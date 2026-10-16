package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jk0 extends s4.g0 {
    public final int f26070c;
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final boolean f26071f;
    public final qk0 h;

    public jk0(qk0 qk0Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.h = qk0Var;
        this.f26070c = i10;
        this.d = context;
        this.e = c6Var;
        this.f26071f = z10;
    }

    @Override
    public final int h() {
        int i10;
        qk0 qk0Var = this.h;
        int size = qk0Var.f28314n.size();
        if (!qk0Var.H.isEmpty() && !MessagesController.getInstance(this.f26070c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f28314n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f44841f == 0) {
            ((org.telegram.ui.Cells.o6) b1Var.f44838a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f28314n.get(i10));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            qk0 qk0Var = this.h;
            ub0 ub0Var = qk0Var.J;
            if (ub0Var != null) {
                if (ub0Var.getParent() != null) {
                    ((ViewGroup) qk0Var.J.getParent()).removeView(qk0Var.J);
                }
            } else {
                qk0Var.i();
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, this.e)));
            o6Var.addView(view, w7.z5.d(8.0f, -1));
            o6Var.addView(qk0Var.J, w7.z5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 0));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.f26070c, this.d, this.e, true, this.f26071f);
        }
        return new s4.b1(o6Var);
    }
}
