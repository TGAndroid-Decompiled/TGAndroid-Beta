package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.o80;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.cx;
public final class f implements Runnable {
    public final int f30592a;
    public final Object f30593b;

    public f(Object obj, int i7) {
        this.f30592a = i7;
        this.f30593b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30592a) {
            case 0:
                g gVar = (g) this.f30593b;
                o80 o80Var = gVar.d;
                if (o80Var != null) {
                    gVar.h.F.n(o80Var, true);
                    return;
                }
                return;
            case 1:
                fj fjVar = (fj) this.f30593b;
                if (g21.j(fjVar)) {
                    g21.x(fjVar, false, null);
                    return;
                }
                return;
            case 2:
                m1 m1Var = ((z1) this.f30593b).f32501e;
                if (m1Var != null) {
                    m1Var.m();
                    return;
                }
                return;
            case 3:
                ((e2) this.f30593b).a();
                return;
            case 4:
                org.telegram.messenger.g0.v1(((bi.t8) this.f30593b).f30800b.getEditText());
                return;
            case 5:
                org.telegram.messenger.g0.v1(((l3) this.f30593b).d);
                return;
            case 6:
                ((s5) this.f30593b).f31753a.invalidate();
                return;
            case 7:
                h6 h6Var = (h6) this.f30593b;
                if (h6Var.getParent() instanceof ck0) {
                    ((ck0) h6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 8:
                ((p7) this.f30593b).h();
                return;
            case 9:
                w9 w9Var = (w9) this.f30593b;
                w9Var.C.invalidate();
                w9Var.T();
                return;
            case 10:
                ((w9) ((g9) this.f30593b).f30683c).T();
                return;
            case 11:
                ba baVar = (ba) this.f30593b;
                baVar.f30468y = -1;
                int i7 = 0;
                while (true) {
                    r1[] r1VarArr = baVar.f30463n;
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
                ((cx) this.f30593b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f30593b;
                x2Var.f30194c0 = true;
                x2Var.f30196d0 = true;
                return;
        }
    }
}
