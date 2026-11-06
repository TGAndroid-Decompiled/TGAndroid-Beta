package org.telegram.ui.Components;

import android.view.View;
public final class i61 implements cj0, dj0 {
    public final o61 f34550a;

    public i61(o61 o61Var) {
        this.f34550a = o61Var;
    }

    @Override
    public boolean c(int i7, View view) {
        org.telegram.messenger.w10 w10Var = this.f34550a.f36642b;
        if (w10Var == null) {
            return false;
        }
        return ((Boolean) w10Var.d(Integer.valueOf(((m61) view).f35944a.f35530a), view)).booleanValue();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        o61 o61Var = this.f34550a;
        n61 n61Var = o61Var.D;
        if (n61Var != null) {
            p61 p61Var = (p61) ((n) n61Var).f36166a;
            if (p61Var.f36913y || p61Var.H) {
                return;
            }
        }
        m61 m61Var = (m61) view;
        if (i7 != o61Var.F || n61Var == null) {
            org.telegram.messenger.w10 w10Var = o61Var.f36656l0;
            if (w10Var != null && ((Boolean) w10Var.d(Integer.valueOf(m61Var.f35944a.f35530a), Integer.valueOf(i7))).booleanValue()) {
                return;
            }
            o61Var.d(m61Var.f35944a.f35530a, i7);
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
