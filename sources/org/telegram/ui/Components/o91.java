package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class o91 implements bm0, cm0 {
    public final u91 f31244a;

    public o91(u91 u91Var) {
        this.f31244a = u91Var;
    }

    @Override
    public boolean c(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f31244a.f33298b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((s91) view).f32530a.f32186a), view)).booleanValue();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        u91 u91Var = this.f31244a;
        t91 t91Var = u91Var.f33322y;
        if (t91Var != null) {
            v91 v91Var = (v91) ((jg.i) t91Var).f15725a;
            if (v91Var.f33639x || v91Var.H) {
                return;
            }
        }
        s91 s91Var = (s91) view;
        if (i10 != u91Var.F || t91Var == null) {
            Utilities.Callback2Return callback2Return = u91Var.f33311l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(s91Var.f32530a.f32186a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            u91Var.d(s91Var.f32530a.f32186a, i10);
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
