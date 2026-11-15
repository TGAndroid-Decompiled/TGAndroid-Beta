package org.telegram.ui.Components;

import android.view.View;
public final class p61 implements hj0, ij0 {
    public final v61 f38227a;

    public p61(v61 v61Var) {
        this.f38227a = v61Var;
    }

    @Override
    public boolean b(int i7, View view) {
        org.telegram.messenger.t10 t10Var = this.f38227a.f40293b;
        if (t10Var == null) {
            return false;
        }
        return ((Boolean) t10Var.d(Integer.valueOf(((t61) view).f39556a.f39185a), view)).booleanValue();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        v61 v61Var = this.f38227a;
        u61 u61Var = v61Var.E;
        if (u61Var != null) {
            w61 w61Var = (w61) ((cf) u61Var).f33545a;
            if (w61Var.f41307y || w61Var.I) {
                return;
            }
        }
        t61 t61Var = (t61) view;
        if (i7 != v61Var.G || u61Var == null) {
            org.telegram.messenger.t10 t10Var = v61Var.m0;
            if (t10Var != null && ((Boolean) t10Var.d(Integer.valueOf(t61Var.f39556a.f39185a), Integer.valueOf(i7))).booleanValue()) {
                return;
            }
            v61Var.d(t61Var.f39556a.f39185a, i7);
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
