package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q50 implements View.OnClickListener {
    public final int f38793a;
    public final TLRPC.User f38794b;
    public final String f38795c;
    public final boolean d;
    public final boolean f38796e;
    public final boolean f38797f;
    public final dk0 h;

    public q50(dk0 dk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.f38793a = i7;
        this.h = dk0Var;
        this.f38794b = user;
        this.f38795c = str;
        this.d = z10;
        this.f38796e = z11;
        this.f38797f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38793a) {
            case 0:
                a60 a60Var = ((v50) this.h).f40684c;
                py0.b(a60Var.getContext(), a60Var.f30170a, -a60Var.f33314b2, this.f38794b, this.f38795c, this.d, this.f38796e, this.f38797f, a60Var.J0);
                return;
            default:
                jt0 jt0Var = ((vr0) this.h).f41545f;
                py0.b(jt0Var.getContext(), jt0Var.f36689y1.getCurrentAccount(), jt0Var.f36653m1, this.f38794b, this.f38795c, this.d, this.f38796e, this.f38797f, jt0Var.I1);
                return;
        }
    }
}
