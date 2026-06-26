package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.PremiumFeatureCell;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class AuctionWearingSheet extends BottomSheetWithRecyclerListView implements GiftAuctionController.OnAuctionUpdateListener {
    private UniversalAdapter adapter;
    private GiftAuctionController.Auction auction;
    private final ButtonWithCounterView buttonView;
    private final GiftSheet.GiftCell giftCell2;
    private final long giftId;
    private final TextView giftNameTextView;
    private final FrameLayout headerContainer;
    private final LinearLayout linearLayout;
    private final TL_stars.StarGift starGift;
    private final StarGiftSheet.TopView topView;

    public static void lambda$new$0(View view) {
    }

    public static void lambda$new$1(View view) {
    }

    public static void lambda$new$2(View view) {
    }

    public static void lambda$new$3(View view) {
    }

    public static void lambda$new$4(View view) {
    }

    public static void lambda$new$5(View view) {
    }

    private void updateTable(boolean z) {
    }

    public AuctionWearingSheet(final Context context, final Theme.ResourcesProvider resourcesProvider, final long j, final TL_stars.StarGift starGift, final ArrayList arrayList, final Runnable runnable, boolean z) {
        AvatarDrawable avatarDrawable;
        TLRPC.Chat chat;
        TextView textView;
        int i;
        LinkSpanDrawable.LinksTextView linksTextView;
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.FADING, resourcesProvider);
        this.starGift = starGift;
        long j2 = starGift.id;
        this.giftId = j2;
        this.headerMoveTop = AndroidUtilities.dp(6.0f);
        this.topPadding = 0.2f;
        setBackgroundColor(getBackgroundColor());
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (ViewPositionWatcher.computeRectInParent(AuctionWearingSheet.this.topView.imageLayout, this, this.rectF) && ViewPositionWatcher.computeRectInParent(AuctionWearingSheet.this.giftNameTextView, this, this.rectF2)) {
                    float fDp = this.rectF2.right - AndroidUtilities.dp(32.0f);
                    float fCenterY = this.rectF2.centerY() - AndroidUtilities.dp(16.0f);
                    if (this.rectF.isEmpty()) {
                        return;
                    }
                    canvas.save();
                    canvas.translate(fDp, fCenterY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / this.rectF.width(), AndroidUtilities.dp(32.0f) / this.rectF.height());
                    AuctionWearingSheet.this.topView.imageLayout.draw(canvas);
                    canvas.restore();
                }
            }
        };
        this.headerContainer = frameLayout;
        linearLayout.addView(frameLayout);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setRound();
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i2 = layoutParamsCreateFrame.leftMargin;
        int i3 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i2 + i3;
        layoutParamsCreateFrame.rightMargin += i3;
        this.containerView.addView(buttonWithCounterView, layoutParamsCreateFrame);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i4 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i4, 0, i4, AndroidUtilities.dp(64.0f));
        this.adapter.update(false);
        int i5 = z ? 220 : 208;
        this.auction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j2, this);
        final int i6 = i5;
        StarGiftSheet.TopView topView = new StarGiftSheet.TopView(context, resourcesProvider, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openCrafting$8();
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionWearingSheet.lambda$new$0(view);
            }
        }, null, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionWearingSheet.lambda$new$1(view);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionWearingSheet.lambda$new$2(view);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionWearingSheet.lambda$new$3(view);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionWearingSheet.lambda$new$4(view);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AuctionWearingSheet.lambda$new$5(view);
            }
        }) {
            Path path = new Path();
            float[] r = new float[8];

            @Override
            public float getRealHeight() {
                return AndroidUtilities.dp(i6);
            }

            @Override
            public int getFinalHeight() {
                return AndroidUtilities.dp(i6);
            }

            @Override
            protected void onSizeChanged(int i7, int i8, int i9, int i10) {
                super.onSizeChanged(i7, i8, i9, i10);
                float[] fArr = this.r;
                float fDp = AndroidUtilities.dp(12.0f);
                fArr[3] = fDp;
                fArr[2] = fDp;
                fArr[1] = fDp;
                fArr[0] = fDp;
                this.path.rewind();
                this.path.addRoundRect(0.0f, 0.0f, i7, i8, this.r, Path.Direction.CW);
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j3) {
                if (view == this.imageLayout) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                canvas.save();
                canvas.clipPath(this.path);
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            protected void updateButtonsBackgrounds(int i7) {
                super.updateButtonsBackgrounds(i7);
                AuctionWearingSheet.this.giftCell2.setRibbonColor(i7);
            }

            @Override
            public void invalidate() {
                super.invalidate();
                if (AuctionWearingSheet.this.giftCell2 != null) {
                    AuctionWearingSheet.this.giftCell2.invalidate();
                }
            }
        };
        this.topView = topView;
        topView.onSwitchPage(new StarGiftSheet.PageTransition(1, 1, 1.0f));
        topView.setPreviewingAttributes(arrayList);
        topView.hideCloseButton();
        frameLayout.addView(topView, 0, LayoutHelper.createFrame(-1, i6, 48));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(45.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        if (j == 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            avatarDrawable = new AvatarDrawable(user);
            chat = user;
        } else if (j > 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            avatarDrawable = new AvatarDrawable(user2);
            chat = user2;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            avatarDrawable = new AvatarDrawable(chat2);
            chat = chat2;
        }
        backupImageView.setForUserOrChat(chat, avatarDrawable);
        TextView textView2 = new TextView(context);
        this.giftNameTextView = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 21.0f);
        textView2.setText(DialogObject.getShortName(j != 0 ? j : UserConfig.getInstance(this.currentAccount).getClientUserId()));
        textView2.setGravity(17);
        textView2.setTextColor(-1);
        textView2.setPadding(0, 0, AndroidUtilities.dp(36.0f), 0);
        textView2.setSingleLine();
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView3.setGravity(17);
        textView3.setTextColor(-1342177281);
        if (z) {
            textView3.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            textView = textView3;
            i = 17;
        } else {
            textView3.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            textView = textView3;
            i = 17;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AuctionWearingSheet.lambda$new$6(context, resourcesProvider, j, starGift, arrayList, view);
                }
            });
            ScaleStateListAnimator.apply(textView, 0.02f, 1.5f);
        }
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(i);
        linearLayout2.setClickable(true);
        GiftSheet.GiftCell giftCell = new GiftSheet.GiftCell(context, this.currentAccount, resourcesProvider) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        giftCell.setPriorityAuction();
        giftCell.setStarsGift(starGift, true, false, false, false, false);
        giftCell.setImageSize(AndroidUtilities.dp(84.0f));
        giftCell.setImageLayer(7);
        giftCell.hidePrice();
        giftCell.cardBackground.setStrokeColors(null);
        giftCell.setRibbonTextOneOf(this.auction.gift.availability_total);
        linearLayout2.addView(giftCell, LayoutHelper.createLinear(116, 116, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteGrayIcon), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, LayoutHelper.createLinear(24, 24, 0.0f, 16, 12, 0, 12, 0));
        GiftSheet.GiftCell giftCell2 = new GiftSheet.GiftCell(context, this.currentAccount, resourcesProvider) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            Path path = new Path();

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override
            protected void onSizeChanged(int i7, int i8, int i9, int i10) {
                super.onSizeChanged(i7, i8, i9, i10);
                this.path.rewind();
                this.rectF.set(0.0f, 0.0f, i7, i8);
                this.rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
                this.path.addRoundRect(this.rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j3) {
                boolean zDrawChild = super.drawChild(canvas, view, j3);
                if (view == this.card) {
                    if (!ViewPositionWatcher.computeRectInParent(AuctionWearingSheet.this.topView.imageLayout, AuctionWearingSheet.this.headerContainer, this.rectF) || !ViewPositionWatcher.computeRectInParent(this.card, this, this.rectF2)) {
                        return true;
                    }
                    float fCenterX = this.rectF2.centerX() - AndroidUtilities.dp(40.0f);
                    float fCenterY = this.rectF2.centerY() - AndroidUtilities.dp(40.0f);
                    if (!this.rectF.isEmpty()) {
                        canvas.save();
                        canvas.clipPath(this.path);
                        canvas.scale(0.6f, 0.6f, this.rectF2.centerX(), this.rectF2.centerY());
                        canvas.translate(this.rectF2.centerX() - (AuctionWearingSheet.this.topView.getWidth() / 2.0f), this.rectF2.centerY() - (AuctionWearingSheet.this.topView.getHeight() / 2.0f));
                        AuctionWearingSheet.this.topView.drawBackground(canvas, AuctionWearingSheet.this.topView.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), AuctionWearingSheet.this.topView.getWidth(), AuctionWearingSheet.this.topView.getHeight());
                        AuctionWearingSheet.this.topView.drawPattern(canvas, AuctionWearingSheet.this.topView.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), AuctionWearingSheet.this.topView.getWidth(), AuctionWearingSheet.this.topView.getHeight());
                        canvas.restore();
                        canvas.save();
                        canvas.translate(fCenterX, fCenterY);
                        canvas.scale(AndroidUtilities.dp(80.0f) / this.rectF.width(), AndroidUtilities.dp(80.0f) / this.rectF.height());
                        AuctionWearingSheet.this.topView.imageLayout.draw(canvas);
                        canvas.restore();
                    }
                }
                return zDrawChild;
            }
        };
        this.giftCell2 = giftCell2;
        giftCell2.removeImage();
        giftCell2.setPriorityAuction();
        giftCell2.setStarsGift(starGift, true, false, false, false, false);
        giftCell2.setImageSize(AndroidUtilities.dp(100.0f));
        giftCell2.setImageLayer(7);
        giftCell2.hidePrice();
        giftCell2.cardBackground.setStrokeColors(null);
        giftCell2.setRibbonTextOneOf(this.auction.gift.availability_total);
        giftCell2.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(giftCell2, LayoutHelper.createLinear(116, 116, 0.0f));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i7 = Theme.key_windowBackgroundWhiteGrayText;
        textView4.setTextColor(getThemedColor(i7));
        final float fClamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int iDp = AndroidUtilities.dp(14.0f);
        int color = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
        int i8 = Theme.key_windowBackgroundWhiteBlackText;
        frameLayout2.setBackground(Theme.createRoundRectDrawable(iDp, ColorUtils.blendARGB(color, Theme.getColor(i8, resourcesProvider), 0.2f)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(Theme.getColor(i8, resourcesProvider));
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        frameLayout2.addView(textView5, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(Theme.getColor(i8, resourcesProvider));
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout2.addView(textView6, LayoutHelper.createFrame(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View view = new View(context) {
            @Override
            protected void onMeasure(int i9, int i10) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i9) * fClamp), 1073741824), i10);
            }
        };
        view.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        frameLayout2.addView(view, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth() * fClamp, getHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        };
        frameLayout3.setWillNotDraw(false);
        frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 13.0f);
        textView7.setGravity(19);
        textView7.setTypeface(AndroidUtilities.bold());
        textView7.setTextColor(-1);
        textView7.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        frameLayout3.addView(textView7, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView8 = new TextView(context);
        textView8.setTextSize(1, 13.0f);
        textView8.setGravity(21);
        textView8.setTypeface(AndroidUtilities.bold());
        textView8.setTextColor(-1);
        textView8.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout3.addView(textView8, LayoutHelper.createFrame(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.auction;
        if (auction == null || auction.auctionStateActive == null) {
            linksTextView = null;
        } else {
            linksTextView = new LinkSpanDrawable.LinksTextView(context);
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setGravity(17);
            linksTextView.setTextColor(getThemedColor(i7));
            linksTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.auction.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new Runnable() {
                @Override
                public final void run() {
                    AuctionJoinSheet.showMoreInfo(context, resourcesProvider, starGift);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
        }
        if (z) {
            showWearingMoreInfo(context, resourcesProvider, linearLayout, starGift);
            buttonWithCounterView.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$new$8(view2);
                }
            });
        } else {
            linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 20.0f, 0.0f, 10.0f));
            linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 40.0f, 0.0f, 40.0f, 15.0f));
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, 28, 14.0f, 18.0f, 14.0f, 10.0f));
            if (linksTextView != null) {
                linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 40.0f, 0.0f, 40.0f, 32.0f));
            }
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            GiftAuctionController.Auction auction2 = this.auction;
            if (auction2 != null && auction2.isUpcoming(currentTime)) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false);
            } else {
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false);
            }
            GiftAuctionController.Auction auction3 = this.auction;
            if (auction3 != null && auction3.auctionStateActive != null) {
                if (auction3.isUpcoming(currentTime)) {
                    buttonWithCounterView.setSubText(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.auction.auctionStateActive.start_date - currentTime)), false);
                } else {
                    buttonWithCounterView.setSubText(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.auction.auctionStateActive.end_date - currentTime)), false);
                }
            }
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$new$9(j, context, resourcesProvider, runnable, view2);
                }
            });
        }
        updateTable(false);
    }

    public static void lambda$new$6(Context context, Theme.ResourcesProvider resourcesProvider, long j, TL_stars.StarGift starGift, ArrayList arrayList, View view) {
        new AuctionWearingSheet(context, resourcesProvider, j, starGift, arrayList, null, true).show();
    }

    public void lambda$new$8(View view) {
        lambda$new$0();
    }

    public void lambda$new$9(long j, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable, View view) {
        AuctionBidSheet auctionBidSheet = new AuctionBidSheet(context, resourcesProvider, new AuctionBidSheet.Params(j, true, null), this.auction);
        auctionBidSheet.show();
        auctionBidSheet.setCloseParentSheet(runnable);
        lambda$new$0();
    }

    @Override
    public void onUpdate(GiftAuctionController.Auction auction) {
        this.auction = auction;
        updateTable(true);
    }

    @Override
    public void lambda$new$0() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.giftId, this);
        super.lambda$new$0();
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

    private int getBackgroundColor() {
        return ColorUtils.blendARGB(getThemedColor(Theme.key_dialogBackgroundGray), getThemedColor(Theme.key_dialogBackground), 0.1f);
    }

    private static void showWearingMoreInfo(Context context, Theme.ResourcesProvider resourcesProvider, LinearLayout linearLayout, TL_stars.StarGift starGift) {
        if (context == null || starGift == null) {
            return;
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
        textView.setTextSize(1, 20.0f);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 14, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoText));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 16));
        PremiumFeatureCell premiumFeatureCell = new PremiumFeatureCell(context, resourcesProvider);
        premiumFeatureCell.title.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Header));
        premiumFeatureCell.description.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
        premiumFeatureCell.nextIcon.setVisibility(8);
        premiumFeatureCell.imageView.setImageResource(R.drawable.msg_emoji_gem);
        premiumFeatureCell.imageView.setColorFilter(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(premiumFeatureCell, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, -2.0f));
        PremiumFeatureCell premiumFeatureCell2 = new PremiumFeatureCell(context, resourcesProvider);
        premiumFeatureCell2.title.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Header));
        premiumFeatureCell2.description.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
        premiumFeatureCell2.nextIcon.setVisibility(8);
        premiumFeatureCell2.imageView.setImageResource(R.drawable.menu_feature_cover_24);
        premiumFeatureCell2.imageView.setColorFilter(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(premiumFeatureCell2, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, -2.0f));
        PremiumFeatureCell premiumFeatureCell3 = new PremiumFeatureCell(context, resourcesProvider);
        premiumFeatureCell3.title.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Header));
        premiumFeatureCell3.description.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
        premiumFeatureCell3.nextIcon.setVisibility(8);
        premiumFeatureCell3.imageView.setImageResource(R.drawable.menu_verification);
        premiumFeatureCell3.imageView.setColorFilter(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(premiumFeatureCell3, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, 14.0f));
    }
}
