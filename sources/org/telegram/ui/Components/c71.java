package org.telegram.ui.Components;

import android.view.View;
public final class c71 implements rj0, sj0 {
    public final i71 f34072a;

    public c71(i71 i71Var) {
        this.f34072a = i71Var;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        org.telegram.messenger.s10 s10Var = this.f34072a.f36150b;
        if (s10Var == null) {
            return false;
        }
        return ((Boolean) s10Var.g(Integer.valueOf(((g71) view).f35406a.f35083a), view)).booleanValue();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        i71 i71Var = this.f34072a;
        h71 h71Var = i71Var.E;
        if (h71Var == null || h71Var.b()) {
            g71 g71Var = (g71) view;
            if (i7 == i71Var.G && i71Var.E != null) {
                return;
            }
            org.telegram.messenger.s10 s10Var = i71Var.m0;
            if (s10Var != null && ((Boolean) s10Var.g(Integer.valueOf(g71Var.f35406a.f35083a), Integer.valueOf(i7))).booleanValue()) {
                return;
            }
            i71Var.e(g71Var.f35406a.f35083a, i7);
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
