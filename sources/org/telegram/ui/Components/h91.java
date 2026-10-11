package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class h91 implements gm0, hm0 {
    public final o91 f27001a;

    public h91(o91 o91Var) {
        this.f27001a = o91Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        o91 o91Var = this.f27001a;
        n91 n91Var = o91Var.f29457y;
        if (n91Var != null) {
            p91 p91Var = (p91) ((m2.t) n91Var).f16033b;
            if (p91Var.f29804x || p91Var.H) {
                return;
            }
        }
        m91 m91Var = (m91) view;
        if (i10 != o91Var.F || n91Var == null) {
            Utilities.Callback2Return callback2Return = o91Var.f29446l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(m91Var.f28808a.f28314a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            o91Var.d(m91Var.f28808a.f28314a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f27001a.f29432b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((m91) view).f28808a.f28314a), view)).booleanValue();
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
