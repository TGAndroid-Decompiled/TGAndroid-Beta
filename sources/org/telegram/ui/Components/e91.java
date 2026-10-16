package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e91 implements bm0, cm0 {
    public final k91 f24332a;

    public e91(k91 k91Var) {
        this.f24332a = k91Var;
    }

    @Override
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f24332a.f26307b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((i91) view).f25606a.f25223a), view)).booleanValue();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        k91 k91Var = this.f24332a;
        j91 j91Var = k91Var.f26331y;
        if (j91Var != null) {
            l91 l91Var = (l91) ((m.h) j91Var).f14848b;
            if (l91Var.f26699x || l91Var.H) {
                return;
            }
        }
        i91 i91Var = (i91) view;
        if (i10 != k91Var.F || j91Var == null) {
            Utilities.Callback2Return callback2Return = k91Var.f26320l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(i91Var.f25606a.f25223a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            k91Var.d(i91Var.f25606a.f25223a, i10);
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
