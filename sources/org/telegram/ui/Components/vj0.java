package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class vj0 extends s4.h0 {
    public final int f29169c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final boolean f29170f;
    public final ck0 h;

    public vj0(ck0 ck0Var, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = ck0Var;
        this.f29169c = i10;
        this.d = context;
        this.e = e6Var;
        this.f29170f = z10;
    }

    @Override
    public final int h() {
        int i10;
        ck0 ck0Var = this.h;
        int size = ck0Var.f23351n.size();
        if (!ck0Var.H.isEmpty() && !MessagesController.getInstance(this.f29169c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f23351n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f43008f == 0) {
            ((org.telegram.ui.Cells.o6) c1Var.f43005a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f23351n.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            ck0 ck0Var = this.h;
            gb0 gb0Var = ck0Var.J;
            if (gb0Var != null) {
                if (gb0Var.getParent() != null) {
                    ((ViewGroup) ck0Var.J.getParent()).removeView(ck0Var.J);
                }
            } else {
                ck0Var.i();
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, this.e)));
            o6Var.addView(view, w7.y5.c(8.0f, -1));
            o6Var.addView(ck0Var.J, w7.y5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.f29169c, this.d, this.e, true, this.f29170f);
        }
        return new s4.c1(o6Var);
    }
}
