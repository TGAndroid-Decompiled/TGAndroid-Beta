package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k70 implements View.OnClickListener {
    public final int f27919a;
    public final TLRPC.User f27920b;
    public final String f27921c;
    public final boolean d;
    public final boolean f27922e;
    public final boolean f27923f;
    public final qm0 h;

    public k70(qm0 qm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27919a = i10;
        this.h = qm0Var;
        this.f27920b = user;
        this.f27921c = str;
        this.d = z10;
        this.f27922e = z11;
        this.f27923f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f27919a) {
            case 0:
                u70 u70Var = ((p70) this.h).f29713c;
                Context context = u70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) u70Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.f3) u70Var).resourcesProvider;
                e11.b(context, i10, -u70Var.f31397g0, this.f27920b, this.f27921c, this.d, this.f27922e, this.f27923f, e6Var);
                return;
            default:
                cw0 cw0Var = ((mu0) this.h).f28901f;
                e11.b(cw0Var.getContext(), cw0Var.f25474v1.getCurrentAccount(), cw0Var.f25449j1, this.f27920b, this.f27921c, this.d, this.f27922e, this.f27923f, cw0Var.F1);
                return;
        }
    }
}
