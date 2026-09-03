package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class rj0 extends f2.o0 {
    public final int f28480c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final boolean f28481f;
    public final yj0 h;

    public rj0(yj0 yj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        this.h = yj0Var;
        this.f28480c = i10;
        this.d = context;
        this.e = f6Var;
        this.f28481f = z4;
    }

    @Override
    public final int h() {
        int i10;
        yj0 yj0Var = this.h;
        int size = yj0Var.f31036n.size();
        if (!yj0Var.E.isEmpty() && !MessagesController.getInstance(this.f28480c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f31036n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f5777f == 0) {
            ((org.telegram.ui.Cells.m6) l1Var.f5774a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f31036n.get(i10));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout m6Var;
        if (i10 != 0) {
            yj0 yj0Var = this.h;
            wa0 wa0Var = yj0Var.G;
            if (wa0Var != null) {
                if (wa0Var.getParent() != null) {
                    ((ViewGroup) yj0Var.G.getParent()).removeView(yj0Var.G);
                }
            } else {
                yj0Var.i();
            }
            Context context = this.d;
            m6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            m6Var.addView(view, k7.b6.c(8.0f, -1));
            m6Var.addView(yj0Var.G, k7.b6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(0, this.f28480c, this.d, this.e, true, this.f28481f);
        }
        return new f2.l1(m6Var);
    }
}
