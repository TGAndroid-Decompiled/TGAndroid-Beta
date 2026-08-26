package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.MotionPhotoDrawable;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.MessageEnterTransitionContainer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.ToggleButton2;
import org.telegram.ui.TextMessageEnterTransition;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public final class PeerStoriesView$40$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public PeerStoriesView$40$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView.AnonymousClass40 anonymousClass40 = (PeerStoriesView.AnonymousClass40) this.f$0;
                anonymousClass40.getClass();
                float fFloatValue = ((Float) ((ValueAnimator) this.f$1).getAnimatedValue()).floatValue();
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass40.this$0;
                anonymousClass1.movingReactionProgress = fFloatValue;
                anonymousClass1.invalidate();
                if (anonymousClass1.movingReactionProgress > 0.8f) {
                    boolean[] zArr = (boolean[]) this.f$2;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        anonymousClass1.drawReactionEffect = true;
                        try {
                            anonymousClass1.performHapticFeedback(3);
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.f$0;
                lPhotoPaintView.getClass();
                lPhotoPaintView.tabsSelectionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lPhotoPaintView.tabsLayout.invalidate();
                lPhotoPaintView.bottomLayout.invalidate();
                lPhotoPaintView.overlayLayout.invalidate();
                int i = 0;
                while (i < lPhotoPaintView.tabsLayout.getChildCount()) {
                    lPhotoPaintView.tabsLayout.getChildAt(i).setAlpha(((i == lPhotoPaintView.tabsNewSelectedIndex ? lPhotoPaintView.tabsSelectionProgress : i == lPhotoPaintView.tabsSelectedIndex ? 1.0f - lPhotoPaintView.tabsSelectionProgress : 0.0f) * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(lPhotoPaintView.tabsSelectionProgress);
                ViewGroup viewGroup3 = (ViewGroup) this.f$1;
                if (viewGroup3 != null && (viewGroup = (ViewGroup) this.f$2) != null) {
                    float f = 1.0f - interpolation;
                    float f2 = (f * 0.4f) + 0.6f;
                    viewGroup3.setScaleX(f2);
                    viewGroup3.setScaleY(f2);
                    viewGroup3.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    viewGroup3.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f3 = (interpolation * 0.4f) + 0.6f;
                    viewGroup.setScaleX(f3);
                    viewGroup.setScaleY(f3);
                    viewGroup.setTranslationY((Math.min(f, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(f, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 2:
                PremiumPreviewFragment.BackgroundView backgroundView = (PremiumPreviewFragment.BackgroundView) this.f$0;
                backgroundView.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = (View) this.f$2;
                view.setAlpha(fFloatValue2);
                view.setScaleX(fFloatValue2);
                view.setScaleY(fFloatValue2);
                float animatedFraction = ((ValueAnimator) this.f$1).getAnimatedFraction();
                int i2 = 0;
                while (true) {
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (i2 < premiumPreviewFragment.backgroundView.getChildCount()) {
                        View childAt = premiumPreviewFragment.backgroundView.getChildAt(i2);
                        if (childAt != backgroundView.tierListView) {
                            childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + (childAt == backgroundView.imageFrameLayout ? 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction) : 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction)));
                        }
                        i2++;
                    }
                    break;
                }
                break;
            case 3:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                paintView.tabsSelectionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paintView.tabsLayout.invalidate();
                paintView.bottomLayout.invalidate();
                paintView.overlayLayout.invalidate();
                int i3 = 0;
                while (i3 < paintView.tabsLayout.getChildCount()) {
                    paintView.tabsLayout.getChildAt(i3).setAlpha(((i3 == paintView.tabsNewSelectedIndex ? paintView.tabsSelectionProgress : i3 == paintView.tabsSelectedIndex ? 1.0f - paintView.tabsSelectionProgress : 0.0f) * 0.4f) + 0.6f);
                    i3++;
                }
                float interpolation2 = CubicBezierInterpolator.DEFAULT.getInterpolation(paintView.tabsSelectionProgress);
                ViewGroup viewGroup4 = (ViewGroup) this.f$1;
                if (viewGroup4 != null && (viewGroup2 = (ViewGroup) this.f$2) != null) {
                    float f4 = 1.0f - interpolation2;
                    float f5 = (f4 * 0.4f) + 0.6f;
                    viewGroup4.setScaleX(f5);
                    viewGroup4.setScaleY(f5);
                    viewGroup4.setTranslationY((Math.min(interpolation2, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    viewGroup4.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f6 = (interpolation2 * 0.4f) + 0.6f;
                    viewGroup2.setScaleX(f6);
                    viewGroup2.setScaleY(f6);
                    viewGroup2.setTranslationY((Math.min(f4, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    viewGroup2.setAlpha(1.0f - (Math.min(f4, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 4:
                ToggleButton2 toggleButton2 = (ToggleButton2) this.f$0;
                toggleButton2.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(fFloatValue3 - 0.5f);
                if (fFloatValue3 >= 0.5f) {
                    AtomicBoolean atomicBoolean = (AtomicBoolean) this.f$1;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        toggleButton2.setDrawable((MotionPhotoDrawable) this.f$2);
                    }
                }
                break;
            case 5:
                TextMessageEnterTransition textMessageEnterTransition = (TextMessageEnterTransition) this.f$0;
                textMessageEnterTransition.getClass();
                textMessageEnterTransition.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f$1).getEditField().setAlpha(textMessageEnterTransition.progress);
                ((MessageEnterTransitionContainer) this.f$2).invalidate();
                break;
            default:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatListItemAnimator.MoveInfoExtended moveInfoExtended = (ChatListItemAnimator.MoveInfoExtended) this.f$0;
                boolean z = moveInfoExtended.animateBackgroundOnly;
                ChatMessageCell.TransitionParams transitionParams = (ChatMessageCell.TransitionParams) this.f$1;
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$2;
                if (z) {
                    transitionParams.deltaLeft = (-moveInfoExtended.deltaLeft) * fFloatValue4;
                    transitionParams.deltaRight = (-moveInfoExtended.deltaRight) * fFloatValue4;
                    transitionParams.deltaTop = (-moveInfoExtended.deltaTop) * fFloatValue4;
                    transitionParams.deltaBottom = (-moveInfoExtended.deltaBottom) * fFloatValue4;
                } else {
                    transitionParams.deltaLeft = ((-moveInfoExtended.deltaLeft) * fFloatValue4) - chatMessageCell.getAnimationOffsetX();
                    transitionParams.deltaRight = ((-moveInfoExtended.deltaRight) * fFloatValue4) - chatMessageCell.getAnimationOffsetX();
                    transitionParams.deltaTop = ((-moveInfoExtended.deltaTop) * fFloatValue4) - chatMessageCell.getTranslationY();
                    transitionParams.deltaBottom = ((-moveInfoExtended.deltaBottom) * fFloatValue4) - chatMessageCell.getTranslationY();
                }
                chatMessageCell.invalidate();
                break;
        }
    }

    public PeerStoriesView$40$$ExternalSyntheticLambda1(PremiumPreviewFragment.BackgroundView backgroundView, View view, ValueAnimator valueAnimator) {
        this.$r8$classId = 2;
        this.f$0 = backgroundView;
        this.f$2 = view;
        this.f$1 = valueAnimator;
    }
}
