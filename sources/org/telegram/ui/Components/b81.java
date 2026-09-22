package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b81 implements al0, bl0 {
    public final h81 f22706a;

    public b81(h81 h81Var) {
        this.f22706a = h81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        h81 h81Var = this.f22706a;
        g81 g81Var = h81Var.f24617y;
        if (g81Var != null) {
            i81 i81Var = (i81) ((ka.c) g81Var).f13566b;
            if (i81Var.f24970x || i81Var.H) {
                return;
            }
        }
        f81 f81Var = (f81) view;
        if (i10 != h81Var.F || g81Var == null) {
            Utilities.Callback2Return callback2Return = h81Var.f24606l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(f81Var.f23848a.f23580a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            h81Var.d(f81Var.f23848a.f23580a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f22706a.f24593b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((f81) view).f23848a.f23580a), view)).booleanValue();
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
