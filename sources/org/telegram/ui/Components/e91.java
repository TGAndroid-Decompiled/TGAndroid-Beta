package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e91 implements bm0, cm0 {
    public final k91 f25940a;

    public e91(k91 k91Var) {
        this.f25940a = k91Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        k91 k91Var = this.f25940a;
        j91 j91Var = k91Var.f27986y;
        if (j91Var != null) {
            l91 l91Var = (l91) ((l2.f) j91Var).f15906b;
            if (l91Var.f28314x || l91Var.H) {
                return;
            }
        }
        i91 i91Var = (i91) view;
        if (i10 != k91Var.F || j91Var == null) {
            Utilities.Callback2Return callback2Return = k91Var.f27975l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(i91Var.f27251a.f26867a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            k91Var.d(i91Var.f27251a.f26867a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f25940a.f27962b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((i91) view).f27251a.f26867a), view)).booleanValue();
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
