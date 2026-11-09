package org.telegram.ui.Components;

import android.view.View;
public final class p61 implements dj0, ej0 {
    public final v61 f36935a;

    public p61(v61 v61Var) {
        this.f36935a = v61Var;
    }

    @Override
    public boolean c(int i7, View view) {
        org.telegram.messenger.w10 w10Var = this.f36935a.f38963b;
        if (w10Var == null) {
            return false;
        }
        return ((Boolean) w10Var.d(Integer.valueOf(((t61) view).f38305a.f37938a), view)).booleanValue();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        v61 v61Var = this.f36935a;
        u61 u61Var = v61Var.D;
        if (u61Var != null) {
            w61 w61Var = (w61) ((n) u61Var).f36185a;
            if (w61Var.f39957y || w61Var.H) {
                return;
            }
        }
        t61 t61Var = (t61) view;
        if (i7 != v61Var.F || u61Var == null) {
            org.telegram.messenger.w10 w10Var = v61Var.f38977l0;
            if (w10Var != null && ((Boolean) w10Var.d(Integer.valueOf(t61Var.f38305a.f37938a), Integer.valueOf(i7))).booleanValue()) {
                return;
            }
            v61Var.d(t61Var.f38305a.f37938a, i7);
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
