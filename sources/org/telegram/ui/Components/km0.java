package org.telegram.ui.Components;

import android.view.View;
public final class km0 implements Runnable {
    public final View f28069a;
    public final int f28070b;
    public final float f28071c;
    public final float d;
    public final lm0 f28072e;

    public km0(lm0 lm0Var, View view, int i10, float f7, float f10) {
        this.f28072e = lm0Var;
        this.f28069a = view;
        this.f28070b = i10;
        this.f28071c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        mm0 mm0Var = this.f28072e.f28428b;
        rm0 rm0Var = (rm0) mm0Var.f28850b;
        if (this == rm0Var.Q1) {
            rm0Var.Q1 = null;
        }
        View view = this.f28069a;
        if (view != null) {
            rm0Var.h1(view, 0.0f, 0.0f, false);
            if (!((rm0) mm0Var.f28850b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f28070b;
                if (i10 != -1) {
                    rm0 rm0Var2 = (rm0) mm0Var.f28850b;
                    fm0 fm0Var = rm0Var2.T0;
                    if (fm0Var != null) {
                        fm0Var.d(i10, view);
                        return;
                    }
                    gm0 gm0Var = rm0Var2.U0;
                    if (gm0Var != null) {
                        gm0Var.c(this.f28071c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
