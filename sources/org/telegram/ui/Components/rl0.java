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
public final class rl0 extends Transition {
    public final int f29951a;
    public final Object f29952b;

    public rl0(Object obj, int i10) {
        this.f29951a = i10;
        this.f29952b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.f29951a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                cx0 cx0Var = (cx0) this.f29952b;
                map.put("offset", Integer.valueOf(cx0Var.f21586b.getTop() + cx0Var.V1));
                return;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f29952b;
                if (view == photoViewer.Q1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.T1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f29952b;
                if (view2 == secretMediaViewer.X) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.Y.getPendingMarginTopDiff()));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        switch (this.f29951a) {
            case 0:
                return;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                cx0 cx0Var = (cx0) this.f29952b;
                map.put("offset", Integer.valueOf(cx0Var.f21586b.getTop() + cx0Var.V1));
                return;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.fr0 fr0Var = ((PhotoViewer) this.f29952b).T1;
                if (view == fr0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(fr0Var.getScrollY()));
                    return;
                }
                return;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.fr0 fr0Var2 = ((SecretMediaViewer) this.f29952b).Y;
                if (view2 == fr0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(fr0Var2.getScrollY()));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i10 = this.f29951a;
        Object obj = this.f29952b;
        switch (i10) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r60(this, 13));
                return ofFloat;
            case 1:
                int i11 = ((cx0) obj).V1;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new jg.a0(this, intValue3, i11, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.T1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.hr0(this, 0));
                    ofInt.addUpdateListener(new org.telegram.ui.a3(this, 20));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.Q1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.Q1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat3.addListener(new org.telegram.ui.hr0(this, 1));
                    return ofFloat3;
                }
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.Y) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.w01(this, 0));
                    ofInt2.addUpdateListener(new org.telegram.ui.u01(this, 2));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.X || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.X, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat4.addListener(new org.telegram.ui.w01(this, 1));
                    return ofFloat4;
                }
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
