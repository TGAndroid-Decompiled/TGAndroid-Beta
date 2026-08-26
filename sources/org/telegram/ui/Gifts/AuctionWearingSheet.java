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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline1;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda0;

public final class AuctionWearingSheet extends BottomSheetWithRecyclerListView implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int $r8$clinit = 0;
    public UniversalAdapter adapter;
    public GiftAuctionController.Auction auction;
    public final AnonymousClass4 giftCell2;
    public final long giftId;
    public final TextView giftNameTextView;
    public final AnonymousClass1 headerContainer;
    public final LinearLayout linearLayout;
    public final AnonymousClass2 topView;

    public final class AnonymousClass3 extends GiftSheet.GiftCell {
        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public AuctionWearingSheet(Context context, Theme.ResourcesProvider resourcesProvider, long j, TL_stars.StarGift starGift, ArrayList arrayList, GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda10, boolean z) {
        AvatarDrawable avatarDrawable;
        TLObject tLObject;
        long clientUserId;
        TextView textView;
        Theme.ResourcesProvider resourcesProvider2;
        LinearLayout linearLayout;
        Theme.ResourcesProvider resourcesProvider3;
        TextView textView2;
        FrameLayout frameLayout;
        int i;
        GiftAuctionController.Auction auction;
        LinkSpanDrawable.LinksTextView linksTextView;
        int currentTime;
        GiftAuctionController.Auction auction2;
        GiftAuctionController.Auction auction3;
        TLRPC.User user;
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.FADING, resourcesProvider);
        long j2 = starGift.id;
        this.giftId = j2;
        this.headerMoveTop = AndroidUtilities.dp(6.0f);
        this.topPadding = 0.2f;
        setBackgroundColor(ColorUtils.blendARGB(0.1f, getThemedColor(Theme.key_dialogBackgroundGray), getThemedColor(Theme.key_dialogBackground)));
        fixNavigationBar();
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.linearLayout = linearLayout2;
        linearLayout2.setOrientation(1);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClickable(true);
        ?? r10 = new FrameLayout(context) {
            public final RectF rectF = new RectF();
            public final RectF rectF2 = new RectF();

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AuctionWearingSheet auctionWearingSheet = AuctionWearingSheet.this;
                FrameLayout frameLayout2 = auctionWearingSheet.topView.imageLayout;
                RectF rectF = this.rectF;
                if (ViewPositionWatcher.computeRectInParent(frameLayout2, this, rectF)) {
                    TextView textView3 = auctionWearingSheet.giftNameTextView;
                    RectF rectF2 = this.rectF2;
                    if (ViewPositionWatcher.computeRectInParent(textView3, this, rectF2)) {
                        float fDp = rectF2.right - AndroidUtilities.dp(32.0f);
                        float fCenterY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                        if (rectF.isEmpty()) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(fDp, fCenterY);
                        canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                        auctionWearingSheet.topView.imageLayout.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        };
        this.headerContainer = r10;
        linearLayout2.addView(r10);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
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
        ?? r0 = new StarGiftSheet.TopView(context, resourcesProvider, new GiftSheet$$ExternalSyntheticLambda9(this, 27), new BotAdView$$ExternalSyntheticLambda0(10), new BotAdView$$ExternalSyntheticLambda0(10), new BotAdView$$ExternalSyntheticLambda0(10), new BotAdView$$ExternalSyntheticLambda0(10), new BotAdView$$ExternalSyntheticLambda0(10), new BotAdView$$ExternalSyntheticLambda0(10)) {
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
            public final boolean drawChild(Canvas canvas, View view, long j3) {
                if (view == this.imageLayout) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            }

            @Override
            public final int getFinalHeight() {
                return AndroidUtilities.dp(i6);
            }

            @Override
            public final float getRealHeight() {
                return AndroidUtilities.dp(i6);
            }

            @Override
            public final void invalidate() {
                super.invalidate();
                AnonymousClass4 anonymousClass4 = AuctionWearingSheet.this.giftCell2;
                if (anonymousClass4 != null) {
                    anonymousClass4.invalidate();
                }
            }

            @Override
            public final void onSizeChanged(int i7, int i8, int i9, int i10) {
                super.onSizeChanged(i7, i8, i9, i10);
                float fDp = AndroidUtilities.dp(12.0f);
                float[] fArr = this.r;
                fArr[3] = fDp;
                fArr[2] = fDp;
                fArr[1] = fDp;
                fArr[0] = fDp;
                Path path = this.path;
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, i7, i8, this.r, Path.Direction.CW);
            }

            @Override
            public final void updateButtonsBackgrounds(int i7) {
                setRibbonColor(i7);
            }
        };
        this.topView = r0;
        r0.onSwitchPage(new StarGiftSheet.PageTransition(1, 1));
        r0.setPreviewingAttributes(arrayList);
        r0.removeView(r0.closeView);
        r10.addView(r0, 0, LayoutHelper.createFrame(-1, i6, 48));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(45.0f));
        r10.addView(backupImageView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        if (j != 0) {
            if (j > 0) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                avatarDrawable = new AvatarDrawable(user2);
                user = user2;
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                avatarDrawable = new AvatarDrawable(chat);
                tLObject = chat;
            }
            backupImageView.setForUserOrChat(tLObject, avatarDrawable);
            TextView textView3 = new TextView(context);
            this.giftNameTextView = textView3;
            AccountFrozenAlert$$ExternalSyntheticOutline1.m(21.0f, 1, textView3);
            if (j != 0) {
                clientUserId = j;
            } else {
                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            }
            textView3.setText(DialogObject.getShortName(clientUserId));
            textView3.setGravity(17);
            textView3.setTextColor(-1);
            textView3.setPadding(0, 0, AndroidUtilities.dp(36.0f), 0);
            textView3.setSingleLine();
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setMaxLines(1);
            r10.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
            textView = new TextView(context);
            textView.setTextSize(1, 13.0f);
            textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            textView.setGravity(17);
            textView.setTextColor(-1342177281);
            if (z) {
                textView.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
                resourcesProvider2 = resourcesProvider;
            } else {
                textView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                resourcesProvider2 = resourcesProvider;
                textView.setOnClickListener(new SendGiftSheet$$ExternalSyntheticLambda1(context, resourcesProvider, j, starGift, arrayList));
                ScaleStateListAnimator.apply(textView, 0.02f, 1.5f);
            }
            r10.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            linearLayout = new LinearLayout(r1);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            linearLayout.setClickable(true);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(r1, this.currentAccount, resourcesProvider2);
            anonymousClass3.priotityAuction = true;
            resourcesProvider3 = resourcesProvider2;
            anonymousClass3.setStarsGift(starGift, true, false, false, false, false);
            anonymousClass3.setImageSize(AndroidUtilities.dp(84.0f));
            anonymousClass3.setImageLayer(7);
            anonymousClass3.priceLayout.setVisibility(8);
            anonymousClass3.cardBackground.setStrokeColors(null);
            anonymousClass3.setRibbonTextOneOf(this.auction.gift.availability_total);
            linearLayout.addView(anonymousClass3, LayoutHelper.createLinear(116, 116, 0.0f));
            ImageView imageView = new ImageView(r1);
            imageView.setImageResource(R.drawable.ic_ab_back);
            imageView.setScaleX(-1.0f);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteGrayIcon), PorterDuff.Mode.SRC_IN));
            linearLayout.addView(imageView, LayoutHelper.createLinear(24, 24, 0.0f, 16, 12, 0, 12, 0));
            ?? r1 = new GiftSheet.GiftCell
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.AuctionWearingSheet.<init>(android.content.Context, org.telegram.ui.ActionBar.Theme$ResourcesProvider, long, org.telegram.tgnet.tl.TL_stars$StarGift, java.util.ArrayList, org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda10, boolean):void");
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 19), this.resourcesProvider);
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

        @Override
        public final void onUpdate(GiftAuctionController.Auction auction) {
            this.auction = auction;
        }
    }
