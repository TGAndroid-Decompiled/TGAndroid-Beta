package org.telegram.ui.Components.Premium;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.TextInfoCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchField$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.SearchTagsList$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda7;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumFeatureCell;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;

public class PremiumPreviewBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public Integer accentColor;
    public int additionEndRow;
    public int additionStartRow;
    public boolean animateConfetti;
    public boolean animateConfettiWithStars;
    public final FrameLayout bulletinContainer;
    public FrameLayout buttonContainer;
    public int buttonRow;
    public final int[] coords;
    public int currentAccount;
    public final PremiumFeatureCell dummyCell;
    public TLRPC.TL_emojiStatusCollectible emojiStatusCollectible;
    public ValueAnimator enterAnimator;
    public boolean enterTransitionInProgress;
    public float enterTransitionProgress;
    public int featuresEndRow;
    public int featuresStartRow;
    public final FireworksOverlay fireworksOverlay;
    public final BaseFragment fragment;
    public final TL_stars.StarGift gift;
    public final GiftPremiumBottomSheet$GiftTier giftTier;
    public final PremiumGradient.PremiumGradientTools gradientTools;
    public PhotoViewer.AnonymousClass35 iconContainer;
    public StarsReactionsSheet.AnonymousClass6 iconTextureView;
    public boolean isEmojiStatus;
    public boolean isOutboundGift;
    public View overrideTitleIcon;
    public int paddingRow;
    public final ArrayList premiumFeatures;
    public int rowCount;
    public int sectionRow;
    public LoginActivity.LoginPayView.AnonymousClass1 starParticlesView;
    public float startEnterFromScale;
    public View startEnterFromView;
    public float startEnterFromX;
    public float startEnterFromX1;
    public float startEnterFromY;
    public float startEnterFromY1;
    public TLRPC.InputStickerSet statusStickerSet;
    public LinkSpanDrawable.LinksTextView subtitleView;
    public int termsRow;
    public LinkSpanDrawable.LinksTextView[] titleView;
    public FrameLayout titleViewContainer;
    public int totalGradientHeight;
    public final TLRPC.User user;

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return PremiumPreviewBottomSheet.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
            if (i == premiumPreviewBottomSheet.paddingRow) {
                return 0;
            }
            if (i >= premiumPreviewBottomSheet.additionStartRow && i < premiumPreviewBottomSheet.additionEndRow) {
                return premiumPreviewBottomSheet.getAdditionItemViewType();
            }
            if (i >= premiumPreviewBottomSheet.featuresStartRow && i < premiumPreviewBottomSheet.featuresEndRow) {
                return 1;
            }
            if (i == premiumPreviewBottomSheet.sectionRow) {
                return 2;
            }
            if (i == premiumPreviewBottomSheet.buttonRow) {
                return 3;
            }
            if (i == 0) {
                return 4;
            }
            return i == premiumPreviewBottomSheet.termsRow ? 5 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
            int i2 = premiumPreviewBottomSheet.featuresStartRow;
            View view = viewHolder.itemView;
            if (i >= i2 && i < premiumPreviewBottomSheet.featuresEndRow) {
                ((PremiumFeatureCell) view).setData((PremiumPreviewFragment.PremiumFeatureData) premiumPreviewBottomSheet.premiumFeatures.get(i - i2), i != premiumPreviewBottomSheet.featuresEndRow - 1);
            } else {
                if (i < premiumPreviewBottomSheet.additionStartRow || i >= premiumPreviewBottomSheet.additionEndRow) {
                    return;
                }
                premiumPreviewBottomSheet.onBindAdditionCell(view);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            Context context = viewGroup.getContext();
            PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
            View viewOnCreateAdditionCell = premiumPreviewBottomSheet.onCreateAdditionCell(context, i);
            if (viewOnCreateAdditionCell != null) {
                return zzkl.m(viewOnCreateAdditionCell, viewOnCreateAdditionCell);
            }
            int i2 = 1;
            int i3 = 0;
            if (i == 0) {
                PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 6);
                premiumPreviewBottomSheet.iconContainer = anonymousClass35;
                anonymousClass35.setOrientation(1);
                View view = premiumPreviewBottomSheet.overrideTitleIcon;
                if (view == null) {
                    premiumPreviewBottomSheet.iconTextureView = new StarsReactionsSheet.AnonymousClass6(context, i2, i3, 2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    int i4 = Theme.key_premiumGradient2;
                    canvas.drawColor(ColorUtils.blendARGB(0.5f, premiumPreviewBottomSheet.getThemedColor(i4), premiumPreviewBottomSheet.getThemedColor(Theme.key_dialogBackground)));
                    premiumPreviewBottomSheet.iconTextureView.setBackgroundBitmap(bitmapCreateBitmap);
                    GLIconRenderer gLIconRenderer = premiumPreviewBottomSheet.iconTextureView.mRenderer;
                    gLIconRenderer.colorKey1 = i4;
                    gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
                    gLIconRenderer.updateColors();
                    anonymousClass35.addView(premiumPreviewBottomSheet.iconTextureView, LayoutHelper.createLinear(160, 160, 1));
                } else {
                    if (view.getParent() != null) {
                        ((ViewGroup) premiumPreviewBottomSheet.overrideTitleIcon.getParent()).removeView(premiumPreviewBottomSheet.overrideTitleIcon);
                    }
                    premiumPreviewBottomSheet.attachIconContainer(anonymousClass35);
                }
                if (premiumPreviewBottomSheet.titleViewContainer == null) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    premiumPreviewBottomSheet.titleViewContainer = frameLayout;
                    frameLayout.setClipChildren(false);
                    Integer num = premiumPreviewBottomSheet.accentColor;
                    new PorterDuffColorFilter(num == null ? premiumPreviewBottomSheet.getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon) : num.intValue(), PorterDuff.Mode.SRC_IN);
                    premiumPreviewBottomSheet.titleView = new LinkSpanDrawable.LinksTextView[2];
                    int i5 = 0;
                    while (i5 < 2) {
                        premiumPreviewBottomSheet.titleView[i5] = new ProfileActivity.AnonymousClass54(context, 4, ((BottomSheet) premiumPreviewBottomSheet).resourcesProvider);
                        premiumPreviewBottomSheet.titleView[i5].setVisibility(i5 == 0 ? 0 : 8);
                        premiumPreviewBottomSheet.titleView[i5].setTextSize(1, 16.0f);
                        premiumPreviewBottomSheet.titleView[i5].setTypeface(AndroidUtilities.bold());
                        premiumPreviewBottomSheet.titleView[i5].setGravity(1);
                        premiumPreviewBottomSheet.titleView[i5].setTextColor(premiumPreviewBottomSheet.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        premiumPreviewBottomSheet.titleView[i5].setLinkTextColor(premiumPreviewBottomSheet.getThemedColor(Theme.key_windowBackgroundWhiteLinkText));
                        premiumPreviewBottomSheet.titleViewContainer.addView(premiumPreviewBottomSheet.titleView[i5], LayoutHelper.createFrame(-2.0f, -1));
                        i5++;
                    }
                }
                if (premiumPreviewBottomSheet.titleViewContainer.getParent() != null) {
                    ((ViewGroup) premiumPreviewBottomSheet.titleViewContainer.getParent()).removeView(premiumPreviewBottomSheet.titleViewContainer);
                }
                anonymousClass35.addView(premiumPreviewBottomSheet.titleViewContainer, LayoutHelper.createLinear(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                if (premiumPreviewBottomSheet.subtitleView == null) {
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(premiumPreviewBottomSheet.getContext(), ((BottomSheet) premiumPreviewBottomSheet).resourcesProvider);
                    premiumPreviewBottomSheet.subtitleView = linksTextView;
                    linksTextView.setTextSize(1, 14.0f);
                    premiumPreviewBottomSheet.subtitleView.setGravity(1);
                    premiumPreviewBottomSheet.subtitleView.setTextColor(premiumPreviewBottomSheet.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                    premiumPreviewBottomSheet.subtitleView.setLinkTextColor(premiumPreviewBottomSheet.getThemedColor(Theme.key_windowBackgroundWhiteLinkText));
                }
                if (premiumPreviewBottomSheet.subtitleView.getParent() != null) {
                    ((ViewGroup) premiumPreviewBottomSheet.subtitleView.getParent()).removeView(premiumPreviewBottomSheet.subtitleView);
                }
                anonymousClass35.addView(premiumPreviewBottomSheet.subtitleView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                premiumPreviewBottomSheet.setTitle(false);
                premiumPreviewBottomSheet.starParticlesView = new LoginActivity.LoginPayView.AnonymousClass1(context, 2);
                ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 20);
                anonymousClass60.setClipChildren(false);
                anonymousClass60.addView(premiumPreviewBottomSheet.starParticlesView);
                anonymousClass60.addView(anonymousClass35);
                StarsReactionsSheet.AnonymousClass6 anonymousClass6 = premiumPreviewBottomSheet.iconTextureView;
                shadowSectionCell = anonymousClass60;
                if (anonymousClass6 != null) {
                    anonymousClass6.setStarParticlesView(premiumPreviewBottomSheet.starParticlesView);
                    shadowSectionCell = anonymousClass60;
                }
            } else if (i == 2) {
                shadowSectionCell = new ShadowSectionCell(context, premiumPreviewBottomSheet.getThemedColor(Theme.key_windowBackgroundGray), 0);
            } else if (i == 3) {
                shadowSectionCell = new PaymentFormActivity.AnonymousClass2(context, 12);
            } else if (i == 4) {
                shadowSectionCell = new AboutPremiumView(context);
            } else if (i != 5) {
                shadowSectionCell = new PremiumPreviewFragment.Adapter.AnonymousClass2(this, context, ((BottomSheet) premiumPreviewBottomSheet).resourcesProvider);
            } else {
                TextInfoCell textInfoCell = new TextInfoCell(context, ((BottomSheet) premiumPreviewBottomSheet).resourcesProvider);
                textInfoCell.setBackground(true);
                String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                int i6 = Theme.key_chat_messageLinkIn;
                final int i7 = 0;
                final int i8 = 1;
                textInfoCell.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i6, 0, new Runnable(this) {
                    public final PremiumPreviewBottomSheet.Adapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i7) {
                            case 0:
                                Browser.openUrl(PremiumPreviewBottomSheet.this.fragment.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                break;
                            default:
                                Browser.openUrl(PremiumPreviewBottomSheet.this.fragment.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                break;
                        }
                    }
                }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i6, 0, new Runnable(this) {
                    public final PremiumPreviewBottomSheet.Adapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i8) {
                            case 0:
                                Browser.openUrl(PremiumPreviewBottomSheet.this.fragment.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                break;
                            default:
                                Browser.openUrl(PremiumPreviewBottomSheet.this.fragment.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                break;
                        }
                    }
                })));
                shadowSectionCell = textInfoCell;
            }
            shadowSectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            premiumPreviewBottomSheet.afterCellCreated(i, shadowSectionCell);
            return new RecyclerListView.Holder(shadowSectionCell);
        }
    }

    public PremiumPreviewBottomSheet(BaseFragment baseFragment, int i, TLRPC.User user, GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, TL_stars.StarGift starGift, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment.getParentActivity(), baseFragment, false, false, false, resourcesProvider);
        ArrayList arrayList = new ArrayList();
        this.premiumFeatures = arrayList;
        this.coords = new int[2];
        this.enterTransitionProgress = 0.0f;
        fixNavigationBar();
        this.fragment = baseFragment;
        this.topPadding = 0.26f;
        this.user = user;
        this.currentAccount = i;
        this.giftTier = giftPremiumBottomSheet$GiftTier;
        this.gift = starGift;
        this.dummyCell = new PremiumFeatureCell(getContext(), null);
        PremiumPreviewFragment.fillPremiumFeaturesList(i, arrayList);
        if (giftPremiumBottomSheet$GiftTier != null || UserConfig.getInstance(i).isPremium()) {
            this.buttonContainer.setVisibility(8);
        }
        PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4, null);
        this.gradientTools = premiumGradientTools;
        premiumGradientTools.exactly = true;
        premiumGradientTools.y1 = 1.0f;
        premiumGradientTools.x2 = 0.0f;
        premiumGradientTools.y2 = 0.0f;
        premiumGradientTools.cx = 0.0f;
        premiumGradientTools.cy = 0.0f;
        updateRows$2();
        this.recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.recyclerListView.setOnItemClickListener(new SearchTagsList$$ExternalSyntheticLambda1(this, i, baseFragment, 1));
        MediaDataController.getInstance(i).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.sentShowScreenStat("profile");
        FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
        this.fireworksOverlay = fireworksOverlay;
        this.container.addView(fireworksOverlay, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.bulletinContainer = frameLayout;
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 140, 87));
    }

    public void afterCellCreated(int i, View view) {
    }

    public void attachIconContainer(PhotoViewer.AnonymousClass35 anonymousClass35) {
        anonymousClass35.addView(this.overrideTitleIcon, LayoutHelper.createLinear(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new Adapter();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.statusStickerSet) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            setTitle(true);
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        ValueAnimator valueAnimator = this.enterAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FireworksOverlay fireworksOverlay = this.fireworksOverlay;
        if (fireworksOverlay.started) {
            fireworksOverlay.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public int getAdditionItemViewType() {
        return 0;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public final void lambda$setTitle$6() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.statusStickerSet);
        SendGiftSheet.AnonymousClass8 anonymousClass8 = new SendGiftSheet.AnonymousClass8(this, 5);
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null) {
            anonymousClass8.setParentFragment(baseFragment);
        }
        new EmojiPacksAlert(anonymousClass8, getContext(), this.resourcesProvider, arrayList) {
            @Override
            public final void onCloseByLink() {
                PremiumPreviewBottomSheet.this.lambda$showGiftOfferSheet$15();
            }
        }.show();
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view = this.overrideTitleIcon;
        if (view != null) {
            view.setVisibility(this.enterTransitionInProgress ? 4 : 0);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.startEnterFromView == null || !this.enterTransitionInProgress) {
            return;
        }
        View view2 = this.overrideTitleIcon;
        View view3 = view2 == null ? this.iconTextureView : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.startEnterFromX, this.startEnterFromY};
        this.startEnterFromView.getMatrix().mapPoints(fArr);
        View view4 = this.startEnterFromView;
        Drawable rightDrawable = view4 instanceof SimpleTextView ? ((SimpleTextView) view4).getRightDrawable() : view4 instanceof ChatMessageCell ? ((ChatMessageCell) view4).currentNameStatusDrawable : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.coords;
        float x = (-iArr[0]) + this.startEnterFromX1 + fArr[0];
        float y = (-iArr[1]) + this.startEnterFromY1 + fArr[1];
        if (AndroidUtilities.isTablet()) {
            ViewGroup view5 = ((ActionBarLayout) this.fragment.getParentLayout()).getView();
            x += view5.getX() + view5.getPaddingLeft();
            y += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.startEnterFromScale * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f = measuredHeight / intrinsicWidth;
        float f2 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float fLerp = AndroidUtilities.lerp(x, measuredWidth, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.enterTransitionProgress));
        float fLerp2 = AndroidUtilities.lerp(y, measuredHeight2, this.enterTransitionProgress);
        float f3 = this.startEnterFromScale;
        float f4 = this.enterTransitionProgress;
        float f5 = (f * f4) + ((1.0f - f4) * f3);
        canvas.save();
        canvas.scale(f5, f5, fLerp, fLerp2);
        int i = (int) fLerp;
        int i2 = (int) fLerp2;
        rightDrawable.setBounds(i - (rightDrawable.getIntrinsicWidth() / 2), i2 - (rightDrawable.getIntrinsicHeight() / 2), (rightDrawable.getIntrinsicWidth() / 2) + i, (rightDrawable.getIntrinsicHeight() / 2) + i2);
        rightDrawable.setAlpha((int) ((1.0f - Utilities.clamp(this.enterTransitionProgress, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float fLerp3 = AndroidUtilities.lerp(f2, 1.0f, this.enterTransitionProgress);
        canvas.scale(fLerp3, fLerp3, fLerp, fLerp2);
        canvas.translate(fLerp - (view3.getMeasuredWidth() / 2.0f), fLerp2 - (view3.getMeasuredHeight() / 2.0f));
        view3.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    public void onBindAdditionCell(View view) {
    }

    public View onCreateAdditionCell(Context context, int i) {
        return null;
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        Drawable rightDrawable;
        GLIconRenderer gLIconRenderer;
        int i = 1;
        int i2 = 0;
        Object[] objArr = 0;
        if (this.startEnterFromView == null) {
            return false;
        }
        this.enterAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.enterTransitionProgress = 0.0f;
        this.enterTransitionInProgress = true;
        this.iconContainer.invalidate();
        View view = this.startEnterFromView;
        if (view instanceof SimpleTextView) {
            rightDrawable = ((SimpleTextView) view).getRightDrawable();
        } else if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = chatMessageCell.currentNameStatusDrawable;
            chatMessageCell.invalidateOutbounds();
            rightDrawable = swapAnimatedEmojiDrawable;
        } else {
            rightDrawable = null;
        }
        if (rightDrawable != null) {
            rightDrawable.setAlpha(0);
        }
        View view2 = this.startEnterFromView;
        if (view2 instanceof ChatMessageCell) {
            ((ChatMessageCell) view2).invalidateOutbounds();
        } else {
            view2.invalidate();
        }
        StarsReactionsSheet.AnonymousClass6 anonymousClass6 = this.iconTextureView;
        if (anonymousClass6 != null && (gLIconRenderer = anonymousClass6.mRenderer) != null) {
            gLIconRenderer.angleX = -180.0f;
            AndroidUtilities.runOnUIThread(new GLIconTextureView.AnonymousClass2(anonymousClass6, i), 100L);
        }
        this.enterAnimator.addUpdateListener(new PremiumPreviewBottomSheet$$ExternalSyntheticLambda5(this, i2));
        this.enterAnimator.addListener(new ChatActivity.AnonymousClass74(this, rightDrawable, objArr == true ? 1 : 0, 24));
        this.enterAnimator.setDuration(600L);
        this.enterAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.enterAnimator.start();
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int measuredHeight = 0;
        while (true) {
            ArrayList arrayList = this.premiumFeatures;
            if (i3 >= arrayList.size()) {
                this.totalGradientHeight = measuredHeight;
                this.container.getLocationOnScreen(this.coords);
                return;
            }
            PremiumFeatureCell premiumFeatureCell = this.dummyCell;
            premiumFeatureCell.setData((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(i3), false);
            premiumFeatureCell.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            ((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(i3)).yOffset = measuredHeight;
            measuredHeight += premiumFeatureCell.getMeasuredHeight();
            i3++;
        }
    }

    @Override
    public final void onViewCreated(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        this.currentAccount = UserConfig.selectedAccount;
        PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(8.0f), getContext(), this.resourcesProvider, false);
        premiumButtonView.setButton(PremiumPreviewFragment.getPremiumButtonText(this.currentAccount, null), new SearchField$$ExternalSyntheticLambda0(this, 17), false);
        this.buttonContainer = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(Theme.key_divider));
        this.buttonContainer.addView(view, LayoutHelper.createFrame(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (UserConfig.getInstance(this.currentAccount).isPremium() || (this instanceof PremiumPreviewGiftSentBottomSheet)) {
            return;
        }
        this.buttonContainer.addView(premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        this.buttonContainer.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        sizeNotifierFrameLayout.addView(this.buttonContainer, LayoutHelper.createFrame(-1, 68, 80));
    }

    public void setTitle(boolean z) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        LinkSpanDrawable.LinksTextView[] linksTextViewArr = this.titleView;
        if (linksTextViewArr == null || this.subtitleView == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.emojiStatusCollectible;
        TLRPC.User user = this.user;
        if (tL_emojiStatusCollectible != null) {
            String strSubstring = tL_emojiStatusCollectible.title;
            int iLastIndexOf = strSubstring.lastIndexOf(32);
            if (iLastIndexOf >= 0) {
                strSubstring = strSubstring.substring(0, iLastIndexOf);
            }
            this.titleView[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), strSubstring), new PremiumPreviewBottomSheet$$ExternalSyntheticLambda1(this, i2)));
            zzln.m(R.string.TelegramPremiumUserStatusDialogSubtitle, this.subtitleView);
        } else if (this.statusStickerSet != null) {
            String string = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
            Integer num = this.accentColor;
            CharSequence charSequenceReplaceSingleLink = AndroidUtilities.replaceSingleLink(string, num == null ? getThemedColor(Theme.key_windowBackgroundWhiteBlueButton) : num.intValue());
            try {
                charSequenceReplaceSingleLink = Emoji.replaceEmoji(charSequenceReplaceSingleLink, this.titleView[0].getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = charSequenceReplaceSingleLink instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequenceReplaceSingleLink : new SpannableStringBuilder(charSequenceReplaceSingleLink);
            int iIndexOf = charSequenceReplaceSingleLink.toString().indexOf("<STICKERSET>");
            if (iIndexOf >= 0) {
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(this.statusStickerSet, false);
                if (stickerSet == null || stickerSet.documents.isEmpty()) {
                    document = null;
                } else {
                    document = stickerSet.documents.get(0);
                    if (stickerSet.set != null) {
                        for (int i4 = 0; i4 < stickerSet.documents.size(); i4++) {
                            if (stickerSet.documents.get(i4).id == stickerSet.set.thumb_document_id) {
                                document = stickerSet.documents.get(i4);
                                break;
                            }
                        }
                    }
                }
                if (document != null) {
                    spannableStringBuilder = new SpannableStringBuilder("x");
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, this.titleView[0].getPaint().getFontMetricsInt());
                    animatedEmojiSpan.document = document;
                    spannableStringBuilder.setSpan(animatedEmojiSpan, 0, spannableStringBuilder.length(), 33);
                    if (stickerSet != null && stickerSet.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new LoadingSpan(AndroidUtilities.dp(100.0f), this.titleView[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(iIndexOf, iIndexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new ChatActivity.AnonymousClass102(this, 5), iIndexOf, spannableStringBuilder.length() + iIndexOf, 33);
                this.titleView[1].setOnLinkPressListener(new TranslateAlert3$$ExternalSyntheticLambda7(this, i3));
                if (document != null) {
                    LinkSpanDrawable.LinksTextView[] linksTextViewArr2 = this.titleView;
                    if (linksTextViewArr2 != 0) {
                        linksTextViewArr2[1].setText(spannableStringBuilder2);
                        if (this.titleView[1].getVisibility() != 0) {
                            if (z) {
                                this.titleView[1].setAlpha(0.0f);
                                this.titleView[1].setVisibility(0);
                                ViewPropertyAnimator viewPropertyAnimatorAlpha = this.titleView[1].animate().alpha(1.0f);
                                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                                OKLCH.m(viewPropertyAnimatorAlpha, cubicBezierInterpolator, 200L);
                                this.titleView[0].animate().alpha(0.0f).setInterpolator(cubicBezierInterpolator).setDuration(200L).withEndAction(new PremiumPreviewBottomSheet$$ExternalSyntheticLambda1(this, i)).start();
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.addUpdateListener(new PremiumPreviewBottomSheet$$ExternalSyntheticLambda5(this, i3));
                                valueAnimatorOfFloat.setInterpolator(cubicBezierInterpolator);
                                valueAnimatorOfFloat.setDuration(200L);
                                valueAnimatorOfFloat.start();
                            } else {
                                this.titleView[1].setAlpha(1.0f);
                                this.titleView[1].setVisibility(0);
                                this.titleView[0].setAlpha(0.0f);
                                this.titleView[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.titleView[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            zzln.m(R.string.TelegramPremiumUserStatusDialogSubtitle, this.subtitleView);
        } else if (this.isEmojiStatus) {
            linksTextViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
            this.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
        } else {
            GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.giftTier;
            if (giftPremiumBottomSheet$GiftTier == null) {
                TL_stars.StarGift starGift = this.gift;
                if (starGift != null) {
                    linksTextViewArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                    this.titleView[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        zzln.m(R.string.Gift2PremiumSubtitle, this.subtitleView);
                    }
                    this.subtitleView.setTextSize(1, 14.0f);
                } else if (user == null) {
                    linksTextViewArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                    zzln.m(R.string.TelegramPremiumSubscribedSubtitle, this.subtitleView);
                } else {
                    LinkSpanDrawable.LinksTextView linksTextView = linksTextViewArr[0];
                    String string2 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                    Integer num2 = this.accentColor;
                    linksTextView.setText(AndroidUtilities.replaceSingleLink(string2, num2 == null ? getThemedColor(Theme.key_windowBackgroundWhiteBlueButton) : num2.intValue()));
                    zzln.m(R.string.TelegramPremiumUserDialogSubtitle, this.subtitleView);
                }
            } else if (this.isOutboundGift) {
                LinkSpanDrawable.LinksTextView linksTextView2 = linksTextViewArr[0];
                String string3 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural, user != null ? user.first_name : "", LocaleController.formatPluralString("GiftMonths", giftPremiumBottomSheet$GiftTier.getMonths(), new Object[0]));
                Integer num3 = this.accentColor;
                linksTextView2.setText(AndroidUtilities.replaceSingleLink(string3, num3 == null ? getThemedColor(Theme.key_windowBackgroundWhiteBlueButton) : num3.intValue()));
                LinkSpanDrawable.LinksTextView linksTextView3 = this.subtitleView;
                String string4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle, user != null ? user.first_name : "");
                Integer num4 = this.accentColor;
                linksTextView3.setText(AndroidUtilities.replaceSingleLink(string4, num4 == null ? getThemedColor(Theme.key_windowBackgroundWhiteBlueButton) : num4.intValue()));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                LinkSpanDrawable.LinksTextView linksTextView4 = this.titleView[0];
                String string5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", giftPremiumBottomSheet$GiftTier.getMonths(), new Object[0]));
                Integer num5 = this.accentColor;
                linksTextView4.setText(AndroidUtilities.replaceSingleLink(string5, num5 == null ? getThemedColor(Theme.key_windowBackgroundWhiteBlueButton) : num5.intValue()));
                zzln.m(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.subtitleView);
            } else {
                LinkSpanDrawable.LinksTextView linksTextView5 = this.titleView[0];
                String string6 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", giftPremiumBottomSheet$GiftTier.getMonths(), new Object[0]));
                Integer num6 = this.accentColor;
                linksTextView5.setText(AndroidUtilities.replaceSingleLink(string6, num6 == null ? getThemedColor(Theme.key_windowBackgroundWhiteBlueButton) : num6.intValue()));
                zzln.m(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.subtitleView);
            }
        }
        try {
            LinkSpanDrawable.LinksTextView linksTextView6 = this.titleView[0];
            linksTextView6.setText(Emoji.replaceEmoji(linksTextView6.getText(), this.titleView[0].getPaint().getFontMetricsInt(), false));
        } catch (Exception unused2) {
        }
    }

    @Override
    public final void show() {
        super.show();
        int i = 1;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        if (this.animateConfetti) {
            AndroidUtilities.runOnUIThread(new PremiumPreviewBottomSheet$$ExternalSyntheticLambda1(this, i), 200L);
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        StarsReactionsSheet.AnonymousClass6 anonymousClass6 = this.iconTextureView;
        if (anonymousClass6 != null) {
            anonymousClass6.setDialogVisible(true);
        }
        this.starParticlesView.setPaused(true);
        dialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 17));
        dialog.show();
        return true;
    }

    public void updateRows$2() {
        int i = this.rowCount;
        int i2 = i + 1;
        this.rowCount = i2;
        this.paddingRow = i;
        this.featuresStartRow = i2;
        int size = this.premiumFeatures.size() + i2;
        this.featuresEndRow = size;
        this.rowCount = size + 1;
        this.sectionRow = size;
        if (UserConfig.getInstance(this.currentAccount).isPremium() || this.giftTier != null) {
            return;
        }
        int i3 = this.rowCount;
        this.rowCount = i3 + 1;
        this.buttonRow = i3;
    }
}
