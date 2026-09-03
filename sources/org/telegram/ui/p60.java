package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p60 implements org.telegram.ui.Components.e20, org.telegram.ui.ActionBar.c2, r0.o {
    public final int f36974a;
    public final a70 f36975b;

    public p60(a70 a70Var, int i10) {
        this.f36974a = i10;
        this.f36975b = a70Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        a70 a70Var = this.f36975b;
        a70Var.f32496j0 = i10;
        dg.v3 v3Var = a70Var.C;
        if (v3Var != null) {
            v3Var.setPadding(0, 0, 0, i10);
        }
        a70Var.j0();
        a70Var.h0();
        return r0.m1.f43153b;
    }

    @Override
    public void a(int i10) {
        a70 a70Var = this.f36975b;
        a70Var.f32485b.a(Math.min(i10, a70Var.Z));
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36974a) {
            case 1:
                this.f36975b.o0();
                return;
            default:
                this.f36975b.finishFragment();
                return;
        }
    }
}
