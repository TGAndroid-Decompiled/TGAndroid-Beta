package org.telegram.ui.Components;

import android.view.View;
public final class bm0 implements Runnable {
    public final View f24987a;
    public final int f24988b;
    public final float f24989c;
    public final float d;
    public final cm0 e;

    public bm0(cm0 cm0Var, View view, int i10, float f7, float f10) {
        this.e = cm0Var;
        this.f24987a = view;
        this.f24988b = i10;
        this.f24989c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        dm0 dm0Var = this.e.f25282b;
        im0 im0Var = (im0) dm0Var.f25592b;
        if (this == im0Var.Q1) {
            im0Var.Q1 = null;
        }
        View view = this.f24987a;
        if (view != null) {
            im0Var.h1(view, 0.0f, 0.0f, false);
            if (!((im0) dm0Var.f25592b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f24988b;
                if (i10 != -1) {
                    im0 im0Var2 = (im0) dm0Var.f25592b;
                    wl0 wl0Var = im0Var2.T0;
                    if (wl0Var != null) {
                        wl0Var.a(i10, view);
                        return;
                    }
                    xl0 xl0Var = im0Var2.U0;
                    if (xl0Var != null) {
                        xl0Var.d(this.f24989c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
