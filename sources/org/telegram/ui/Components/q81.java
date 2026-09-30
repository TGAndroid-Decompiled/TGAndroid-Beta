package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class q81 implements ol0, pl0 {
    public final x81 f27591a;

    public q81(x81 x81Var) {
        this.f27591a = x81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        x81 x81Var = this.f27591a;
        w81 w81Var = x81Var.f30205y;
        if (w81Var != null) {
            y81 y81Var = (y81) ((l.d) w81Var).f13940a;
            if (y81Var.f30677x || y81Var.H) {
                return;
            }
        }
        v81 v81Var = (v81) view;
        if (i10 != x81Var.F || w81Var == null) {
            Utilities.Callback2Return callback2Return = x81Var.f30194l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(v81Var.f29083a.f28799a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            x81Var.d(v81Var.f29083a.f28799a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f27591a.f30181b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((v81) view).f29083a.f28799a), view)).booleanValue();
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
