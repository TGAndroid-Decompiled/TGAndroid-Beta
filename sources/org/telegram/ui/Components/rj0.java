package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class rj0 extends f2.o0 {
    public final int f28478c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final boolean f28479f;
    public final yj0 h;

    public rj0(yj0 yj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        this.h = yj0Var;
        this.f28478c = i10;
        this.d = context;
        this.e = f6Var;
        this.f28479f = z4;
    }

    @Override
    public final int h() {
        int i10;
        yj0 yj0Var = this.h;
        int size = yj0Var.f31032n.size();
        if (!yj0Var.E.isEmpty() && !MessagesController.getInstance(this.f28478c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f31032n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f5788f == 0) {
            ((org.telegram.ui.Cells.n6) l1Var.f5785a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f31032n.get(i10));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            yj0 yj0Var = this.h;
            va0 va0Var = yj0Var.G;
            if (va0Var != null) {
                if (va0Var.getParent() != null) {
                    ((ViewGroup) yj0Var.G.getParent()).removeView(yj0Var.G);
                }
            } else {
                yj0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            n6Var.addView(view, k7.b6.c(8.0f, -1));
            n6Var.addView(yj0Var.G, k7.b6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f28478c, this.d, this.e, true, this.f28479f);
        }
        return new f2.l1(n6Var);
    }
}
