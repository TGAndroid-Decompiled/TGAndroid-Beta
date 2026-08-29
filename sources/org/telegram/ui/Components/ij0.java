package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ij0 extends f2.p0 {
    public final int f29397c;
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 f29398e;
    public final boolean f29399f;
    public final pj0 h;

    public ij0(pj0 pj0Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.h = pj0Var;
        this.f29397c = i10;
        this.d = context;
        this.f29398e = c6Var;
        this.f29399f = z10;
    }

    @Override
    public final int h() {
        int i10;
        pj0 pj0Var = this.h;
        int size = pj0Var.f31691n.size();
        if (!pj0Var.D.isEmpty() && !MessagesController.getInstance(this.f29397c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f31691n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f6436f == 0) {
            ((org.telegram.ui.Cells.l6) n1Var.f6432a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f31691n.get(i10));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout l6Var;
        if (i10 != 0) {
            pj0 pj0Var = this.h;
            qa0 qa0Var = pj0Var.F;
            if (qa0Var != null) {
                if (qa0Var.getParent() != null) {
                    ((ViewGroup) pj0Var.F.getParent()).removeView(pj0Var.F);
                }
            } else {
                pj0Var.i();
            }
            Context context = this.d;
            l6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, this.f29398e)));
            l6Var.addView(view, i7.f6.c(8.0f, -1));
            l6Var.addView(pj0Var.F, i7.f6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            l6Var = new org.telegram.ui.Cells.l6(0, this.f29397c, this.d, this.f29398e, true, this.f29399f);
        }
        return new f2.n1(l6Var);
    }
}
