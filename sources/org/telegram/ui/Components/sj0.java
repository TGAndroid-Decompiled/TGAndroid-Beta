package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class sj0 extends s4.h0 {
    public final int f27084c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final boolean f27085f;
    public final zj0 h;

    public sj0(zj0 zj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = zj0Var;
        this.f27084c = i10;
        this.d = context;
        this.e = f6Var;
        this.f27085f = z10;
    }

    @Override
    public final int h() {
        int i10;
        zj0 zj0Var = this.h;
        int size = zj0Var.f29705n.size();
        if (!zj0Var.H.isEmpty() && !MessagesController.getInstance(this.f27084c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f29705n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f41613f == 0) {
            ((org.telegram.ui.Cells.p6) c1Var.f41610a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f29705n.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout p6Var;
        if (i10 != 0) {
            zj0 zj0Var = this.h;
            db0 db0Var = zj0Var.J;
            if (db0Var != null) {
                if (db0Var.getParent() != null) {
                    ((ViewGroup) zj0Var.J.getParent()).removeView(zj0Var.J);
                }
            } else {
                zj0Var.i();
            }
            Context context = this.d;
            p6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            p6Var.addView(view, w7.a6.c(8.0f, -1));
            p6Var.addView(zj0Var.J, w7.a6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            p6Var = new org.telegram.ui.Cells.p6(0, this.f27084c, this.d, this.e, true, this.f27085f);
        }
        return new s4.c1(p6Var);
    }
}
