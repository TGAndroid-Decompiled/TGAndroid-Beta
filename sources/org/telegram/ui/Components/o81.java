package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class o81 implements ll0, ml0 {
    public final v81 f26964a;

    public o81(v81 v81Var) {
        this.f26964a = v81Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        v81 v81Var = this.f26964a;
        u81 u81Var = v81Var.f29106y;
        if (u81Var != null) {
            w81 w81Var = (w81) ((l.d) u81Var).f13924a;
            if (w81Var.f29940x || w81Var.H) {
                return;
            }
        }
        t81 t81Var = (t81) view;
        if (i10 != v81Var.F || u81Var == null) {
            Utilities.Callback2Return callback2Return = v81Var.f29095l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(t81Var.f28448a.f28203a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            v81Var.d(t81Var.f28448a.f28203a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f26964a.f29082b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((t81) view).f28448a.f28203a), view)).booleanValue();
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
