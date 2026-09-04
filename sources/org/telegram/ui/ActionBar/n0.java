package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class n0 extends Visibility {
    public final int f21203a;

    public n0(int i10) {
        this.f21203a = i10;
    }

    @Override
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f21203a) {
            case 0:
                if (view instanceof u0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet.setInterpolator(pr.f29466f);
                    return animatorSet;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
            case 1:
                if (view instanceof u0) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet2.setInterpolator(pr.f29466f);
                    return animatorSet2;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
            case 2:
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1.0f));
                animatorSet3.setInterpolator(pr.f29466f);
                return animatorSet3;
            case 3:
                AnimatorSet animatorSet4 = new AnimatorSet();
                view.setAlpha(0.0f);
                view.setScaleY(0.6f);
                view.setScaleX(0.6f);
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.6f, 1.0f));
                animatorSet4.setInterpolator(pr.f29470k);
                return animatorSet4;
            case 4:
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, AndroidUtilities.dp(100.0f), 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f, 1.0f));
                if (view instanceof org.telegram.ui.Components.voip.t2) {
                    view.setTranslationY(AndroidUtilities.dp(100.0f));
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    ofPropertyValuesHolder.setStartDelay(((org.telegram.ui.Components.voip.t2) view).F);
                }
                if (view instanceof org.telegram.ui.Components.voip.i3) {
                    view.setTranslationY(AndroidUtilities.dp(100.0f));
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    ofPropertyValuesHolder.setStartDelay(((org.telegram.ui.Components.voip.i3) view).f31553f);
                }
                return ofPropertyValuesHolder;
            default:
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, AndroidUtilities.dp(20.0f), 0.0f));
                animatorSet5.setInterpolator(pr.f29466f);
                return animatorSet5;
        }
    }

    @Override
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f21203a) {
            case 0:
                if (view instanceof u0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet.setInterpolator(pr.f29466f);
                    return animatorSet;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
            case 1:
                if (view instanceof u0) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet2.setInterpolator(pr.f29466f);
                    return animatorSet2;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
            case 2:
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, View.SCALE_Y, view.getScaleX(), 0.5f));
                animatorSet3.setInterpolator(pr.f29466f);
                return animatorSet3;
            case 3:
                AnimatorSet animatorSet4 = new AnimatorSet();
                if (view instanceof org.telegram.ui.Components.voip.e2) {
                    ((org.telegram.ui.Components.voip.e2) view).d = true;
                }
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.7f, 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, 0.6f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.6f));
                animatorSet4.setInterpolator(pr.f29466f);
                return animatorSet4;
            case 4:
                return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, view.getTranslationY(), AndroidUtilities.dp(100.0f)), PropertyValuesHolder.ofFloat(View.SCALE_Y, view.getScaleY(), 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, view.getScaleX(), 0.0f));
            default:
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, -AndroidUtilities.dp(20.0f)));
                animatorSet5.setInterpolator(pr.f29466f);
                return animatorSet5;
        }
    }
}
