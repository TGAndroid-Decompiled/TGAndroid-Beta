package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jj0 extends s4.h0 {
    public final int f25311c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final boolean f25312f;
    public final qj0 h;

    public jj0(qj0 qj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = qj0Var;
        this.f25311c = i10;
        this.d = context;
        this.e = f6Var;
        this.f25312f = z10;
    }

    @Override
    public final int h() {
        int i10;
        qj0 qj0Var = this.h;
        int size = qj0Var.f27331n.size();
        if (!qj0Var.H.isEmpty() && !MessagesController.getInstance(this.f25311c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f27331n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f42705f == 0) {
            ((org.telegram.ui.Cells.n6) c1Var.f42702a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f27331n.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            qj0 qj0Var = this.h;
            ta0 ta0Var = qj0Var.J;
            if (ta0Var != null) {
                if (ta0Var.getParent() != null) {
                    ((ViewGroup) qj0Var.J.getParent()).removeView(qj0Var.J);
                }
            } else {
                qj0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            n6Var.addView(view, w7.x5.c(8.0f, -1));
            n6Var.addView(qj0Var.J, w7.x5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f25311c, this.d, this.e, true, this.f25312f);
        }
        return new s4.c1(n6Var);
    }
}
