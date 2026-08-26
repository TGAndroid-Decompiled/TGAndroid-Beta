package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ActiveAuctionsSheet extends BottomSheetWithRecyclerListView implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public final LongSparseArray activeAuctionCells;
    public ArrayList activeAuctions;
    public UniversalAdapter adapter;
    public final UItem headerItem;
    public boolean isOpenAnimationEnd;

    public final class ActiveAuctionCell extends FrameLayout {
        public final GiftAuctionController.Auction auction;
        public final ButtonWithCounterView buttonView;
        public final ColoredImageSpan cs;
        public final AnimatedTextView messageView;
        public final Paint paint;
        public final ColoredImageSpan[] spanRefStars;
        public final CountdownTimer timer;
        public final AnimatedTextView titleView;

        public ActiveAuctionCell(Context context, GiftAuctionController.Auction auction) {
            super(context);
            Paint paint = new Paint(1);
            this.paint = paint;
            this.timer = new CountdownTimer(new GiftSheet$$ExternalSyntheticLambda6(this, 12));
            this.cs = new ColoredImageSpan(R.drawable.filled_gift_sell_24);
            this.spanRefStars = new ColoredImageSpan[1];
            this.auction = auction;
            setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
            paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, 536870912);
            paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, null);
            this.buttonView = buttonWithCounterView;
            buttonWithCounterView.setTextHacks(false, true, true, true);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.titleView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
            this.messageView = animatedTextView2;
            animatedTextView2.setTextSize(AndroidUtilities.dp(12.0f));
            TLRPC.Document document = auction.gift.sticker;
            if (document != null) {
                rLottieImageView.setAnimation(document, 44, 44);
            }
            addView(animatedTextView, LayoutHelper.createFrame(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
            addView(animatedTextView2, LayoutHelper.createFrame(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
            addView(rLottieImageView, LayoutHelper.createFrame(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
            addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
            updateStatus(false);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.paint);
            super.dispatchDraw(canvas);
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
            super.onMeasure(i, LayoutHelper.measureSpecExactlyDp(146));
        }

        public final void updateStatus(boolean z) {
            GiftAuctionController.Auction auction = this.auction;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                this.titleView.setText(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(tL_starGiftAuctionState.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z);
            }
            String strM = BillingController$$ExternalSyntheticOutline0.m(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
            boolean zIsOutbid = auction.getBidStatus().isOutbid();
            AnimatedTextView animatedTextView = this.messageView;
            ColoredImageSpan[] coloredImageSpanArr = this.spanRefStars;
            if (zIsOutbid) {
                animatedTextView.setText(StarsIntroActivity.replaceStarsWithPlain(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, strM)), 0.66f, coloredImageSpanArr), z);
                animatedTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            } else {
                animatedTextView.setText(StarsIntroActivity.replaceStarsWithPlain(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, strM, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, coloredImageSpanArr), z);
                animatedTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            }
        }
    }

    public ActiveAuctionsSheet(Context context) {
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        int i = 0;
        this.activeAuctionCells = new LongSparseArray();
        this.activeAuctions = new ArrayList();
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        GiftAuctionController.getInstance(this.currentAccount).subscribeToActiveAuctionsUpdates(this);
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.headerItem = UItem.asCustom(-1, linearLayout);
        this.recyclerListView.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f));
        this.recyclerListView.setOverScrollMode(2);
        this.adapter.update(false);
        ArrayList<GiftAuctionController.Auction> activeAuctions = GiftAuctionController.getInstance(this.currentAccount).getActiveAuctions();
        int size = activeAuctions.size();
        while (i < size) {
            GiftAuctionController.Auction auction = activeAuctions.get(i);
            i++;
            GiftAuctionController.Auction auction2 = auction;
            ActiveAuctionCell activeAuctionCell = new ActiveAuctionCell(context, auction2);
            activeAuctionCell.buttonView.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, context, auction2, 5));
            linearLayout.addView(activeAuctionCell, LayoutHelper.createLinear(-1, -2));
            this.activeAuctionCells.put(auction2.giftId, activeAuctionCell);
        }
        onActiveAuctionsUpdate(activeAuctions);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 16), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromActiveAuctionsUpdates(this);
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final CharSequence getTitle() {
        ArrayList arrayList = this.activeAuctions;
        if (arrayList == null) {
            return null;
        }
        return LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(arrayList.size()));
    }

    public final void lambda$new$0(Context context, GiftAuctionController.Auction auction) {
        new AuctionBidSheet(context, null, null, auction).show();
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromActiveAuctionsUpdates(this);
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void onActiveAuctionsUpdate(List list) {
        this.activeAuctions = new ArrayList(list);
        this.actionBar.setTitle(getTitle());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) it.next();
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
            int i = tL_starGiftAuctionState != null ? tL_starGiftAuctionState.next_round_at : 0;
            ActiveAuctionCell activeAuctionCell = (ActiveAuctionCell) this.activeAuctionCells.get(auction.giftId);
            if (activeAuctionCell != null) {
                activeAuctionCell.updateStatus(this.isOpenAnimationEnd);
                long jMax = Math.max(0, i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                boolean z = this.isOpenAnimationEnd;
                String durationNoHours = AndroidUtilities.formatDurationNoHours((int) jMax, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
                spannableStringBuilder.setSpan(activeAuctionCell.cs, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActiveAuctionsActiveRaiseBid));
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.append((CharSequence) durationNoHours);
                activeAuctionCell.buttonView.setText(spannableStringBuilder, z);
                activeAuctionCell.timer.start(jMax);
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.isOpenAnimationEnd = true;
    }
}
