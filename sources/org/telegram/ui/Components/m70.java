package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m70 implements View.OnClickListener {
    public final int f28414a;
    public final TLRPC.User f28415b;
    public final String f28416c;
    public final boolean d;
    public final boolean f28417e;
    public final boolean f28418f;
    public final vm0 h;

    public m70(vm0 vm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28414a = i10;
        this.h = vm0Var;
        this.f28415b = user;
        this.f28416c = str;
        this.d = z10;
        this.f28417e = z11;
        this.f28418f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.f28414a) {
            case 0:
                w70 w70Var = ((r70) this.h).f30068c;
                Context context = w70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) w70Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.e3) w70Var).resourcesProvider;
                j11.b(context, i10, -w70Var.f32327g0, this.f28415b, this.f28416c, this.d, this.f28417e, this.f28418f, c6Var);
                return;
            default:
                hw0 hw0Var = ((ru0) this.h).f30243f;
                j11.b(hw0Var.getContext(), hw0Var.f26957v1.getCurrentAccount(), hw0Var.f26932j1, this.f28415b, this.f28416c, this.d, this.f28417e, this.f28418f, hw0Var.F1);
                return;
        }
    }
}
