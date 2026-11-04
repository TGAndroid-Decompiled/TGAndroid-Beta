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
public final class rk0 extends Transition {
    public final int f37746a;
    public final Object f37747b;

    public rk0(Object obj, int i3) {
        this.f37746a = i3;
        this.f37747b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.f37746a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                xv0 xv0Var = (xv0) this.f37747b;
                map.put("offset", Integer.valueOf(xv0Var.f28586b.getTop() + xv0Var.W1));
                return;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f37747b;
                if (view == photoViewer.R1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.U1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37747b;
                if (view2 == secretMediaViewer.Y) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.Z.getPendingMarginTopDiff()));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        switch (this.f37746a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                xv0 xv0Var = (xv0) this.f37747b;
                map.put("offset", Integer.valueOf(xv0Var.f28586b.getTop() + xv0Var.W1));
                return;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.mp0 mp0Var = ((PhotoViewer) this.f37747b).U1;
                if (view == mp0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(mp0Var.getScrollY()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.mp0 mp0Var2 = ((SecretMediaViewer) this.f37747b).Z;
                if (view2 == mp0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(mp0Var2.getScrollY()));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i3 = this.f37746a;
        Object obj = this.f37747b;
        switch (i3) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new y50(this, 13));
                return ofFloat;
            case 1:
                int i10 = ((xv0) obj).W1;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new gi.h4(this, intValue3, i10, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.U1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.op0(this, 0));
                    ofInt.addUpdateListener(new org.telegram.ui.b3(this, 20));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.R1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.R1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat3.addListener(new org.telegram.ui.op0(this, 1));
                    return ofFloat3;
                }
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.Z) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.zy0(this, 0));
                    ofInt2.addUpdateListener(new org.telegram.ui.xy0(this, 2));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.Y || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.Y, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat4.addListener(new org.telegram.ui.zy0(this, 1));
                    return ofFloat4;
                }
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
