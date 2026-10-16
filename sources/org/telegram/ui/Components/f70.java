package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f70 implements View.OnClickListener {
    public final int f24643a;
    public final TLRPC.User f24644b;
    public final String f24645c;
    public final boolean d;
    public final boolean e;
    public final boolean f24646f;
    public final lm0 h;

    public f70(lm0 lm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24643a = i10;
        this.h = lm0Var;
        this.f24644b = user;
        this.f24645c = str;
        this.d = z10;
        this.e = z11;
        this.f24646f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.f24643a) {
            case 0:
                p70 p70Var = ((k70) this.h).f26233c;
                Context context = p70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) p70Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.e3) p70Var).resourcesProvider;
                a11.b(context, i10, -p70Var.f27907g0, this.f24644b, this.f24645c, this.d, this.e, this.f24646f, c6Var);
                return;
            default:
                xv0 xv0Var = ((hu0) this.h).f25404f;
                a11.b(xv0Var.getContext(), xv0Var.f31069v1.getCurrentAccount(), xv0Var.f31044j1, this.f24644b, this.f24645c, this.d, this.e, this.f24646f, xv0Var.F1);
                return;
        }
    }
}
