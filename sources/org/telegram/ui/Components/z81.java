package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class z81 implements nl0, ol0 {
    public final g91 f33468a;

    public z81(g91 g91Var) {
        this.f33468a = g91Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g91 g91Var = this.f33468a;
        f91 f91Var = g91Var.f26794y;
        if (f91Var != null) {
            h91 h91Var = (h91) ((n2.c) f91Var).f16532b;
            if (h91Var.f27174x || h91Var.H) {
                return;
            }
        }
        e91 e91Var = (e91) view;
        if (i10 != g91Var.F || f91Var == null) {
            Utilities.Callback2Return callback2Return = g91Var.f26783l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(e91Var.f26083a.f25731a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            g91Var.d(e91Var.f26083a.f25731a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f33468a.f26769b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((e91) view).f26083a.f25731a), view)).booleanValue();
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
