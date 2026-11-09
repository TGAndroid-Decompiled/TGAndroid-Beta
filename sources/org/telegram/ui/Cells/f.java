package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.yw;
public final class f implements Runnable {
    public final int f29089a;
    public final Object f29090b;

    public f(Object obj, int i7) {
        this.f29089a = i7;
        this.f29090b = obj;
    }

    @Override
    public final void run() {
        switch (this.f29089a) {
            case 0:
                g gVar = (g) this.f29090b;
                b80 b80Var = gVar.d;
                if (b80Var != null) {
                    gVar.h.E.n(b80Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((y1) this.f29090b).f30922e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 2:
                ((d2) this.f29090b).a();
                return;
            case 3:
                org.telegram.messenger.g0.v1(((zh.w3) this.f29090b).f29256b.getEditText());
                return;
            case 4:
                org.telegram.messenger.g0.v1(((k3) this.f29090b).d);
                return;
            case 5:
                ((q5) this.f29090b).f30136a.invalidate();
                return;
            case 6:
                g6 g6Var = (g6) this.f29090b;
                if (g6Var.getParent() instanceof qj0) {
                    ((qj0) g6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(g6Var), g6Var);
                    return;
                } else {
                    g6Var.callOnClick();
                    return;
                }
            case 7:
                ((o7) this.f29090b).h();
                return;
            case 8:
                v9 v9Var = (v9) this.f29090b;
                v9Var.C.invalidate();
                v9Var.T();
                return;
            case 9:
                ((v9) ((f9) this.f29090b).f29138c).T();
                return;
            case 10:
                z9 z9Var = (z9) this.f29090b;
                z9Var.f31007y = -1;
                int i7 = 0;
                while (true) {
                    q1[] q1VarArr = z9Var.f31002n;
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
                ((yw) this.f29090b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f29090b;
                v2Var.f28625b0 = true;
                v2Var.f28628c0 = true;
                return;
        }
    }
}
