package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f50 implements View.OnClickListener {
    public final int f34522a;
    public final TLRPC.User f34523b;
    public final String f34524c;
    public final boolean d;
    public final boolean f34525e;
    public final boolean f34526f;
    public final tj0 h;

    public f50(tj0 tj0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.f34522a = i7;
        this.h = tj0Var;
        this.f34523b = user;
        this.f34524c = str;
        this.d = z10;
        this.f34525e = z11;
        this.f34526f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34522a) {
            case 0:
                p50 p50Var = ((k50) this.h).f36278c;
                gy0.b(p50Var.getContext(), p50Var.f29679a, -p50Var.f38206b2, this.f34523b, this.f34524c, this.d, this.f34525e, this.f34526f, p50Var.J0);
                return;
            default:
                ys0 ys0Var = ((lr0) this.h).f36894f;
                gy0.b(ys0Var.getContext(), ys0Var.f42152y1.getCurrentAccount(), ys0Var.f42116m1, this.f34523b, this.f34524c, this.d, this.f34525e, this.f34526f, ys0Var.I1);
                return;
        }
    }
}
