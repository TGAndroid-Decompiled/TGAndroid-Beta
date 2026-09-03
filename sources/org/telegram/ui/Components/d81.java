package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class d81 implements il0, jl0 {
    public final k81 f24230a;

    public d81(k81 k81Var) {
        this.f24230a = k81Var;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        k81 k81Var = this.f24230a;
        j81 j81Var = k81Var.f26231y;
        if (j81Var != null) {
            l81 l81Var = (l81) ((tp0) j81Var).f29015b;
            if (l81Var.f26624x || l81Var.E) {
                return;
            }
        }
        i81 i81Var = (i81) view;
        if (i10 != k81Var.C || j81Var == null) {
            Utilities.Callback2Return callback2Return = k81Var.f26220i0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(i81Var.f25643a.f25336a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            k81Var.d(i81Var.f25643a.f25336a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f24230a.f26210b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((i81) view).f25643a.f25336a), view)).booleanValue();
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
