package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j70 implements View.OnClickListener {
    public final int f27631a;
    public final TLRPC.User f27632b;
    public final String f27633c;
    public final boolean d;
    public final boolean f27634e;
    public final boolean f27635f;
    public final qm0 h;

    public j70(qm0 qm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27631a = i10;
        this.h = qm0Var;
        this.f27632b = user;
        this.f27633c = str;
        this.d = z10;
        this.f27634e = z11;
        this.f27635f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f27631a) {
            case 0:
                t70 t70Var = ((o70) this.h).f29405c;
                Context context = t70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) t70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.e3) t70Var).resourcesProvider;
                e11.b(context, i10, -t70Var.f31144g0, this.f27632b, this.f27633c, this.d, this.f27634e, this.f27635f, d6Var);
                return;
            default:
                cw0 cw0Var = ((mu0) this.h).f28941f;
                e11.b(cw0Var.getContext(), cw0Var.f25536v1.getCurrentAccount(), cw0Var.f25511j1, this.f27632b, this.f27633c, this.d, this.f27634e, this.f27635f, cw0Var.F1);
                return;
        }
    }
}
