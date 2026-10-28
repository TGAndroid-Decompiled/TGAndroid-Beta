package org.telegram.ui.Components;

import android.view.View;
public final class fm0 implements Runnable {
    public final View f28210a;
    public final int f28211b;
    public final float f28212c;
    public final float d;
    public final gm0 e;

    public fm0(gm0 gm0Var, View view, int i10, float f7, float f10) {
        this.e = gm0Var;
        this.f28210a = view;
        this.f28211b = i10;
        this.f28212c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        hm0 hm0Var = this.e.f28655b;
        nm0 nm0Var = (nm0) hm0Var.f29026b;
        if (this == nm0Var.Q1) {
            nm0Var.Q1 = null;
        }
        View view = this.f28210a;
        if (view != null) {
            nm0Var.k1(view, 0.0f, 0.0f, false);
            if (!((nm0) hm0Var.f29026b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f28211b;
                if (i10 != -1) {
                    nm0 nm0Var2 = (nm0) hm0Var.f29026b;
                    am0 am0Var = nm0Var2.T0;
                    if (am0Var != null) {
                        am0Var.c(i10, view);
                        return;
                    }
                    bm0 bm0Var = nm0Var2.U0;
                    if (bm0Var != null) {
                        bm0Var.e(this.f28212c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
