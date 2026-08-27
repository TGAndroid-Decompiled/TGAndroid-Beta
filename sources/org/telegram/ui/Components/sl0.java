package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;

public final class sl0 extends Transition {

    public final int f32481a;

    public final Object f32482b;

    public sl0(Object obj, int i10) {
        this.f32481a = i10;
        this.f32482b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.f32481a) {
            case 0:
                break;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                ex0 ex0Var = (ex0) this.f32482b;
                map.put("offset", Integer.valueOf(((org.telegram.ui.ActionBar.e3) ex0Var).containerView.getTop() + ex0Var.f28170a0));
                break;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.f32482b;
                if (view == photoViewer.M1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.P1.getPendingMarginTopDiff()));
                }
                break;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32482b;
                if (view2 == secretMediaViewer.V) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.W.getPendingMarginTopDiff()));
                }
                break;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        switch (this.f32481a) {
            case 0:
                break;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                ex0 ex0Var = (ex0) this.f32482b;
                map.put("offset", Integer.valueOf(((org.telegram.ui.ActionBar.e3) ex0Var).containerView.getTop() + ex0Var.f28170a0));
                break;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.at0 at0Var = ((PhotoViewer) this.f32482b).P1;
                if (view == at0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(at0Var.getScrollY()));
                }
                break;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.at0 at0Var2 = ((SecretMediaViewer) this.f32482b).W;
                if (view2 == at0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(at0Var2.getScrollY()));
                }
                break;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int iIntValue;
        int iIntValue2;
        int i10 = this.f32481a;
        Object obj = this.f32482b;
        int i11 = 1;
        int i12 = 0;
        switch (i10) {
            case 0:
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new v60(this, 13));
                return valueAnimatorOfFloat;
            case 1:
                int i13 = ((ex0) obj).f28170a0;
                int iIntValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(250L);
                valueAnimatorOfFloat2.addUpdateListener(new lh.t4(this, iIntValue3, i13, 4));
                return valueAnimatorOfFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.P1) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    valueAnimatorOfInt.addListener(new org.telegram.ui.ct0(this, i12));
                    valueAnimatorOfInt.addUpdateListener(new org.telegram.ui.g3(this, 22));
                    return valueAnimatorOfInt;
                }
                if (transitionValues2.view != photoViewer.M1 || (iIntValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(photoViewer.M1, (Property<org.telegram.ui.qt0, Float>) View.TRANSLATION_Y, 0.0f, iIntValue);
                objectAnimatorOfFloat.addListener(new org.telegram.ui.ct0(this, i11));
                return objectAnimatorOfFloat;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.W) {
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    valueAnimatorOfInt2.addListener(new org.telegram.ui.s31(this, i12));
                    valueAnimatorOfInt2.addUpdateListener(new org.telegram.ui.w01(this, 6));
                    return valueAnimatorOfInt2;
                }
                if (transitionValues2.view != secretMediaViewer.V || (iIntValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(secretMediaViewer.V, (Property<org.telegram.ui.qt0, Float>) View.TRANSLATION_Y, 0.0f, iIntValue2);
                objectAnimatorOfFloat2.addListener(new org.telegram.ui.s31(this, i11));
                return objectAnimatorOfFloat2;
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
