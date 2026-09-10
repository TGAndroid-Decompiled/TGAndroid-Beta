package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class o81 implements kl0, ll0 {
    public final u81 f25697a;

    public o81(u81 u81Var) {
        this.f25697a = u81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        u81 u81Var = this.f25697a;
        t81 t81Var = u81Var.f27640y;
        if (t81Var != null) {
            v81 v81Var = (v81) ((l2.h) t81Var).f12721b;
            if (v81Var.f27893x || v81Var.H) {
                return;
            }
        }
        s81 s81Var = (s81) view;
        if (i10 != u81Var.F || t81Var == null) {
            Utilities.Callback2Return callback2Return = u81Var.f27629l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(s81Var.f26977a.f26629a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            u81Var.d(s81Var.f26977a.f26629a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f25697a.f27616b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((s81) view).f26977a.f26629a), view)).booleanValue();
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
