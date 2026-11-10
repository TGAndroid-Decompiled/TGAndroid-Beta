package org.telegram.ui.Components;

import android.view.View;
public final class o61 implements cj0, dj0 {
    public final u61 f36529a;

    public o61(u61 u61Var) {
        this.f36529a = u61Var;
    }

    @Override
    public boolean c(int i7, View view) {
        org.telegram.messenger.w10 w10Var = this.f36529a.f38558b;
        if (w10Var == null) {
            return false;
        }
        return ((Boolean) w10Var.d(Integer.valueOf(((s61) view).f37878a.f37523a), view)).booleanValue();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        u61 u61Var = this.f36529a;
        t61 t61Var = u61Var.D;
        if (t61Var != null) {
            v61 v61Var = (v61) ((m) t61Var).f35778a;
            if (v61Var.f38900y || v61Var.H) {
                return;
            }
        }
        s61 s61Var = (s61) view;
        if (i7 != u61Var.F || t61Var == null) {
            org.telegram.messenger.w10 w10Var = u61Var.f38572l0;
            if (w10Var != null && ((Boolean) w10Var.d(Integer.valueOf(s61Var.f37878a.f37523a), Integer.valueOf(i7))).booleanValue()) {
                return;
            }
            u61Var.d(s61Var.f37878a.f37523a, i7);
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
