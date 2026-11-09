package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class lh0 extends v4.g0 {
    public final int f35747c;
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 f35748e;
    public final boolean f35749f;
    public final sh0 h;

    public lh0(sh0 sh0Var, int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        this.h = sh0Var;
        this.f35747c = i7;
        this.d = context;
        this.f35748e = g6Var;
        this.f35749f = z9;
    }

    @Override
    public final int b() {
        int i7;
        sh0 sh0Var = this.h;
        int size = sh0Var.f38068n.size();
        if (!sh0Var.H.isEmpty() && !org.telegram.messenger.qp.s1(this.f35747c).D3()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return size + i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.h.f38068n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f57060f == 0) {
            ((org.telegram.ui.Cells.m6) d1Var.f57056a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f38068n.get(i7));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout m6Var;
        if (i7 != 0) {
            sh0 sh0Var = this.h;
            m90 m90Var = sh0Var.J;
            if (m90Var != null) {
                if (m90Var.getParent() != null) {
                    ((ViewGroup) sh0Var.J.getParent()).removeView(sh0Var.J);
                }
            } else {
                sh0Var.i();
            }
            Context context = this.d;
            m6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.s6.i(view, org.telegram.ui.ActionBar.s6.K(0.06f, org.telegram.ui.ActionBar.l6.E8), this.f35748e);
            m6Var.addView(view, c8.ha.c(8.0f, -1));
            m6Var.addView(sh0Var.J, c8.ha.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(0, this.f35747c, this.d, this.f35748e, true, this.f35749f);
        }
        return new v4.d1(m6Var);
    }
}
