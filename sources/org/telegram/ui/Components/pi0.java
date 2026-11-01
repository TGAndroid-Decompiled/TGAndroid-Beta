package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class pi0 extends s4.g0 {
    public final int f29434c;
    public final Context d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final boolean f29435f;
    public final wi0 h;

    public pi0(wi0 wi0Var, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this.h = wi0Var;
        this.f29434c = i10;
        this.d = context;
        this.e = p6Var;
        this.f29435f = z10;
    }

    @Override
    public final int b() {
        int i10;
        wi0 wi0Var = this.h;
        int size = wi0Var.f32255n.size();
        if (!wi0Var.H.isEmpty() && !org.telegram.messenger.wp.r1(this.f29434c).A3()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int d(int i10) {
        if (i10 < this.h.f32255n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f47912f == 0) {
            ((org.telegram.ui.Cells.q6) c1Var.f47909a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f32255n.get(i10));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout q6Var;
        if (i10 != 0) {
            wi0 wi0Var = this.h;
            da0 da0Var = wi0Var.J;
            if (da0Var != null) {
                if (da0Var.getParent() != null) {
                    ((ViewGroup) wi0Var.J.getParent()).removeView(wi0Var.J);
                }
            } else {
                wi0Var.i();
            }
            Context context = this.d;
            q6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.a7.j(view, org.telegram.ui.ActionBar.a7.L(0.06f, org.telegram.ui.ActionBar.t6.E8), this.e);
            q6Var.addView(view, w7.b6.c(8.0f, -1));
            q6Var.addView(wi0Var.J, w7.b6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            q6Var = new org.telegram.ui.Cells.q6(0, this.f29434c, this.d, this.e, true, this.f29435f);
        }
        return new s4.c1(q6Var);
    }
}
