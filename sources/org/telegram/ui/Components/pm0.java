package org.telegram.ui.Components;

import android.view.View;
public final class pm0 implements Runnable {
    public final View f29529a;
    public final int f29530b;
    public final float f29531c;
    public final float d;
    public final qm0 f29532e;

    public pm0(qm0 qm0Var, View view, int i10, float f7, float f10) {
        this.f29532e = qm0Var;
        this.f29529a = view;
        this.f29530b = i10;
        this.f29531c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        rm0 rm0Var = this.f29532e.f29867b;
        wm0 wm0Var = (wm0) rm0Var.f30188b;
        if (this == wm0Var.Q1) {
            wm0Var.Q1 = null;
        }
        View view = this.f29529a;
        if (view != null) {
            wm0Var.h1(view, 0.0f, 0.0f, false);
            if (!((wm0) rm0Var.f30188b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f29530b;
                if (i10 != -1) {
                    wm0 wm0Var2 = (wm0) rm0Var.f30188b;
                    km0 km0Var = wm0Var2.T0;
                    if (km0Var != null) {
                        km0Var.d(i10, view);
                        return;
                    }
                    lm0 lm0Var = wm0Var2.U0;
                    if (lm0Var != null) {
                        lm0Var.c(this.f29531c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
