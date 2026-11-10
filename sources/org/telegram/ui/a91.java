package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class a91 implements yh.c, org.telegram.messenger.bp, r0.m, org.telegram.ui.Components.ej0 {
    public final z91 f43618a;

    public a91(z91 z91Var) {
        this.f43618a = z91Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = k1Var.f54213a.f(519).d;
        z91 z91Var = this.f43618a;
        z91Var.f52359f1 = i7;
        v91 v91Var = z91Var.f52380r0;
        if (v91Var != null) {
            v91Var.setPadding(0, 0, 0, i7);
        }
        v81 v81Var = z91Var.f52372n;
        if (v81Var != null) {
            ((TextView) v81Var.d).setTranslationY((-z91Var.f52359f1) - z91Var.f52356e1);
        }
        z91Var.h.setTranslationY(((-z91Var.X0) - z91Var.f52359f1) - z91Var.f52356e1);
        z91Var.F0();
        return r0.k1.f54212b;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return z91.Z(this.f43618a, tL_error);
    }

    @Override
    public void d(boolean z9, boolean z10) {
        z91 z91Var = this.f43618a;
        z91Var.U0.i(z91Var.R0.b(), z9, z10);
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        return z91.b0(this.f43618a, view, f10);
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }
}
