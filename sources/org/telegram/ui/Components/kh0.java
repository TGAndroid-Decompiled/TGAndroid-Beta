package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class kh0 extends v4.g0 {
    public final int f35336c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 f35337e;
    public final boolean f35338f;
    public final rh0 h;

    public kh0(rh0 rh0Var, int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this.h = rh0Var;
        this.f35336c = i7;
        this.d = context;
        this.f35337e = f6Var;
        this.f35338f = z9;
    }

    @Override
    public final int b() {
        int i7;
        rh0 rh0Var = this.h;
        int size = rh0Var.f37665n.size();
        if (!rh0Var.H.isEmpty() && !org.telegram.messenger.qp.s1(this.f35336c).D3()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return size + i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.h.f37665n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f57047f == 0) {
            ((org.telegram.ui.Cells.m6) d1Var.f57043a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f37665n.get(i7));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout m6Var;
        if (i7 != 0) {
            rh0 rh0Var = this.h;
            l90 l90Var = rh0Var.J;
            if (l90Var != null) {
                if (l90Var.getParent() != null) {
                    ((ViewGroup) rh0Var.J.getParent()).removeView(rh0Var.J);
                }
            } else {
                rh0Var.i();
            }
            Context context = this.d;
            m6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.j(view, org.telegram.ui.ActionBar.r6.L(0.06f, org.telegram.ui.ActionBar.k6.E8), this.f35337e);
            m6Var.addView(view, c8.ha.c(8.0f, -1));
            m6Var.addView(rh0Var.J, c8.ha.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(0, this.f35336c, this.d, this.f35337e, true, this.f35338f);
        }
        return new v4.d1(m6Var);
    }
}
