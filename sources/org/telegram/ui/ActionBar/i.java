package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.zn0;
public final class i extends ChangeBounds {
    public final int f17814a;

    public i(int i10) {
        this.f17814a = i10;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.f17814a) {
            case 0:
                super.captureEndValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof l5) {
                    transitionValues.values.put("text_size", Float.valueOf(((l5) view).getTextPaint().getTextSize()));
                    return;
                }
                return;
            default:
                super.captureEndValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof org.telegram.ui.Components.voip.j) {
                    int i10 = ((org.telegram.ui.Components.voip.j) view2).f28186n;
                    int i11 = ((org.telegram.ui.Components.voip.j) view2).f28187r;
                    int i12 = ((org.telegram.ui.Components.voip.j) view2).f28188s;
                    int i13 = ((org.telegram.ui.Components.voip.j) view2).v;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i10));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i11));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i12));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i13));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        switch (this.f17814a) {
            case 0:
                super.captureStartValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof l5) {
                    transitionValues.values.put("text_size", Float.valueOf(((l5) view).getTextPaint().getTextSize()));
                    return;
                }
                return;
            default:
                super.captureStartValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof org.telegram.ui.Components.voip.j) {
                    int i10 = ((org.telegram.ui.Components.voip.j) view2).f28186n;
                    int i11 = ((org.telegram.ui.Components.voip.j) view2).f28187r;
                    int i12 = ((org.telegram.ui.Components.voip.j) view2).f28188s;
                    int i13 = ((org.telegram.ui.Components.voip.j) view2).v;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i10));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i11));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i12));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i13));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, final TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f17814a) {
            case 0:
                if (transitionValues != null && (transitionValues.view instanceof l5)) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (transitionValues2 != null) {
                        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                        float floatValue = ((Float) transitionValues.values.get("text_size")).floatValue() / ((Float) transitionValues2.values.get("text_size")).floatValue();
                        transitionValues.view.setScaleX(floatValue);
                        transitionValues.view.setScaleY(floatValue);
                        if (createAnimator != null) {
                            animatorSet.playTogether(createAnimator);
                        }
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, View.SCALE_X, 1.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new h(transitionValues, 0));
                    return animatorSet;
                }
                return super.createAnimator(viewGroup, transitionValues, transitionValues2);
            default:
                if (transitionValues != null && transitionValues2 != null && (transitionValues.view instanceof org.telegram.ui.Components.voip.j)) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    Animator createAnimator2 = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                    if (createAnimator2 != null) {
                        animatorSet2.playTogether(createAnimator2);
                    }
                    Integer num = (Integer) transitionValues2.values.get("decline_call_alpha_end_close");
                    Integer num2 = (Integer) transitionValues.values.get("close_text_alpha_end_close");
                    Integer num3 = (Integer) transitionValues2.values.get("close_text_alpha_end_close");
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(((Integer) transitionValues.values.get("back_color_end_close")).intValue(), ((Integer) transitionValues2.values.get("back_color_end_close")).intValue());
                    valueAnimator.setEvaluator(new ArgbEvaluator());
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (r2) {
                                case 0:
                                    ((j) transitionValues.view).f28186n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 1:
                                    ((j) transitionValues.view).f28187r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 2:
                                    ((j) transitionValues.view).f28188s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                default:
                                    ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                            }
                        }
                    });
                    animatorSet2.playTogether(valueAnimator);
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("round_end_close")).intValue(), ((Integer) transitionValues2.values.get("round_end_close")).intValue());
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (r2) {
                                case 0:
                                    ((j) transitionValues.view).f28186n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 1:
                                    ((j) transitionValues.view).f28187r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 2:
                                    ((j) transitionValues.view).f28188s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                default:
                                    ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt);
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("decline_call_alpha_end_close")).intValue(), num.intValue(), num.intValue(), num.intValue(), num.intValue(), num.intValue(), num.intValue());
                    ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (r2) {
                                case 0:
                                    ((j) transitionValues.view).f28186n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 1:
                                    ((j) transitionValues.view).f28187r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 2:
                                    ((j) transitionValues.view).f28188s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                default:
                                    ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt2);
                    ValueAnimator ofInt3 = ValueAnimator.ofInt(num2.intValue(), num2.intValue(), (int) (num3.intValue() * 0.25f), (int) (num3.intValue() * 0.5f), (int) (num3.intValue() * 0.75f), num3.intValue());
                    ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (r2) {
                                case 0:
                                    ((j) transitionValues.view).f28186n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 1:
                                    ((j) transitionValues.view).f28187r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 2:
                                    ((j) transitionValues.view).f28188s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                default:
                                    ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt3);
                    animatorSet2.addListener(new zn0(transitionValues, 22));
                    return animatorSet2;
                }
                return super.createAnimator(viewGroup, transitionValues, transitionValues2);
        }
    }
}
