package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class p81 implements ml0, nl0 {
    public final w81 f27247a;

    public p81(w81 w81Var) {
        this.f27247a = w81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        w81 w81Var = this.f27247a;
        v81 v81Var = w81Var.f29957y;
        if (v81Var != null) {
            x81 x81Var = (x81) ((l.d) v81Var).f13924a;
            if (x81Var.f30311x || x81Var.H) {
                return;
            }
        }
        u81 u81Var = (u81) view;
        if (i10 != w81Var.F || v81Var == null) {
            Utilities.Callback2Return callback2Return = w81Var.f29946l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(u81Var.f28741a.f28507a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            w81Var.d(u81Var.f28741a.f28507a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f27247a.f29933b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((u81) view).f28741a.f28507a), view)).booleanValue();
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
