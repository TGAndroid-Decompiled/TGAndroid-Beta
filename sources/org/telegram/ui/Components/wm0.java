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
public final class wm0 extends Transition {
    public final int f32670a;
    public final Object f32671b;

    public wm0(Object obj, int i10) {
        this.f32670a = i10;
        this.f32671b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.f32670a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                ry0 ry0Var = (ry0) this.f32671b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) ry0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + ry0Var.f30614e0));
                return;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f32671b;
                if (view == photoViewer.Q1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.T1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32671b;
                if (view2 == secretMediaViewer.Z) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.f34423a0.getPendingMarginTopDiff()));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.f32670a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                ry0 ry0Var = (ry0) this.f32671b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) ry0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + ry0Var.f30614e0));
                return;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.wt0 wt0Var = ((PhotoViewer) this.f32671b).T1;
                if (view == wt0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(wt0Var.getScrollY()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.wt0 wt0Var2 = ((SecretMediaViewer) this.f32671b).f34423a0;
                if (view2 == wt0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(wt0Var2.getScrollY()));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i10 = this.f32670a;
        Object obj = this.f32671b;
        switch (i10) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new v70(this, 13));
                return ofFloat;
            case 1:
                int i11 = ((ry0) obj).f30614e0;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new ci.c5(this, intValue3, i11, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.T1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.yt0(this, 0));
                    ofInt.addUpdateListener(new org.telegram.ui.c3(this, 21));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.Q1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.Q1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat3.addListener(new org.telegram.ui.yt0(this, 1));
                    return ofFloat3;
                }
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.f34423a0) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.s41(this, 0));
                    ofInt2.addUpdateListener(new org.telegram.ui.b21(this, 5));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.Z || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.Z, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat4.addListener(new org.telegram.ui.s41(this, 1));
                    return ofFloat4;
                }
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
