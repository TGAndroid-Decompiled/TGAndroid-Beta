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
    public final int f29179a;
    public final Object f29180b;

    public mm0(Object obj, int i10) {
        this.f29179a = i10;
        this.f29180b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.f29179a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                xx0 xx0Var = (xx0) this.f29180b;
                viewGroup = ((org.telegram.ui.ActionBar.h3) xx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + xx0Var.f33222b0));
                return;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f29180b;
                if (view == photoViewer.N1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.Q1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f29180b;
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
        switch (this.f29179a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                xx0 xx0Var = (xx0) this.f29180b;
                viewGroup = ((org.telegram.ui.ActionBar.h3) xx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + xx0Var.f33222b0));
                return;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.nt0 nt0Var = ((PhotoViewer) this.f29180b).Q1;
                if (view == nt0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(nt0Var.getScrollY()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.nt0 nt0Var2 = ((SecretMediaViewer) this.f29180b).X;
                if (view2 == nt0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(nt0Var2.getScrollY()));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i10 = this.f29179a;
        Object obj = this.f29180b;
        switch (i10) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new k70(this, 13));
                return ofFloat;
            case 1:
                int i11 = ((xx0) obj).f33222b0;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new eg.e0(this, intValue3, i11, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.Q1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.pt0(this, 0));
                    ofInt.addUpdateListener(new org.telegram.ui.e3(this, 22));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.N1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.N1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat3.addListener(new org.telegram.ui.pt0(this, 1));
                    return ofFloat3;
                }
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.X) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.m41(this, 0));
                    ofInt2.addUpdateListener(new org.telegram.ui.n11(this, 6));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.W || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.W, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat4.addListener(new org.telegram.ui.m41(this, 1));
                    return ofFloat4;
                }
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
