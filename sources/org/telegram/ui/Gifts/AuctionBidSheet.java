package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.BalanceCloud;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.HighlightMessageSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class AuctionBidSheet extends BottomSheetWithRecyclerListView implements GiftAuctionController.OnAuctionUpdateListener {
    private UniversalAdapter adapter;
    private AnimatedEmojiSpan animatedEmojiSpan;
    private GiftAuctionController.Auction auction;
    private final BalanceCloud balanceCloud;
    private boolean balanceCloudVisible;
    private boolean bidIsPending;
    private final FrameLayout bulletinContainer;
    private final ButtonWithCounterView buttonView;
    private Runnable closeParentSheet;
    private final long giftId;
    private final InfoCell giftsLeftCell;
    private final UItem headerItem;
    private boolean isFirstCheck;
    private boolean isOpenAnimationEnd;
    private long lastAcquiredCount;
    private long lastRecipientDialogId;
    private final InfoCell minimumBidCell;
    private final InfoCell nextRoundCell;
    private final BoolAnimator outbidColor;
    private final Params params;
    private final ColoredImageSpan[] refS;
    private final BidderCell selfBidderCell;
    private final AnimatedTextView selfBidderFutureGift;
    private final HeaderCell selfBidderHeader;
    private final StarsReactionsSheet.StarsSlider slider;
    private final ColoredImageSpan[] spanRefStars;
    private final CountdownTimer timer;
    private final BidderCell[] topBidderCells;
    private final BoolAnimator winningColor;

    public static void m3190$r8$lambda$G2Xuq_D6dRrzaq7lKN44Yo7tEw(View view, int i) {
    }

    public static void $r8$lambda$kEbIuDGYjHhgjjOWj68BRjfmH0Q(View view) {
    }

    public static class Params {
        public final long dialogId;
        public final boolean hideName;
        public final TLRPC.TL_textWithEntities message;

        public Params(long j, boolean z, TLRPC.TL_textWithEntities tL_textWithEntities) {
            this.dialogId = j;
            this.hideName = z;
            this.message = tL_textWithEntities;
        }
    }

    public AuctionBidSheet(final Context context, final Theme.ResourcesProvider resourcesProvider, Params params, GiftAuctionController.Auction auction) {
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        this.topBidderCells = new BidderCell[3];
        this.isFirstCheck = true;
        this.refS = new ColoredImageSpan[1];
        FactorAnimator.Target target = new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.onColorFactorChanged(i, f, f2, factorAnimator);
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.winningColor = new BoolAnimator(0, target, cubicBezierInterpolator, 380L);
        this.outbidColor = new BoolAnimator(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.onColorFactorChanged(i, f, f2, factorAnimator);
            }
        }, cubicBezierInterpolator, 380L);
        this.spanRefStars = new ColoredImageSpan[1];
        this.auction = auction;
        this.params = params;
        long j = auction.giftId;
        this.giftId = j;
        this.centerTitle = true;
        this.topPadding = 0.2f;
        GiftAuctionController.Auction auctionSubscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j, this);
        this.timer = new CountdownTimer(new CountdownTimer.Callback() {
            @Override
            public final void onTimerUpdate(long j2) {
                this.f$0.updateCountdownCell(j2);
            }
        });
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        AuctionJoinSheet.initActionBar(this.actionBar, context, resourcesProvider, this.currentAccount, auctionSubscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.headerItem = UItem.asCustom(-1, linearLayout);
        StarsReactionsSheet.StarsSlider starsSlider = new StarsReactionsSheet.StarsSlider(context, resourcesProvider) {
            @Override
            public void onValueChanged(int i) {
                super.onValueChanged(i);
                AuctionBidSheet.this.onSliderValueChanged(i);
            }

            @Override
            public void setValue(int i) {
                super.setValue(i);
                AuctionBidSheet.this.onSliderValueChanged(i);
            }

            @Override
            protected boolean onTapCustom(float f, float f2) {
                if (getProgress() <= 0.99d && f <= getMeasuredWidth() * 0.9f) {
                    return false;
                }
                AuctionBidSheet.this.showCustomPlaceABid();
                return true;
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || motionEvent.getY() <= getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.slider = starsSlider;
        starsSlider.drawPlus = true;
        setSliderValues();
        linearLayout.addView(starsSlider, LayoutHelper.createLinear(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        InfoCell infoCell = new InfoCell(context, resourcesProvider);
        this.minimumBidCell = infoCell;
        int iDp = AndroidUtilities.dp(12.0f);
        int i = Theme.key_windowBackgroundGray;
        infoCell.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, getThemedColor(i), ColorUtils.compositeColors(getThemedColor(Theme.key_listSelector), getThemedColor(i))));
        infoCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionBidSheet auctionBidSheet = this.f$0;
                auctionBidSheet.slider.setValueAnimated((int) auctionBidSheet.auction.getMinimumBid());
            }
        });
        infoCell.titleView.setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        InfoCell infoCell2 = new InfoCell(context, resourcesProvider);
        this.nextRoundCell = infoCell2;
        infoCell2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), getThemedColor(i)));
        infoCell2.titleView.setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        InfoCell infoCell3 = new InfoCell(context, resourcesProvider);
        this.giftsLeftCell = infoCell3;
        infoCell3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), getThemedColor(i)));
        infoCell3.titleView.setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(infoCell, LayoutHelper.createLinear(0, -1, 1.0f));
        linearLayout2.addView(new View(context), LayoutHelper.createLinear(10, -1, 0.0f));
        linearLayout2.addView(infoCell2, LayoutHelper.createLinear(0, -1, 1.0f));
        linearLayout2.addView(new View(context), LayoutHelper.createLinear(10, -1, 0.0f));
        linearLayout2.addView(infoCell3, LayoutHelper.createLinear(0, -1, 1.0f));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, 56, 16.0f, 0.0f, 16.0f, 15.0f));
        if (auctionSubscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            final boolean[] zArr = new boolean[1];
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            linksTextView.setGravity(17);
            linksTextView.setTextSize(1, 16.0f);
            int i2 = Theme.key_windowBackgroundWhiteLinkText;
            linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
            linksTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionBidSheet.$r8$lambda$lZXnxOxvFbwnBkbwAFHDl5tSz8s(this.f$0, zArr, resourcesProvider, view);
                }
            });
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(auctionSubscribeToGiftAuction.giftDocumentId, linksTextView.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            linksTextView.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", auctionSubscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            ScaleStateListAnimator.apply(linksTextView, 0.02f, 1.5f);
            linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 16.0f, 4.0f, 16.0f, 4.0f));
        }
        int i3 = Theme.key_windowBackgroundWhiteBlueHeader;
        HeaderCell headerCell = new HeaderCell(context, i3, 21, 0, 0, false, true, resourcesProvider);
        this.selfBidderHeader = headerCell;
        linearLayout.addView(headerCell, LayoutHelper.createLinear(-1, -2, 0.0f, 5.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.selfBidderFutureGift = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(12.5f));
        animatedTextView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        animatedTextView.setSizeableBackground(Theme.createRadSelectorDrawable(0, 0, 9, 9));
        animatedTextView.setHideBackgroundIfEmpty(true);
        headerCell.setOnWidthUpdateListener(new Runnable() {
            @Override
            public final void run() {
                AuctionBidSheet auctionBidSheet = this.f$0;
                auctionBidSheet.selfBidderFutureGift.setTranslationX(auctionBidSheet.selfBidderHeader.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
            }
        });
        headerCell.addView(animatedTextView, LayoutHelper.createFrame(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        BidderCell bidderCell = new BidderCell(context, resourcesProvider);
        this.selfBidderCell = bidderCell;
        bidderCell.placeTextView.setTextColor(getThemedColor(i3));
        bidderCell.setUser(user, false);
        linearLayout.addView(bidderCell, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, -7.0f));
        HeaderCell headerCell2 = new HeaderCell(context, i3, 21, 15, 0, false, resourcesProvider);
        headerCell2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(headerCell2, LayoutHelper.createLinear(-1, -2));
        int i4 = 0;
        while (true) {
            BidderCell[] bidderCellArr = this.topBidderCells;
            if (i4 >= bidderCellArr.length) {
                break;
            }
            bidderCellArr[i4] = new BidderCell(context, resourcesProvider);
            int i5 = i4 + 1;
            this.topBidderCells[i4].setPlace(i5, true, false);
            this.topBidderCells[i4].setBackground(Theme.getSelectorDrawable(false));
            this.topBidderCells[i4].drawDivider = i4 < 2;
            this.topBidderCells[i4].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionBidSheet.$r8$lambda$kEbIuDGYjHhgjjOWj68BRjfmH0Q(view);
                }
            });
            linearLayout.addView(this.topBidderCells[i4], LayoutHelper.createLinear(-1, -2));
            i4 = i5;
        }
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (isEnabled()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setRound();
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i6 = layoutParamsCreateFrame.leftMargin;
        int i7 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i6 + i7;
        layoutParamsCreateFrame.rightMargin += i7;
        this.containerView.addView(buttonWithCounterView, layoutParamsCreateFrame);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i8 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i8, 0, i8, AndroidUtilities.dp(64.0f));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i9) {
                AuctionBidSheet.m3190$r8$lambda$G2Xuq_D6dRrzaq7lKN44Yo7tEw(view, i9);
            }
        });
        long j2 = auctionSubscribeToGiftAuction.auctionUserState.bid_amount;
        if (j2 > 0) {
            this.slider.setValue((int) j2);
        } else {
            this.slider.setValue((int) auctionSubscribeToGiftAuction.getMinimumBid());
        }
        updateTable(false);
        this.recyclerListView.setOverScrollMode(2);
        BalanceCloud balanceCloud = new BalanceCloud(context, this.currentAccount, resourcesProvider);
        this.balanceCloud = balanceCloud;
        balanceCloud.setScaleX(0.6f);
        balanceCloud.setScaleY(0.6f);
        balanceCloud.setAlpha(0.0f);
        balanceCloud.setEnabled(false);
        balanceCloud.setClickable(false);
        this.container.addView(balanceCloud, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(balanceCloud);
        balanceCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.bulletinContainer = frameLayout;
        this.container.addView(frameLayout, LayoutHelper.createFrame(-1, 100, 48));
        updateColors();
        this.adapter.update(false);
    }

    public static void $r8$lambda$lZXnxOxvFbwnBkbwAFHDl5tSz8s(final AuctionBidSheet auctionBidSheet, final boolean[] zArr, final Theme.ResourcesProvider resourcesProvider, View view) {
        auctionBidSheet.getClass();
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(auctionBidSheet.currentAccount).getOrRequestAcquiredGifts(auctionBidSheet.giftId, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                AuctionBidSheet.m3192$r8$lambda$h2wHd9jQuvxe9b4cz_YE0FszUs(this.f$0, zArr, resourcesProvider, (List) obj);
            }
        });
    }

    public static void m3192$r8$lambda$h2wHd9jQuvxe9b4cz_YE0FszUs(AuctionBidSheet auctionBidSheet, boolean[] zArr, Theme.ResourcesProvider resourcesProvider, List list) {
        auctionBidSheet.getClass();
        zArr[0] = false;
        new AcquiredGiftsSheet(auctionBidSheet.getContext(), resourcesProvider, auctionBidSheet.auction, list).show();
    }

    public void onSliderValueChanged(int i) {
        this.slider.setColor(HighlightMessageSheet.getTierOption(this.currentAccount, i, HighlightMessageSheet.TIER_COLOR1), HighlightMessageSheet.getTierOption(this.currentAccount, i, HighlightMessageSheet.TIER_COLOR2), true);
        updateSelfBidderCell(this.isOpenAnimationEnd);
        updateSelfBidderHeader(this.isOpenAnimationEnd);
        updateButtonText(this.isOpenAnimationEnd);
        checkSliderSubText();
    }

    private void checkSliderSubText() {
        int value = this.slider.getValue();
        if (this.slider.getProgress() > 0.99f) {
            this.slider.setCounterSubText(LocaleController.getString(R.string.Gift2AuctionTapToBidMore), true);
            return;
        }
        long j = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.auction.auctionUserState;
        long j2 = tL_StarGiftAuctionUserState.bid_amount;
        if (j == j2) {
            this.slider.setCounterSubText(LocaleController.getString(R.string.Gift2AuctionYourBid), true);
            return;
        }
        if (j2 <= 0 || tL_StarGiftAuctionUserState.returned) {
            this.slider.setCounterSubText(null, true);
            return;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            this.slider.setCounterSubText("+" + LocaleController.formatNumber(j3, ','), true);
            return;
        }
        this.slider.setCounterSubText(null, true);
    }

    private void setSliderValues() {
        int i = 50000;
        this.auction.getMinimumBid();
        this.auction.getCurrentMyBid();
        long currentTopBid = this.auction.getCurrentTopBid();
        if (currentTopBid > 100000) {
            i = ((((int) currentTopBid) * 3) / 2000) * 1000;
        } else if (currentTopBid > 30000) {
            i = 100000;
        }
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i2 = 0; i2 < 15; i2++) {
            int i3 = iArr[i2];
            if (i3 >= 50) {
                if (i3 == 50) {
                    z = false;
                }
                if (i3 > i) {
                    arrayList.add(Integer.valueOf(i));
                    break;
                } else {
                    arrayList.add(Integer.valueOf(i3));
                    if (iArr[i2] == i) {
                        break;
                    }
                }
            } else {
                z = true;
            }
        }
        if (z) {
            arrayList.add(0, 50);
        }
        if (arrayList.size() < 2) {
            arrayList.clear();
            arrayList.add(1);
            arrayList.add(10000);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        this.slider.setSteps(100, iArr2);
    }

    private void checkAuctionParams() {
        BaseFragment lastFragment;
        long peerDialogId = DialogObject.getPeerDialogId(this.auction.auctionUserState.peer);
        long j = this.auction.auctionUserState.acquired_count;
        if (this.lastAcquiredCount < j && !this.isFirstCheck && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            long j2 = this.lastRecipientDialogId;
            if (j2 != 0) {
                final ChatActivity chatActivityOf = ChatActivity.of(j2);
                Objects.requireNonNull(chatActivityOf);
                chatActivityOf.whenFullyVisible(new Runnable() {
                    @Override
                    public final void run() {
                        chatActivityOf.startFireworks();
                    }
                });
                lastFragment.presentFragment(chatActivityOf);
                Runnable runnable = this.closeParentSheet;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.lastRecipientDialogId = peerDialogId;
        }
        this.lastAcquiredCount = j;
        this.isFirstCheck = false;
    }

    public void setCloseParentSheet(Runnable runnable) {
        this.closeParentSheet = runnable;
    }

    private void updateTable(boolean z) {
        int i;
        this.minimumBidCell.infoView.setText(StarsIntroActivity.replaceStarsWithPlain("⭐️" + LocaleController.formatNumberWithMillion((int) this.auction.getMinimumBid(), ','), 0.78f, this.refS), z);
        if (this.auction.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.auction.isUpcoming(currentTime)) {
                long jMax = Math.max(0, this.auction.auctionStateActive.start_date - currentTime);
                this.timer.start(jMax);
                updateCountdownCell(jMax, z);
            } else {
                long jMax2 = Math.max(0, this.auction.auctionStateActive.next_round_at - currentTime);
                this.timer.start(jMax2);
                updateCountdownCell(jMax2, z);
            }
            if (this.animatedEmojiSpan == null && this.auction.gift.sticker != null) {
                this.animatedEmojiSpan = new AnimatedEmojiSpan(this.auction.gift.sticker.id, this.giftsLeftCell.infoView.getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.animatedEmojiSpan != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.animatedEmojiSpan, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.auction.auctionStateActive.gifts_left, ','));
            this.giftsLeftCell.infoView.setText(spannableStringBuilder, z);
            TextView textView = this.nextRoundCell.titleView;
            if (this.auction.isUpcoming()) {
                i = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auction.auctionStateActive;
                i = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? R.string.Gift2AuctionBidInfoUntilEndRound : R.string.Gift2AuctionBidInfoUntilNextRound;
            }
            textView.setText(LocaleController.getString(i));
            int iMin = Math.min(this.topBidderCells.length, this.auction.auctionStateActive.top_bidders.size());
            if (iMin > 0) {
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = i2 + 1;
                    Long l = this.auction.auctionStateActive.top_bidders.get(i2);
                    final long jLongValue = l.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l);
                    if (user != null) {
                        this.topBidderCells[i2].setUser(user, z);
                    }
                    this.topBidderCells[i2].setBid(this.auction.approximateBidAmountFromPlace(i3), z);
                    this.topBidderCells[i2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.openProfile(jLongValue);
                        }
                    });
                    i2 = i3;
                }
            }
        }
        StarsReactionsSheet.StarsSlider starsSlider = this.slider;
        GiftAuctionController.Auction auction = this.auction;
        starsSlider.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        this.slider.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.auction.gift.gifts_per_round, new Object[0]));
        updateSelfBidderCell(z);
        updateSelfBidderHeader(z);
        updateButtonText(z);
        checkSliderSubText();
        checkAuctionParams();
    }

    public void openProfile(long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (UserObject.isService(j)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
                if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putBoolean("open_gifts", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle));
        }
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
    }

    public void onColorFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        updateColors();
    }

    private void updateColors() {
        int iBlendARGB = ColorUtils.blendARGB(ColorUtils.blendARGB(getThemedColor(Theme.key_windowBackgroundWhiteBlueHeader), getThemedColor(Theme.key_text_RedBold), this.outbidColor.getFloatValue()), getThemedColor(Theme.key_color_green), this.winningColor.getFloatValue());
        this.selfBidderHeader.setTextColor(iBlendARGB);
        this.selfBidderFutureGift.setTextColor(iBlendARGB);
        this.selfBidderCell.placeTextView.setTextColor(iBlendARGB);
        if (Theme.setSelectorDrawableColor(this.selfBidderFutureGift.getSizeableBackground(), Theme.multAlpha(iBlendARGB, 0.15f), false)) {
            this.selfBidderFutureGift.invalidate();
        }
    }

    private void updateSelfBidderHeader(boolean z) {
        boolean z2;
        GiftAuctionController.Auction.BidStatus bidStatus = this.auction.getBidStatus();
        boolean z3 = false;
        if (this.slider.getValue() > this.auction.auctionUserState.bid_amount) {
            this.selfBidderHeader.setText(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z);
        } else {
            z2 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID || bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                this.selfBidderHeader.setText(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                this.selfBidderHeader.setText(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z);
                z2 = false;
                z3 = true;
            } else {
                this.selfBidderHeader.setText(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z);
            }
            this.winningColor.setValue(z3, z);
            this.outbidColor.setValue(z2, z);
        }
        z2 = false;
        this.winningColor.setValue(z3, z);
        this.outbidColor.setValue(z2, z);
    }

    private void updateSelfBidderCell(boolean z) {
        long value = this.slider.getValue();
        int approximatedMyPlace = this.auction.getApproximatedMyPlace();
        int iApproximatePlaceFromStars = this.auction.approximatePlaceFromStars(value);
        this.selfBidderCell.setBid(Math.max(value, this.auction.getCurrentMyBid()), false);
        if (approximatedMyPlace > 0) {
            iApproximatePlaceFromStars = Math.min(approximatedMyPlace, iApproximatePlaceFromStars);
        }
        this.selfBidderCell.setPlace(iApproximatePlaceFromStars, false, z);
        GiftAuctionController.Auction auction = this.auction;
        if (auction.auctionStateActive != null && iApproximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.auction.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.auction;
            int i = auction2.auctionStateActive.last_gift_num + iApproximatePlaceFromStars;
            if (i <= auction2.gift.availability_total) {
                this.selfBidderFutureGift.setText(this.auction.gift.title + " #" + LocaleController.formatNumber(i, ','));
                return;
            }
        }
        this.selfBidderFutureGift.setText(null);
    }

    public void updateCountdownCell(long j) {
        updateCountdownCell(j, this.isOpenAnimationEnd);
    }

    private void updateCountdownCell(long j, boolean z) {
        this.nextRoundCell.infoView.setText(formatDuration(j), z);
    }

    @Override
    public void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.isOpenAnimationEnd = false;
        checkBalanceCloudVisibility();
        Bulletin.removeDelegate(this.container);
    }

    private void updateButtonText(boolean z) {
        long value = this.slider.getValue();
        if (value == this.auction.getCurrentMyBid()) {
            this.buttonView.setText(LocaleController.getString(R.string.OK), z);
            this.buttonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.dismiss();
                }
            });
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.auction.auctionUserState;
        long j = tL_StarGiftAuctionUserState.bid_amount;
        if (j < value && !tL_StarGiftAuctionUserState.returned) {
            this.buttonView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j, ',')), this.spanRefStars), z);
        } else {
            this.buttonView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), this.spanRefStars), z);
        }
        this.buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionBidSheet.$r8$lambda$LGjPqytnQD3cIaEXnRKv_y8vhuc(this.f$0, view);
            }
        });
    }

    public static void $r8$lambda$LGjPqytnQD3cIaEXnRKv_y8vhuc(AuctionBidSheet auctionBidSheet, View view) {
        int value = auctionBidSheet.slider.getValue();
        int minimumBid = (int) auctionBidSheet.auction.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(auctionBidSheet.buttonView);
            BulletinFactory.of(auctionBidSheet.container, auctionBidSheet.resourcesProvider).createSimpleBulletin(R.raw.info, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).show();
        } else {
            auctionBidSheet.sendBid(value);
        }
    }

    @Override
    public void onUpdate(GiftAuctionController.Auction auction) {
        this.auction = auction;
        updateTable(this.isOpenAnimationEnd);
    }

    @Override
    public void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.isOpenAnimationEnd = true;
        checkBalanceCloudVisibility();
        Bulletin.addDelegate(this.container, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                return AndroidUtilities.dp(64.0f);
            }
        });
    }

    @Override
    public void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.giftId, this);
        this.timer.stop();
        super.dismiss();
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(this.headerItem);
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
    }

    public static String formatDuration(long j) {
        if (j >= 3600) {
            return AndroidUtilities.formatFullDuration((int) j);
        }
        return AndroidUtilities.formatDurationNoHours((int) j, true);
    }

    @Override
    public void onContainerTranslationYChanged(float f) {
        super.onContainerTranslationYChanged(f);
        checkBalanceCloudVisibility();
    }

    private void checkBalanceCloudVisibility() {
        boolean z = this.isOpenAnimationEnd && !isDismissed();
        if (this.balanceCloudVisible != z) {
            this.balanceCloudVisible = z;
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                balanceCloud.setEnabled(z);
                this.balanceCloud.setClickable(z);
                this.balanceCloud.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).alpha(z ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    private void sendBid(int i) {
        if (this.bidIsPending) {
            return;
        }
        final long j = this.auction.auctionUserState.bid_amount;
        long j2 = i;
        if (j > 0) {
            j2 -= j;
        }
        long j3 = j2;
        if (StarsController.getInstance(this.currentAccount).balanceAvailable() && StarsController.getInstance(this.currentAccount).getBalance(false) < j3) {
            new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j3, 14, null, null, 0L).show();
            return;
        }
        this.bidIsPending = true;
        this.buttonView.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.giftId, this.params, i, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                AuctionBidSheet.m3193$r8$lambda$wwPZ2vn5WSlX0CHaaELu6_6lQc(this.f$0, j, (Boolean) obj, (String) obj2);
            }
        });
    }

    public static void m3193$r8$lambda$wwPZ2vn5WSlX0CHaaELu6_6lQc(AuctionBidSheet auctionBidSheet, long j, Boolean bool, String str) {
        auctionBidSheet.buttonView.setLoading(false);
        auctionBidSheet.bidIsPending = false;
        if (bool != null) {
            auctionBidSheet.showBidSuccessBulletin(j > 0);
            StarsController.getInstance(auctionBidSheet.currentAccount).getBalance(false, null, true);
        }
        if (str != null) {
            auctionBidSheet.updateBulletinContainerPosition();
            BulletinFactory.of(auctionBidSheet.bulletinContainer, auctionBidSheet.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
        }
    }

    private void showBidSuccessBulletin(boolean z) {
        Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(getContext(), this.resourcesProvider);
        twoLineLayout.imageView.setImageResource(R.drawable.filled_gift_sell_24);
        twoLineLayout.titleTextView.setText(LocaleController.getString(z ? R.string.Gift2AuctionsBidHasBeenIncreased : R.string.Gift2AuctionsBidHasBeenPlaced));
        twoLineLayout.titleTextView.setSingleLine(true);
        twoLineLayout.titleTextView.setTextSize(1, 15.0f);
        twoLineLayout.titleTextView.setMaxLines(1);
        twoLineLayout.titleTextView.setTypeface(AndroidUtilities.bold());
        twoLineLayout.subtitleTextView.setText(LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(this.auction.gift.gifts_per_round)));
        twoLineLayout.subtitleTextView.setSingleLine(false);
        twoLineLayout.subtitleTextView.setMaxLines(5);
        updateBulletinContainerPosition();
        BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).create(twoLineLayout, 2750).show();
    }

    private void updateBulletinContainerPosition() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable == null || this.containerView == null || (frameLayout = this.bulletinContainer) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((drawable.getBounds().top + this.containerView.getY()) - this.bulletinContainer.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
    }

    public void showCustomPlaceABid() {
        Context context = getContext();
        final Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (activityFindActivity != null) {
            activityFindActivity.getCurrentFocus();
        }
        final View[] viewArr = new View[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid));
        builder.setMessage(LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(this.auction.gift.gifts_per_round)));
        final Drawable drawableMutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        final EditTextCaption editTextCaption = new EditTextCaption(context, this.resourcesProvider) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                drawableMutate.setBounds(0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(28.0f));
                drawableMutate.draw(canvas);
            }
        };
        editTextCaption.setTextSize(1, 18.0f);
        editTextCaption.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        editTextCaption.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, this.resourcesProvider));
        editTextCaption.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        editTextCaption.setFocusable(true);
        editTextCaption.setInputType(2);
        editTextCaption.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        editTextCaption.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, this.resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, this.resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, this.resourcesProvider));
        editTextCaption.setImeOptions(268435462);
        editTextCaption.setBackgroundDrawable(null);
        editTextCaption.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        editTextCaption.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        editTextCaption.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    boolean z = ((long) Integer.parseInt(editable.toString())) >= AuctionBidSheet.this.auction.getMinimumBid();
                    viewArr[0].animate().alpha(z ? 1.0f : 0.6f).setDuration(180L).start();
                    viewArr[0].setEnabled(z);
                    viewArr[0].setClickable(z);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(AndroidUtilities.dp(300.0f));
        builder.setPositiveButton(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AuctionBidSheet.$r8$lambda$mQ9WhLtfGXpw93uCjdO9KTvatU0(this.f$0, editTextCaption, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog[] alertDialogArr = {builder.create()};
        if (lastFragment != null) {
            AndroidUtilities.requestAdjustNothing(activityFindActivity, lastFragment.getClassGuid());
        }
        alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AuctionBidSheet.$r8$lambda$3H2sZSZ6p9m5W_7TQ96JI8Ydpjg(editTextCaption, lastFragment, activityFindActivity, dialogInterface);
            }
        });
        alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                AuctionBidSheet.$r8$lambda$Gjs5MOYaCq2CPw6S1guYlA55XXM(editTextCaption, dialogInterface);
            }
        });
        alertDialogArr[0].show();
        View button = alertDialogArr[0].getButton(-1);
        viewArr[0] = button;
        button.setAlpha(0.6f);
        alertDialogArr[0].setDismissDialogByButtons(false);
        editTextCaption.setSelection(editTextCaption.getText().length());
    }

    public static void $r8$lambda$mQ9WhLtfGXpw93uCjdO9KTvatU0(AuctionBidSheet auctionBidSheet, EditTextCaption editTextCaption, AlertDialog alertDialog, int i) {
        auctionBidSheet.getClass();
        try {
            int i2 = Integer.parseInt(editTextCaption.getText().toString().trim());
            auctionBidSheet.sendBid(i2);
            auctionBidSheet.slider.setValue(i2);
            alertDialog.dismiss();
        } catch (Throwable th) {
            AndroidUtilities.shakeView(editTextCaption);
            FileLog.e(th);
        }
    }

    public static void $r8$lambda$3H2sZSZ6p9m5W_7TQ96JI8Ydpjg(EditTextCaption editTextCaption, BaseFragment baseFragment, Activity activity, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editTextCaption);
        if (baseFragment != null) {
            AndroidUtilities.requestAdjustResize(activity, baseFragment.getClassGuid());
        }
    }

    public static void $r8$lambda$Gjs5MOYaCq2CPw6S1guYlA55XXM(EditTextCaption editTextCaption, DialogInterface dialogInterface) {
        editTextCaption.requestFocus();
        AndroidUtilities.showKeyboard(editTextCaption);
    }

    private static class InfoCell extends FrameLayout {
        public final AnimatedTextView infoView;
        public final TextView titleView;

        public InfoCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.infoView = animatedTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            animatedTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            animatedTextView.setTextSize(AndroidUtilities.dp(17.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-2, 23, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1));
            addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
        }
    }

    private static class BidderCell extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private final BackupImageView backupImageView;
        private final AnimatedTextView bidTextView;
        private boolean drawDivider;
        private final AnimatedTextView nameTextView;
        private final AnimatedTextView placeTextView;
        private final ColoredImageSpan[] ref;

        public BidderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.ref = new ColoredImageSpan[1];
            setOrientation(0);
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.nameTextView = animatedTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            animatedTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            animatedTextView.setEllipsizeByGradient(true);
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
            this.bidTextView = animatedTextView2;
            animatedTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
            animatedTextView2.setTextSize(AndroidUtilities.dp(15.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.backupImageView = backupImageView;
            AnimatedTextView animatedTextView3 = new AnimatedTextView(context);
            this.placeTextView = animatedTextView3;
            animatedTextView3.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
            animatedTextView3.setTextColor(Theme.getColor(i, resourcesProvider));
            animatedTextView3.setTypeface(AndroidUtilities.bold());
            animatedTextView3.setGravity(17);
            addView(animatedTextView3, LayoutHelper.createLinear(66, -2, 0.0f, 16));
            addView(backupImageView, LayoutHelper.createLinear(32, 32, 0.0f, 16));
            addView(animatedTextView, LayoutHelper.createLinear(0, -2, 1.0f, 16));
            addView(animatedTextView2, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 0, 20, 0));
        }

        public void setUser(TLRPC.User user, boolean z) {
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(user);
            this.backupImageView.setForUserOrChat(user, avatarDrawable);
            this.backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
            this.nameTextView.setText(UserObject.getUserName(user));
        }

        public void setPlace(int i, boolean z, boolean z2) {
            if (!z || i > 3) {
                if (i >= 10000) {
                    this.placeTextView.setTextSize(AndroidUtilities.dp(12.0f));
                } else if (i >= 1000) {
                    this.placeTextView.setTextSize(AndroidUtilities.dp(14.0f));
                } else {
                    this.placeTextView.setTextSize(AndroidUtilities.dp(15.0f));
                }
                this.placeTextView.setText(Integer.toString(i), z2);
                return;
            }
            if (i == 1) {
                AnimatedTextView animatedTextView = this.placeTextView;
                animatedTextView.setText(Emoji.replaceWithRestrictedEmoji("🥇", animatedTextView.getPaint().getFontMetricsInt(), (Runnable) null), z2);
            } else if (i == 2) {
                AnimatedTextView animatedTextView2 = this.placeTextView;
                animatedTextView2.setText(Emoji.replaceWithRestrictedEmoji("🥈", animatedTextView2.getPaint().getFontMetricsInt(), (Runnable) null), z2);
            } else if (i == 3) {
                AnimatedTextView animatedTextView3 = this.placeTextView;
                animatedTextView3.setText(Emoji.replaceWithRestrictedEmoji("🥉", animatedTextView3.getPaint().getFontMetricsInt(), (Runnable) null), z2);
            }
        }

        public void setBid(long j, boolean z) {
            this.bidTextView.setText(StarsIntroActivity.replaceStarsWithPlain("⭐️" + LocaleController.formatNumber((int) j, ','), 0.78f, this.ref), z);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.drawDivider) {
                canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            this.placeTextView.invalidate();
        }
    }
}
