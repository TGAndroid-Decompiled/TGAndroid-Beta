package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
public final class mm0 extends Transition {
    public final int f27075a;
    public final Object f27076b;

    public mm0(Object obj, int i10) {
        this.f27075a = i10;
        this.f27076b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.f27075a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                xx0 xx0Var = (xx0) this.f27076b;
                viewGroup = ((org.telegram.ui.ActionBar.g3) xx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + xx0Var.f30769b0));
                return;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f27076b;
                if (view == photoViewer.N1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.Q1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f27076b;
                if (view2 == secretMediaViewer.W) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.X.getPendingMarginTopDiff()));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.f27075a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                xx0 xx0Var = (xx0) this.f27076b;
                viewGroup = ((org.telegram.ui.ActionBar.g3) xx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + xx0Var.f30769b0));
                return;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.gt0 gt0Var = ((PhotoViewer) this.f27076b).Q1;
                if (view == gt0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(gt0Var.getScrollY()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.gt0 gt0Var2 = ((SecretMediaViewer) this.f27076b).X;
                if (view2 == gt0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(gt0Var2.getScrollY()));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i10 = this.f27075a;
        Object obj = this.f27076b;
        switch (i10) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new i70(this, 13));
                return ofFloat;
            case 1:
                int i11 = ((xx0) obj).f30769b0;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new dg.g0(this, intValue3, i11, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.Q1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.it0(this, 0));
                    ofInt.addUpdateListener(new org.telegram.ui.e3(this, 22));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.N1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.N1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat3.addListener(new org.telegram.ui.it0(this, 1));
                    return ofFloat3;
                }
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.X) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.f41(this, 0));
                    ofInt2.addUpdateListener(new org.telegram.ui.h11(this, 6));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.W || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.W, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat4.addListener(new org.telegram.ui.f41(this, 1));
                    return ofFloat4;
                }
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
