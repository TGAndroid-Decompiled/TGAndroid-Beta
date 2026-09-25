package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class tj0 extends s4.h0 {
    public final int f28557c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final boolean f28558f;
    public final ak0 h;

    public tj0(ak0 ak0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this.h = ak0Var;
        this.f28557c = i10;
        this.d = context;
        this.e = d6Var;
        this.f28558f = z10;
    }

    @Override
    public final int h() {
        int i10;
        ak0 ak0Var = this.h;
        int size = ak0Var.f22718n.size();
        if (!ak0Var.H.isEmpty() && !MessagesController.getInstance(this.f28557c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f22718n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f42964f == 0) {
            ((org.telegram.ui.Cells.o6) c1Var.f42961a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f22718n.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            ak0 ak0Var = this.h;
            fb0 fb0Var = ak0Var.J;
            if (fb0Var != null) {
                if (fb0Var.getParent() != null) {
                    ((ViewGroup) ak0Var.J.getParent()).removeView(ak0Var.J);
                }
            } else {
                ak0Var.i();
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, this.e)));
            o6Var.addView(view, w7.y5.c(8.0f, -1));
            o6Var.addView(ak0Var.J, w7.y5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.f28557c, this.d, this.e, true, this.f28558f);
        }
        return new s4.c1(o6Var);
    }
}
