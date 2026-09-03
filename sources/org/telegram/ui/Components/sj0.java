package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class sj0 extends f2.p0 {
    public final int f31073c;
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 f31074e;
    public final boolean f31075f;
    public final zj0 h;

    public sj0(zj0 zj0Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        this.h = zj0Var;
        this.f31073c = i10;
        this.d = context;
        this.f31074e = g6Var;
        this.f31075f = z4;
    }

    @Override
    public final int h() {
        int i10;
        zj0 zj0Var = this.h;
        int size = zj0Var.f33954n.size();
        if (!zj0Var.E.isEmpty() && !MessagesController.getInstance(this.f31073c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f33954n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f5879f == 0) {
            ((org.telegram.ui.Cells.n6) m1Var.f5875a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f33954n.get(i10));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            zj0 zj0Var = this.h;
            xa0 xa0Var = zj0Var.G;
            if (xa0Var != null) {
                if (xa0Var.getParent() != null) {
                    ((ViewGroup) zj0Var.G.getParent()).removeView(zj0Var.G);
                }
            } else {
                zj0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, this.f31074e)));
            n6Var.addView(view, k7.c6.c(8.0f, -1));
            n6Var.addView(zj0Var.G, k7.c6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f31073c, this.d, this.f31074e, true, this.f31075f);
        }
        return new f2.m1(n6Var);
    }
}
