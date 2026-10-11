package org.telegram.ui.Components;

import android.view.View;
public final class km0 implements Runnable {
    public final View f28106a;
    public final int f28107b;
    public final float f28108c;
    public final float d;
    public final lm0 f28109e;

    public km0(lm0 lm0Var, View view, int i10, float f7, float f10) {
        this.f28109e = lm0Var;
        this.f28106a = view;
        this.f28107b = i10;
        this.f28108c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        mm0 mm0Var = this.f28109e.f28504b;
        rm0 rm0Var = (rm0) mm0Var.f28890b;
        if (this == rm0Var.Q1) {
            rm0Var.Q1 = null;
        }
        View view = this.f28106a;
        if (view != null) {
            rm0Var.h1(view, 0.0f, 0.0f, false);
            if (!((rm0) mm0Var.f28890b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f28107b;
                if (i10 != -1) {
                    rm0 rm0Var2 = (rm0) mm0Var.f28890b;
                    fm0 fm0Var = rm0Var2.T0;
                    if (fm0Var != null) {
                        fm0Var.d(i10, view);
                        return;
                    }
                    gm0 gm0Var = rm0Var2.U0;
                    if (gm0Var != null) {
                        gm0Var.c(this.f28108c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
