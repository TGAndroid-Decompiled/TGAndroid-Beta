package org.telegram.ui.Components;

import android.view.View;
public final class n61 implements cj0, dj0 {
    public final t61 f36204a;

    public n61(t61 t61Var) {
        this.f36204a = t61Var;
    }

    @Override
    public boolean c(int i7, View view) {
        org.telegram.messenger.w10 w10Var = this.f36204a.f38244b;
        if (w10Var == null) {
            return false;
        }
        return ((Boolean) w10Var.d(Integer.valueOf(((r61) view).f37558a.f37165a), view)).booleanValue();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        t61 t61Var = this.f36204a;
        s61 s61Var = t61Var.D;
        if (s61Var != null) {
            u61 u61Var = (u61) ((n) s61Var).f36104a;
            if (u61Var.f38541y || u61Var.H) {
                return;
            }
        }
        r61 r61Var = (r61) view;
        if (i7 != t61Var.F || s61Var == null) {
            org.telegram.messenger.w10 w10Var = t61Var.f38258l0;
            if (w10Var != null && ((Boolean) w10Var.d(Integer.valueOf(r61Var.f37558a.f37165a), Integer.valueOf(i7))).booleanValue()) {
                return;
            }
            t61Var.d(r61Var.f37558a.f37165a, i7);
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
