package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c50 implements View.OnClickListener {
    public final int f32409a;
    public final TLRPC.User f32410b;
    public final String f32411c;
    public final boolean d;
    public final boolean f32412e;
    public final boolean f32413f;
    public final oj0 h;

    public c50(oj0 oj0Var, TLRPC.User user, String str, boolean z9, boolean z10, boolean z11, int i7) {
        this.f32409a = i7;
        this.h = oj0Var;
        this.f32410b = user;
        this.f32411c = str;
        this.d = z9;
        this.f32412e = z10;
        this.f32413f = z11;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32409a) {
            case 0:
                m50 m50Var = ((h50) this.h).f34167c;
                dy0.b(m50Var.getContext(), m50Var.f28612a, -m50Var.X1, this.f32410b, this.f32411c, this.d, this.f32412e, this.f32413f, m50Var.I0);
                return;
            default:
                xs0 xs0Var = ((kr0) this.h).f35408f;
                dy0.b(xs0Var.getContext(), xs0Var.f40424x1.getCurrentAccount(), xs0Var.l1, this.f32410b, this.f32411c, this.d, this.f32412e, this.f32413f, xs0Var.H1);
                return;
        }
    }
}
