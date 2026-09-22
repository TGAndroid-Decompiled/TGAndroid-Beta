package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class r81 implements nl0, ol0 {
    public final y81 f27851a;

    public r81(y81 y81Var) {
        this.f27851a = y81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        y81 y81Var = this.f27851a;
        x81 x81Var = y81Var.f30609y;
        if (x81Var != null) {
            z81 z81Var = (z81) ((ki.e0) x81Var).f13672b;
            if (z81Var.f30856x || z81Var.H) {
                return;
            }
        }
        w81 w81Var = (w81) view;
        if (i10 != y81Var.F || x81Var == null) {
            Utilities.Callback2Return callback2Return = y81Var.f30598l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(w81Var.f29973a.f29031a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            y81Var.d(w81Var.f29973a.f29031a, i10);
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f27851a.f30585b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((w81) view).f29973a.f29031a), view)).booleanValue();
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
