package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class xh0 extends v4.i0 {
    public final int f42043c;
    public final Context d;
    public final org.telegram.ui.ActionBar.i6 f42044e;
    public final boolean f42045f;
    public final ei0 h;

    public xh0(ei0 ei0Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        this.h = ei0Var;
        this.f42043c = i7;
        this.d = context;
        this.f42044e = i6Var;
        this.f42045f = z10;
    }

    @Override
    public final int b() {
        int i7;
        ei0 ei0Var = this.h;
        int size = ei0Var.f34715n.size();
        if (!ei0Var.I.isEmpty() && !org.telegram.messenger.mp.u1(this.f42043c).K3()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return size + i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.h.f34715n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f59126f == 0) {
            ((org.telegram.ui.Cells.m6) f1Var.f59122a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f34715n.get(i7));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout m6Var;
        if (i7 != 0) {
            ei0 ei0Var = this.h;
            y90 y90Var = ei0Var.K;
            if (y90Var != null) {
                if (y90Var.getParent() != null) {
                    ((ViewGroup) ei0Var.K.getParent()).removeView(ei0Var.K);
                }
            } else {
                ei0Var.i();
            }
            Context context = this.d;
            m6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.u6.i(view, org.telegram.ui.ActionBar.u6.K(0.06f, org.telegram.ui.ActionBar.n6.E8), this.f42044e);
            m6Var.addView(view, c8.ma.c(8.0f, -1));
            m6Var.addView(ei0Var.K, c8.ma.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(0, this.f42043c, this.d, this.f42044e, true, this.f42045f);
        }
        return new v4.f1(m6Var);
    }
}
