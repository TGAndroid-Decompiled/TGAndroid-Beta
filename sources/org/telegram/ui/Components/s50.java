package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s50 implements View.OnClickListener {
    public final int f30160a;
    public final TLRPC.User f30161b;
    public final String f30162c;
    public final boolean d;
    public final boolean e;
    public final boolean f30163f;
    public final sk0 h;

    public s50(sk0 sk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f30160a = i10;
        this.h = sk0Var;
        this.f30161b = user;
        this.f30162c = str;
        this.d = z10;
        this.e = z11;
        this.f30163f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30160a) {
            case 0:
                c60 c60Var = ((x50) this.h).f32356c;
                iz0.b(c60Var.getContext(), c60Var.f21583a, -c60Var.X1, this.f30161b, this.f30162c, this.d, this.e, this.f30163f, c60Var.I0);
                return;
            default:
                zt0 zt0Var = ((ks0) this.h).f27901f;
                iz0.b(zt0Var.getContext(), zt0Var.f33240x1.getCurrentAccount(), zt0Var.l1, this.f30161b, this.f30162c, this.d, this.e, this.f30163f, zt0Var.H1);
                return;
        }
    }
}
