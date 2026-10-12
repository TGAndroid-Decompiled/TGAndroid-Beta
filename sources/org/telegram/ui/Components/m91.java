package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class m91 implements lm0, mm0 {
    public final t91 f28449a;

    public m91(t91 t91Var) {
        this.f28449a = t91Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        t91 t91Var = this.f28449a;
        s91 s91Var = t91Var.f30830y;
        if (s91Var != null) {
            u91 u91Var = (u91) ((n4.l) s91Var).f16326a;
            if (u91Var.f31115x || u91Var.H) {
                return;
            }
        }
        r91 r91Var = (r91) view;
        if (i10 != t91Var.F || s91Var == null) {
            Utilities.Callback2Return callback2Return = t91Var.f30819l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(r91Var.f30109a.f29784a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            t91Var.d(r91Var.f30109a.f29784a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f28449a.f30805b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((r91) view).f30109a.f29784a), view)).booleanValue();
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
