package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class y81 implements nl0, ol0 {
    public final f91 f33118a;

    public y81(f91 f91Var) {
        this.f33118a = f91Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        f91 f91Var = this.f33118a;
        e91 e91Var = f91Var.f26425y;
        if (e91Var != null) {
            g91 g91Var = (g91) ((n2.c) e91Var).f16527b;
            if (g91Var.f26744x || g91Var.H) {
                return;
            }
        }
        d91 d91Var = (d91) view;
        if (i10 != f91Var.F || e91Var == null) {
            Utilities.Callback2Return callback2Return = f91Var.f26414l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(d91Var.f25672a.f25282a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            f91Var.d(d91Var.f25672a.f25282a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f33118a.f26400b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((d91) view).f25672a.f25282a), view)).booleanValue();
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
