package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class q81 implements nl0, ol0 {
    public final x81 f27566a;

    public q81(x81 x81Var) {
        this.f27566a = x81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        x81 x81Var = this.f27566a;
        w81 w81Var = x81Var.f30334y;
        if (w81Var != null) {
            y81 y81Var = (y81) ((l.d) w81Var).f13925a;
            if (y81Var.f30620x || y81Var.H) {
                return;
            }
        }
        v81 v81Var = (v81) view;
        if (i10 != x81Var.F || w81Var == null) {
            Utilities.Callback2Return callback2Return = x81Var.f30323l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(v81Var.f29009a.f28786a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            x81Var.d(v81Var.f29009a.f28786a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f27566a.f30310b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((v81) view).f29009a.f28786a), view)).booleanValue();
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
