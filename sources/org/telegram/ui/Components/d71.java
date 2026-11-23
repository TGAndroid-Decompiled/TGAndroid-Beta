package org.telegram.ui.Components;

import android.view.View;
public final class d71 implements rj0, sj0 {
    public final j71 f34229a;

    public d71(j71 j71Var) {
        this.f34229a = j71Var;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public boolean b(int i7, View view) {
        org.telegram.messenger.q10 q10Var = this.f34229a.f36324b;
        if (q10Var == null) {
            return false;
        }
        return ((Boolean) q10Var.d(Integer.valueOf(((h71) view).f35678a.f35349a), view)).booleanValue();
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        j71 j71Var = this.f34229a;
        i71 i71Var = j71Var.E;
        if (i71Var == null || i71Var.d()) {
            h71 h71Var = (h71) view;
            if (i7 == j71Var.G && j71Var.E != null) {
                return;
            }
            org.telegram.messenger.q10 q10Var = j71Var.m0;
            if (q10Var != null && ((Boolean) q10Var.d(Integer.valueOf(h71Var.f35678a.f35349a), Integer.valueOf(i7))).booleanValue()) {
                return;
            }
            j71Var.e(h71Var.f35678a.f35349a, i7);
        }
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
