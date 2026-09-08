package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ij0 extends s4.h0 {
    public final int f27175c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 f27176e;
    public final boolean f27177f;
    public final pj0 h;

    public ij0(pj0 pj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = pj0Var;
        this.f27175c = i10;
        this.d = context;
        this.f27176e = f6Var;
        this.f27177f = z10;
    }

    @Override
    public final int h() {
        int i10;
        pj0 pj0Var = this.h;
        int size = pj0Var.f29429n.size();
        if (!pj0Var.H.isEmpty() && !MessagesController.getInstance(this.f27175c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f29429n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f45770f == 0) {
            ((org.telegram.ui.Cells.n6) c1Var.f45766a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f29429n.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            pj0 pj0Var = this.h;
            ua0 ua0Var = pj0Var.J;
            if (ua0Var != null) {
                if (ua0Var.getParent() != null) {
                    ((ViewGroup) pj0Var.J.getParent()).removeView(pj0Var.J);
                }
            } else {
                pj0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.f27176e)));
            n6Var.addView(view, w7.x5.c(8.0f, -1));
            n6Var.addView(pj0Var.J, w7.x5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f27175c, this.d, this.f27176e, true, this.f27177f);
        }
        return new s4.c1(n6Var);
    }
}
