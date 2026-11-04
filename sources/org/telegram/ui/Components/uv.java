package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class uv extends b5.l {
    public final ey f38890x0;

    public uv(ey eyVar, Context context) {
        super(context);
        this.f38890x0 = eyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f38890x0.f33535f) {
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
    public final void x(int i3, boolean z10) {
        boolean z11;
        ey eyVar = this.f38890x0;
        jw jwVar = eyVar.J;
        if (i3 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        ey.a(eyVar, z11);
        if (i3 == getCurrentItem()) {
            if (i3 == 0) {
                eyVar.R0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
                eyVar.G(1, 0);
                if (jwVar != null) {
                    jwVar.j(0, true);
                    return;
                }
                return;
            } else if (i3 == 1) {
                eyVar.f33545i0.y0(0);
                return;
            } else {
                eyVar.E0.y0(1);
                return;
            }
        }
        super.x(i3, z10);
    }
}
