package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n60 implements org.telegram.ui.Components.d20, org.telegram.ui.ActionBar.c2, r0.o {
    public final int f36470a;
    public final y60 f36471b;

    public n60(y60 y60Var, int i10) {
        this.f36470a = i10;
        this.f36471b = y60Var;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        y60 y60Var = this.f36471b;
        y60Var.f40424j0 = i10;
        dg.v3 v3Var = y60Var.C;
        if (v3Var != null) {
            v3Var.setPadding(0, 0, 0, i10);
        }
        y60Var.j0();
        y60Var.h0();
        return r0.m1.f43129b;
    }

    @Override
    public void a(int i10) {
        y60 y60Var = this.f36471b;
        y60Var.f40413b.a(Math.min(i10, y60Var.Z));
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36470a) {
            case 1:
                this.f36471b.o0();
                return;
            default:
                this.f36471b.finishFragment();
                return;
        }
    }
}
