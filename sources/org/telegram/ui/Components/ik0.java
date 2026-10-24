package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ik0 extends s4.g0 {
    public final int f27439c;
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final boolean f27440f;
    public final pk0 h;

    public ik0(pk0 pk0Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        this.h = pk0Var;
        this.f27439c = i10;
        this.d = context;
        this.e = g6Var;
        this.f27440f = z10;
    }

    @Override
    public final int h() {
        int i10;
        pk0 pk0Var = this.h;
        int size = pk0Var.f29582n.size();
        if (!pk0Var.H.isEmpty() && !MessagesController.getInstance(this.f27439c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f29582n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f46345f == 0) {
            ((org.telegram.ui.Cells.o6) b1Var.f46342a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f29582n.get(i10));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            pk0 pk0Var = this.h;
            nb0 nb0Var = pk0Var.J;
            if (nb0Var != null) {
                if (nb0Var.getParent() != null) {
                    ((ViewGroup) pk0Var.J.getParent()).removeView(pk0Var.J);
                }
            } else {
                pk0Var.i();
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.j(view, org.telegram.ui.ActionBar.r6.M(0.06f, org.telegram.ui.ActionBar.k6.E8), this.e);
            o6Var.addView(view, w7.z5.c(8.0f, -1));
            o6Var.addView(pk0Var.J, w7.z5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.f27439c, this.d, this.e, true, this.f27440f);
        }
        return new s4.b1(o6Var);
    }
}
