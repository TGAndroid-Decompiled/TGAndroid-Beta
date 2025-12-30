package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.Premium.boosts.cells.TextInfoCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PremiumFeatureCell;
import org.telegram.ui.PremiumPreviewFragment;

public class PremiumPreviewBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public Integer accentColor;
    protected int additionEndRow;
    protected int additionStartRow;
    boolean animateConfetti;
    boolean animateConfettiWithStars;
    FrameLayout bulletinContainer;
    FrameLayout buttonContainer;
    protected int buttonRow;
    int[] coords;
    int currentAccount;
    PremiumFeatureCell dummyCell;
    public TLRPC.TL_emojiStatusCollectible emojiStatusCollectible;
    ValueAnimator enterAnimator;
    boolean enterTransitionInProgress;
    float enterTransitionProgress;
    protected int featuresEndRow;
    protected int featuresStartRow;
    FireworksOverlay fireworksOverlay;
    BaseFragment fragment;
    protected TL_stars.StarGift gift;
    protected GiftPremiumBottomSheet$GiftTier giftTier;
    PremiumGradient.PremiumGradientTools gradientTools;
    protected int helpUsRow;
    ViewGroup iconContainer;
    GLIconTextureView iconTextureView;
    public boolean isEmojiStatus;
    boolean isOutboundGift;
    public View overrideTitleIcon;
    protected int paddingRow;
    protected ArrayList premiumFeatures;
    protected int rowCount;
    protected int sectionRow;
    StarParticlesView starParticlesView;
    public float startEnterFromScale;
    public View startEnterFromView;
    public float startEnterFromX;
    public float startEnterFromX1;
    public float startEnterFromY;
    public float startEnterFromY1;
    public TLRPC.InputStickerSet statusStickerSet;
    protected LinkSpanDrawable.LinksTextView subtitleView;
    protected int termsRow;
    protected LinkSpanDrawable.LinksTextView[] titleView;
    private FrameLayout titleViewContainer;
    int totalGradientHeight;
    protected TLRPC.User user;

    protected void afterCellCreated(int i, View view) {
    }

    protected int getAdditionItemViewType(int i) {
        return 0;
    }

    protected boolean isAdditionViewClickable(int i) {
        return false;
    }

    protected boolean needDefaultPremiumBtn() {
        return true;
    }

    protected void onAdditionItemClicked(View view) {
    }

    protected void onBindAdditionCell(View view, int i) {
    }

    protected View onCreateAdditionCell(int i, Context context) {
        return null;
    }

    public PremiumPreviewBottomSheet(BaseFragment baseFragment, int i, TLRPC.User user, Theme.ResourcesProvider resourcesProvider) {
        this(baseFragment, i, user, null, null, resourcesProvider);
    }

    public PremiumPreviewBottomSheet(final BaseFragment baseFragment, final int i, TLRPC.User user, GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, TL_stars.StarGift starGift, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment, false, false, false, resourcesProvider);
        this.premiumFeatures = new ArrayList();
        this.coords = new int[2];
        this.enterTransitionProgress = 0.0f;
        fixNavigationBar();
        this.fragment = baseFragment;
        this.topPadding = 0.26f;
        this.user = user;
        this.currentAccount = i;
        this.giftTier = giftPremiumBottomSheet$GiftTier;
        this.gift = starGift;
        this.dummyCell = new PremiumFeatureCell(getContext());
        PremiumPreviewFragment.fillPremiumFeaturesList(this.premiumFeatures, i, false);
        if (this.giftTier != null || UserConfig.getInstance(i).isPremium()) {
            this.buttonContainer.setVisibility(8);
        }
        PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4);
        this.gradientTools = premiumGradientTools;
        premiumGradientTools.exactly = true;
        premiumGradientTools.x1 = 0.0f;
        premiumGradientTools.y1 = 1.0f;
        premiumGradientTools.x2 = 0.0f;
        premiumGradientTools.y2 = 0.0f;
        premiumGradientTools.cx = 0.0f;
        premiumGradientTools.cy = 0.0f;
        updateRows();
        this.recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                this.f$0.lambda$new$0(i, baseFragment, view, i2);
            }
        });
        MediaDataController.getInstance(i).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.sentShowScreenStat("profile");
        FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
        this.fireworksOverlay = fireworksOverlay;
        this.container.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.bulletinContainer = frameLayout;
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 140, 87));
    }

    public void lambda$new$0(int i, BaseFragment baseFragment, View view, int i2) {
        if (view instanceof PremiumFeatureCell) {
            PremiumFeatureCell premiumFeatureCell = (PremiumFeatureCell) view;
            PremiumPreviewFragment.sentShowFeaturePreview(i, premiumFeatureCell.data.type);
            showDialog(new PremiumFeatureBottomSheet(baseFragment, premiumFeatureCell.data.type, false));
        }
        onAdditionItemClicked(view);
    }

    protected void updateRows() {
        int i = this.rowCount;
        int i2 = i + 1;
        this.rowCount = i2;
        this.paddingRow = i;
        this.featuresStartRow = i2;
        int size = i2 + this.premiumFeatures.size();
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

    public PremiumPreviewBottomSheet setOutboundGift(boolean z) {
        this.isOutboundGift = z;
        return this;
    }

    public PremiumPreviewBottomSheet setAnimateConfetti(boolean z) {
        this.animateConfetti = z;
        return this;
    }

    public PremiumPreviewBottomSheet setAnimateConfettiWithStars(boolean z) {
        this.animateConfettiWithStars = z;
        return this;
    }

    @Override
    public boolean showDialog(Dialog dialog) {
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setDialogVisible(true);
        }
        this.starParticlesView.setPaused(true);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.lambda$showDialog$1(dialogInterface);
            }
        });
        dialog.show();
        return true;
    }

    public void lambda$showDialog$1(DialogInterface dialogInterface) {
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setDialogVisible(false);
        }
        this.starParticlesView.setPaused(false);
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        this.currentAccount = UserConfig.selectedAccount;
        PremiumButtonView premiumButtonView = new PremiumButtonView(getContext(), false, this.resourcesProvider);
        premiumButtonView.setButton(PremiumPreviewFragment.getPremiumButtonText(this.currentAccount, null), new View.OnClickListener() {
            @Override
            public final void onClick(View view) throws Throwable {
                this.f$0.lambda$onViewCreated$2(view);
            }
        });
        this.buttonContainer = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(Theme.key_divider));
        this.buttonContainer.addView(view, LayoutHelper.createFrame(-1, 1.0f));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (UserConfig.getInstance(this.currentAccount).isPremium() || !needDefaultPremiumBtn()) {
            return;
        }
        this.buttonContainer.addView(premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        this.buttonContainer.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        frameLayout.addView(this.buttonContainer, LayoutHelper.createFrame(-1, 68, 80));
    }

    public void lambda$onViewCreated$2(View view) throws Throwable {
        PremiumPreviewFragment.sentPremiumButtonClick();
        PremiumPreviewFragment.buyPremium(this.fragment, "profile");
    }

    @Override
    protected void onPreMeasure(int i, int i2) {
        super.onPreMeasure(i, i2);
        measureGradient(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.container.getLocationOnScreen(this.coords);
    }

    private void titleLoaded(CharSequence charSequence, boolean z) {
        LinkSpanDrawable.LinksTextView[] linksTextViewArr = this.titleView;
        if (linksTextViewArr == null) {
            return;
        }
        linksTextViewArr[1].setText(charSequence);
        if (this.titleView[1].getVisibility() != 0) {
            if (z) {
                this.titleView[1].setAlpha(0.0f);
                this.titleView[1].setVisibility(0);
                ViewPropertyAnimator viewPropertyAnimatorAlpha = this.titleView[1].animate().alpha(1.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator).setDuration(200L).start();
                this.titleView[0].animate().alpha(0.0f).setInterpolator(cubicBezierInterpolator).setDuration(200L).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$titleLoaded$3();
                    }
                }).start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$titleLoaded$4(valueAnimator);
                    }
                });
                valueAnimatorOfFloat.setInterpolator(cubicBezierInterpolator);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.start();
                return;
            }
            this.titleView[1].setAlpha(1.0f);
            this.titleView[1].setVisibility(0);
            this.titleView[0].setAlpha(0.0f);
            this.titleView[0].setVisibility(8);
        }
    }

    public void lambda$titleLoaded$3() {
        this.titleView[0].setVisibility(8);
    }

    public void lambda$titleLoaded$4(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.titleViewContainer.getLayoutParams().height = AndroidUtilities.lerp(this.titleView[0].getHeight(), this.titleView[1].getHeight(), fFloatValue);
        this.titleViewContainer.requestLayout();
    }

    public void setTitle(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet.setTitle(boolean):void");
    }

    public void lambda$setTitle$5() {
        Browser.openUrl(getContext(), "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + this.emojiStatusCollectible.slug);
    }

    public void lambda$setTitle$6(ClickableSpan clickableSpan) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.statusStickerSet);
        BaseFragment baseFragment = new BaseFragment() {
            @Override
            public Activity getParentActivity() {
                BaseFragment baseFragment2 = PremiumPreviewBottomSheet.this.fragment;
                if (baseFragment2 == null) {
                    return null;
                }
                return baseFragment2.getParentActivity();
            }

            @Override
            public int getCurrentAccount() {
                return this.currentAccount;
            }

            @Override
            public FrameLayout getLayoutContainer() {
                return PremiumPreviewBottomSheet.this.bulletinContainer;
            }

            @Override
            public View getFragmentView() {
                return ((BottomSheet) PremiumPreviewBottomSheet.this).containerView;
            }

            @Override
            public Dialog showDialog(Dialog dialog) {
                dialog.show();
                return dialog;
            }
        };
        BaseFragment baseFragment2 = this.fragment;
        if (baseFragment2 != null) {
            baseFragment.setParentFragment(baseFragment2);
        }
        new EmojiPacksAlert(baseFragment, getContext(), this.resourcesProvider, arrayList) {
            @Override
            protected void onCloseByLink() {
                PremiumPreviewBottomSheet.this.lambda$new$0();
            }
        }.show();
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new Adapter();
    }

    protected void attachIconContainer(LinearLayout linearLayout) {
        linearLayout.addView(this.overrideTitleIcon, LayoutHelper.createLinear(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    class Adapter extends RecyclerListView.SelectionAdapter {
        private Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            Context context = viewGroup.getContext();
            View viewOnCreateAdditionCell = PremiumPreviewBottomSheet.this.onCreateAdditionCell(i, context);
            if (viewOnCreateAdditionCell != null) {
                viewOnCreateAdditionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(viewOnCreateAdditionCell);
            }
            int i2 = 1;
            if (i == 0) {
                LinearLayout linearLayout = new LinearLayout(context) {
                    @Override
                    protected boolean drawChild(Canvas canvas, View view, long j) {
                        PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
                        if (view == premiumPreviewBottomSheet.iconTextureView && premiumPreviewBottomSheet.enterTransitionInProgress) {
                            return true;
                        }
                        return super.drawChild(canvas, view, j);
                    }
                };
                PremiumPreviewBottomSheet.this.iconContainer = linearLayout;
                linearLayout.setOrientation(1);
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
                View view = premiumPreviewBottomSheet.overrideTitleIcon;
                if (view == null) {
                    premiumPreviewBottomSheet.iconTextureView = new GLIconTextureView(context, i2) {
                        @Override
                        protected void onAttachedToWindow() {
                            super.onAttachedToWindow();
                            setPaused(false);
                        }

                        @Override
                        protected void onDetachedFromWindow() {
                            super.onDetachedFromWindow();
                            setPaused(true);
                        }
                    };
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    PremiumPreviewBottomSheet premiumPreviewBottomSheet2 = PremiumPreviewBottomSheet.this;
                    int i3 = Theme.key_premiumGradient2;
                    canvas.drawColor(ColorUtils.blendARGB(premiumPreviewBottomSheet2.getThemedColor(i3), PremiumPreviewBottomSheet.this.getThemedColor(Theme.key_dialogBackground), 0.5f));
                    PremiumPreviewBottomSheet.this.iconTextureView.setBackgroundBitmap(bitmapCreateBitmap);
                    GLIconRenderer gLIconRenderer = PremiumPreviewBottomSheet.this.iconTextureView.mRenderer;
                    gLIconRenderer.colorKey1 = i3;
                    gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
                    gLIconRenderer.updateColors();
                    linearLayout.addView(PremiumPreviewBottomSheet.this.iconTextureView, LayoutHelper.createLinear(160, 160, 1));
                } else {
                    if (view.getParent() != null) {
                        ((ViewGroup) PremiumPreviewBottomSheet.this.overrideTitleIcon.getParent()).removeView(PremiumPreviewBottomSheet.this.overrideTitleIcon);
                    }
                    PremiumPreviewBottomSheet.this.attachIconContainer(linearLayout);
                }
                if (PremiumPreviewBottomSheet.this.titleViewContainer == null) {
                    PremiumPreviewBottomSheet.this.titleViewContainer = new FrameLayout(context);
                    PremiumPreviewBottomSheet.this.titleViewContainer.setClipChildren(false);
                    PremiumPreviewBottomSheet premiumPreviewBottomSheet3 = PremiumPreviewBottomSheet.this;
                    Integer num = premiumPreviewBottomSheet3.accentColor;
                    new PorterDuffColorFilter(num == null ? premiumPreviewBottomSheet3.getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon) : num.intValue(), PorterDuff.Mode.SRC_IN);
                    PremiumPreviewBottomSheet.this.titleView = new LinkSpanDrawable.LinksTextView[2];
                    int i4 = 0;
                    while (i4 < 2) {
                        PremiumPreviewBottomSheet.this.titleView[i4] = new LinkSpanDrawable.LinksTextView(context, ((BottomSheet) PremiumPreviewBottomSheet.this).resourcesProvider) {
                            @Override
                            protected int emojiCacheType() {
                                return 3;
                            }
                        };
                        PremiumPreviewBottomSheet.this.titleView[i4].setVisibility(i4 == 0 ? 0 : 8);
                        PremiumPreviewBottomSheet.this.titleView[i4].setTextSize(1, 16.0f);
                        PremiumPreviewBottomSheet.this.titleView[i4].setTypeface(AndroidUtilities.bold());
                        PremiumPreviewBottomSheet.this.titleView[i4].setGravity(1);
                        PremiumPreviewBottomSheet premiumPreviewBottomSheet4 = PremiumPreviewBottomSheet.this;
                        premiumPreviewBottomSheet4.titleView[i4].setTextColor(premiumPreviewBottomSheet4.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        PremiumPreviewBottomSheet premiumPreviewBottomSheet5 = PremiumPreviewBottomSheet.this;
                        premiumPreviewBottomSheet5.titleView[i4].setLinkTextColor(premiumPreviewBottomSheet5.getThemedColor(Theme.key_windowBackgroundWhiteLinkText));
                        PremiumPreviewBottomSheet.this.titleViewContainer.addView(PremiumPreviewBottomSheet.this.titleView[i4], LayoutHelper.createFrame(-1, -2.0f));
                        i4++;
                    }
                }
                if (PremiumPreviewBottomSheet.this.titleViewContainer.getParent() != null) {
                    ((ViewGroup) PremiumPreviewBottomSheet.this.titleViewContainer.getParent()).removeView(PremiumPreviewBottomSheet.this.titleViewContainer);
                }
                linearLayout.addView(PremiumPreviewBottomSheet.this.titleViewContainer, LayoutHelper.createLinear(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                PremiumPreviewBottomSheet premiumPreviewBottomSheet6 = PremiumPreviewBottomSheet.this;
                if (premiumPreviewBottomSheet6.subtitleView == null) {
                    premiumPreviewBottomSheet6.subtitleView = new LinkSpanDrawable.LinksTextView(PremiumPreviewBottomSheet.this.getContext(), ((BottomSheet) PremiumPreviewBottomSheet.this).resourcesProvider);
                    PremiumPreviewBottomSheet.this.subtitleView.setTextSize(1, 14.0f);
                    PremiumPreviewBottomSheet.this.subtitleView.setGravity(1);
                    PremiumPreviewBottomSheet premiumPreviewBottomSheet7 = PremiumPreviewBottomSheet.this;
                    premiumPreviewBottomSheet7.subtitleView.setTextColor(premiumPreviewBottomSheet7.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                    PremiumPreviewBottomSheet premiumPreviewBottomSheet8 = PremiumPreviewBottomSheet.this;
                    premiumPreviewBottomSheet8.subtitleView.setLinkTextColor(premiumPreviewBottomSheet8.getThemedColor(Theme.key_windowBackgroundWhiteLinkText));
                }
                if (PremiumPreviewBottomSheet.this.subtitleView.getParent() != null) {
                    ((ViewGroup) PremiumPreviewBottomSheet.this.subtitleView.getParent()).removeView(PremiumPreviewBottomSheet.this.subtitleView);
                }
                linearLayout.addView(PremiumPreviewBottomSheet.this.subtitleView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                PremiumPreviewBottomSheet.this.setTitle(false);
                PremiumPreviewBottomSheet.this.starParticlesView = new StarParticlesView(context) {
                    @Override
                    protected void onMeasure(int i5, int i6) {
                        super.onMeasure(i5, i6);
                        this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                    }

                    @Override
                    protected void configure() {
                        super.configure();
                        StarParticlesView.Drawable drawable = this.drawable;
                        drawable.useGradient = true;
                        drawable.useBlur = false;
                        drawable.forceMaxAlpha = true;
                        drawable.checkBounds = true;
                        drawable.init();
                    }
                };
                FrameLayout frameLayout = new FrameLayout(context) {
                    @Override
                    protected void onMeasure(int i5, int i6) {
                        float f;
                        float top;
                        int measuredHeight;
                        super.onMeasure(i5, i6);
                        PremiumPreviewBottomSheet premiumPreviewBottomSheet9 = PremiumPreviewBottomSheet.this;
                        GLIconTextureView gLIconTextureView = premiumPreviewBottomSheet9.iconTextureView;
                        if (gLIconTextureView != null) {
                            top = gLIconTextureView.getTop();
                            measuredHeight = PremiumPreviewBottomSheet.this.iconTextureView.getMeasuredHeight();
                        } else {
                            View view2 = premiumPreviewBottomSheet9.overrideTitleIcon;
                            if (view2 != null) {
                                top = view2.getTop();
                                measuredHeight = PremiumPreviewBottomSheet.this.overrideTitleIcon.getMeasuredHeight();
                            } else {
                                f = 0.0f;
                                PremiumPreviewBottomSheet.this.starParticlesView.setTranslationY(f - (r4.getMeasuredHeight() / 2.0f));
                            }
                        }
                        f = top + (measuredHeight / 2.0f);
                        PremiumPreviewBottomSheet.this.starParticlesView.setTranslationY(f - (r4.getMeasuredHeight() / 2.0f));
                    }
                };
                frameLayout.setClipChildren(false);
                frameLayout.addView(PremiumPreviewBottomSheet.this.starParticlesView);
                frameLayout.addView(linearLayout);
                PremiumPreviewBottomSheet premiumPreviewBottomSheet9 = PremiumPreviewBottomSheet.this;
                GLIconTextureView gLIconTextureView = premiumPreviewBottomSheet9.iconTextureView;
                shadowSectionCell = frameLayout;
                if (gLIconTextureView != null) {
                    gLIconTextureView.setStarParticlesView(premiumPreviewBottomSheet9.starParticlesView);
                    shadowSectionCell = frameLayout;
                }
            } else if (i == 2) {
                shadowSectionCell = new ShadowSectionCell(context, 12, PremiumPreviewBottomSheet.this.getThemedColor(Theme.key_windowBackgroundGray));
            } else if (i == 3) {
                shadowSectionCell = new View(context) {
                    @Override
                    protected void onMeasure(int i5, int i6) {
                        super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
                    }
                };
            } else if (i == 4) {
                shadowSectionCell = new AboutPremiumView(context);
            } else if (i != 5) {
                shadowSectionCell = new PremiumFeatureCell(context, ((BottomSheet) PremiumPreviewBottomSheet.this).resourcesProvider) {
                    @Override
                    protected void dispatchDraw(Canvas canvas2) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(this.imageView.getLeft(), this.imageView.getTop(), this.imageView.getRight(), this.imageView.getBottom());
                        PremiumPreviewBottomSheet.this.gradientTools.gradientMatrix(0, 0, getMeasuredWidth(), PremiumPreviewBottomSheet.this.totalGradientHeight, 0.0f, -this.data.yOffset);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), PremiumPreviewBottomSheet.this.gradientTools.paint);
                        super.dispatchDraw(canvas2);
                    }
                };
            } else {
                TextInfoCell textInfoCell = new TextInfoCell(context, ((BottomSheet) PremiumPreviewBottomSheet.this).resourcesProvider);
                textInfoCell.setBackground(true);
                String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                int i5 = Theme.key_chat_messageLinkIn;
                textInfoCell.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i5, 0, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onCreateViewHolder$0();
                    }
                }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i5, 0, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onCreateViewHolder$1();
                    }
                })));
                shadowSectionCell = textInfoCell;
            }
            shadowSectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            PremiumPreviewBottomSheet.this.afterCellCreated(i, shadowSectionCell);
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        public void lambda$onCreateViewHolder$0() {
            Browser.openUrl(PremiumPreviewBottomSheet.this.fragment.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
        }

        public void lambda$onCreateViewHolder$1() {
            Browser.openUrl(PremiumPreviewBottomSheet.this.fragment.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
            int i2 = premiumPreviewBottomSheet.featuresStartRow;
            if (i >= i2 && i < premiumPreviewBottomSheet.featuresEndRow) {
                ((PremiumFeatureCell) viewHolder.itemView).setData((PremiumPreviewFragment.PremiumFeatureData) premiumPreviewBottomSheet.premiumFeatures.get(i - i2), i != PremiumPreviewBottomSheet.this.featuresEndRow - 1);
            } else {
                if (i < premiumPreviewBottomSheet.additionStartRow || i >= premiumPreviewBottomSheet.additionEndRow) {
                    return;
                }
                premiumPreviewBottomSheet.onBindAdditionCell(viewHolder.itemView, i);
            }
        }

        @Override
        public int getItemCount() {
            return PremiumPreviewBottomSheet.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
            if (i == premiumPreviewBottomSheet.paddingRow) {
                return 0;
            }
            if (i >= premiumPreviewBottomSheet.additionStartRow && i < premiumPreviewBottomSheet.additionEndRow) {
                return premiumPreviewBottomSheet.getAdditionItemViewType(i);
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
            if (i == premiumPreviewBottomSheet.helpUsRow) {
                return 4;
            }
            if (i == premiumPreviewBottomSheet.termsRow) {
                return 5;
            }
            return super.getItemViewType(i);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1 || PremiumPreviewBottomSheet.this.isAdditionViewClickable(viewHolder.getItemViewType());
        }
    }

    private void measureGradient(int i, int i2) {
        int measuredHeight = 0;
        for (int i3 = 0; i3 < this.premiumFeatures.size(); i3++) {
            this.dummyCell.setData((PremiumPreviewFragment.PremiumFeatureData) this.premiumFeatures.get(i3), false);
            this.dummyCell.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            ((PremiumPreviewFragment.PremiumFeatureData) this.premiumFeatures.get(i3)).yOffset = measuredHeight;
            measuredHeight += this.dummyCell.getMeasuredHeight();
        }
        this.totalGradientHeight = measuredHeight;
    }

    @Override
    public void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        if (this.animateConfetti) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$show$7();
                }
            }, 200L);
        }
    }

    public void lambda$show$7() {
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.fireworksOverlay.start(this.animateConfettiWithStars);
    }

    @Override
    public void lambda$new$0() {
        super.lambda$new$0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        ValueAnimator valueAnimator = this.enterAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.fireworksOverlay.isStarted()) {
            this.fireworksOverlay.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override
    protected void mainContainerDispatchDraw(Canvas canvas) {
        Drawable rightDrawable;
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
        if (view4 instanceof SimpleTextView) {
            rightDrawable = ((SimpleTextView) view4).getRightDrawable();
        } else {
            rightDrawable = view4 instanceof ChatMessageCell ? ((ChatMessageCell) view4).currentNameStatusDrawable : null;
        }
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.coords;
        float x = (-iArr[0]) + this.startEnterFromX1 + fArr[0];
        float y = (-iArr[1]) + this.startEnterFromY1 + fArr[1];
        if (AndroidUtilities.isTablet()) {
            ViewGroup view5 = this.fragment.getParentLayout().getView();
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
        float y2 = view3.getY() + 0.0f + ((View) view3.getParent()).getY() + ((View) view3.getParent().getParent()).getY() + (view3.getMeasuredHeight() / 2.0f);
        float fLerp = AndroidUtilities.lerp(x, measuredWidth, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.enterTransitionProgress));
        float fLerp2 = AndroidUtilities.lerp(y, y2, this.enterTransitionProgress);
        float f3 = this.startEnterFromScale;
        float f4 = this.enterTransitionProgress;
        float f5 = (f3 * (1.0f - f4)) + (f * f4);
        canvas.save();
        canvas.scale(f5, f5, fLerp, fLerp2);
        int i = (int) fLerp;
        int i2 = (int) fLerp2;
        rightDrawable.setBounds(i - (rightDrawable.getIntrinsicWidth() / 2), i2 - (rightDrawable.getIntrinsicHeight() / 2), i + (rightDrawable.getIntrinsicWidth() / 2), i2 + (rightDrawable.getIntrinsicHeight() / 2));
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
    protected boolean onCustomOpenAnimation() {
        Drawable rightDrawable;
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
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.startEnterAnimation(-360, 100L);
        }
        this.enterAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$onCustomOpenAnimation$8(valueAnimator);
            }
        });
        this.enterAnimator.addListener(new AnonymousClass4(rightDrawable));
        this.enterAnimator.setDuration(600L);
        this.enterAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.enterAnimator.start();
        return super.onCustomOpenAnimation();
    }

    public void lambda$onCustomOpenAnimation$8(ValueAnimator valueAnimator) {
        this.enterTransitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.container.invalidate();
    }

    class AnonymousClass4 extends AnimatorListenerAdapter {
        final Drawable val$startEnterFromDrawable;

        AnonymousClass4(Drawable drawable) {
            this.val$startEnterFromDrawable = drawable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
            premiumPreviewBottomSheet.enterTransitionInProgress = false;
            premiumPreviewBottomSheet.enterTransitionProgress = 1.0f;
            premiumPreviewBottomSheet.iconContainer.invalidate();
            if (this.val$startEnterFromDrawable != null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
                final Drawable drawable = this.val$startEnterFromDrawable;
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$onAnimationEnd$0(drawable, valueAnimator);
                    }
                });
                valueAnimatorOfInt.start();
            }
            super.onAnimationEnd(animator);
        }

        public void lambda$onAnimationEnd$0(Drawable drawable, ValueAnimator valueAnimator) {
            drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            View view = PremiumPreviewBottomSheet.this.startEnterFromView;
            if (view instanceof ChatMessageCell) {
                ((ChatMessageCell) view).invalidateOutbounds();
            } else {
                view.invalidate();
            }
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.statusStickerSet) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            setTitle(true);
        }
    }
}
