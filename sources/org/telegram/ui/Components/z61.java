package org.telegram.ui.Components;

import android.view.View;
public final class z61 implements pj0, qj0 {
    public final f71 f42821a;

    public z61(f71 f71Var) {
        this.f42821a = f71Var;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        org.telegram.messenger.r10 r10Var = this.f42821a.f34992b;
        if (r10Var == null) {
            return false;
        }
        return ((Boolean) r10Var.g(Integer.valueOf(((d71) view).f34293a.f33908a), view)).booleanValue();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        f71 f71Var = this.f42821a;
        e71 e71Var = f71Var.E;
        if (e71Var == null || e71Var.b()) {
            d71 d71Var = (d71) view;
            if (i7 == f71Var.G && f71Var.E != null) {
                return;
            }
            org.telegram.messenger.r10 r10Var = f71Var.m0;
            if (r10Var != null && ((Boolean) r10Var.g(Integer.valueOf(d71Var.f34293a.f33908a), Integer.valueOf(i7))).booleanValue()) {
                return;
            }
            f71Var.e(d71Var.f34293a.f33908a, i7);
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
