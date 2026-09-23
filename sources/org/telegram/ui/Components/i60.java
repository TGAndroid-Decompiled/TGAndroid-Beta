package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i60 implements View.OnClickListener {
    public final int f24884a;
    public final TLRPC.User f24885b;
    public final String f24886c;
    public final boolean d;
    public final boolean e;
    public final boolean f24887f;
    public final ll0 h;

    public i60(ll0 ll0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24884a = i10;
        this.h = ll0Var;
        this.f24885b = user;
        this.f24886c = str;
        this.d = z10;
        this.e = z11;
        this.f24887f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f24884a) {
            case 0:
                s60 s60Var = ((n60) this.h).f26353c;
                Context context = s60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) s60Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.f3) s60Var).resourcesProvider;
                a01.b(context, i10, -s60Var.f27848g0, this.f24885b, this.f24886c, this.d, this.e, this.f24887f, d6Var);
                return;
            default:
                yu0 yu0Var = ((it0) this.h).f25059f;
                a01.b(yu0Var.getContext(), yu0Var.f30450v1.getCurrentAccount(), yu0Var.f30425j1, this.f24885b, this.f24886c, this.d, this.e, this.f24887f, yu0Var.F1);
                return;
        }
    }
}
