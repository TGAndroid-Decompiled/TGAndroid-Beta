package org.telegram.ui.Components;

import android.view.View;
public final class c71 implements rj0, sj0 {
    public final i71 f34114a;

    public c71(i71 i71Var) {
        this.f34114a = i71Var;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        org.telegram.messenger.r10 r10Var = this.f34114a.f36202b;
        if (r10Var == null) {
            return false;
        }
        return ((Boolean) r10Var.g(Integer.valueOf(((g71) view).f35425a.f35106a), view)).booleanValue();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        i71 i71Var = this.f34114a;
        h71 h71Var = i71Var.E;
        if (h71Var == null || h71Var.b()) {
            g71 g71Var = (g71) view;
            if (i7 == i71Var.G && i71Var.E != null) {
                return;
            }
            org.telegram.messenger.r10 r10Var = i71Var.m0;
            if (r10Var != null && ((Boolean) r10Var.g(Integer.valueOf(g71Var.f35425a.f35106a), Integer.valueOf(i7))).booleanValue()) {
                return;
            }
            i71Var.e(g71Var.f35425a.f35106a, i7);
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
