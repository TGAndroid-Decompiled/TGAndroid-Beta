package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class zh0 extends v4.h0 {
    public final int f42799c;
    public final Context d;
    public final org.telegram.ui.ActionBar.h6 f42800e;
    public final boolean f42801f;
    public final gi0 h;

    public zh0(gi0 gi0Var, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this.h = gi0Var;
        this.f42799c = i7;
        this.d = context;
        this.f42800e = h6Var;
        this.f42801f = z10;
    }

    @Override
    public final int b() {
        int i7;
        gi0 gi0Var = this.h;
        int size = gi0Var.f35544n.size();
        if (!gi0Var.I.isEmpty() && !org.telegram.messenger.np.u1(this.f42799c).K3()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return size + i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.h.f35544n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        if (e1Var.f59115f == 0) {
            ((org.telegram.ui.Cells.n6) e1Var.f59111a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f35544n.get(i7));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout n6Var;
        if (i7 != 0) {
            gi0 gi0Var = this.h;
            aa0 aa0Var = gi0Var.K;
            if (aa0Var != null) {
                if (aa0Var.getParent() != null) {
                    ((ViewGroup) gi0Var.K.getParent()).removeView(gi0Var.K);
                }
            } else {
                gi0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.t6.i(view, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), this.f42800e);
            n6Var.addView(view, c8.na.c(8.0f, -1));
            n6Var.addView(gi0Var.K, c8.na.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f42799c, this.d, this.f42800e, true, this.f42801f);
        }
        return new v4.e1(n6Var);
    }
}
