package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class zh0 extends v4.i0 {
    public final int f42863c;
    public final Context d;
    public final org.telegram.ui.ActionBar.i6 f42864e;
    public final boolean f42865f;
    public final gi0 h;

    public zh0(gi0 gi0Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        this.h = gi0Var;
        this.f42863c = i7;
        this.d = context;
        this.f42864e = i6Var;
        this.f42865f = z10;
    }

    @Override
    public final int b() {
        int i7;
        gi0 gi0Var = this.h;
        int size = gi0Var.f35445n.size();
        if (!gi0Var.I.isEmpty() && !org.telegram.messenger.mp.u1(this.f42863c).K3()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return size + i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.h.f35445n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f59249f == 0) {
            ((org.telegram.ui.Cells.m6) f1Var.f59245a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f35445n.get(i7));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout m6Var;
        if (i7 != 0) {
            gi0 gi0Var = this.h;
            x90 x90Var = gi0Var.K;
            if (x90Var != null) {
                if (x90Var.getParent() != null) {
                    ((ViewGroup) gi0Var.K.getParent()).removeView(gi0Var.K);
                }
            } else {
                gi0Var.i();
            }
            Context context = this.d;
            m6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.u6.i(view, org.telegram.ui.ActionBar.u6.K(0.06f, org.telegram.ui.ActionBar.n6.E8), this.f42864e);
            m6Var.addView(view, c8.na.c(8.0f, -1));
            m6Var.addView(gi0Var.K, c8.na.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(0, this.f42863c, this.d, this.f42864e, true, this.f42865f);
        }
        return new v4.f1(m6Var);
    }
}
