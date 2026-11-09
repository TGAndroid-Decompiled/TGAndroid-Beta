package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d50 implements View.OnClickListener {
    public final int f32867a;
    public final TLRPC.User f32868b;
    public final String f32869c;
    public final boolean d;
    public final boolean f32870e;
    public final boolean f32871f;
    public final pj0 h;

    public d50(pj0 pj0Var, TLRPC.User user, String str, boolean z9, boolean z10, boolean z11, int i7) {
        this.f32867a = i7;
        this.h = pj0Var;
        this.f32868b = user;
        this.f32869c = str;
        this.d = z9;
        this.f32870e = z10;
        this.f32871f = z11;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32867a) {
            case 0:
                n50 n50Var = ((i50) this.h).f34575c;
                fy0.b(n50Var.getContext(), n50Var.f28621a, -n50Var.X1, this.f32868b, this.f32869c, this.d, this.f32870e, this.f32871f, n50Var.I0);
                return;
            default:
                zs0 zs0Var = ((mr0) this.h).f36142f;
                fy0.b(zs0Var.getContext(), zs0Var.f41127x1.getCurrentAccount(), zs0Var.l1, this.f32868b, this.f32869c, this.d, this.f32870e, this.f32871f, zs0Var.H1);
                return;
        }
    }
}
