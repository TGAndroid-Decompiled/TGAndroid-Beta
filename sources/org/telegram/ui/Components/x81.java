package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class x81 implements yl0, zl0 {
    public final d91 f32371a;

    public x81(d91 d91Var) {
        this.f32371a = d91Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f32371a.f25397b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((b91) view).f24837a.f24559a), view)).booleanValue();
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        d91 d91Var = this.f32371a;
        c91 c91Var = d91Var.f25421y;
        if (c91Var != null) {
            e91 e91Var = (e91) ((l2.f) c91Var).f15843b;
            if (e91Var.f25873x || e91Var.H) {
                return;
            }
        }
        b91 b91Var = (b91) view;
        if (i10 != d91Var.F || c91Var == null) {
            Utilities.Callback2Return callback2Return = d91Var.f25410l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(b91Var.f24837a.f24559a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            d91Var.d(b91Var.f24837a.f24559a, i10);
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
