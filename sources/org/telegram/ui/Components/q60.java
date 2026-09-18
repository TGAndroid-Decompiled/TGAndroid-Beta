package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q60 implements View.OnClickListener {
    public final int f27471a;
    public final TLRPC.User f27472b;
    public final String f27473c;
    public final boolean d;
    public final boolean e;
    public final boolean f27474f;
    public final vl0 h;

    public q60(vl0 vl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27471a = i10;
        this.h = vl0Var;
        this.f27472b = user;
        this.f27473c = str;
        this.d = z10;
        this.e = z11;
        this.f27474f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f27471a) {
            case 0:
                a70 a70Var = ((v60) this.h).f28942c;
                Context context = a70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) a70Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.f3) a70Var).resourcesProvider;
                n01.b(context, i10, -a70Var.f22544g0, this.f27472b, this.f27473c, this.d, this.e, this.f27474f, e6Var);
                return;
            default:
                kv0 kv0Var = ((ut0) this.h).f28822f;
                n01.b(kv0Var.getContext(), kv0Var.f25848v1.getCurrentAccount(), kv0Var.f25823j1, this.f27472b, this.f27473c, this.d, this.e, this.f27474f, kv0Var.F1);
                return;
        }
    }
}
