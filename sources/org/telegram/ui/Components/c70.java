package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c70 implements View.OnClickListener {
    public final int f25254a;
    public final TLRPC.User f25255b;
    public final String f25256c;
    public final boolean d;
    public final boolean e;
    public final boolean f25257f;
    public final lm0 h;

    public c70(lm0 lm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f25254a = i10;
        this.h = lm0Var;
        this.f25255b = user;
        this.f25256c = str;
        this.d = z10;
        this.e = z11;
        this.f25257f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.f25254a) {
            case 0:
                m70 m70Var = ((h70) this.h).f26813c;
                Context context = m70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.h3) m70Var).resourcesProvider;
                a11.b(context, i10, -m70Var.f28584g0, this.f25255b, this.f25256c, this.d, this.e, this.f25257f, g6Var);
                return;
            default:
                xv0 xv0Var = ((hu0) this.h).f27051f;
                a11.b(xv0Var.getContext(), xv0Var.f32711v1.getCurrentAccount(), xv0Var.f32686j1, this.f25255b, this.f25256c, this.d, this.e, this.f25257f, xv0Var.F1);
                return;
        }
    }
}
