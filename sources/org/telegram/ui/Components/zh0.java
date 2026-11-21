package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class zh0 extends v4.i0 {
    public final int f42836c;
    public final Context d;
    public final org.telegram.ui.ActionBar.h6 f42837e;
    public final boolean f42838f;
    public final gi0 h;

    public zh0(gi0 gi0Var, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this.h = gi0Var;
        this.f42836c = i7;
        this.d = context;
        this.f42837e = h6Var;
        this.f42838f = z10;
    }

    @Override
    public final int b() {
        int i7;
        gi0 gi0Var = this.h;
        int size = gi0Var.f35566n.size();
        if (!gi0Var.I.isEmpty() && !org.telegram.messenger.mp.u1(this.f42836c).K3()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return size + i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.h.f35566n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f59165f == 0) {
            ((org.telegram.ui.Cells.n6) f1Var.f59161a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f35566n.get(i7));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
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
            org.telegram.ui.ActionBar.t6.i(view, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), this.f42837e);
            n6Var.addView(view, c8.ma.c(8.0f, -1));
            n6Var.addView(gi0Var.K, c8.ma.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f42836c, this.d, this.f42837e, true, this.f42838f);
        }
        return new v4.f1(n6Var);
    }
}
