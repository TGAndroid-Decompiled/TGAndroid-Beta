package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m70 implements View.OnClickListener {
    public final int f28419a;
    public final TLRPC.User f28420b;
    public final String f28421c;
    public final boolean d;
    public final boolean f28422e;
    public final boolean f28423f;
    public final vm0 h;

    public m70(vm0 vm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28419a = i10;
        this.h = vm0Var;
        this.f28420b = user;
        this.f28421c = str;
        this.d = z10;
        this.f28422e = z11;
        this.f28423f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.f28419a) {
            case 0:
                w70 w70Var = ((r70) this.h).f30067c;
                Context context = w70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) w70Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.e3) w70Var).resourcesProvider;
                j11.b(context, i10, -w70Var.f32341g0, this.f28420b, this.f28421c, this.d, this.f28422e, this.f28423f, c6Var);
                return;
            default:
                hw0 hw0Var = ((ru0) this.h).f30247f;
                j11.b(hw0Var.getContext(), hw0Var.f26972v1.getCurrentAccount(), hw0Var.f26947j1, this.f28420b, this.f28421c, this.d, this.f28422e, this.f28423f, hw0Var.F1);
                return;
        }
    }
}
