package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c50 implements View.OnClickListener {
    public final int f32423a;
    public final TLRPC.User f32424b;
    public final String f32425c;
    public final boolean d;
    public final boolean f32426e;
    public final boolean f32427f;
    public final oj0 h;

    public c50(oj0 oj0Var, TLRPC.User user, String str, boolean z9, boolean z10, boolean z11, int i7) {
        this.f32423a = i7;
        this.h = oj0Var;
        this.f32424b = user;
        this.f32425c = str;
        this.d = z9;
        this.f32426e = z10;
        this.f32427f = z11;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32423a) {
            case 0:
                m50 m50Var = ((h50) this.h).f34177c;
                ey0.b(m50Var.getContext(), m50Var.f28613a, -m50Var.X1, this.f32424b, this.f32425c, this.d, this.f32426e, this.f32427f, m50Var.I0);
                return;
            default:
                xs0 xs0Var = ((kr0) this.h).f35399f;
                ey0.b(xs0Var.getContext(), xs0Var.f40440x1.getCurrentAccount(), xs0Var.l1, this.f32424b, this.f32425c, this.d, this.f32426e, this.f32427f, xs0Var.H1);
                return;
        }
    }
}
