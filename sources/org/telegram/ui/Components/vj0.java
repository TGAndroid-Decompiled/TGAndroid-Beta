package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class vj0 extends s4.h0 {
    public final int f29192c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final boolean f29193f;
    public final ck0 h;

    public vj0(ck0 ck0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = ck0Var;
        this.f29192c = i10;
        this.d = context;
        this.e = f6Var;
        this.f29193f = z10;
    }

    @Override
    public final int h() {
        int i10;
        ck0 ck0Var = this.h;
        int size = ck0Var.f23390n.size();
        if (!ck0Var.H.isEmpty() && !MessagesController.getInstance(this.f29192c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f23390n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f42998f == 0) {
            ((org.telegram.ui.Cells.p6) c1Var.f42995a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f23390n.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout p6Var;
        if (i10 != 0) {
            ck0 ck0Var = this.h;
            eb0 eb0Var = ck0Var.J;
            if (eb0Var != null) {
                if (eb0Var.getParent() != null) {
                    ((ViewGroup) ck0Var.J.getParent()).removeView(ck0Var.J);
                }
            } else {
                ck0Var.i();
            }
            Context context = this.d;
            p6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            p6Var.addView(view, w7.y5.c(8.0f, -1));
            p6Var.addView(ck0Var.J, w7.y5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            p6Var = new org.telegram.ui.Cells.p6(0, this.f29192c, this.d, this.e, true, this.f29193f);
        }
        return new s4.c1(p6Var);
    }
}
