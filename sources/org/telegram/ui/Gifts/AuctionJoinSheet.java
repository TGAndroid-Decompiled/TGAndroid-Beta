package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkj;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCheckCell2$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.PremiumFeatureCell;
import org.telegram.ui.Stars.BagRandomizer;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda140;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda0;

public final class AuctionJoinSheet extends BottomSheetWithRecyclerListView implements GiftAuctionController.OnAuctionUpdateListener {
    public static final ButtonSpan.TextViewButtons[] ref = new ButtonSpan.TextViewButtons[1];
    public static final TableView.TableRowTitle[] ref2 = new TableView.TableRowTitle[1];
    public UniversalAdapter adapter;
    public GiftAuctionController.Auction auction;
    public final ButtonSpan.TextViewButtons auctionRowAvailabilityText;
    public final TableView.TableRowTitle auctionRowAvailabilityTitle;
    public final TableRow auctionRowAveragePrice;
    public final ButtonSpan.TextViewButtons auctionRowAveragePriceText;
    public final ButtonSpan.TextViewButtons auctionRowEndTimeText;
    public final ButtonSpan.TextViewButtons auctionRowStartTimeText;
    public final ButtonWithCounterView buttonView;
    public final CharSequence emojiGiftText;
    public final long giftId;
    public final FrameLayout headerContainer;
    public final TextView headerStatus;
    public final LinkSpanDrawable.LinksTextView itemsBought;
    public final LinearLayout linearLayout;
    public final GiftOfferSheet$$ExternalSyntheticLambda12 showHint;
    public final TL_stars.StarGift starGift;
    public final LinkSpanDrawable.LinksTextView subtitleTextView;

    public final class AnonymousClass1 extends GiftSheet.GiftCell {
        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public final class AnonymousClass2 extends SendGiftSheet {
        @Override
        public final BulletinFactory getParentBulletinFactory() {
            return BulletinFactory.of(this.container, this.resourcesProvider);
        }
    }

    public final class AnonymousClass4 extends ActionBar.ActionBarMenuOnItemClick {
        public final Context val$context;
        public final Theme.ResourcesProvider val$resourcesProvider;
        public final TL_stars.StarGift val$starGift;

        public AnonymousClass4(Context context, Theme.ResourcesProvider resourcesProvider, TL_stars.StarGift starGift) {
            this.val$starGift = starGift;
            this.val$context = context;
            this.val$resourcesProvider = resourcesProvider;
        }

        @Override
        public final void onItemClick(int i) {
            TL_stars.StarGift starGift = this.val$starGift;
            if (i != 3 && i != 2) {
                if (i == 4) {
                    AuctionJoinSheet.showMoreInfo(this.val$context, this.val$resourcesProvider, starGift);
                    return;
                }
                return;
            }
            String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
            if (i == 3) {
                AndroidUtilities.addToClipboard(str);
            } else {
                ShareAlert.createShareAlert(this.val$context, null, str, false, str, false).show();
            }
        }
    }

    public AuctionJoinSheet(Context context, Theme.ResourcesProvider resourcesProvider, long j, TL_stars.StarGift starGift, GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda10) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.FADING, resourcesProvider);
        this.starGift = starGift;
        long j2 = starGift.id;
        this.giftId = j2;
        this.headerMoveTop = AndroidUtilities.dp(6.0f);
        this.topPadding = 0.2f;
        fixNavigationBar();
        String str = starGift.title;
        str = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        ActionBar actionBar = new ActionBar(context, resourcesProvider);
        actionBar.setItemsColor(-1, false);
        actionBar.setOccupyStatusBar(false);
        actionBar.setActionBarMenuOnItemClick(new AnonymousClass4(context, resourcesProvider, starGift));
        ActionBarMenuItem actionBarMenuItemAddItem = actionBar.createMenu().addItem(0, R.drawable.ic_ab_other);
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        actionBarMenuItemAddItem.addSubItem(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        actionBarMenuItemAddItem.addSubItem(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        actionBarMenuItemAddItem.addSubItem(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
        FrameLayout frameLayout = new FrameLayout(context);
        this.headerContainer = frameLayout;
        frameLayout.addView(actionBar, LayoutHelper.createLinear(-1, -2));
        linearLayout.addView(frameLayout);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.currentAccount, resourcesProvider);
        anonymousClass1.priotityAuction = true;
        String str2 = str;
        anonymousClass1.setStarsGift(starGift, false, false, false, false, false);
        anonymousClass1.setImageSize(AndroidUtilities.dp(100.0f));
        anonymousClass1.setImageLayer(7);
        anonymousClass1.priceLayout.setVisibility(8);
        frameLayout.addView(anonymousClass1, LayoutHelper.createFrame(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 6));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        this.subtitleTextView = linksTextView;
        linksTextView.setGravity(17);
        linksTextView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new AuctionJoinSheet$$ExternalSyntheticLambda3(context, resourcesProvider, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        int i2 = Theme.key_windowBackgroundWhiteLinkText;
        linksTextView.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TableView tableView = new TableView(context, resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        ButtonSpan.TextViewButtons[] textViewButtonsArr = ref;
        tableView.addRow(string, "", textViewButtonsArr);
        this.auctionRowStartTimeText = textViewButtonsArr[0];
        tableView.addRow(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", textViewButtonsArr);
        this.auctionRowEndTimeText = textViewButtonsArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(tableView, LayoutHelper.createFrame(-1, -2, 119));
        this.showHint = new GiftOfferSheet$$ExternalSyntheticLambda12(this, new HintView2[1], frameLayout2, 2);
        TableRow tableRowAddRow = tableView.addRow(LocaleController.getString(R.string.GiftValueAveragePrice), "", textViewButtonsArr);
        this.auctionRowAveragePrice = tableRowAddRow;
        final int i3 = 1;
        tableRowAddRow.setOnClickListener(new View.OnClickListener(this) {
            public final AuctionJoinSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        new PremiumFeatureBottomSheet(this.f$0.getContext(), 40, (Theme.ResourcesProvider) null).show();
                        break;
                    default:
                        this.f$0.showAveragePriceHint();
                        break;
                }
            }
        });
        this.auctionRowAveragePriceText = textViewButtonsArr[0];
        TableView.TableRowTitle[] tableRowTitleArr = ref2;
        tableView.addRow("", "", tableRowTitleArr, textViewButtonsArr);
        this.auctionRowAvailabilityText = textViewButtonsArr[0];
        this.auctionRowAvailabilityTitle = tableRowTitleArr[0];
        linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 16.0f, 16.0f, 14.0f, 18.0f));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.itemsBought = linksTextView2;
        linksTextView2.setGravity(17);
        linksTextView2.setTextSize(1, 16.0f);
        linksTextView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView2.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, new boolean[1], resourcesProvider, 8));
        ScaleStateListAnimator.apply(linksTextView2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(starGift.sticker, linksTextView2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.emojiGiftText = spannableStringBuilder;
        } else {
            this.emojiGiftText = "";
        }
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setRound();
        buttonWithCounterView.setOnClickListener(new SendGiftSheet$$ExternalSyntheticLambda1(this, j, context, resourcesProvider, giftSheet$$ExternalSyntheticLambda10, 1));
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i4 = layoutParamsCreateFrame.leftMargin;
        int i5 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i4 + i5;
        layoutParamsCreateFrame.rightMargin += i5;
        this.containerView.addView(buttonWithCounterView, layoutParamsCreateFrame);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i6 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i6, 0, i6, AndroidUtilities.dp(64.0f));
        this.adapter.update(false);
        GiftAuctionController.Auction auctionSubscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j2, this);
        this.auction = auctionSubscribeToGiftAuction;
        if (auctionSubscribeToGiftAuction != null && (tL_starGiftAuctionState2 = auctionSubscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                tableView.addRow(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.auction.auctionStateActive.total_rounds, ','));
            } else {
                tableView.addRow(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.auction.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.auction.auctionStateActive.total_rounds, ',')));
            }
        }
        GiftAuctionController.Auction auction = this.auction;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.auction.auctionStateActive.rounds.get(i7);
                int i8 = i7 < size + (-1) ? this.auction.auctionStateActive.rounds.get(i7 + 1).num - 1 : this.auction.auctionStateActive.total_rounds;
                int i9 = starGiftAuctionRound.num;
                tableView.addRow(i9 == i8 ? LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOne, Integer.valueOf(i9)) : LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsTwo, Integer.valueOf(i9), Integer.valueOf(i8)), starGiftAuctionRound.num == i8 ? LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top)) : LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]));
                i7++;
            }
        }
        GiftAuctionController.Auction auction2 = this.auction;
        if (auction2 != null && auction2.previewAttributes != null) {
            int i10 = 9;
            StarGiftSheet.TopView topView = new StarGiftSheet.TopView(context, resourcesProvider, new AuctionJoinSheet$$ExternalSyntheticLambda11(this, 0), new BotAdView$$ExternalSyntheticLambda0(i10), new BotAdView$$ExternalSyntheticLambda0(i10), new BotAdView$$ExternalSyntheticLambda0(i10), new BotAdView$$ExternalSyntheticLambda0(i10), new BotAdView$$ExternalSyntheticLambda0(i10), new BotAdView$$ExternalSyntheticLambda0(i10)) {
                public final Path path = new Path();
                public final float[] r = new float[8];

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    canvas.save();
                    canvas.clipPath(this.path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }

                @Override
                public final int getFinalHeight() {
                    return AndroidUtilities.dp(288.0f);
                }

                @Override
                public final float getRealHeight() {
                    return AndroidUtilities.dp(288.0f);
                }

                @Override
                public final void onSizeChanged(int i11, int i12, int i13, int i14) {
                    super.onSizeChanged(i11, i12, i13, i14);
                    float fDp = AndroidUtilities.dp(12.0f);
                    float[] fArr = this.r;
                    fArr[3] = fDp;
                    fArr[2] = fDp;
                    fArr[1] = fDp;
                    fArr[0] = fDp;
                    Path path = this.path;
                    path.rewind();
                    path.addRoundRect(0.0f, 0.0f, i11, i12, this.r, Path.Direction.CW);
                }

                @Override
                public final void updateButtonsBackgrounds(int i11) {
                    AuctionJoinSheet auctionJoinSheet = AuctionJoinSheet.this;
                    TextView textView2 = auctionJoinSheet.headerStatus;
                    if (textView2 == null || !Theme.setSelectorDrawableColor(textView2.getBackground(), i11, false)) {
                        return;
                    }
                    auctionJoinSheet.headerStatus.invalidate();
                }
            };
            topView.onSwitchPage(new StarGiftSheet.PageTransition(1, 1));
            topView.setPreviewingAttributes(this.auction.previewAttributes);
            topView.removeView(topView.closeView);
            this.headerContainer.addView(topView, 0, LayoutHelper.createFrame(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.headerStatus = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            GiftAuctionController.Auction auction3 = this.auction;
            if (auction3.auctionStateFinished != null) {
                textView2.setText(LocaleController.getString(R.string.Gift2AuctionEndedNoDot));
            } else if (auction3.isUpcoming()) {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkUpcomingAuction));
            } else {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkGiftAuction));
            }
            textView2.setBackground(Theme.createRadSelectorDrawable(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView textViewM = zzkj.m(this.headerContainer, textView2, LayoutHelper.createFrame(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            textViewM.setTypeface(AndroidUtilities.bold());
            textViewM.setTextSize(1, 21.0f);
            textViewM.setText(str2);
            textViewM.setGravity(17);
            textViewM.setTextColor(-1);
            TextView textViewM2 = zzkj.m(this.headerContainer, textViewM, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            textViewM2.setTextSize(1, 13.0f);
            textViewM2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            textViewM2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            textViewM2.setGravity(17);
            textViewM2.setTextColor(-1342177281);
            final int i11 = 0;
            textViewM2.setOnClickListener(new View.OnClickListener(this) {
                public final AuctionJoinSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            new PremiumFeatureBottomSheet(this.f$0.getContext(), 40, (Theme.ResourcesProvider) null).show();
                            break;
                        default:
                            this.f$0.showAveragePriceHint();
                            break;
                    }
                }
            });
            ScaleStateListAnimator.apply(textViewM2, 0.02f, 1.5f);
            this.headerContainer.addView(textViewM2, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            anonymousClass1.setVisibility(8);
            textView.setVisibility(8);
            this.subtitleTextView.setVisibility(8);
            LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            linksTextView3.setGravity(17);
            linksTextView3.setTextSize(1, 16.0f);
            int i12 = Theme.key_windowBackgroundWhiteLinkText;
            linksTextView3.setTextColor(Theme.getColor(i12, resourcesProvider));
            linksTextView3.setLinkTextColor(Theme.getColor(i12, resourcesProvider));
            linksTextView3.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, context, resourcesProvider, 7));
            ScaleStateListAnimator.apply(linksTextView3, 0.02f, 1.5f);
            this.linearLayout.addView(linksTextView3, LayoutHelper.createLinear(-1, -2, 16.0f, 0.0f, 14.0f, 18.0f));
            BagRandomizer bagRandomizer = new BagRandomizer(TlUtils.findAllInstances(this.auction.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j3 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i13 = 0; i13 < 3; i13++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) bagRandomizer.next();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(stargiftattributemodel.document, linksTextView3.getPaint().getFontMetricsInt()), i13, i13 + 1, 33);
                }
            }
            linksTextView3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j3, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.linearLayout.addView(this.itemsBought, LayoutHelper.createLinear(-1, -2, 16.0f, 0.0f, 14.0f, 18.0f));
        updateTable$1(false);
    }

    public static void showMoreInfo(Context context, Theme.ResourcesProvider resourcesProvider, TL_stars.StarGift starGift) {
        if (context == null || starGift == null) {
            return;
        }
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, null);
        Runnable runnable = bottomSheetM.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
        imageView.setBackground(shapeDrawable);
        linearLayout.addView(imageView, LayoutHelper.createLinear(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
        textView.setTextSize(1, 20.0f);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 16));
        PremiumFeatureCell premiumFeatureCell = new PremiumFeatureCell(context, resourcesProvider);
        SimpleTextView simpleTextView = premiumFeatureCell.title;
        int i2 = starGift.gifts_per_round;
        simpleTextView.setText(LocaleController.formatPluralString("GiftAuctionInfo1Header", i2, Integer.valueOf(i2)));
        TextView textView3 = premiumFeatureCell.description;
        int i3 = starGift.gifts_per_round;
        textView3.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i3, Integer.valueOf(i3)));
        premiumFeatureCell.nextIcon.setVisibility(8);
        premiumFeatureCell.imageView.setImageResource(R.drawable.menu_top_bidders_24);
        premiumFeatureCell.imageView.setColorFilter(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(premiumFeatureCell, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, -2.0f));
        PremiumFeatureCell premiumFeatureCell2 = new PremiumFeatureCell(context, resourcesProvider);
        premiumFeatureCell2.title.setText(LocaleController.getString(R.string.GiftAuctionInfo2Header));
        premiumFeatureCell2.description.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
        premiumFeatureCell2.nextIcon.setVisibility(8);
        premiumFeatureCell2.imageView.setImageResource(R.drawable.menu_carryover_24);
        premiumFeatureCell2.imageView.setColorFilter(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(premiumFeatureCell2, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, -2.0f));
        PremiumFeatureCell premiumFeatureCell3 = new PremiumFeatureCell(context, resourcesProvider);
        premiumFeatureCell3.title.setText(LocaleController.getString(R.string.GiftAuctionInfo3Header));
        premiumFeatureCell3.description.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
        premiumFeatureCell3.nextIcon.setVisibility(8);
        premiumFeatureCell3.imageView.setImageResource(R.drawable.menu_bid_refund_24);
        premiumFeatureCell3.imageView.setColorFilter(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(premiumFeatureCell3, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, 8.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        buttonWithCounterView.setOnClickListener(new TextCheckCell2$$ExternalSyntheticLambda0(5, runnable));
        buttonWithCounterView.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 10.0f, 16.0f, 8.0f));
        bottomSheetM.customView = linearLayout;
        bottomSheetM.show();
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 18), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.giftId, this);
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final CharSequence getTitle() {
        return "";
    }

    public final void lambda$new$14(Context context, Theme.ResourcesProvider resourcesProvider) {
        int i = this.currentAccount;
        GiftAuctionController.Auction auction = this.auction;
        new StarGiftPreviewSheet(context, resourcesProvider, i, auction.gift.title, auction.previewAttributes, false).show();
        lambda$showGiftOfferSheet$15();
    }

    public final void lambda$new$5(boolean[] zArr, Theme.ResourcesProvider resourcesProvider) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(this.currentAccount).getOrRequestAcquiredGifts(this.giftId, new StarGiftSheet$$ExternalSyntheticLambda140(this, zArr, resourcesProvider, 2));
    }

    public final void lambda$new$6(long j, Context context, Theme.ResourcesProvider resourcesProvider, GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda10) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = this.auction;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId()) && (arrayList = (auction = this.auction).previewAttributes) != null) {
                new AuctionWearingSheet(context, resourcesProvider, j, auction.gift, arrayList, giftSheet$$ExternalSyntheticLambda10, false).show();
            } else {
                new AnonymousClass2(context, this.currentAccount, this.auction.gift, null, j, giftSheet$$ExternalSyntheticLambda10, false, false).show();
            }
        }
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.auction = auction;
        updateTable$1(true);
    }

    public final void showAveragePriceHint() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.auction;
        if (auction == null || (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) == null || auction.gift.title == null) {
            return;
        }
        this.showHint.run(this.auctionRowAveragePriceText, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.auction.gift.title));
    }

    public final void updateTable$1(boolean z) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.auction;
        ButtonWithCounterView buttonWithCounterView = this.buttonView;
        ButtonSpan.TextViewButtons textViewButtons = this.auctionRowEndTimeText;
        ButtonSpan.TextViewButtons textViewButtons2 = this.auctionRowStartTimeText;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null) {
            textViewButtons2.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            textViewButtons.setText(LocaleController.formatDateTime(this.auction.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(this.auction.auctionStateFinished.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append(ButtonSpan.make("?", new AuctionJoinSheet$$ExternalSyntheticLambda11(this, 1), this.resourcesProvider));
            this.auctionRowAveragePriceText.setText(spannableStringBuilder);
        } else if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null) {
            textViewButtons2.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            textViewButtons.setText(LocaleController.formatDateTime(this.auction.auctionStateActive.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.auction.isUpcoming(currentTime)) {
                buttonWithCounterView.setSubText(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.auction.auctionStateActive.start_date - currentTime)), z);
            } else {
                buttonWithCounterView.setSubText(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.auction.auctionStateActive.end_date - currentTime)), z);
            }
        }
        GiftAuctionController.Auction auction2 = this.auction;
        TL_stars.StarGift starGift = this.starGift;
        if (auction2 == null) {
            i = starGift.availability_remains;
        } else if (auction2.isFinished()) {
            i = 0;
        } else {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.auction.auctionStateActive;
            if (tL_starGiftAuctionState2 != null) {
                i = tL_starGiftAuctionState2.gifts_left;
            } else {
                i = starGift.availability_remains;
            }
        }
        int i2 = starGift.availability_total;
        ButtonSpan.TextViewButtons textViewButtons3 = this.auctionRowAvailabilityText;
        TableView.TableRowTitle tableRowTitle = this.auctionRowAvailabilityTitle;
        if (i == i2) {
            tableRowTitle.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
            textViewButtons3.setText(LocaleController.formatNumber(i2, ','));
        } else {
            tableRowTitle.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
            textViewButtons3.setText(LocaleController.formatPluralString("Gift2Availability4Value", i, LocaleController.formatNumber(i2, ',')));
        }
        int i3 = this.auction.auctionUserState.acquired_count;
        LinkSpanDrawable.LinksTextView linksTextView = this.itemsBought;
        if (i3 > 0) {
            linksTextView.setVisibility(0);
            linksTextView.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i3, this.emojiGiftText), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        } else {
            linksTextView.setVisibility(8);
        }
        GiftAuctionController.Auction auction3 = this.auction;
        TableRow tableRow = this.auctionRowAveragePrice;
        if ((auction3 == null || auction3.auctionStateFinished == null) && !starGift.sold_out) {
            tableRow.setVisibility(8);
            buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2AuctionJoin), z);
            return;
        }
        String string = LocaleController.getString(R.string.Gift2AuctionEnded);
        LinkSpanDrawable.LinksTextView linksTextView2 = this.subtitleTextView;
        linksTextView2.setText(string);
        linksTextView2.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        tableRow.setVisibility(0);
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), z);
        buttonWithCounterView.setSubText(null, z);
    }
}
