package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.f11;

public final class i extends ChangeBounds {

    public final int f23498a;

    public i(int i10) {
        this.f23498a = i10;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.f23498a) {
            case 0:
                super.captureEndValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof h5) {
                    transitionValues.values.put("text_size", Float.valueOf(((h5) view).getTextPaint().getTextSize()));
                }
                break;
            default:
                super.captureEndValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof org.telegram.ui.Components.voip.j) {
                    int i10 = ((org.telegram.ui.Components.voip.j) view2).f33632n;
                    int i11 = ((org.telegram.ui.Components.voip.j) view2).f33633r;
                    int i12 = ((org.telegram.ui.Components.voip.j) view2).f33634s;
                    int i13 = ((org.telegram.ui.Components.voip.j) view2).v;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i10));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i11));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i12));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i13));
                }
                break;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        switch (this.f23498a) {
            case 0:
                super.captureStartValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof h5) {
                    transitionValues.values.put("text_size", Float.valueOf(((h5) view).getTextPaint().getTextSize()));
                }
                break;
            default:
                super.captureStartValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof org.telegram.ui.Components.voip.j) {
                    int i10 = ((org.telegram.ui.Components.voip.j) view2).f33632n;
                    int i11 = ((org.telegram.ui.Components.voip.j) view2).f33633r;
                    int i12 = ((org.telegram.ui.Components.voip.j) view2).f33634s;
                    int i13 = ((org.telegram.ui.Components.voip.j) view2).v;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i10));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i11));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i12));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i13));
                }
                break;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, final TransitionValues transitionValues, TransitionValues transitionValues2) {
        final int i10 = 1;
        final int i11 = 0;
        switch (this.f23498a) {
            case 0:
                if (transitionValues == null || !(transitionValues.view instanceof h5)) {
                    return super.createAnimator(viewGroup, transitionValues, transitionValues2);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                if (transitionValues2 != null) {
                    Animator animatorCreateAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                    float fFloatValue = ((Float) transitionValues.values.get("text_size")).floatValue() / ((Float) transitionValues2.values.get("text_size")).floatValue();
                    transitionValues.view.setScaleX(fFloatValue);
                    transitionValues.view.setScaleY(fFloatValue);
                    if (animatorCreateAnimator != null) {
                        animatorSet.playTogether(animatorCreateAnimator);
                    }
                }
                animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_X, 1.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_Y, 1.0f));
                animatorSet.addListener(new h(transitionValues, 0));
                return animatorSet;
            default:
                if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof org.telegram.ui.Components.voip.j)) {
                    return super.createAnimator(viewGroup, transitionValues, transitionValues2);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                Animator animatorCreateAnimator2 = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                if (animatorCreateAnimator2 != null) {
                    animatorSet2.playTogether(animatorCreateAnimator2);
                }
                Integer num = (Integer) transitionValues.values.get("back_color_end_close");
                Integer num2 = (Integer) transitionValues2.values.get("back_color_end_close");
                Integer num3 = (Integer) transitionValues.values.get("round_end_close");
                Integer num4 = (Integer) transitionValues2.values.get("round_end_close");
                Integer num5 = (Integer) transitionValues.values.get("decline_call_alpha_end_close");
                Integer num6 = (Integer) transitionValues2.values.get("decline_call_alpha_end_close");
                Integer num7 = (Integer) transitionValues.values.get("close_text_alpha_end_close");
                Integer num8 = (Integer) transitionValues2.values.get("close_text_alpha_end_close");
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(num.intValue(), num2.intValue());
                valueAnimator.setEvaluator(new ArgbEvaluator());
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i11) {
                            case 0:
                                ((j) transitionValues.view).f33632n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            case 1:
                                ((j) transitionValues.view).f33633r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            case 2:
                                ((j) transitionValues.view).f33634s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            default:
                                ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                        }
                    }
                });
                animatorSet2.playTogether(valueAnimator);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(num3.intValue(), num4.intValue());
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i10) {
                            case 0:
                                ((j) transitionValues.view).f33632n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            case 1:
                                ((j) transitionValues.view).f33633r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            case 2:
                                ((j) transitionValues.view).f33634s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            default:
                                ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                        }
                    }
                });
                animatorSet2.playTogether(valueAnimatorOfInt);
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(num5.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue());
                final int i12 = 2;
                valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i12) {
                            case 0:
                                ((j) transitionValues.view).f33632n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            case 1:
                                ((j) transitionValues.view).f33633r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            case 2:
                                ((j) transitionValues.view).f33634s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            default:
                                ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                        }
                    }
                });
                animatorSet2.playTogether(valueAnimatorOfInt2);
                ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(num7.intValue(), num7.intValue(), (int) (num8.intValue() * 0.25f), (int) (num8.intValue() * 0.5f), (int) (num8.intValue() * 0.75f), num8.intValue());
                final int i13 = 3;
                valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i13) {
                            case 0:
                                ((j) transitionValues.view).f33632n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            case 1:
                                ((j) transitionValues.view).f33633r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            case 2:
                                ((j) transitionValues.view).f33634s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                            default:
                                ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                break;
                        }
                    }
                });
                animatorSet2.playTogether(valueAnimatorOfInt3);
                animatorSet2.addListener(new f11(transitionValues, 10));
                return animatorSet2;
        }
    }
}
