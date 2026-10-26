package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d70 implements View.OnClickListener {
    public final int f27416a;
    public final TLRPC.User f27417b;
    public final String f27418c;
    public final boolean d;
    public final boolean e;
    public final boolean f27419f;
    public final lm0 h;

    public d70(lm0 lm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27416a = i10;
        this.h = lm0Var;
        this.f27417b = user;
        this.f27418c = str;
        this.d = z10;
        this.e = z11;
        this.f27419f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        switch (this.f27416a) {
            case 0:
                n70 n70Var = ((i70) this.h).f29206c;
                Context context = n70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.k3) n70Var).currentAccount;
                u6Var = ((org.telegram.ui.ActionBar.k3) n70Var).resourcesProvider;
                i11.b(context, i10, -n70Var.f30894g0, this.f27417b, this.f27418c, this.d, this.e, this.f27419f, u6Var);
                return;
            default:
                aw0 aw0Var = ((ku0) this.h).f29986f;
                i11.b(aw0Var.getContext(), aw0Var.f26704x1.getCurrentAccount(), aw0Var.l1, this.f27417b, this.f27418c, this.d, this.e, this.f27419f, aw0Var.H1);
                return;
        }
    }
}
