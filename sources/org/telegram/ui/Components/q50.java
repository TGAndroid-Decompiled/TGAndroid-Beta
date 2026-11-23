package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q50 implements View.OnClickListener {
    public final int f38787a;
    public final TLRPC.User f38788b;
    public final String f38789c;
    public final boolean d;
    public final boolean f38790e;
    public final boolean f38791f;
    public final dk0 h;

    public q50(dk0 dk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.f38787a = i7;
        this.h = dk0Var;
        this.f38788b = user;
        this.f38789c = str;
        this.d = z10;
        this.f38790e = z11;
        this.f38791f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38787a) {
            case 0:
                a60 a60Var = ((v50) this.h).f40686c;
                py0.b(a60Var.getContext(), a60Var.f30173a, -a60Var.f33327b2, this.f38788b, this.f38789c, this.d, this.f38790e, this.f38791f, a60Var.J0);
                return;
            default:
                jt0 jt0Var = ((vr0) this.h).f41547f;
                py0.b(jt0Var.getContext(), jt0Var.f36684y1.getCurrentAccount(), jt0Var.f36648m1, this.f38788b, this.f38789c, this.d, this.f38790e, this.f38791f, jt0Var.I1);
                return;
        }
    }
}
