package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda356;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.LayoutHelper;

public final class ActiveGiftAuctionsHintCell extends FrameLayout implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public ArrayList activeAuctions;
    public final int currentAccount;
    public boolean isOutbid;
    public final AnimatedTextView messageTextView;
    public final CountDown timerView;
    public final AnimatedTextView titleTextView;

    public final class CountDown extends FrameLayout {
        public final int currentAccount;
        public final Drawable drawable;
        public int endTime;
        public final Paint fillPaint;
        public final AnimatedTextView.AnimatedTextDrawable textView;
        public final CountdownTimer timer;

        public CountDown(Activity activity, int i) {
            super(activity);
            Paint paint = new Paint(1);
            this.fillPaint = paint;
            this.timer = new CountdownTimer(new ChatActivity$$ExternalSyntheticLambda356(this, 1));
            this.currentAccount = i;
            this.drawable = activity.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
            this.textView = animatedTextDrawable;
            animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
            animatedTextDrawable.setCallback(this);
            Typeface typefaceBold = AndroidUtilities.bold();
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setTypeface(typefaceBold);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setColor(-1);
            animatedTextDrawable.alpha = Color.alpha(-1);
            animatedTextDrawable.gravity = 3;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(14.0f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textView;
            int currentWidth = measuredWidth - ((int) animatedTextDrawable.getCurrentWidth());
            int iDp = currentWidth - AndroidUtilities.dp(30.0f);
            canvas.save();
            canvas.translate(iDp, 0.0f);
            canvas.drawRoundRect(0.0f, 0.0f, getWidth() - iDp, getHeight(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.fillPaint);
            canvas.restore();
            animatedTextDrawable.setBounds(currentWidth, 0, getMeasuredWidth() - AndroidUtilities.dp(8.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
            animatedTextDrawable.draw(canvas);
            int iDp2 = AndroidUtilities.dp(-22.0f) + currentWidth;
            int iDp3 = AndroidUtilities.dp(5.0f);
            int iDp4 = AndroidUtilities.dp(-4.0f) + currentWidth;
            int iDp5 = AndroidUtilities.dp(23.0f);
            Drawable drawable = this.drawable;
            drawable.setBounds(iDp2, iDp3, iDp4, iDp5);
            drawable.draw(canvas);
            super.dispatchDraw(canvas);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            start(this.endTime);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            CountdownTimer countdownTimer = this.timer;
            countdownTimer.isRunning = false;
            AndroidUtilities.cancelRunOnUIThread(countdownTimer.doUpdate);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28), 1073741824));
        }

        public final void start(int i) {
            this.endTime = i;
            if (isAttachedToWindow()) {
                long jMax = Math.max(0, i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                this.timer.start(jMax);
                updateTimer(jMax);
            }
        }

        public final void updateTimer(long j) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textView;
            if (j == 0) {
                animatedTextDrawable.setText(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
            } else {
                int i = (int) j;
                animatedTextDrawable.setText(j > 3600 ? AndroidUtilities.formatDuration(i, false) : AndroidUtilities.formatDurationNoHours(i, false), isAttachedToWindow(), true);
            }
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.textView || super.verifyDrawable(drawable);
        }
    }

    public ActiveGiftAuctionsHintCell(Activity activity, int i) {
        super(activity);
        this.activeAuctions = new ArrayList();
        this.currentAccount = i;
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 1);
        AnimatedTextView animatedTextView = new AnimatedTextView(activity, false, false, false);
        this.titleTextView = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setTranslationY(-AndroidUtilities.dp(1.0f));
        linearLayoutM.addView(animatedTextView, LayoutHelper.createLinear(-1, 18));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(activity, false, false, false);
        this.messageTextView = animatedTextView2;
        animatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
        linearLayoutM.addView(animatedTextView2, LayoutHelper.createLinear(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        CountDown countDown = new CountDown(activity, i);
        this.timerView = countDown;
        countDown.updateTimer(299L);
        addView(linearLayoutM, LayoutHelper.createFrame(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(countDown, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors$1();
        setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 19));
    }

    @Override
    public final void onActiveAuctionsUpdate(List list) {
        AnimatedTextView animatedTextView;
        String string;
        ArrayList arrayList = new ArrayList(list);
        this.activeAuctions = arrayList;
        int size = arrayList.size();
        CountDown countDown = this.timerView;
        if (size == 1) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) this.activeAuctions.get(0);
            if (auction.isUpcoming()) {
                countDown.start(auction.gift.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
                countDown.start(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            countDown.endTime = 0;
            CountdownTimer countdownTimer = countDown.timer;
            countdownTimer.isRunning = false;
            AndroidUtilities.cancelRunOnUIThread(countdownTimer.doUpdate);
            countDown.textView.setText(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.activeAuctions.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        int i = 0;
        boolean zIsUpcoming = false;
        boolean z = false;
        while (true) {
            animatedTextView = this.titleTextView;
            if (i >= size2) {
                break;
            }
            GiftAuctionController.Auction auction2 = (GiftAuctionController.Auction) this.activeAuctions.get(i);
            zIsUpcoming |= auction2.isUpcoming(currentTime);
            if (auction2.giftDocumentId != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(auction2.giftDocumentId, 1.2f, animatedTextView.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            GiftAuctionController.Auction.BidStatus bidStatus = auction2.getBidStatus();
            z |= bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID || bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED;
            i++;
        }
        spannableStringBuilder.append(' ');
        if (zIsUpcoming) {
            spannableStringBuilder.append((CharSequence) (size2 == 1 ? LocaleController.getString(R.string.Gift2ActiveAuctionsUpcomingAuctionTitle) : LocaleController.formatString(R.string.Gift2ActiveAuctionsUpcomingAuctionsTitle, Integer.valueOf(size2))));
        } else {
            spannableStringBuilder.append((CharSequence) (size2 == 1 ? LocaleController.getString(R.string.Gift2ActiveAuctionsActiveAuctionTitle) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(size2))));
        }
        animatedTextView.setText(spannableStringBuilder, true, true);
        this.isOutbid = false;
        AnimatedTextView animatedTextView2 = this.messageTextView;
        if (zIsUpcoming) {
            animatedTextView2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusEarly));
        } else if (z) {
            animatedTextView2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusOutbid));
            this.isOutbid = true;
        } else if (size2 > 1) {
            animatedTextView2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinningAll));
        } else {
            int approximatedMyPlace = ((GiftAuctionController.Auction) this.activeAuctions.get(0)).getApproximatedMyPlace();
            if (approximatedMyPlace == 1) {
                string = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning1Place);
            } else if (approximatedMyPlace == 2) {
                string = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning2Place);
            } else if (approximatedMyPlace == 3) {
                string = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning3Place);
            } else {
                int i2 = approximatedMyPlace % 100;
                if (i2 < 11 || i2 > 13) {
                    int i3 = approximatedMyPlace % 10;
                    if (i3 == 1) {
                        string = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherSt, Integer.valueOf(approximatedMyPlace));
                    } else if (i3 != 2) {
                        string = i3 != 3 ? LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(approximatedMyPlace)) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherRd, Integer.valueOf(approximatedMyPlace));
                    } else {
                        string = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherNd, Integer.valueOf(approximatedMyPlace));
                    }
                } else {
                    string = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(approximatedMyPlace));
                }
            }
            animatedTextView2.setText(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOne, string));
        }
        updateColors$1();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.currentAccount;
        GiftAuctionController.getInstance(i).subscribeToActiveAuctionsUpdates(this);
        onActiveAuctionsUpdate(GiftAuctionController.getInstance(i).getActiveAuctions());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromActiveAuctionsUpdates(this);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public final void updateColors$1() {
        setBackground(Theme.getSelectorDrawable(false));
        this.titleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.messageTextView.setTextColor(Theme.getColor(null, this.isOutbid ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteGrayText, false));
        invalidate();
    }
}
