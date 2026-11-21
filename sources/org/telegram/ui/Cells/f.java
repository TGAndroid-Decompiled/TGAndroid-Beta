package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.q80;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.cx;
public final class f implements Runnable {
    public final int f30620a;
    public final Object f30621b;

    public f(Object obj, int i7) {
        this.f30620a = i7;
        this.f30621b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30620a) {
            case 0:
                g gVar = (g) this.f30621b;
                q80 q80Var = gVar.d;
                if (q80Var != null) {
                    gVar.h.F.n(q80Var, true);
                    return;
                }
                return;
            case 1:
                fj fjVar = (fj) this.f30621b;
                if (j21.j(fjVar)) {
                    j21.y(fjVar, false, null);
                    return;
                }
                return;
            case 2:
                m1 m1Var = ((z1) this.f30621b).f32529e;
                if (m1Var != null) {
                    m1Var.m();
                    return;
                }
                return;
            case 3:
                ((e2) this.f30621b).a();
                return;
            case 4:
                org.telegram.messenger.g0.v1(((bi.x8) this.f30621b).f30828b.getEditText());
                return;
            case 5:
                org.telegram.messenger.g0.v1(((l3) this.f30621b).d);
                return;
            case 6:
                ((s5) this.f30621b).f31781a.invalidate();
                return;
            case 7:
                h6 h6Var = (h6) this.f30621b;
                if (h6Var.getParent() instanceof ek0) {
                    ((ek0) h6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 8:
                ((p7) this.f30621b).h();
                return;
            case 9:
                w9 w9Var = (w9) this.f30621b;
                w9Var.C.invalidate();
                w9Var.T();
                return;
            case 10:
                ((w9) ((g9) this.f30621b).f30711c).T();
                return;
            case 11:
                ba baVar = (ba) this.f30621b;
                baVar.f30496y = -1;
                int i7 = 0;
                while (true) {
                    r1[] r1VarArr = baVar.f30491n;
                    if (i7 < r1VarArr.length) {
                        r1 r1Var = r1VarArr[i7];
                        if (r1Var != null) {
                            r1Var.invalidate();
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            case 12:
                gc.e();
                ((cx) this.f30621b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f30621b;
                w2Var.f30177c0 = true;
                w2Var.f30179d0 = true;
                return;
        }
    }
}
