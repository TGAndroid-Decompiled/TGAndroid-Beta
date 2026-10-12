package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class d91 implements bm0, cm0 {
    public final j91 f24327a;

    public d91(j91 j91Var) {
        this.f24327a = j91Var;
    }

    @Override
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f24327a.f26275b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((h91) view).f25578a.f25238a), view)).booleanValue();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        j91 j91Var = this.f24327a;
        i91 i91Var = j91Var.f26299y;
        if (i91Var != null) {
            k91 k91Var = (k91) ((l2.f) i91Var).f14503b;
            if (k91Var.f26647x || k91Var.H) {
                return;
            }
        }
        h91 h91Var = (h91) view;
        if (i10 != j91Var.F || i91Var == null) {
            Utilities.Callback2Return callback2Return = j91Var.f26288l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(h91Var.f25578a.f25238a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            j91Var.d(h91Var.f25578a.f25238a, i10);
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
