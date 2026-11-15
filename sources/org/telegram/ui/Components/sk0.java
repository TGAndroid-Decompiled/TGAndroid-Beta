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
public final class sk0 extends Transition {
    public final int f39331a;
    public final Object f39332b;

    public sk0(Object obj, int i7) {
        this.f39331a = i7;
        this.f39332b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.f39331a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                bw0 bw0Var = (bw0) this.f39332b;
                map.put("offset", Integer.valueOf(bw0Var.f29682b.getTop() + bw0Var.Z1));
                return;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f39332b;
                if (view == photoViewer.R1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.U1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39332b;
                if (view2 == secretMediaViewer.Y) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.Z.getPendingMarginTopDiff()));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        switch (this.f39331a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                bw0 bw0Var = (bw0) this.f39332b;
                map.put("offset", Integer.valueOf(bw0Var.f29682b.getTop() + bw0Var.Z1));
                return;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.up0 up0Var = ((PhotoViewer) this.f39332b).U1;
                if (view == up0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(up0Var.getScrollY()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.up0 up0Var2 = ((SecretMediaViewer) this.f39332b).Z;
                if (view2 == up0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(up0Var2.getScrollY()));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i7 = this.f39331a;
        Object obj = this.f39332b;
        switch (i7) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f60(this, 12));
                return ofFloat;
            case 1:
                int i10 = ((bw0) obj).Z1;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new hi.g4(this, intValue3, i10, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.U1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.wp0(this, 0));
                    ofInt.addUpdateListener(new org.telegram.ui.a3(this, 20));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.R1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.R1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat3.addListener(new org.telegram.ui.wp0(this, 1));
                    return ofFloat3;
                }
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.Z) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.gz0(this, 0));
                    ofInt2.addUpdateListener(new org.telegram.ui.ez0(this, 2));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.Y || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.Y, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat4.addListener(new org.telegram.ui.gz0(this, 1));
                    return ofFloat4;
                }
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
