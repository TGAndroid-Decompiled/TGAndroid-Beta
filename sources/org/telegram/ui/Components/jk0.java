package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jk0 extends s4.h0 {
    public final int f29691c;
    public final Context d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final boolean f29692f;
    public final qk0 h;

    public jk0(qk0 qk0Var, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this.h = qk0Var;
        this.f29691c = i10;
        this.d = context;
        this.e = u6Var;
        this.f29692f = z10;
    }

    @Override
    public final int h() {
        int i10;
        qk0 qk0Var = this.h;
        int size = qk0Var.f31924n.size();
        if (!qk0Var.H.isEmpty() && !MessagesController.getInstance(this.f29691c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f31924n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f47776f == 0) {
            ((org.telegram.ui.Cells.s6) e1Var.f47773a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f31924n.get(i10));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout s6Var;
        if (i10 != 0) {
            qk0 qk0Var = this.h;
            nb0 nb0Var = qk0Var.J;
            if (nb0Var != null) {
                if (nb0Var.getParent() != null) {
                    ((ViewGroup) qk0Var.J.getParent()).removeView(qk0Var.J);
                }
            } else {
                qk0Var.i();
            }
            Context context = this.d;
            s6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.f7.j(view, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), this.e);
            s6Var.addView(view, kb1.g(8.0f, -1));
            s6Var.addView(qk0Var.J, kb1.h(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            s6Var = new org.telegram.ui.Cells.s6(0, this.f29691c, this.d, this.e, true, this.f29692f);
        }
        return new s4.e1(s6Var);
    }
}
