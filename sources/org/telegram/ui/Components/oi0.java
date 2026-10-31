package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class oi0 extends s4.g0 {
    public final int f29080c;
    public final Context d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final boolean f29081f;
    public final vi0 h;

    public oi0(vi0 vi0Var, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this.h = vi0Var;
        this.f29080c = i10;
        this.d = context;
        this.e = p6Var;
        this.f29081f = z10;
    }

    @Override
    public final int b() {
        int i10;
        vi0 vi0Var = this.h;
        int size = vi0Var.f31263n.size();
        if (!vi0Var.H.isEmpty() && !org.telegram.messenger.vp.r1(this.f29080c).A3()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int d(int i10) {
        if (i10 < this.h.f31263n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f47901f == 0) {
            ((org.telegram.ui.Cells.q6) c1Var.f47898a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f31263n.get(i10));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout q6Var;
        if (i10 != 0) {
            vi0 vi0Var = this.h;
            da0 da0Var = vi0Var.J;
            if (da0Var != null) {
                if (da0Var.getParent() != null) {
                    ((ViewGroup) vi0Var.J.getParent()).removeView(vi0Var.J);
                }
            } else {
                vi0Var.i();
            }
            Context context = this.d;
            q6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.a7.j(view, org.telegram.ui.ActionBar.a7.L(0.06f, org.telegram.ui.ActionBar.t6.E8), this.e);
            q6Var.addView(view, w7.b6.c(8.0f, -1));
            q6Var.addView(vi0Var.J, w7.b6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            q6Var = new org.telegram.ui.Cells.q6(0, this.f29080c, this.d, this.e, true, this.f29081f);
        }
        return new s4.c1(q6Var);
    }
}
