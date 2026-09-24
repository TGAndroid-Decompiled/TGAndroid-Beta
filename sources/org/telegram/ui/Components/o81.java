package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class o81 implements ll0, ml0 {
    public final v81 f26960a;

    public o81(v81 v81Var) {
        this.f26960a = v81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        v81 v81Var = this.f26960a;
        u81 u81Var = v81Var.f29100y;
        if (u81Var != null) {
            w81 w81Var = (w81) ((l.d) u81Var).f13909a;
            if (w81Var.f29925x || w81Var.H) {
                return;
            }
        }
        t81 t81Var = (t81) view;
        if (i10 != v81Var.F || u81Var == null) {
            Utilities.Callback2Return callback2Return = v81Var.f29089l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(t81Var.f28442a.f28196a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            v81Var.d(t81Var.f28442a.f28196a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f26960a.f29076b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((t81) view).f28442a.f28196a), view)).booleanValue();
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
