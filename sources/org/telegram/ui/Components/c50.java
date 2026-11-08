package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c50 implements View.OnClickListener {
    public final int f32454a;
    public final TLRPC.User f32455b;
    public final String f32456c;
    public final boolean d;
    public final boolean f32457e;
    public final boolean f32458f;
    public final oj0 h;

    public c50(oj0 oj0Var, TLRPC.User user, String str, boolean z9, boolean z10, boolean z11, int i7) {
        this.f32454a = i7;
        this.h = oj0Var;
        this.f32455b = user;
        this.f32456c = str;
        this.d = z9;
        this.f32457e = z10;
        this.f32458f = z11;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32454a) {
            case 0:
                m50 m50Var = ((h50) this.h).f34114c;
                ey0.b(m50Var.getContext(), m50Var.f28616a, -m50Var.X1, this.f32455b, this.f32456c, this.d, this.f32457e, this.f32458f, m50Var.I0);
                return;
            default:
                xs0 xs0Var = ((kr0) this.h).f35425f;
                ey0.b(xs0Var.getContext(), xs0Var.f40461x1.getCurrentAccount(), xs0Var.l1, this.f32455b, this.f32456c, this.d, this.f32457e, this.f32458f, xs0Var.H1);
                return;
        }
    }
}
