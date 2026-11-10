package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.zw;
public final class f implements Runnable {
    public final int f29100a;
    public final Object f29101b;

    public f(Object obj, int i7) {
        this.f29100a = i7;
        this.f29101b = obj;
    }

    @Override
    public final void run() {
        switch (this.f29100a) {
            case 0:
                g gVar = (g) this.f29101b;
                a80 a80Var = gVar.d;
                if (a80Var != null) {
                    gVar.h.E.n(a80Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((y1) this.f29101b).f30933e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 2:
                ((d2) this.f29101b).a();
                return;
            case 3:
                org.telegram.messenger.g0.v1(((zh.w3) this.f29101b).f29267b.getEditText());
                return;
            case 4:
                org.telegram.messenger.g0.v1(((k3) this.f29101b).d);
                return;
            case 5:
                ((q5) this.f29101b).f30147a.invalidate();
                return;
            case 6:
                g6 g6Var = (g6) this.f29101b;
                if (g6Var.getParent() instanceof pj0) {
                    ((pj0) g6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(g6Var), g6Var);
                    return;
                } else {
                    g6Var.callOnClick();
                    return;
                }
            case 7:
                ((o7) this.f29101b).h();
                return;
            case 8:
                v9 v9Var = (v9) this.f29101b;
                v9Var.C.invalidate();
                v9Var.T();
                return;
            case 9:
                ((v9) ((f9) this.f29101b).f29149c).T();
                return;
            case 10:
                z9 z9Var = (z9) this.f29101b;
                z9Var.f31018y = -1;
                int i7 = 0;
                while (true) {
                    q1[] q1VarArr = z9Var.f31013n;
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
                bc.e();
                ((zw) this.f29101b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f29101b;
                w2Var.f28673b0 = true;
                w2Var.f28676c0 = true;
                return;
        }
    }
}
