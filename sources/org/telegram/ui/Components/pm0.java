package org.telegram.ui.Components;

import android.view.View;
public final class pm0 implements Runnable {
    public final View f29550a;
    public final int f29551b;
    public final float f29552c;
    public final float d;
    public final qm0 f29553e;

    public pm0(qm0 qm0Var, View view, int i10, float f7, float f10) {
        this.f29553e = qm0Var;
        this.f29550a = view;
        this.f29551b = i10;
        this.f29552c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        rm0 rm0Var = this.f29553e.f29865b;
        wm0 wm0Var = (wm0) rm0Var.f30192b;
        if (this == wm0Var.Q1) {
            wm0Var.Q1 = null;
        }
        View view = this.f29550a;
        if (view != null) {
            wm0Var.h1(view, 0.0f, 0.0f, false);
            if (!((wm0) rm0Var.f30192b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f29551b;
                if (i10 != -1) {
                    wm0 wm0Var2 = (wm0) rm0Var.f30192b;
                    km0 km0Var = wm0Var2.T0;
                    if (km0Var != null) {
                        km0Var.d(i10, view);
                        return;
                    }
                    lm0 lm0Var = wm0Var2.U0;
                    if (lm0Var != null) {
                        lm0Var.c(this.f29552c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
