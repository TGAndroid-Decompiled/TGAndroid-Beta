package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nk0 extends s4.i0 {
    public final int f29203c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f29204e;
    public final boolean f29205f;
    public final uk0 h;

    public nk0(uk0 uk0Var, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = uk0Var;
        this.f29203c = i10;
        this.d = context;
        this.f29204e = e6Var;
        this.f29205f = z10;
    }

    @Override
    public final int h() {
        int i10;
        uk0 uk0Var = this.h;
        int size = uk0Var.f31526n.size();
        if (!uk0Var.H.isEmpty() && !MessagesController.getInstance(this.f29203c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f31526n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47662f == 0) {
            ((org.telegram.ui.Cells.o6) d1Var.f47658a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f31526n.get(i10));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            uk0 uk0Var = this.h;
            vb0 vb0Var = uk0Var.J;
            if (vb0Var != null) {
                if (vb0Var.getParent() != null) {
                    ((ViewGroup) uk0Var.J.getParent()).removeView(uk0Var.J);
                }
            } else {
                uk0Var.i();
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, this.f29204e)));
            o6Var.addView(view, w7.x5.d(8.0f, -1));
            o6Var.addView(uk0Var.J, w7.x5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 0));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.f29203c, this.d, this.f29204e, true, this.f29205f);
        }
        return new s4.d1(o6Var);
    }
}
