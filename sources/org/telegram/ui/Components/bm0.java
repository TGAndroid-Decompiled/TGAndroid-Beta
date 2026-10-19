package org.telegram.ui.Components;

import android.view.View;
public final class bm0 implements Runnable {
    public final View f24989a;
    public final int f24990b;
    public final float f24991c;
    public final float d;
    public final cm0 e;

    public bm0(cm0 cm0Var, View view, int i10, float f7, float f10) {
        this.e = cm0Var;
        this.f24989a = view;
        this.f24990b = i10;
        this.f24991c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        dm0 dm0Var = this.e.f25284b;
        im0 im0Var = (im0) dm0Var.f25594b;
        if (this == im0Var.Q1) {
            im0Var.Q1 = null;
        }
        View view = this.f24989a;
        if (view != null) {
            im0Var.h1(view, 0.0f, 0.0f, false);
            if (!((im0) dm0Var.f25594b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f24990b;
                if (i10 != -1) {
                    im0 im0Var2 = (im0) dm0Var.f25594b;
                    wl0 wl0Var = im0Var2.T0;
                    if (wl0Var != null) {
                        wl0Var.a(i10, view);
                        return;
                    }
                    xl0 xl0Var = im0Var2.U0;
                    if (xl0Var != null) {
                        xl0Var.d(this.f24991c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
