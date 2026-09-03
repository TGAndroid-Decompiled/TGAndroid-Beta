package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e81 implements jl0, kl0 {
    public final k81 f26496a;

    public e81(k81 k81Var) {
        this.f26496a = k81Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        k81 k81Var = this.f26496a;
        j81 j81Var = k81Var.f28346y;
        if (j81Var != null) {
            l81 l81Var = (l81) ((oh.h4) j81Var).f17182b;
            if (l81Var.f28693x || l81Var.E) {
                return;
            }
        }
        i81 i81Var = (i81) view;
        if (i10 != k81Var.C || j81Var == null) {
            Utilities.Callback2Return callback2Return = k81Var.f28335i0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(i81Var.f27738a.f27413a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            k81Var.d(i81Var.f27738a.f27413a, i10);
        }
    }

    @Override
    public boolean f(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f26496a.f28324b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((i81) view).f27738a.f27413a), view)).booleanValue();
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
