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
public final class nk0 extends Transition {
    public final int f36381a;
    public final Object f36382b;

    public nk0(Object obj, int i7) {
        this.f36381a = i7;
        this.f36382b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.f36381a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                yv0 yv0Var = (yv0) this.f36382b;
                map.put("offset", Integer.valueOf(yv0Var.f28619b.getTop() + yv0Var.V1));
                return;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f36382b;
                if (view == photoViewer.Q1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.T1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36382b;
                if (view2 == secretMediaViewer.X) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.Y.getPendingMarginTopDiff()));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        switch (this.f36381a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                yv0 yv0Var = (yv0) this.f36382b;
                map.put("offset", Integer.valueOf(yv0Var.f28619b.getTop() + yv0Var.V1));
                return;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.vp0 vp0Var = ((PhotoViewer) this.f36382b).T1;
                if (view == vp0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(vp0Var.getScrollY()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.vp0 vp0Var2 = ((SecretMediaViewer) this.f36382b).Y;
                if (view2 == vp0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(vp0Var2.getScrollY()));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i7 = this.f36381a;
        Object obj = this.f36382b;
        switch (i7) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new c60(this, 12));
                return ofFloat;
            case 1:
                int i10 = ((yv0) obj).V1;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new fi.k4(this, intValue3, i10, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.T1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.xp0(this, 0));
                    ofInt.addUpdateListener(new org.telegram.ui.a3(this, 20));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.Q1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.Q1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat3.addListener(new org.telegram.ui.xp0(this, 1));
                    return ofFloat3;
                }
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.Y) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.iz0(this, 0));
                    ofInt2.addUpdateListener(new org.telegram.ui.gz0(this, 2));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.X || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.X, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat4.addListener(new org.telegram.ui.iz0(this, 1));
                    return ofFloat4;
                }
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
