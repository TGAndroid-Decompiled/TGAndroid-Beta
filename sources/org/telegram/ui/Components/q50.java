package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q50 implements View.OnClickListener {
    public final int f38740a;
    public final TLRPC.User f38741b;
    public final String f38742c;
    public final boolean d;
    public final boolean f38743e;
    public final boolean f38744f;
    public final dk0 h;

    public q50(dk0 dk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.f38740a = i7;
        this.h = dk0Var;
        this.f38741b = user;
        this.f38742c = str;
        this.d = z10;
        this.f38743e = z11;
        this.f38744f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38740a) {
            case 0:
                a60 a60Var = ((v50) this.h).f40637c;
                py0.b(a60Var.getContext(), a60Var.f30139a, -a60Var.f33293b2, this.f38741b, this.f38742c, this.d, this.f38743e, this.f38744f, a60Var.J0);
                return;
            default:
                jt0 jt0Var = ((vr0) this.h).f41508f;
                py0.b(jt0Var.getContext(), jt0Var.f36638y1.getCurrentAccount(), jt0Var.f36602m1, this.f38741b, this.f38742c, this.d, this.f38743e, this.f38744f, jt0Var.I1);
                return;
        }
    }
}
