package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s60 implements View.OnClickListener {
    public final int f28158a;
    public final TLRPC.User f28159b;
    public final String f28160c;
    public final boolean d;
    public final boolean e;
    public final boolean f28161f;
    public final vl0 h;

    public s60(vl0 vl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28158a = i10;
        this.h = vl0Var;
        this.f28159b = user;
        this.f28160c = str;
        this.d = z10;
        this.e = z11;
        this.f28161f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f28158a) {
            case 0:
                c70 c70Var = ((x60) this.h).f30257c;
                Context context = c70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.e3) c70Var).resourcesProvider;
                l01.b(context, i10, -c70Var.f23234g0, this.f28159b, this.f28160c, this.d, this.e, this.f28161f, d6Var);
                return;
            default:
                jv0 jv0Var = ((tt0) this.h).f28608f;
                l01.b(jv0Var.getContext(), jv0Var.f25543v1.getCurrentAccount(), jv0Var.f25518j1, this.f28159b, this.f28160c, this.d, this.e, this.f28161f, jv0Var.F1);
                return;
        }
    }
}
