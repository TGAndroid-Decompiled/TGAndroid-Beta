package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ActiveGiftAuctionsHintCell;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BlurredFrameLayout;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Gifts.ActiveAuctionsSheet;
import org.telegram.ui.Gifts.AuctionBidSheet;

public class ActiveGiftAuctionsHintCell extends BlurredFrameLayout implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    private List activeAuctions;
    private final int currentAccount;
    private boolean isOutbid;
    private final AnimatedTextView messageTextView;
    private final CountDown timerView;
    private final AnimatedTextView titleTextView;

    public ActiveGiftAuctionsHintCell(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, int i) {
        super(context, sizeNotifierFrameLayout);
        this.activeAuctions = new ArrayList();
        this.currentAccount = i;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.titleTextView = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-1, 18));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.messageTextView = animatedTextView2;
        animatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
        linearLayout.addView(animatedTextView2, LayoutHelper.createLinear(-1, 17));
        CountDown countDown = new CountDown(context, i);
        this.timerView = countDown;
        countDown.updateTimer(299L);
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 16, 16.0f, 0.0f, 92.0f, 0.0f));
        addView(countDown, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ActiveGiftAuctionsHintCell.this.onClick(view);
            }
        });
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void updateColors() {
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        this.titleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        this.messageTextView.setTextColor(Theme.getColor(this.isOutbid ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteGrayText));
        invalidate();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        GiftAuctionController.getInstance(this.currentAccount).subscribeToActiveAuctionsUpdates(this);
        onActiveAuctionsUpdate(GiftAuctionController.getInstance(this.currentAccount).getActiveAuctions());
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromActiveAuctionsUpdates(this);
    }

    @Override
    public void onActiveAuctionsUpdate(List list) {
        ArrayList arrayList = new ArrayList(list);
        this.activeAuctions = arrayList;
        if (arrayList.size() == 1) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = ((GiftAuctionController.Auction) it.next()).auctionStateActive;
                if (tL_starGiftAuctionState != null) {
                    i = Math.max(i, tL_starGiftAuctionState.next_round_at);
                }
            }
            this.timerView.start(i);
        } else {
            this.timerView.stop();
            this.timerView.textView.setText(LocaleController.getString(R.string.Gift2AuctionPriceView), true);
        }
        update(true);
    }

    private void update(boolean z) {
        String formatString;
        String formatPlace;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = this.activeAuctions.size();
        if (size == 0) {
            return;
        }
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) this.activeAuctions.get(i);
            if (auction.giftDocumentId != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(auction.giftDocumentId, this.titleTextView.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            GiftAuctionController.Auction.BidStatus bidStatus = auction.getBidStatus();
            z2 |= bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID || bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED;
        }
        spannableStringBuilder.append(' ');
        if (size == 1) {
            formatString = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveAuctionTitle);
        } else {
            formatString = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(size));
        }
        spannableStringBuilder.append((CharSequence) formatString);
        this.titleTextView.setText(spannableStringBuilder, z);
        this.isOutbid = false;
        if (z2) {
            this.messageTextView.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusOutbid));
            this.isOutbid = true;
        } else if (size > 1) {
            this.messageTextView.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinningAll));
        } else {
            int approximatedMyPlace = ((GiftAuctionController.Auction) this.activeAuctions.get(0)).getApproximatedMyPlace();
            if (approximatedMyPlace == 1) {
                formatPlace = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning1Place);
            } else if (approximatedMyPlace == 2) {
                formatPlace = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning2Place);
            } else if (approximatedMyPlace == 3) {
                formatPlace = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning3Place);
            } else {
                formatPlace = formatPlace(approximatedMyPlace);
            }
            this.messageTextView.setText(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOne, formatPlace));
        }
        updateColors();
    }

    private static String formatPlace(int i) {
        int i2 = i % 100;
        if (i2 >= 11 && i2 <= 13) {
            return LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(i));
        }
        int i3 = i % 10;
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(i)) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherRd, Integer.valueOf(i)) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherNd, Integer.valueOf(i)) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherSt, Integer.valueOf(i));
    }

    public void onClick(View view) {
        if (this.activeAuctions.size() == 1) {
            new AuctionBidSheet(getContext(), null, null, (GiftAuctionController.Auction) this.activeAuctions.get(0)).show();
        } else {
            new ActiveAuctionsSheet(getContext(), null).show();
        }
    }

    public static class CountDown extends FrameLayout {
        private final int currentAccount;
        private final Drawable drawable;
        private int endTime;
        private final Paint fillPaint;
        public final AnimatedTextView.AnimatedTextDrawable textView;
        private final CountdownTimer timer;

        public CountDown(Context context, int i) {
            super(context);
            Paint paint = new Paint(1);
            this.fillPaint = paint;
            this.timer = new CountdownTimer(new CountdownTimer.Callback() {
                @Override
                public final void onTimerUpdate(long j) {
                    ActiveGiftAuctionsHintCell.CountDown.this.updateTimer(j);
                }
            });
            this.currentAccount = i;
            this.drawable = context.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.textView = animatedTextDrawable;
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable.setTextColor(-1);
            animatedTextDrawable.setGravity(3);
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.textView || super.verifyDrawable(drawable);
        }

        public void start(int i) {
            this.endTime = i;
            if (isAttachedToWindow()) {
                long max = Math.max(0, i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                this.timer.start(max);
                updateTimer(max);
            }
        }

        public void stop() {
            this.endTime = 0;
            this.timer.stop();
        }

        public void updateTimer(long j) {
            if (j == 0) {
                this.textView.setText(LocaleController.getString(R.string.Gift2AuctionPriceView));
            } else {
                this.textView.setText(AndroidUtilities.formatDurationNoHours((int) j, false), isAttachedToWindow());
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            start(this.endTime);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.timer.stop();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - ((int) this.textView.getCurrentWidth());
            int dp = measuredWidth - AndroidUtilities.dp(30.0f);
            canvas.save();
            canvas.translate(dp, 0.0f);
            canvas.drawRoundRect(0.0f, 0.0f, getWidth() - dp, getHeight(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.fillPaint);
            canvas.restore();
            this.textView.setBounds(measuredWidth, 0, getMeasuredWidth() - AndroidUtilities.dp(8.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
            this.textView.draw(canvas);
            this.drawable.setBounds(AndroidUtilities.dp(-22.0f) + measuredWidth, AndroidUtilities.dp(5.0f), measuredWidth + AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(23.0f));
            this.drawable.draw(canvas);
            super.dispatchDraw(canvas);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(LayoutHelper.measureSpecExactlyDp(172), LayoutHelper.measureSpecExactlyDp(28));
        }
    }
}
