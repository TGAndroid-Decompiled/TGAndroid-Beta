package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jj0 extends s4.h0 {
    public final int f25336c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final boolean f25337f;
    public final qj0 h;

    public jj0(qj0 qj0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this.h = qj0Var;
        this.f25336c = i10;
        this.d = context;
        this.e = d6Var;
        this.f25337f = z10;
    }

    @Override
    public final int h() {
        int i10;
        qj0 qj0Var = this.h;
        int size = qj0Var.f27368n.size();
        if (!qj0Var.H.isEmpty() && !MessagesController.getInstance(this.f25336c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f27368n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f42630f == 0) {
            ((org.telegram.ui.Cells.o6) c1Var.f42627a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f27368n.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            qj0 qj0Var = this.h;
            ua0 ua0Var = qj0Var.J;
            if (ua0Var != null) {
                if (ua0Var.getParent() != null) {
                    ((ViewGroup) qj0Var.J.getParent()).removeView(qj0Var.J);
                }
            } else {
                qj0Var.i();
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, this.e)));
            o6Var.addView(view, w7.x5.c(8.0f, -1));
            o6Var.addView(qj0Var.J, w7.x5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.f25336c, this.d, this.e, true, this.f25337f);
        }
        return new s4.c1(o6Var);
    }
}
