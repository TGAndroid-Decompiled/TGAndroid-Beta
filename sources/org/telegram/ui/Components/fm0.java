package org.telegram.ui.Components;

import android.view.View;
public final class fm0 implements Runnable {
    public final View f25081a;
    public final int f25082b;
    public final float f25083c;
    public final float d;
    public final gm0 e;

    public fm0(gm0 gm0Var, View view, int i10, float f7, float f10) {
        this.e = gm0Var;
        this.f25081a = view;
        this.f25082b = i10;
        this.f25083c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        hm0 hm0Var = this.e.f25364b;
        mm0 mm0Var = (mm0) hm0Var.f25711b;
        if (this == mm0Var.Q1) {
            mm0Var.Q1 = null;
        }
        View view = this.f25081a;
        if (view != null) {
            mm0Var.h1(view, 0.0f, 0.0f, false);
            if (!((mm0) hm0Var.f25711b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f25082b;
                if (i10 != -1) {
                    mm0 mm0Var2 = (mm0) hm0Var.f25711b;
                    am0 am0Var = mm0Var2.T0;
                    if (am0Var != null) {
                        am0Var.a(i10, view);
                        return;
                    }
                    bm0 bm0Var = mm0Var2.U0;
                    if (bm0Var != null) {
                        bm0Var.d(this.f25083c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
