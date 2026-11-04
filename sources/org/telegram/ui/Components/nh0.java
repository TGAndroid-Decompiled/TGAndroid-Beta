package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class nh0 extends u4.h0 {
    public final int f36541c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f36542e;
    public final boolean f36543f;
    public final uh0 h;

    public nh0(uh0 uh0Var, int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = uh0Var;
        this.f36541c = i3;
        this.d = context;
        this.f36542e = e6Var;
        this.f36543f = z10;
    }

    @Override
    public final int b() {
        int i3;
        uh0 uh0Var = this.h;
        int size = uh0Var.f38753n.size();
        if (!uh0Var.I.isEmpty() && !org.telegram.messenger.hp.s1(this.f36541c).D3()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        return size + i3;
    }

    @Override
    public final int d(int i3) {
        if (i3 < this.h.f38753n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f55544f == 0) {
            ((org.telegram.ui.Cells.l6) d1Var.f55540a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f38753n.get(i3));
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout l6Var;
        if (i3 != 0) {
            uh0 uh0Var = this.h;
            h90 h90Var = uh0Var.K;
            if (h90Var != null) {
                if (h90Var.getParent() != null) {
                    ((ViewGroup) uh0Var.K.getParent()).removeView(uh0Var.K);
                }
            } else {
                uh0Var.i();
            }
            Context context = this.d;
            l6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.j(view, org.telegram.ui.ActionBar.r6.L(0.06f, org.telegram.ui.ActionBar.k6.E8), this.f36542e);
            l6Var.addView(view, b8.mf.c(8.0f, -1));
            l6Var.addView(uh0Var.K, b8.mf.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            l6Var = new org.telegram.ui.Cells.l6(0, this.f36541c, this.d, this.f36542e, true, this.f36543f);
        }
        return new u4.d1(l6Var);
    }
}
