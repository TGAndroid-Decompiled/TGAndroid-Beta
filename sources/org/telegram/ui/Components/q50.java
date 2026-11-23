package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q50 implements View.OnClickListener {
    public final int f38786a;
    public final TLRPC.User f38787b;
    public final String f38788c;
    public final boolean d;
    public final boolean f38789e;
    public final boolean f38790f;
    public final dk0 h;

    public q50(dk0 dk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.f38786a = i7;
        this.h = dk0Var;
        this.f38787b = user;
        this.f38788c = str;
        this.d = z10;
        this.f38789e = z11;
        this.f38790f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38786a) {
            case 0:
                a60 a60Var = ((v50) this.h).f40685c;
                py0.b(a60Var.getContext(), a60Var.f30173a, -a60Var.f33327b2, this.f38787b, this.f38788c, this.d, this.f38789e, this.f38790f, a60Var.J0);
                return;
            default:
                jt0 jt0Var = ((vr0) this.h).f41546f;
                py0.b(jt0Var.getContext(), jt0Var.f36683y1.getCurrentAccount(), jt0Var.f36647m1, this.f38787b, this.f38788c, this.d, this.f38789e, this.f38790f, jt0Var.I1);
                return;
        }
    }
}
