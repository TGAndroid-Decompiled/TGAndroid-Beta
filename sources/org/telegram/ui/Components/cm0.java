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
public final class cm0 extends Transition {
    public final int f27509a;
    public final Object f27510b;

    public cm0(Object obj, int i10) {
        this.f27509a = i10;
        this.f27510b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.f27509a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                nx0 nx0Var = (nx0) this.f27510b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) nx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + nx0Var.f31168a0));
                return;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f27510b;
                if (view == photoViewer.M1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.P1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f27510b;
                if (view2 == secretMediaViewer.V) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.W.getPendingMarginTopDiff()));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.f27509a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                nx0 nx0Var = (nx0) this.f27510b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) nx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + nx0Var.f31168a0));
                return;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.xs0 xs0Var = ((PhotoViewer) this.f27510b).P1;
                if (view == xs0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(xs0Var.getScrollY()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.xs0 xs0Var2 = ((SecretMediaViewer) this.f27510b).W;
                if (view2 == xs0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(xs0Var2.getScrollY()));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i10 = this.f27509a;
        Object obj = this.f27510b;
        switch (i10) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d70(this, 13));
                return ofFloat;
            case 1:
                int i11 = ((nx0) obj).f31168a0;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new bg.h0(this, intValue3, i11, 5));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.P1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.zs0(this, 0));
                    ofInt.addUpdateListener(new org.telegram.ui.g3(this, 22));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.M1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.M1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat3.addListener(new org.telegram.ui.zs0(this, 1));
                    return ofFloat3;
                }
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.W) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.v31(this, 0));
                    ofInt2.addUpdateListener(new org.telegram.ui.w01(this, 6));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.V || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.V, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat4.addListener(new org.telegram.ui.v31(this, 1));
                    return ofFloat4;
                }
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
