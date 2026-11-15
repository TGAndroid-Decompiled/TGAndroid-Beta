package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class bw extends c5.l {
    public final ly f33394x0;

    public bw(ly lyVar, Context context) {
        super(context);
        this.f33394x0 = lyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f33394x0.f36946f) {
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
    public final void x(int i7, boolean z10) {
        boolean z11;
        ly lyVar = this.f33394x0;
        qw qwVar = lyVar.J;
        if (i7 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        ly.a(lyVar, z11);
        if (i7 == getCurrentItem()) {
            if (i7 == 0) {
                lyVar.R0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(er.h);
                ofFloat.start();
                lyVar.H(1, 0);
                if (qwVar != null) {
                    qwVar.j(0, true);
                    return;
                }
                return;
            } else if (i7 == 1) {
                lyVar.f36956i0.y0(0);
                return;
            } else {
                lyVar.E0.y0(1);
                return;
            }
        }
        super.x(i7, z10);
    }
}
