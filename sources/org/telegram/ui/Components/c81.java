package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class c81 implements bl0, cl0 {
    public final i81 f22963a;

    public c81(i81 i81Var) {
        this.f22963a = i81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        i81 i81Var = this.f22963a;
        h81 h81Var = i81Var.f24899y;
        if (h81Var != null) {
            j81 j81Var = (j81) ((ka.c) h81Var).f13567b;
            if (j81Var.f25189x || j81Var.H) {
                return;
            }
        }
        g81 g81Var = (g81) view;
        if (i10 != i81Var.F || h81Var == null) {
            Utilities.Callback2Return callback2Return = i81Var.f24888l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(g81Var.f24120a.f23824a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            i81Var.d(g81Var.f24120a.f23824a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f22963a.f24875b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((g81) view).f24120a.f23824a), view)).booleanValue();
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
