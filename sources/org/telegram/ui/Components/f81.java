package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class f81 implements kl0, ll0 {
    public final l81 f26789a;

    public f81(l81 l81Var) {
        this.f26789a = l81Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        l81 l81Var = this.f26789a;
        k81 k81Var = l81Var.f28671y;
        if (k81Var != null) {
            m81 m81Var = (m81) ((oh.h4) k81Var).f17180b;
            if (m81Var.f28993x || m81Var.E) {
                return;
            }
        }
        j81 j81Var = (j81) view;
        if (i10 != l81Var.C || k81Var == null) {
            Utilities.Callback2Return callback2Return = l81Var.f28660i0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(j81Var.f28074a.f27698a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            l81Var.d(j81Var.f28074a.f27698a, i10);
        }
    }

    @Override
    public boolean f(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f26789a.f28649b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((j81) view).f28074a.f27698a), view)).booleanValue();
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
