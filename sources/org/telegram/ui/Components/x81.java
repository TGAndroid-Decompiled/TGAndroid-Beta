package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class x81 implements yl0, zl0 {
    public final d91 f32367a;

    public x81(d91 d91Var) {
        this.f32367a = d91Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f32367a.f25393b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((b91) view).f24833a.f24555a), view)).booleanValue();
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        d91 d91Var = this.f32367a;
        c91 c91Var = d91Var.f25417y;
        if (c91Var != null) {
            e91 e91Var = (e91) ((l2.f) c91Var).f15843b;
            if (e91Var.f25869x || e91Var.H) {
                return;
            }
        }
        b91 b91Var = (b91) view;
        if (i10 != d91Var.F || c91Var == null) {
            Utilities.Callback2Return callback2Return = d91Var.f25406l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(b91Var.f24833a.f24555a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            d91Var.d(b91Var.f24833a.f24555a, i10);
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
