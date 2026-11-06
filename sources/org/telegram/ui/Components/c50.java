package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c50 implements View.OnClickListener {
    public final int f32415a;
    public final TLRPC.User f32416b;
    public final String f32417c;
    public final boolean d;
    public final boolean f32418e;
    public final boolean f32419f;
    public final oj0 h;

    public c50(oj0 oj0Var, TLRPC.User user, String str, boolean z9, boolean z10, boolean z11, int i7) {
        this.f32415a = i7;
        this.h = oj0Var;
        this.f32416b = user;
        this.f32417c = str;
        this.d = z9;
        this.f32418e = z10;
        this.f32419f = z11;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32415a) {
            case 0:
                m50 m50Var = ((h50) this.h).f34217c;
                dy0.b(m50Var.getContext(), m50Var.f28612a, -m50Var.X1, this.f32416b, this.f32417c, this.d, this.f32418e, this.f32419f, m50Var.I0);
                return;
            default:
                xs0 xs0Var = ((kr0) this.h).f35405f;
                dy0.b(xs0Var.getContext(), xs0Var.f40405x1.getCurrentAccount(), xs0Var.l1, this.f32416b, this.f32417c, this.d, this.f32418e, this.f32419f, xs0Var.H1);
                return;
        }
    }
}
