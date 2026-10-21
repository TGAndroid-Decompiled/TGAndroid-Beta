package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gk0 extends s4.g0 {
    public final int f26594c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final boolean f26595f;
    public final nk0 h;

    public gk0(nk0 nk0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this.h = nk0Var;
        this.f26594c = i10;
        this.d = context;
        this.e = d6Var;
        this.f26595f = z10;
    }

    @Override
    public final int h() {
        int i10;
        nk0 nk0Var = this.h;
        int size = nk0Var.f28832n.size();
        if (!nk0Var.H.isEmpty() && !MessagesController.getInstance(this.f26594c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f28832n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f45920f == 0) {
            ((org.telegram.ui.Cells.n6) b1Var.f45917a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f28832n.get(i10));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            nk0 nk0Var = this.h;
            ob0 ob0Var = nk0Var.J;
            if (ob0Var != null) {
                if (ob0Var.getParent() != null) {
                    ((ViewGroup) nk0Var.J.getParent()).removeView(nk0Var.J);
                }
            } else {
                nk0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.e)));
            n6Var.addView(view, w7.z5.c(8.0f, -1));
            n6Var.addView(nk0Var.J, w7.z5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f26594c, this.d, this.e, true, this.f26595f);
        }
        return new s4.b1(n6Var);
    }
}
