package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ww;
public final class f implements Runnable {
    public final int f29082a;
    public final Object f29083b;

    public f(Object obj, int i7) {
        this.f29082a = i7;
        this.f29083b = obj;
    }

    @Override
    public final void run() {
        switch (this.f29082a) {
            case 0:
                g gVar = (g) this.f29083b;
                a80 a80Var = gVar.d;
                if (a80Var != null) {
                    gVar.h.E.n(a80Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((y1) this.f29083b).f30913e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 2:
                ((d2) this.f29083b).a();
                return;
            case 3:
                org.telegram.messenger.g0.v1(((zh.w3) this.f29083b).f29249b.getEditText());
                return;
            case 4:
                org.telegram.messenger.g0.v1(((k3) this.f29083b).d);
                return;
            case 5:
                ((q5) this.f29083b).f30128a.invalidate();
                return;
            case 6:
                g6 g6Var = (g6) this.f29083b;
                if (g6Var.getParent() instanceof pj0) {
                    ((pj0) g6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(g6Var), g6Var);
                    return;
                } else {
                    g6Var.callOnClick();
                    return;
                }
            case 7:
                ((o7) this.f29083b).h();
                return;
            case 8:
                v9 v9Var = (v9) this.f29083b;
                v9Var.C.invalidate();
                v9Var.T();
                return;
            case 9:
                ((v9) ((f9) this.f29083b).f29131c).T();
                return;
            case 10:
                z9 z9Var = (z9) this.f29083b;
                z9Var.f30998y = -1;
                int i7 = 0;
                while (true) {
                    q1[] q1VarArr = z9Var.f30993n;
                    if (i7 < q1VarArr.length) {
                        q1 q1Var = q1VarArr[i7];
                        if (q1Var != null) {
                            q1Var.invalidate();
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            case 11:
                cc.e();
                ((ww) this.f29083b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f29083b;
                v2Var.f28617b0 = true;
                v2Var.f28620c0 = true;
                return;
        }
    }
}
