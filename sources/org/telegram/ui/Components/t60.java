package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t60 implements View.OnClickListener {
    public final int f28471a;
    public final TLRPC.User f28472b;
    public final String f28473c;
    public final boolean d;
    public final boolean e;
    public final boolean f28474f;
    public final wl0 h;

    public t60(wl0 wl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28471a = i10;
        this.h = wl0Var;
        this.f28472b = user;
        this.f28473c = str;
        this.d = z10;
        this.e = z11;
        this.f28474f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f28471a) {
            case 0:
                d70 d70Var = ((y60) this.h).f30574c;
                Context context = d70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) d70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.e3) d70Var).resourcesProvider;
                m01.b(context, i10, -d70Var.f23601g0, this.f28472b, this.f28473c, this.d, this.e, this.f28474f, d6Var);
                return;
            default:
                kv0 kv0Var = ((ut0) this.h).f28902f;
                m01.b(kv0Var.getContext(), kv0Var.f25866v1.getCurrentAccount(), kv0Var.f25841j1, this.f28472b, this.f28473c, this.d, this.e, this.f28474f, kv0Var.F1);
                return;
        }
    }
}
