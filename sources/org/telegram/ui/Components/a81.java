package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a81 implements bl0, cl0 {
    public final g81 f22384a;

    public a81(g81 g81Var) {
        this.f22384a = g81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g81 g81Var = this.f22384a;
        f81 f81Var = g81Var.f24234y;
        if (f81Var != null) {
            h81 h81Var = (h81) ((ka.c) f81Var).f13554b;
            if (h81Var.f24576x || h81Var.H) {
                return;
            }
        }
        e81 e81Var = (e81) view;
        if (i10 != g81Var.F || f81Var == null) {
            Utilities.Callback2Return callback2Return = g81Var.f24223l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(e81Var.f23599a.f23322a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            g81Var.d(e81Var.f23599a.f23322a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f22384a.f24210b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((e81) view).f23599a.f23322a), view)).booleanValue();
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
