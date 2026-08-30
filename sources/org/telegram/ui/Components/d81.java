package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class d81 implements jl0, kl0 {
    public final k81 f24205a;

    public d81(k81 k81Var) {
        this.f24205a = k81Var;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        k81 k81Var = this.f24205a;
        j81 j81Var = k81Var.f26229y;
        if (j81Var != null) {
            l81 l81Var = (l81) ((o2.o) j81Var).f16220b;
            if (l81Var.f26600x || l81Var.E) {
                return;
            }
        }
        i81 i81Var = (i81) view;
        if (i10 != k81Var.C || j81Var == null) {
            Utilities.Callback2Return callback2Return = k81Var.f26218i0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(i81Var.f25622a.f25354a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            k81Var.d(i81Var.f25622a.f25354a, i10);
        }
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public boolean f(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f24205a.f26208b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((i81) view).f25622a.f25354a), view)).booleanValue();
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
