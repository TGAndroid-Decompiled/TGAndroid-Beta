package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class r71 implements al0, bl0 {
    public final y71 f32229a;

    public r71(y71 y71Var) {
        this.f32229a = y71Var;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        y71 y71Var = this.f32229a;
        x71 x71Var = y71Var.f34963y;
        if (x71Var != null) {
            z71 z71Var = (z71) ((n) x71Var).f30787b;
            if (z71Var.f35267x || z71Var.D) {
                return;
            }
        }
        w71 w71Var = (w71) view;
        if (i10 != y71Var.B || x71Var == null) {
            Utilities.Callback2Return callback2Return = y71Var.f34952h0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(w71Var.f34343a.f33488a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            y71Var.d(w71Var.f34343a.f33488a, i10);
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f32229a.f34942b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((w71) view).f34343a.f33488a), view)).booleanValue();
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
