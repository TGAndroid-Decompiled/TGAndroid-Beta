package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class zi0 extends f2.q0 {

    public final int f35246c;
    public final Context d;

    public final org.telegram.ui.ActionBar.c6 f35247e;

    public final boolean f35248f;
    public final gj0 h;

    public zi0(gj0 gj0Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.h = gj0Var;
        this.f35246c = i10;
        this.d = context;
        this.f35247e = c6Var;
        this.f35248f = z10;
    }

    @Override
    public final int h() {
        gj0 gj0Var = this.h;
        return gj0Var.f28728n.size() + ((gj0Var.D.isEmpty() || MessagesController.getInstance(this.f35246c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override
    public final int j(int i10) {
        return i10 < this.h.f28728n.size() ? 0 : 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f == 0) {
            ((org.telegram.ui.Cells.k6) o1Var.f5789a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f28728n.get(i10));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout k6Var;
        if (i10 != 0) {
            gj0 gj0Var = this.h;
            ga0 ga0Var = gj0Var.F;
            if (ga0Var == null) {
                gj0Var.i();
            } else if (ga0Var.getParent() != null) {
                ((ViewGroup) gj0Var.F.getParent()).removeView(gj0Var.F);
            }
            Context context = this.d;
            k6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, this.f35247e)));
            k6Var.addView(view, h7.z5.c(8.0f, -1));
            k6Var.addView(gj0Var.F, h7.z5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            k6Var = new org.telegram.ui.Cells.k6(0, this.f35246c, this.d, this.f35247e, true, this.f35248f);
        }
        return new lk0(k6Var);
    }
}
