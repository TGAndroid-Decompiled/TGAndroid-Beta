package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f50 implements View.OnClickListener {
    public final int f34523a;
    public final TLRPC.User f34524b;
    public final String f34525c;
    public final boolean d;
    public final boolean f34526e;
    public final boolean f34527f;
    public final tj0 h;

    public f50(tj0 tj0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.f34523a = i7;
        this.h = tj0Var;
        this.f34524b = user;
        this.f34525c = str;
        this.d = z10;
        this.f34526e = z11;
        this.f34527f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34523a) {
            case 0:
                p50 p50Var = ((k50) this.h).f36288c;
                gy0.b(p50Var.getContext(), p50Var.f29679a, -p50Var.f38208b2, this.f34524b, this.f34525c, this.d, this.f34526e, this.f34527f, p50Var.J0);
                return;
            default:
                ys0 ys0Var = ((lr0) this.h).f36894f;
                gy0.b(ys0Var.getContext(), ys0Var.f42150y1.getCurrentAccount(), ys0Var.f42114m1, this.f34524b, this.f34525c, this.d, this.f34526e, this.f34527f, ys0Var.I1);
                return;
        }
    }
}
