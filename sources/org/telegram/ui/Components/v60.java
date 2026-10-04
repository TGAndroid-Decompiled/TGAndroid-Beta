package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v60 implements View.OnClickListener {
    public final int f31573a;
    public final TLRPC.User f31574b;
    public final String f31575c;
    public final boolean d;
    public final boolean f31576e;
    public final boolean f31577f;
    public final yl0 h;

    public v60(yl0 yl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f31573a = i10;
        this.h = yl0Var;
        this.f31574b = user;
        this.f31575c = str;
        this.d = z10;
        this.f31576e = z11;
        this.f31577f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f31573a) {
            case 0:
                f70 f70Var = ((a70) this.h).f24476c;
                Context context = f70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) f70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.f3) f70Var).resourcesProvider;
                w01.b(context, i10, -f70Var.f26346g0, this.f31574b, this.f31575c, this.d, this.f31576e, this.f31577f, d6Var);
                return;
            default:
                pv0 pv0Var = ((zt0) this.h).f33643f;
                w01.b(pv0Var.getContext(), pv0Var.f29800v1.getCurrentAccount(), pv0Var.f29775j1, this.f31574b, this.f31575c, this.d, this.f31576e, this.f31577f, pv0Var.F1);
                return;
        }
    }
}
