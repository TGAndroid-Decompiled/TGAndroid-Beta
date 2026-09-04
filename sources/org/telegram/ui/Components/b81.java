package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b81 implements al0, bl0 {
    public final h81 f24598a;

    public b81(h81 h81Var) {
        this.f24598a = h81Var;
    }

    @Override
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f24598a.f26634b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((f81) view).f25955a.f25602a), view)).booleanValue();
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        h81 h81Var = this.f24598a;
        g81 g81Var = h81Var.f26659y;
        if (g81Var != null) {
            i81 i81Var = (i81) ((k2.g0) g81Var).f14578b;
            if (i81Var.f27023x || i81Var.H) {
                return;
            }
        }
        f81 f81Var = (f81) view;
        if (i10 != h81Var.F || g81Var == null) {
            Utilities.Callback2Return callback2Return = h81Var.f26648l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(f81Var.f25955a.f25602a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            h81Var.d(f81Var.f25955a.f25602a, i10);
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
