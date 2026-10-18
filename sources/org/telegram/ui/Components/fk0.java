package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fk0 extends s4.g0 {
    public final int f26271c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final boolean f26272f;
    public final mk0 h;

    public fk0(mk0 mk0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this.h = mk0Var;
        this.f26271c = i10;
        this.d = context;
        this.e = d6Var;
        this.f26272f = z10;
    }

    @Override
    public final int h() {
        int i10;
        mk0 mk0Var = this.h;
        int size = mk0Var.f28548n.size();
        if (!mk0Var.H.isEmpty() && !MessagesController.getInstance(this.f26271c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f28548n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f45961f == 0) {
            ((org.telegram.ui.Cells.n6) b1Var.f45958a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f28548n.get(i10));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            mk0 mk0Var = this.h;
            ob0 ob0Var = mk0Var.J;
            if (ob0Var != null) {
                if (ob0Var.getParent() != null) {
                    ((ViewGroup) mk0Var.J.getParent()).removeView(mk0Var.J);
                }
            } else {
                mk0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.e)));
            n6Var.addView(view, w7.z5.d(8.0f, -1));
            n6Var.addView(mk0Var.J, w7.z5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 0));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f26271c, this.d, this.e, true, this.f26272f);
        }
        return new s4.b1(n6Var);
    }
}
