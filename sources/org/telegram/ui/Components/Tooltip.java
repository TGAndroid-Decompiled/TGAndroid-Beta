package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.transition.TransitionValues;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.VoIPBackgroundProvider;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIPTextureView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.VoIPFragment;

public final class Tooltip extends TextView {
    public View anchor;
    public ViewPropertyAnimator animator;
    public final Tooltip$$ExternalSyntheticLambda0 dismissRunnable;
    public boolean showing;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ((Tooltip) this.this$0).setVisibility(8);
                    break;
                case 1:
                    ((DialogsActivity.AnonymousClass47) this.this$0).noMediaFiltersSearchView.setVisibility(8);
                    break;
                case 2:
                    SenderSelectView senderSelectView = (SenderSelectView) this.this$0;
                    if (animator == senderSelectView.menuAnimator) {
                        senderSelectView.menuAnimator = null;
                    }
                    break;
                case 3:
                    ((ShareAlert.SwitchView) this.this$0).animator = null;
                    break;
                case 4:
                    SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = (SharedMediaFastScrollTooltip) this.this$0;
                    if (sharedMediaFastScrollTooltip.getParent() != null) {
                        ((ViewGroup) sharedMediaFastScrollTooltip.getParent()).removeView(sharedMediaFastScrollTooltip);
                    }
                    break;
                case 5:
                    SharedMediaLayout.AnonymousClass45 anonymousClass45 = (SharedMediaLayout.AnonymousClass45) this.this$0;
                    FlickerLoadingView flickerLoadingView = anonymousClass45.val$finalProgressView;
                    flickerLoadingView.setAlpha(1.0f);
                    RecyclerView.LayoutManager.stopIgnoringView(flickerLoadingView);
                    anonymousClass45.val$finalListView.removeView(flickerLoadingView);
                    break;
                case 6:
                    SimpleAvatarView simpleAvatarView = (SimpleAvatarView) this.this$0;
                    if (simpleAvatarView.animator == animator) {
                        simpleAvatarView.animator = null;
                    }
                    break;
                case 7:
                    StickerCategoriesListView stickerCategoriesListView = (StickerCategoriesListView) this.this$0;
                    stickerCategoriesListView.setCategoriesShownT(((Float) stickerCategoriesListView.categoriesShownAnimator.getAnimatedValue()).floatValue());
                    stickerCategoriesListView.categoriesShownAnimator = null;
                    break;
                case 8:
                    StickersAlert stickersAlert = (StickersAlert) this.this$0;
                    stickersAlert.stickerPreviewLayout.setVisibility(8);
                    stickersAlert.stickerImageView.setImageDrawable(null);
                    break;
                case 9:
                    int i = 0;
                    while (true) {
                        StorageDiagramView.ClearViewData[] clearViewDataArr = (StorageDiagramView.ClearViewData[]) this.this$0;
                        if (i < clearViewDataArr.length) {
                            StorageDiagramView.ClearViewData clearViewData = clearViewDataArr[i];
                            if (clearViewData != null) {
                                clearViewData.firstDraw = false;
                            }
                            i++;
                        }
                        break;
                    }
                    break;
                case 10:
                    super.onAnimationEnd(animator);
                    ((StorageDiagramView) this.this$0).backAnimator = null;
                    break;
                case 11:
                    ((SubstringLayoutAnimator) this.this$0).animateTextChange = false;
                    break;
                case 12:
                    ((TextSelectionHint) this.this$0).setVisibility(4);
                    break;
                case 13:
                    TopicsTabsView.HorizontalTabView horizontalTabView = (TopicsTabsView.HorizontalTabView) this.this$0;
                    horizontalTabView.counterView.setScaleX(1.0f);
                    horizontalTabView.counterView.setScaleY(1.0f);
                    horizontalTabView.counterView.invalidate();
                    break;
                case 14:
                    TopicsTabsView.VerticalTabView verticalTabView = (TopicsTabsView.VerticalTabView) this.this$0;
                    verticalTabView.countScale = 1.0f;
                    verticalTabView.imageLayoutView.invalidate();
                    break;
                case 15:
                    ((TrendingStickersLayout) this.this$0).glueToTopAnimator = null;
                    break;
                case 16:
                    UndoView undoView = (UndoView) this.this$0;
                    undoView.setVisibility(4);
                    undoView.setScaleX(1.0f);
                    undoView.setScaleY(1.0f);
                    undoView.setAlpha(1.0f);
                    break;
                case 17:
                    UpdateLayout updateLayout = (UpdateLayout) this.this$0;
                    if (updateLayout.updateLayout.getTag() == null) {
                        updateLayout.updateLayout.setVisibility(4);
                    }
                    break;
                case 18:
                    super.onAnimationEnd(animator);
                    UsersAlertBase.ContainerView containerView = (UsersAlertBase.ContainerView) this.this$0;
                    containerView.snapToTopOffset = 0.0f;
                    containerView.setTranslationY(0.0f);
                    containerView.valueAnimator = null;
                    break;
                case 19:
                    ViewPagerFixed.TabsView tabsView = (ViewPagerFixed.TabsView) this.this$0;
                    tabsView.animatingIndicator = false;
                    tabsView.setEnabled(true);
                    ViewPagerFixed.TabsView.TabsViewDelegate tabsViewDelegate = tabsView.delegate;
                    if (tabsViewDelegate != null) {
                        ((ViewPagerFixed.AnonymousClass4) tabsViewDelegate).onPageScrolled(1.0f);
                    }
                    tabsView.invalidate();
                    break;
                case 20:
                    ((WebPlayerView) this.this$0).progressAnimation = null;
                    break;
                case 21:
                    ((ZoomControlView) this.this$0).animatorSet = null;
                    break;
                case 22:
                    SpoilerEffect spoilerEffect = (SpoilerEffect) this.this$0;
                    Iterator it = spoilerEffect.particles.iterator();
                    while (it.hasNext()) {
                        SpoilerEffect.Particle particle = (SpoilerEffect.Particle) it.next();
                        if (spoilerEffect.particlesPool.size() < spoilerEffect.maxParticles) {
                            spoilerEffect.particlesPool.push(particle);
                        }
                        it.remove();
                    }
                    Runnable runnable = spoilerEffect.onRippleEndCallback;
                    if (runnable != null) {
                        runnable.run();
                        spoilerEffect.onRippleEndCallback = null;
                    }
                    spoilerEffect.rippleAnimator = null;
                    spoilerEffect.invalidateSelf();
                    break;
                case 23:
                    super.onAnimationEnd(animator);
                    ((TransitionValues) this.this$0).view.setEnabled(true);
                    break;
                case 24:
                    GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = (GroupCallMiniTextureView.AnonymousClass1) this.this$0;
                    if (GroupCallMiniTextureView.this.blurredFlippingStub.getParent() != null) {
                        GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                        groupCallMiniTextureView.textureView.removeView(groupCallMiniTextureView.blurredFlippingStub);
                    }
                    break;
                case 25:
                    super.onAnimationEnd(animator);
                    PrivateVideoPreviewDialog privateVideoPreviewDialog = (PrivateVideoPreviewDialog) this.this$0;
                    if (privateVideoPreviewDialog.getParent() != null) {
                        ((ViewGroup) privateVideoPreviewDialog.getParent()).removeView(privateVideoPreviewDialog);
                    }
                    break;
                case 26:
                    VoIPFragment.AnonymousClass24 anonymousClass24 = (VoIPFragment.AnonymousClass24) this.this$0;
                    if (!anonymousClass24.isDismissed) {
                        VoIPFragment.this.gradientLayout.lockDrawing = true;
                        VoIPFragment.this.gradientLayout.invalidate();
                    }
                    break;
                case 27:
                    VoIPBackgroundProvider voIPBackgroundProvider = (VoIPBackgroundProvider) this.this$0;
                    voIPBackgroundProvider.hasVideo = false;
                    voIPBackgroundProvider.darkPaint.setAlpha(35);
                    voIPBackgroundProvider.darkVideoPaint.setAlpha(102);
                    voIPBackgroundProvider.whiteVideoPaint.setAlpha(35);
                    voIPBackgroundProvider.invalidateViews();
                    break;
                case 28:
                    VoIPFloatingLayout voIPFloatingLayout = VoIPFloatingLayout.this;
                    voIPFloatingLayout.switchingToFloatingMode = false;
                    voIPFloatingLayout.requestLayout();
                    break;
                default:
                    VoIPTextureView voIPTextureView = (VoIPTextureView) this.this$0;
                    voIPTextureView.currentClipVertical = 0.0f;
                    voIPTextureView.currentClipHorizontal = 0.0f;
                    voIPTextureView.renderer.setScaleX(voIPTextureView.scaleTextureToFill);
                    voIPTextureView.renderer.setScaleY(voIPTextureView.scaleTextureToFill);
                    TextureView textureView = voIPTextureView.blurRenderer;
                    if (textureView != null) {
                        textureView.setScaleX(voIPTextureView.scaleTextureToFillBlur);
                        voIPTextureView.blurRenderer.setScaleY(voIPTextureView.scaleTextureToFillBlur);
                    }
                    voIPTextureView.setTranslationY(0.0f);
                    voIPTextureView.setTranslationX(0.0f);
                    voIPTextureView.currentThumbScale = voIPTextureView.scaleThumb;
                    voIPTextureView.currentAnimation = null;
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 23:
                    super.onAnimationStart(animator);
                    ((TransitionValues) this.this$0).view.setEnabled(false);
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }
    }

    public Tooltip(Activity activity, ViewGroup viewGroup) {
        super(activity);
        this.dismissRunnable = new Tooltip$$ExternalSyntheticLambda0(this, 0);
        setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(3.0f), -871296751));
        setTextColor(-1);
        setTextSize(1, 14.0f);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
        setGravity(16);
        viewGroup.addView(this, LayoutHelper.createFrame(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
        setVisibility(8);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateTooltipPosition();
    }

    public final void updateTooltipPosition() {
        if (this.anchor == null) {
            return;
        }
        View view = (View) getParent();
        int left = 0;
        int top = 0;
        for (View view2 = this.anchor; view2 != view; view2 = (View) view2.getParent()) {
            top += view2.getTop();
            left += view2.getLeft();
        }
        int width = ((this.anchor.getWidth() / 2) + left) - (getMeasuredWidth() / 2);
        setTranslationX(width >= 0 ? getMeasuredWidth() + width > view.getMeasuredWidth() ? (view.getMeasuredWidth() - getMeasuredWidth()) - AndroidUtilities.dp(16.0f) : width : 0);
        setTranslationY(top - getMeasuredHeight());
    }
}
