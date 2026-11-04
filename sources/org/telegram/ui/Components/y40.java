package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y40 implements View.OnClickListener {
    public final int f40609a;
    public final TLRPC.User f40610b;
    public final String f40611c;
    public final boolean d;
    public final boolean f40612e;
    public final boolean f40613f;
    public final sj0 h;

    public y40(sj0 sj0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i3) {
        this.f40609a = i3;
        this.h = sj0Var;
        this.f40610b = user;
        this.f40611c = str;
        this.d = z10;
        this.f40612e = z11;
        this.f40613f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40609a) {
            case 0:
                i50 i50Var = ((d50) this.h).f32935c;
                dy0.b(i50Var.getContext(), i50Var.f28583a, -i50Var.Y1, this.f40610b, this.f40611c, this.d, this.f40612e, this.f40613f, i50Var.J0);
                return;
            default:
                ws0 ws0Var = ((jr0) this.h).f35173f;
                dy0.b(ws0Var.getContext(), ws0Var.f40142y1.getCurrentAccount(), ws0Var.m1, this.f40610b, this.f40611c, this.d, this.f40612e, this.f40613f, ws0Var.I1);
                return;
        }
    }
}
