package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class jw extends c5.l {
    public final ty f36699x0;

    public jw(ty tyVar, Context context) {
        super(context);
        this.f36699x0 = tyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f36699x0.f40096f) {
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
        ty tyVar = this.f36699x0;
        yw ywVar = tyVar.J;
        if (i7 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        ty.a(tyVar, z11);
        if (i7 == getCurrentItem()) {
            if (i7 == 0) {
                tyVar.R0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ywVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(nr.h);
                ofFloat.start();
                tyVar.G(1, 0);
                if (ywVar != null) {
                    ywVar.j(0, true);
                    return;
                }
                return;
            } else if (i7 == 1) {
                tyVar.f40106i0.y0(0);
                return;
            } else {
                tyVar.E0.y0(1);
                return;
            }
        }
        super.x(i7, z10);
    }
}
