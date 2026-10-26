package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class n91 implements am0, bm0 {
    public final t91 f30931a;

    public n91(t91 t91Var) {
        this.f30931a = t91Var;
    }

    @Override
    public boolean c(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f30931a.f32924b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((r91) view).f32180a.f31864a), view)).booleanValue();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        t91 t91Var = this.f30931a;
        s91 s91Var = t91Var.f32948y;
        if (s91Var != null) {
            u91 u91Var = (u91) ((jg.i) s91Var).f15726a;
            if (u91Var.f33324x || u91Var.H) {
                return;
            }
        }
        r91 r91Var = (r91) view;
        if (i10 != t91Var.F || s91Var == null) {
            Utilities.Callback2Return callback2Return = t91Var.f32937l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(r91Var.f32180a.f31864a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            t91Var.d(r91Var.f32180a.f31864a, i10);
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
