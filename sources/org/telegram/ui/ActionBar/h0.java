package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.xq;
public final class h0 extends Visibility {
    public final int f27550a;

    public h0(int i3) {
        this.f27550a = i3;
    }

    @Override
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f27550a) {
            case 0:
                if (view instanceof p0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet.setInterpolator(xq.f40452f);
                    return animatorSet;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
            case 1:
                if (view instanceof p0) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet2.setInterpolator(xq.f40452f);
                    return animatorSet2;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
            case 2:
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1.0f));
                animatorSet3.setInterpolator(xq.f40452f);
                return animatorSet3;
            case 3:
                AnimatorSet animatorSet4 = new AnimatorSet();
                view.setAlpha(0.0f);
                view.setScaleY(0.6f);
                view.setScaleX(0.6f);
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.6f, 1.0f));
                animatorSet4.setInterpolator(xq.f40456k);
                return animatorSet4;
            case 4:
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, org.telegram.messenger.g0.L(100.0f), 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f, 1.0f));
                if (view instanceof org.telegram.ui.Components.voip.c2) {
                    view.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    ofPropertyValuesHolder.setStartDelay(((org.telegram.ui.Components.voip.c2) view).G);
                }
                if (view instanceof org.telegram.ui.Components.voip.q2) {
                    view.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    ofPropertyValuesHolder.setStartDelay(((org.telegram.ui.Components.voip.q2) view).f39545f);
                }
                return ofPropertyValuesHolder;
            default:
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, org.telegram.messenger.g0.L(20.0f), 0.0f));
                animatorSet5.setInterpolator(xq.f40452f);
                return animatorSet5;
        }
    }

    @Override
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f27550a) {
            case 0:
                if (view instanceof p0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet.setInterpolator(xq.f40452f);
                    return animatorSet;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
            case 1:
                if (view instanceof p0) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet2.setInterpolator(xq.f40452f);
                    return animatorSet2;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
            case 2:
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, View.SCALE_Y, view.getScaleX(), 0.5f));
                animatorSet3.setInterpolator(xq.f40452f);
                return animatorSet3;
            case 3:
                AnimatorSet animatorSet4 = new AnimatorSet();
                if (view instanceof org.telegram.ui.Components.voip.o1) {
                    ((org.telegram.ui.Components.voip.o1) view).d = true;
                }
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.7f, 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, 0.6f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.6f));
                animatorSet4.setInterpolator(xq.f40452f);
                return animatorSet4;
            case 4:
                return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, view.getTranslationY(), org.telegram.messenger.g0.L(100.0f)), PropertyValuesHolder.ofFloat(View.SCALE_Y, view.getScaleY(), 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, view.getScaleX(), 0.0f));
            default:
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, -org.telegram.messenger.g0.L(20.0f)));
                animatorSet5.setInterpolator(xq.f40452f);
                return animatorSet5;
        }
    }
}
