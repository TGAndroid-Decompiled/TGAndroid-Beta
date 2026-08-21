package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
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
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.PremiumFeatureCell;
import org.telegram.ui.Stars.BagRandomizer;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class AuctionJoinSheet extends BottomSheetWithRecyclerListView implements GiftAuctionController.OnAuctionUpdateListener {
    private static final ButtonSpan.TextViewButtons[] ref = new ButtonSpan.TextViewButtons[1];
    private static final TableView.TableRowTitle[] ref2 = new TableView.TableRowTitle[1];
    private UniversalAdapter adapter;
    private GiftAuctionController.Auction auction;
    private final ButtonSpan.TextViewButtons auctionRowAvailabilityText;
    private final TableView.TableRowTitle auctionRowAvailabilityTitle;
    private final TableRow auctionRowAveragePrice;
    private final ButtonSpan.TextViewButtons auctionRowAveragePriceText;
    private final ButtonSpan.TextViewButtons auctionRowEndTimeText;
    private final ButtonSpan.TextViewButtons auctionRowStartTimeText;
    private final ButtonWithCounterView buttonView;
    private final CharSequence emojiGiftText;
    private final long giftId;
    private final FrameLayout headerContainer;
    private TextView headerStatus;
    private final LinkSpanDrawable.LinksTextView itemsBought;
    private final LinearLayout linearLayout;
    private final Utilities.Callback2 showHint;
    private final TL_stars.StarGift starGift;
    private final LinkSpanDrawable.LinksTextView subtitleTextView;

    public static void $r8$lambda$1DUxjYFtE69U_qFQRtChVoxzGr8(View view) {
    }

    public static void m3195$r8$lambda$6BJrnfi3ZJ3cJs3Bf_9BJtCOLU(View view) {
    }

    public static void $r8$lambda$YeUq2LReHHi1r1GAtZp0wUyzLtQ(View view) {
    }

    public static void m3199$r8$lambda$_AmuCjii1BRDD1h5poia39kI0(View view) {
    }

    public static void $r8$lambda$evhnpTfZlwrtcMSOiMiajabj5Lo(View view) {
    }

    public static void m3202$r8$lambda$lOauVwazGWP_yO4vu_vKA8mJfY(View view) {
    }

    private AuctionJoinSheet(final Context context, final Theme.ResourcesProvider resourcesProvider, final long j, final TL_stars.StarGift starGift, final Runnable runnable) {
        int i;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i2;
        String string;
        String pluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.FADING, resourcesProvider);
        this.starGift = starGift;
        long j2 = starGift.id;
        this.giftId = j2;
        this.headerMoveTop = AndroidUtilities.dp(6.0f);
        this.topPadding = 0.2f;
        fixNavigationBar();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        ActionBar actionBar = new ActionBar(context, resourcesProvider);
        actionBar.setItemsColor(-1, false);
        actionBar.setOccupyStatusBar(false);
        initActionBar(actionBar, context, resourcesProvider, this.currentAccount, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.headerContainer = frameLayout;
        frameLayout.addView(actionBar, LayoutHelper.createLinear(-1, -2));
        linearLayout.addView(frameLayout);
        GiftSheet.GiftCell giftCell = new GiftSheet.GiftCell(context, this.currentAccount, resourcesProvider) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        giftCell.setPriorityAuction();
        giftCell.setStarsGift(starGift, false, false, false, false, false);
        giftCell.setImageSize(AndroidUtilities.dp(100.0f));
        giftCell.setImageLayer(7);
        giftCell.hidePrice();
        frameLayout.addView(giftCell, LayoutHelper.createFrame(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i3, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 6));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        this.subtitleTextView = linksTextView;
        linksTextView.setGravity(17);
        linksTextView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new Runnable() {
            @Override
            public final void run() {
                AuctionJoinSheet.showMoreInfo(context, resourcesProvider, starGift);
            }
        }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
        int i4 = Theme.key_windowBackgroundWhiteLinkText;
        linksTextView.setLinkTextColor(Theme.getColor(i4, resourcesProvider));
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TableView tableView = new TableView(context, resourcesProvider);
        String string2 = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        ButtonSpan.TextViewButtons[] textViewButtonsArr = ref;
        tableView.addRow(string2, "", textViewButtonsArr);
        this.auctionRowStartTimeText = textViewButtonsArr[0];
        tableView.addRow(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", textViewButtonsArr);
        this.auctionRowEndTimeText = textViewButtonsArr[0];
        final FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(tableView, LayoutHelper.createFrame(-1, -2, 119));
        final HintView2[] hintView2Arr = new HintView2[1];
        this.showHint = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                AuctionJoinSheet.m3203$r8$lambda$o3NL3m2WpXqLKzIKw8DRS3cvA(this.f$0, hintView2Arr, frameLayout2, (View) obj, (CharSequence) obj2);
            }
        };
        TableRow tableRowAddRow = tableView.addRow(LocaleController.getString(R.string.GiftValueAveragePrice), "", textViewButtonsArr);
        this.auctionRowAveragePrice = tableRowAddRow;
        tableRowAddRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.showAveragePriceHint();
            }
        });
        this.auctionRowAveragePriceText = textViewButtonsArr[0];
        TableView.TableRowTitle[] tableRowTitleArr = ref2;
        tableView.addRow("", "", tableRowTitleArr, textViewButtonsArr);
        this.auctionRowAvailabilityText = textViewButtonsArr[0];
        this.auctionRowAvailabilityTitle = tableRowTitleArr[0];
        linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 16.0f, 16.0f, 14.0f, 18.0f));
        final boolean[] zArr = new boolean[1];
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.itemsBought = linksTextView2;
        linksTextView2.setGravity(17);
        linksTextView2.setTextSize(1, 16.0f);
        linksTextView2.setTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionJoinSheet.m3194$r8$lambda$3PXWKSWkocdOqfY2fnj0IrdPz8(this.f$0, zArr, resourcesProvider, view);
            }
        });
        ScaleStateListAnimator.apply(linksTextView2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(starGift.sticker, linksTextView2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.emojiGiftText = spannableStringBuilder;
        } else {
            this.emojiGiftText = "";
        }
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setRound();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionJoinSheet.$r8$lambda$ZilYHHa2cKuYr4qM7A10dFSdZeM(this.f$0, j, context, resourcesProvider, runnable, view);
            }
        });
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i5 = layoutParamsCreateFrame.leftMargin;
        int i6 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i5 + i6;
        layoutParamsCreateFrame.rightMargin += i6;
        this.containerView.addView(buttonWithCounterView, layoutParamsCreateFrame);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i7 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i7, 0, i7, AndroidUtilities.dp(64.0f));
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
            for (int i8 = 0; i8 < size; i8++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.auction.auctionStateActive.rounds.get(i8);
                if (i8 < size - 1) {
                    i2 = this.auction.auctionStateActive.rounds.get(i8 + 1).num - 1;
                } else {
                    i2 = this.auction.auctionStateActive.total_rounds;
                }
                int i9 = starGiftAuctionRound.num;
                if (i9 == i2) {
                    string = LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOne, Integer.valueOf(i9));
                } else {
                    string = LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsTwo, Integer.valueOf(i9), Integer.valueOf(i2));
                }
                if (starGiftAuctionRound.num == i2) {
                    pluralString = LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top));
                } else {
                    pluralString = LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]);
                }
                tableView.addRow(string, pluralString);
            }
        }
        GiftAuctionController.Auction auction2 = this.auction;
        if (auction2 != null && auction2.previewAttributes != null) {
            StarGiftSheet.TopView topView = new StarGiftSheet.TopView(context, resourcesProvider, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.onBackPressed();
                }
            }, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionJoinSheet.$r8$lambda$1DUxjYFtE69U_qFQRtChVoxzGr8(view);
                }
            }, null, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionJoinSheet.$r8$lambda$evhnpTfZlwrtcMSOiMiajabj5Lo(view);
                }
            }, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionJoinSheet.m3202$r8$lambda$lOauVwazGWP_yO4vu_vKA8mJfY(view);
                }
            }, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionJoinSheet.m3199$r8$lambda$_AmuCjii1BRDD1h5poia39kI0(view);
                }
            }, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionJoinSheet.m3195$r8$lambda$6BJrnfi3ZJ3cJs3Bf_9BJtCOLU(view);
                }
            }, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionJoinSheet.$r8$lambda$YeUq2LReHHi1r1GAtZp0wUyzLtQ(view);
                }
            }) {
                Path path = new Path();
                float[] r = new float[8];

                @Override
                public float getRealHeight() {
                    return AndroidUtilities.dp(288.0f);
                }

                @Override
                public int getFinalHeight() {
                    return AndroidUtilities.dp(288.0f);
                }

                @Override
                protected void onSizeChanged(int i10, int i11, int i12, int i13) {
                    super.onSizeChanged(i10, i11, i12, i13);
                    float[] fArr = this.r;
                    float fDp = AndroidUtilities.dp(12.0f);
                    fArr[3] = fDp;
                    fArr[2] = fDp;
                    fArr[1] = fDp;
                    fArr[0] = fDp;
                    this.path.rewind();
                    this.path.addRoundRect(0.0f, 0.0f, i10, i11, this.r, Path.Direction.CW);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    canvas.save();
                    canvas.clipPath(this.path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }

                @Override
                protected void updateButtonsBackgrounds(int i10) {
                    super.updateButtonsBackgrounds(i10);
                    if (AuctionJoinSheet.this.headerStatus == null || !Theme.setSelectorDrawableColor(AuctionJoinSheet.this.headerStatus.getBackground(), i10, false)) {
                        return;
                    }
                    AuctionJoinSheet.this.headerStatus.invalidate();
                }
            };
            topView.onSwitchPage(new StarGiftSheet.PageTransition(1, 1, 1.0f));
            topView.setPreviewingAttributes(this.auction.previewAttributes);
            topView.hideCloseButton();
            this.headerContainer.addView(topView, 0, LayoutHelper.createFrame(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.headerStatus = textView2;
            textView2.setGravity(17);
            this.headerStatus.setTypeface(AndroidUtilities.bold());
            this.headerStatus.setTextColor(-1);
            this.headerStatus.setTextSize(1, 12.0f);
            GiftAuctionController.Auction auction3 = this.auction;
            if (auction3.auctionStateFinished != null) {
                this.headerStatus.setText(LocaleController.getString(R.string.Gift2AuctionEndedNoDot));
            } else if (auction3.isUpcoming()) {
                this.headerStatus.setText(LocaleController.getString(R.string.Gift2LinkUpcomingAuction));
            } else {
                this.headerStatus.setText(LocaleController.getString(R.string.Gift2LinkGiftAuction));
            }
            this.headerStatus.setBackground(Theme.createRadSelectorDrawable(0, 285212671, 13, 13));
            this.headerStatus.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.headerContainer.addView(this.headerStatus, LayoutHelper.createFrame(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 21.0f);
            textView3.setText(str2);
            textView3.setGravity(17);
            textView3.setTextColor(-1);
            this.headerContainer.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 13.0f);
            textView4.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            textView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            textView4.setGravity(17);
            textView4.setTextColor(-1342177281);
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    new PremiumFeatureBottomSheet(this.f$0.getContext(), 40, true, (Theme.ResourcesProvider) null).show();
                }
            });
            ScaleStateListAnimator.apply(textView4, 0.02f, 1.5f);
            this.headerContainer.addView(textView4, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            giftCell.setVisibility(8);
            textView.setVisibility(8);
            this.subtitleTextView.setVisibility(8);
            LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            linksTextView3.setGravity(17);
            linksTextView3.setTextSize(1, 16.0f);
            int i10 = Theme.key_windowBackgroundWhiteLinkText;
            linksTextView3.setTextColor(Theme.getColor(i10, resourcesProvider));
            linksTextView3.setLinkTextColor(Theme.getColor(i10, resourcesProvider));
            linksTextView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionJoinSheet.$r8$lambda$oODoYFiuw5qYHUBsC4A8eC3ltFc(this.f$0, context, resourcesProvider, view);
                }
            });
            ScaleStateListAnimator.apply(linksTextView3, 0.02f, 1.5f);
            this.linearLayout.addView(linksTextView3, LayoutHelper.createLinear(-1, -2, 16.0f, 0.0f, 14.0f, 18.0f));
            BagRandomizer bagRandomizer = new BagRandomizer(TlUtils.findAllInstances(this.auction.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j3 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            int i11 = 0;
            while (i11 < 3) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) bagRandomizer.next();
                if (stargiftattributemodel == null) {
                    i = 1;
                } else {
                    spannableStringBuilder2.append('*');
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(stargiftattributemodel.document, linksTextView3.getPaint().getFontMetricsInt());
                    i = 1;
                    spannableStringBuilder2.setSpan(animatedEmojiSpan, i11, i11 + 1, 33);
                }
                i11 += i;
            }
            linksTextView3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j3, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.linearLayout.addView(this.itemsBought, LayoutHelper.createLinear(-1, -2, 16.0f, 0.0f, 14.0f, 18.0f));
        updateTable(false);
    }

    public static void m3203$r8$lambda$o3NL3m2WpXqLKzIKw8DRS3cvA(AuctionJoinSheet auctionJoinSheet, HintView2[] hintView2Arr, FrameLayout frameLayout, View view, CharSequence charSequence) {
        ButtonSpan buttonSpan;
        auctionJoinSheet.getClass();
        HintView2 hintView2 = hintView2Arr[0];
        if (hintView2 != null) {
            hintView2.hide();
        }
        CharSequence charSequenceReplaceTags = AndroidUtilities.replaceTags(charSequence);
        float x = view.getX() + ((View) view.getParent()).getX() + ((View) ((View) view.getParent()).getParent()).getX();
        float y = view.getY() + ((View) view.getParent()).getY() + ((View) ((View) view.getParent()).getParent()).getY();
        if (view instanceof ButtonSpan.TextViewButtons) {
            Layout layout = ((ButtonSpan.TextViewButtons) view).getLayout();
            CharSequence text = layout.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(0, text.length(), ButtonSpan.class);
                if (buttonSpanArr.length > 0 && (buttonSpan = buttonSpanArr[0]) != null) {
                    int spanStart = spanned.getSpanStart(buttonSpan);
                    x += layout.getPrimaryHorizontal(spanStart) + (buttonSpanArr[0].getSize() / 2);
                    y += layout.getLineTop(layout.getLineForOffset(spanStart));
                }
            }
        }
        final HintView2 hintView3 = new HintView2(auctionJoinSheet.getContext(), 3);
        hintView2Arr[0] = hintView3;
        hintView3.setMultilineText(true);
        hintView3.setInnerPadding(11.0f, 8.0f, 11.0f, 7.0f);
        hintView3.setRounding(10.0f);
        hintView3.setText(charSequenceReplaceTags);
        hintView3.setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.removeFromParent(hintView3);
            }
        });
        hintView3.setTranslationY((-AndroidUtilities.dp(100.0f)) + y);
        hintView3.setMaxWidthPx(AndroidUtilities.dp(300.0f));
        hintView3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        hintView3.setJointPx(0.0f, x - AndroidUtilities.dp(4.0f));
        frameLayout.addView(hintView3, LayoutHelper.createFrame(-1, 100, 55));
        hintView3.show();
    }

    public static void m3194$r8$lambda$3PXWKSWkocdOqfY2fnj0IrdPz8(final AuctionJoinSheet auctionJoinSheet, final boolean[] zArr, final Theme.ResourcesProvider resourcesProvider, View view) {
        auctionJoinSheet.getClass();
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(auctionJoinSheet.currentAccount).getOrRequestAcquiredGifts(auctionJoinSheet.giftId, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                AuctionJoinSheet.$r8$lambda$sm9h2ZckasVc9aKVWJE2AszHSTI(this.f$0, zArr, resourcesProvider, (List) obj);
            }
        });
    }

    public static void $r8$lambda$sm9h2ZckasVc9aKVWJE2AszHSTI(AuctionJoinSheet auctionJoinSheet, boolean[] zArr, Theme.ResourcesProvider resourcesProvider, List list) {
        auctionJoinSheet.getClass();
        zArr[0] = false;
        if (auctionJoinSheet.auction != null) {
            new AcquiredGiftsSheet(auctionJoinSheet.getContext(), resourcesProvider, auctionJoinSheet.auction, list).show();
            auctionJoinSheet.dismiss();
        }
    }

    public static void $r8$lambda$ZilYHHa2cKuYr4qM7A10dFSdZeM(AuctionJoinSheet auctionJoinSheet, long j, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable, View view) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = auctionJoinSheet.auction;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j == 0 || j == UserConfig.getInstance(auctionJoinSheet.currentAccount).getClientUserId()) && (arrayList = (auction = auctionJoinSheet.auction).previewAttributes) != null) {
                new AuctionWearingSheet(context, resourcesProvider, j, auction.gift, arrayList, runnable, false).show();
            } else {
                new SendGiftSheet(context, auctionJoinSheet.currentAccount, auctionJoinSheet.auction.gift, j, runnable, false, false) {
                    @Override
                    protected BulletinFactory getParentBulletinFactory() {
                        return BulletinFactory.of(this.container, this.resourcesProvider);
                    }
                }.show();
            }
        }
        auctionJoinSheet.dismiss();
    }

    public static void $r8$lambda$oODoYFiuw5qYHUBsC4A8eC3ltFc(AuctionJoinSheet auctionJoinSheet, Context context, Theme.ResourcesProvider resourcesProvider, View view) {
        int i = auctionJoinSheet.currentAccount;
        GiftAuctionController.Auction auction = auctionJoinSheet.auction;
        new StarGiftPreviewSheet(context, resourcesProvider, i, auction.gift.title, auction.previewAttributes, false).show();
        auctionJoinSheet.dismiss();
    }

    public void showAveragePriceHint() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.auction;
        if (auction == null || (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) == null || auction.gift.title == null) {
            return;
        }
        this.showHint.run(this.auctionRowAveragePriceText, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.auction.gift.title));
    }

    private void updateTable(boolean z) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.auction;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null) {
            this.auctionRowStartTimeText.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            this.auctionRowEndTimeText.setText(LocaleController.formatDateTime(this.auction.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StarsIntroActivity.replaceStarsWithPlain("⭐️ " + LocaleController.formatNumber(this.auction.auctionStateFinished.average_price, ','), 0.8f));
            spannableStringBuilder.append((CharSequence) " ").append(ButtonSpan.make("?", new Runnable() {
                @Override
                public final void run() {
                    this.f$0.showAveragePriceHint();
                }
            }, this.resourcesProvider));
            this.auctionRowAveragePriceText.setText(spannableStringBuilder);
        } else if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null) {
            this.auctionRowStartTimeText.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            this.auctionRowEndTimeText.setText(LocaleController.formatDateTime(this.auction.auctionStateActive.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.auction.isUpcoming(currentTime)) {
                this.buttonView.setSubText(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.auction.auctionStateActive.start_date - currentTime)), z);
            } else {
                this.buttonView.setSubText(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.auction.auctionStateActive.end_date - currentTime)), z);
            }
        }
        GiftAuctionController.Auction auction2 = this.auction;
        if (auction2 == null) {
            i = this.starGift.availability_remains;
        } else if (auction2.isFinished()) {
            i = 0;
        } else {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.auction.auctionStateActive;
            if (tL_starGiftAuctionState2 != null) {
                i = tL_starGiftAuctionState2.gifts_left;
            } else {
                i = this.starGift.availability_remains;
            }
        }
        int i2 = this.starGift.availability_total;
        if (i == i2) {
            this.auctionRowAvailabilityTitle.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
            this.auctionRowAvailabilityText.setText(LocaleController.formatNumber(i2, ','));
        } else {
            this.auctionRowAvailabilityTitle.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
            this.auctionRowAvailabilityText.setText(LocaleController.formatPluralString("Gift2Availability4Value", i, LocaleController.formatNumber(i2, ',')));
        }
        int i3 = this.auction.auctionUserState.acquired_count;
        if (i3 > 0) {
            this.itemsBought.setVisibility(0);
            this.itemsBought.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i3, this.emojiGiftText), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        } else {
            this.itemsBought.setVisibility(8);
        }
        GiftAuctionController.Auction auction3 = this.auction;
        if ((auction3 != null && auction3.auctionStateFinished != null) || this.starGift.sold_out) {
            this.subtitleTextView.setText(LocaleController.getString(R.string.Gift2AuctionEnded));
            this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
            this.auctionRowAveragePrice.setVisibility(0);
            this.buttonView.setText(LocaleController.getString(R.string.OK), z);
            this.buttonView.setSubText(null, z);
            return;
        }
        this.auctionRowAveragePrice.setVisibility(8);
        this.buttonView.setText(LocaleController.getString(R.string.Gift2AuctionJoin), z);
    }

    @Override
    public void onUpdate(GiftAuctionController.Auction auction) {
        this.auction = auction;
        updateTable(true);
    }

    @Override
    public void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.giftId, this);
        super.dismiss();
    }

    @Override
    protected CharSequence getTitle() {
        return "";
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
        arrayList.add(UItem.asCustom(-1, this.linearLayout));
    }

    public static void showMoreInfo(Context context, Theme.ResourcesProvider resourcesProvider, TL_stars.StarGift starGift) {
        if (context == null || starGift == null) {
            return;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context);
        final Runnable dismissRunnable = builder.getDismissRunnable();
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
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                dismissRunnable.run();
            }
        });
        buttonWithCounterView.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 10.0f, 16.0f, 8.0f));
        builder.setCustomView(linearLayout);
        builder.show();
    }

    public static void show(final Context context, final Theme.ResourcesProvider resourcesProvider, final int i, final long j, long j2, final Runnable runnable) {
        GiftAuctionController.getInstance(i).getOrRequestAuction(j2, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                AuctionJoinSheet.m3201$r8$lambda$hP_lRUuYCaP75u8lhXvsZQZlQw(context, resourcesProvider, i, j, runnable, (GiftAuctionController.Auction) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void m3201$r8$lambda$hP_lRUuYCaP75u8lhXvsZQZlQw(Context context, Theme.ResourcesProvider resourcesProvider, int i, long j, Runnable runnable, GiftAuctionController.Auction auction, TLRPC.TL_error tL_error) {
        if (auction != null) {
            show(context, resourcesProvider, i, j, auction, runnable);
        }
    }

    private static void show(final Context context, Theme.ResourcesProvider resourcesProvider, final int i, final long j, final GiftAuctionController.Auction auction, final Runnable runnable) {
        if (auction == null) {
            return;
        }
        long j2 = UserConfig.getInstance(i).clientUserId;
        long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
        if (j != peerDialogId && j != 0 && peerDialogId != 0) {
            openAuctionTransferAlert(context, resourcesProvider, i, peerDialogId, j, new Runnable() {
                @Override
                public final void run() {
                    new SendGiftSheet(context, i, auction.gift, j, runnable, false, false).show();
                }
            });
            return;
        }
        if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
            AuctionBidSheet auctionBidSheet = new AuctionBidSheet(context, resourcesProvider, null, auction);
            auctionBidSheet.setCloseParentSheet(runnable);
            auctionBidSheet.show();
            return;
        }
        new AuctionJoinSheet(context, resourcesProvider, j, auction.gift, runnable).show();
    }

    public static void initActionBar(ActionBar actionBar, final Context context, final Theme.ResourcesProvider resourcesProvider, int i, final TL_stars.StarGift starGift) {
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 != 3 && i2 != 2) {
                    if (i2 == 4) {
                        AuctionJoinSheet.showMoreInfo(context, resourcesProvider, starGift);
                        return;
                    }
                    return;
                }
                String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
                if (i2 == 3) {
                    AndroidUtilities.addToClipboard(str);
                } else {
                    ShareAlert.createShareAlert(context, null, str, false, str, false).show();
                }
            }
        });
        ActionBarMenuItem actionBarMenuItemAddItem = actionBar.createMenu().addItem(0, R.drawable.ic_ab_other);
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        actionBarMenuItemAddItem.addSubItem(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        actionBarMenuItemAddItem.addSubItem(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        actionBarMenuItemAddItem.addSubItem(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    private static void openAuctionTransferAlert(Context context, Theme.ResourcesProvider resourcesProvider, int i, long j, long j2, final Runnable runnable) {
        TLObject chat;
        TLObject chat2;
        if (j >= 0) {
            chat = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        } else {
            chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        }
        if (j2 >= 0) {
            chat2 = MessagesController.getInstance(i).getUser(Long.valueOf(j2));
        } else {
            chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(-j2));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new StarGiftSheet.UserToUserTransferTopView(context, chat, chat2), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        NotificationCenter.listenEmojiLoading(textView);
        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 16.0f);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AuctionsChangeRecipient2, DialogObject.getShortName(j), DialogObject.getShortName(j2))));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
        new AlertDialog.Builder(context, resourcesProvider).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                runnable.run();
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().show();
    }
}
