package org.telegram.ui.Components;

import android.view.View;
public final class fm0 implements Runnable {
    public final View f26377a;
    public final int f26378b;
    public final float f26379c;
    public final float d;
    public final gm0 e;

    public fm0(gm0 gm0Var, View view, int i10, float f7, float f10) {
        this.e = gm0Var;
        this.f26377a = view;
        this.f26378b = i10;
        this.f26379c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        hm0 hm0Var = this.e.f26677b;
        mm0 mm0Var = (mm0) hm0Var.f26986b;
        if (this == mm0Var.Q1) {
            mm0Var.Q1 = null;
        }
        View view = this.f26377a;
        if (view != null) {
            mm0Var.j1(view, 0.0f, 0.0f, false);
            if (!((mm0) hm0Var.f26986b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f26378b;
                if (i10 != -1) {
                    mm0 mm0Var2 = (mm0) hm0Var.f26986b;
                    am0 am0Var = mm0Var2.T0;
                    if (am0Var != null) {
                        am0Var.d(i10, view);
                        return;
                    }
                    bm0 bm0Var = mm0Var2.U0;
                    if (bm0Var != null) {
                        bm0Var.c(this.f26379c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
