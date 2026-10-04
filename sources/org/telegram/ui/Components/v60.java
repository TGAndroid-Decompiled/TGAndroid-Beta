package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v60 implements View.OnClickListener {
    public final int f31574a;
    public final TLRPC.User f31575b;
    public final String f31576c;
    public final boolean d;
    public final boolean f31577e;
    public final boolean f31578f;
    public final yl0 h;

    public v60(yl0 yl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f31574a = i10;
        this.h = yl0Var;
        this.f31575b = user;
        this.f31576c = str;
        this.d = z10;
        this.f31577e = z11;
        this.f31578f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f31574a) {
            case 0:
                f70 f70Var = ((a70) this.h).f24477c;
                Context context = f70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) f70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.f3) f70Var).resourcesProvider;
                w01.b(context, i10, -f70Var.f26347g0, this.f31575b, this.f31576c, this.d, this.f31577e, this.f31578f, d6Var);
                return;
            default:
                pv0 pv0Var = ((zt0) this.h).f33644f;
                w01.b(pv0Var.getContext(), pv0Var.f29801v1.getCurrentAccount(), pv0Var.f29776j1, this.f31575b, this.f31576c, this.d, this.f31577e, this.f31578f, pv0Var.F1);
                return;
        }
    }
}
