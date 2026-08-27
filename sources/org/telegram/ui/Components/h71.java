package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class h71 implements qk0, rk0 {

    public final o71 f28938a;

    public h71(o71 o71Var) {
        this.f28938a = o71Var;
    }

    @Override
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f28938a.f31206b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((m71) view).f30609a.f30318a), view)).booleanValue();
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        o71 o71Var = this.f28938a;
        n71 n71Var = o71Var.f31227y;
        if (n71Var != null) {
            p71 p71Var = (p71) ((m5.o) n71Var).f17823b;
            if (p71Var.f31551x || p71Var.D) {
                return;
            }
        }
        m71 m71Var = (m71) view;
        if (i10 != o71Var.B || n71Var == null) {
            Utilities.Callback2Return callback2Return = o71Var.f31216h0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(m71Var.f30609a.f30318a), Integer.valueOf(i10))).booleanValue()) {
                o71Var.d(m71Var.f30609a.f30318a, i10);
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
