package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class lw extends m2.g {
    public final wy f30567s0;

    public lw(wy wyVar, Context context) {
        super(context);
        this.f30567s0 = wyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30567s0.f34401f) {
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
    public final void x(int i9, boolean z10) {
        boolean z11;
        wy wyVar = this.f30567s0;
        vv vvVar = wyVar.E;
        if (i9 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        wy.b(wyVar, z11);
        if (i9 == getCurrentItem()) {
            if (i9 == 0) {
                wyVar.M0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vvVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(gr.h);
                ofFloat.start();
                wyVar.H(1, 0);
                if (vvVar != null) {
                    vvVar.j(0, true);
                    return;
                }
                return;
            } else if (i9 == 1) {
                wyVar.f34394d0.x0(0);
                return;
            } else {
                wyVar.f34466z0.x0(1);
                return;
            }
        }
        super.x(i9, z10);
    }
}
