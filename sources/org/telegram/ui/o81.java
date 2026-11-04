package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class o81 implements zh.c, org.telegram.messenger.so, r0.m, org.telegram.ui.Components.ij0 {
    public final m91 f48234a;

    public o81(m91 m91Var) {
        this.f48234a = m91Var;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        int i3 = k1Var.f54026a.f(519).d;
        m91 m91Var = this.f48234a;
        m91Var.f47593g1 = i3;
        i91 i91Var = m91Var.f47615s0;
        if (i91Var != null) {
            i91Var.setPadding(0, 0, 0, i3);
        }
        j81 j81Var = m91Var.f47603n;
        if (j81Var != null) {
            ((TextView) j81Var.d).setTranslationY((-m91Var.f47593g1) - m91Var.f47591f1);
        }
        m91Var.h.setTranslationY(((-m91Var.Y0) - m91Var.f47593g1) - m91Var.f47591f1);
        m91Var.F0();
        return r0.k1.f54025b;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return m91.Z(this.f48234a, tL_error);
    }

    @Override
    public boolean mo20b(float f10, float f11, int i3, View view) {
        return m91.b0(this.f48234a, view, f10);
    }

    @Override
    public void c(boolean z10, boolean z11) {
        m91 m91Var = this.f48234a;
        m91Var.V0.i(m91Var.S0.b(), z10, z11);
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void h() {
    }
}
