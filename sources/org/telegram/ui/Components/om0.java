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
public final class om0 extends Transition {
    public final int f25842a;
    public final Object f25843b;

    public om0(Object obj, int i10) {
        this.f25842a = i10;
        this.f25843b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.f25842a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                hy0 hy0Var = (hy0) this.f25843b;
                viewGroup = ((org.telegram.ui.ActionBar.h3) hy0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + hy0Var.f23809e0));
                return;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f25843b;
                if (view == photoViewer.Q1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.T1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f25843b;
                if (view2 == secretMediaViewer.Z) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.f30549a0.getPendingMarginTopDiff()));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.f25842a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                hy0 hy0Var = (hy0) this.f25843b;
                viewGroup = ((org.telegram.ui.ActionBar.h3) hy0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + hy0Var.f23809e0));
                return;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.au0 au0Var = ((PhotoViewer) this.f25843b).T1;
                if (view == au0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(au0Var.getScrollY()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.au0 au0Var2 = ((SecretMediaViewer) this.f25843b).f30549a0;
                if (view2 == au0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(au0Var2.getScrollY()));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i10 = this.f25842a;
        Object obj = this.f25843b;
        switch (i10) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new q70(this, 13));
                return ofFloat;
            case 1:
                int i11 = ((hy0) obj).f23809e0;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new bi.z5(this, intValue3, i11, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.T1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.cu0(this, 0));
                    ofInt.addUpdateListener(new org.telegram.ui.d3(this, 22));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.Q1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.Q1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat3.addListener(new org.telegram.ui.cu0(this, 1));
                    return ofFloat3;
                }
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.f30549a0) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.d51(this, 0));
                    ofInt2.addUpdateListener(new org.telegram.ui.f21(this, 6));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.Z || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.Z, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat4.addListener(new org.telegram.ui.d51(this, 1));
                    return ofFloat4;
                }
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
