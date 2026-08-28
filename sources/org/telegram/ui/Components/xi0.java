package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xi0 extends f2.r0 {
    public final int f34683c;
    public final Context d;
    public final org.telegram.ui.ActionBar.b6 f34684e;
    public final boolean f34685f;
    public final ej0 h;

    public xi0(ej0 ej0Var, int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        this.h = ej0Var;
        this.f34683c = i9;
        this.d = context;
        this.f34684e = b6Var;
        this.f34685f = z10;
    }

    @Override
    public final int h() {
        int i9;
        ej0 ej0Var = this.h;
        int size = ej0Var.f28042n.size();
        if (!ej0Var.D.isEmpty() && !MessagesController.getInstance(this.f34683c).premiumFeaturesBlocked()) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        return size + i9;
    }

    @Override
    public final int j(int i9) {
        if (i9 < this.h.f28042n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f5505f == 0) {
            ((org.telegram.ui.Cells.n6) q1Var.f5501a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f28042n.get(i9));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout n6Var;
        if (i9 != 0) {
            ej0 ej0Var = this.h;
            ca0 ca0Var = ej0Var.F;
            if (ca0Var != null) {
                if (ca0Var.getParent() != null) {
                    ((ViewGroup) ej0Var.F.getParent()).removeView(ej0Var.F);
                }
            } else {
                ej0Var.i();
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, this.f34684e)));
            n6Var.addView(view, g7.e6.c(8.0f, -1));
            n6Var.addView(ej0Var.F, g7.e6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.f34683c, this.d, this.f34684e, true, this.f34685f);
        }
        return new f2.q1(n6Var);
    }
}
