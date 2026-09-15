package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ij0 extends s4.h0 {
    public final int f25040c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final boolean f25041f;
    public final pj0 h;

    public ij0(pj0 pj0Var, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = pj0Var;
        this.f25040c = i10;
        this.d = context;
        this.e = e6Var;
        this.f25041f = z10;
    }

    @Override
    public final int h() {
        int i10;
        pj0 pj0Var = this.h;
        int size = pj0Var.f27063n.size();
        if (!pj0Var.H.isEmpty() && !MessagesController.getInstance(this.f25040c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f27063n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f42678f == 0) {
            ((org.telegram.ui.Cells.n6) c1Var.f42675a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f27063n.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            pj0 pj0Var = this.h;
            ta0 ta0Var = pj0Var.J;
            if (ta0Var != null) {
                if (ta0Var.getParent() != null) {
                    ((ViewGroup) pj0Var.J.getParent()).removeView(pj0Var.J);
                }
            } else {
                pj0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, this.e)));
            n6Var.addView(view, w7.x5.c(8.0f, -1));
            n6Var.addView(pj0Var.J, w7.x5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f25040c, this.d, this.e, true, this.f25041f);
        }
        return new s4.c1(n6Var);
    }
}
