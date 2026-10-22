package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gk0 extends s4.g0 {
    public final int f26597c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final boolean f26598f;
    public final nk0 h;

    public gk0(nk0 nk0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this.h = nk0Var;
        this.f26597c = i10;
        this.d = context;
        this.e = d6Var;
        this.f26598f = z10;
    }

    @Override
    public final int h() {
        int i10;
        nk0 nk0Var = this.h;
        int size = nk0Var.f28835n.size();
        if (!nk0Var.H.isEmpty() && !MessagesController.getInstance(this.f26597c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f28835n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f45923f == 0) {
            ((org.telegram.ui.Cells.n6) b1Var.f45920a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f28835n.get(i10));
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
            n6Var = new org.telegram.ui.Cells.n6(0, this.f26597c, this.d, this.e, true, this.f26598f);
        }
        return new s4.b1(n6Var);
    }
}
