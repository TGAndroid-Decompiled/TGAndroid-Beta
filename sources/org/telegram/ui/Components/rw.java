package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class rw extends m2.g {
    public final fz f32400s0;

    public rw(fz fzVar, Context context) {
        super(context);
        this.f32400s0 = fzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f32400s0.f28592f) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override
    public final void x(int i10, boolean z10) {
        boolean z11;
        fz fzVar = this.f32400s0;
        bw bwVar = fzVar.E;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        fz.a(fzVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                fzVar.M0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(jr.h);
                ofFloat.start();
                fzVar.H(1, 0);
                if (bwVar != null) {
                    bwVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                fzVar.f28585d0.x0(0);
                return;
            } else {
                fzVar.f28657z0.x0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
