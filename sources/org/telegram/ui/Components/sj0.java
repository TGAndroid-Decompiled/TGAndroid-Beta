package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class sj0 extends s4.h0 {
    public final int f28151c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final boolean f28152f;
    public final zj0 h;

    public sj0(zj0 zj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = zj0Var;
        this.f28151c = i10;
        this.d = context;
        this.e = f6Var;
        this.f28152f = z10;
    }

    @Override
    public final int h() {
        int i10;
        zj0 zj0Var = this.h;
        int size = zj0Var.f30844n.size();
        if (!zj0Var.H.isEmpty() && !MessagesController.getInstance(this.f28151c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f30844n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f42977f == 0) {
            ((org.telegram.ui.Cells.p6) c1Var.f42974a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f30844n.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout p6Var;
        if (i10 != 0) {
            zj0 zj0Var = this.h;
            bb0 bb0Var = zj0Var.J;
            if (bb0Var != null) {
                if (bb0Var.getParent() != null) {
                    ((ViewGroup) zj0Var.J.getParent()).removeView(zj0Var.J);
                }
            } else {
                zj0Var.i();
            }
            Context context = this.d;
            p6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            p6Var.addView(view, w7.y5.c(8.0f, -1));
            p6Var.addView(zj0Var.J, w7.y5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            p6Var = new org.telegram.ui.Cells.p6(0, this.f28151c, this.d, this.e, true, this.f28152f);
        }
        return new s4.c1(p6Var);
    }
}
