package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s60 implements View.OnClickListener {
    public final int f28129a;
    public final TLRPC.User f28130b;
    public final String f28131c;
    public final boolean d;
    public final boolean e;
    public final boolean f28132f;
    public final xl0 h;

    public s60(xl0 xl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28129a = i10;
        this.h = xl0Var;
        this.f28130b = user;
        this.f28131c = str;
        this.d = z10;
        this.e = z11;
        this.f28132f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f28129a) {
            case 0:
                c70 c70Var = ((x60) this.h).f30228c;
                Context context = c70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.f3) c70Var).resourcesProvider;
                o01.b(context, i10, -c70Var.f23276g0, this.f28130b, this.f28131c, this.d, this.e, this.f28132f, f6Var);
                return;
            default:
                lv0 lv0Var = ((vt0) this.h).f29796f;
                o01.b(lv0Var.getContext(), lv0Var.f26234v1.getCurrentAccount(), lv0Var.f26209j1, this.f28130b, this.f28131c, this.d, this.e, this.f28132f, lv0Var.F1);
                return;
        }
    }
}
