package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b70 implements View.OnClickListener {
    public final int f24819a;
    public final TLRPC.User f24820b;
    public final String f24821c;
    public final boolean d;
    public final boolean e;
    public final boolean f24822f;
    public final hm0 h;

    public b70(hm0 hm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24819a = i10;
        this.h = hm0Var;
        this.f24820b = user;
        this.f24821c = str;
        this.d = z10;
        this.e = z11;
        this.f24822f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f24819a) {
            case 0:
                l70 l70Var = ((g70) this.h).f26514c;
                Context context = l70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.f3) l70Var).resourcesProvider;
                w01.b(context, i10, -l70Var.f28131g0, this.f24820b, this.f24821c, this.d, this.e, this.f24822f, d6Var);
                return;
            default:
                tv0 tv0Var = ((du0) this.h).f25639f;
                w01.b(tv0Var.getContext(), tv0Var.f30732v1.getCurrentAccount(), tv0Var.f30707j1, this.f24820b, this.f24821c, this.d, this.e, this.f24822f, tv0Var.F1);
                return;
        }
    }
}
