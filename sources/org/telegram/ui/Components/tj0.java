package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class tj0 extends f2.p0 {
    public final int f31351c;
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 f31352e;
    public final boolean f31353f;
    public final ak0 h;

    public tj0(ak0 ak0Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        this.h = ak0Var;
        this.f31351c = i10;
        this.d = context;
        this.f31352e = g6Var;
        this.f31353f = z4;
    }

    @Override
    public final int h() {
        int i10;
        ak0 ak0Var = this.h;
        int size = ak0Var.f25276n.size();
        if (!ak0Var.E.isEmpty() && !MessagesController.getInstance(this.f31351c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f25276n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f5879f == 0) {
            ((org.telegram.ui.Cells.n6) m1Var.f5875a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f25276n.get(i10));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            ak0 ak0Var = this.h;
            xa0 xa0Var = ak0Var.G;
            if (xa0Var != null) {
                if (xa0Var.getParent() != null) {
                    ((ViewGroup) ak0Var.G.getParent()).removeView(ak0Var.G);
                }
            } else {
                ak0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, this.f31352e)));
            n6Var.addView(view, k7.c6.c(8.0f, -1));
            n6Var.addView(ak0Var.G, k7.c6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f31351c, this.d, this.f31352e, true, this.f31353f);
        }
        return new f2.m1(n6Var);
    }
}
