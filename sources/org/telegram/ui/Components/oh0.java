package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class oh0 extends v4.h0 {
    public final int f37956c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f37957e;
    public final boolean f37958f;
    public final vh0 h;

    public oh0(vh0 vh0Var, int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = vh0Var;
        this.f37956c = i7;
        this.d = context;
        this.f37957e = e6Var;
        this.f37958f = z10;
    }

    @Override
    public final int b() {
        int i7;
        vh0 vh0Var = this.h;
        int size = vh0Var.f40418n.size();
        if (!vh0Var.I.isEmpty() && !org.telegram.messenger.np.s1(this.f37956c).D3()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return size + i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.h.f40418n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        if (e1Var.f58539f == 0) {
            ((org.telegram.ui.Cells.l6) e1Var.f58535a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f40418n.get(i7));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout l6Var;
        if (i7 != 0) {
            vh0 vh0Var = this.h;
            n90 n90Var = vh0Var.K;
            if (n90Var != null) {
                if (n90Var.getParent() != null) {
                    ((ViewGroup) vh0Var.K.getParent()).removeView(vh0Var.K);
                }
            } else {
                vh0Var.i();
            }
            Context context = this.d;
            l6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.q6.i(view, org.telegram.ui.ActionBar.q6.K(0.06f, org.telegram.ui.ActionBar.j6.E8), this.f37957e);
            l6Var.addView(view, c8.ja.c(8.0f, -1));
            l6Var.addView(vh0Var.K, c8.ja.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            l6Var = new org.telegram.ui.Cells.l6(0, this.f37956c, this.d, this.f37957e, true, this.f37958f);
        }
        return new v4.e1(l6Var);
    }
}
