package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c50 implements View.OnClickListener {
    public final int f32458a;
    public final TLRPC.User f32459b;
    public final String f32460c;
    public final boolean d;
    public final boolean f32461e;
    public final boolean f32462f;
    public final oj0 h;

    public c50(oj0 oj0Var, TLRPC.User user, String str, boolean z9, boolean z10, boolean z11, int i7) {
        this.f32458a = i7;
        this.h = oj0Var;
        this.f32459b = user;
        this.f32460c = str;
        this.d = z9;
        this.f32461e = z10;
        this.f32462f = z11;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32458a) {
            case 0:
                m50 m50Var = ((h50) this.h).f34183c;
                ey0.b(m50Var.getContext(), m50Var.f28669a, -m50Var.f35854a2, this.f32459b, this.f32460c, this.d, this.f32461e, this.f32462f, m50Var.I0);
                return;
            default:
                ys0 ys0Var = ((lr0) this.h).f35735f;
                ey0.b(ys0Var.getContext(), ys0Var.f40719x1.getCurrentAccount(), ys0Var.l1, this.f32459b, this.f32460c, this.d, this.f32461e, this.f32462f, ys0Var.H1);
                return;
        }
    }
}
