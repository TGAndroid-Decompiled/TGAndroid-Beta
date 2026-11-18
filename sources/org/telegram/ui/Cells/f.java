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
    public final int f30577a;
    public final Object f30578b;

    public f(Object obj, int i7) {
        this.f30577a = i7;
        this.f30578b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30577a) {
            case 0:
                g gVar = (g) this.f30578b;
                o80 o80Var = gVar.d;
                if (o80Var != null) {
                    gVar.h.F.n(o80Var, true);
                    return;
                }
                return;
            case 1:
                fj fjVar = (fj) this.f30578b;
                if (g21.j(fjVar)) {
                    g21.x(fjVar, false, null);
                    return;
                }
                return;
            case 2:
                l1 l1Var = ((y1) this.f30578b).f32450e;
                if (l1Var != null) {
                    l1Var.m();
                    return;
                }
                return;
            case 3:
                ((d2) this.f30578b).a();
                return;
            case 4:
                org.telegram.messenger.g0.v1(((bi.u8) this.f30578b).f30752b.getEditText());
                return;
            case 5:
                org.telegram.messenger.g0.v1(((k3) this.f30578b).d);
                return;
            case 6:
                ((r5) this.f30578b).f31700a.invalidate();
                return;
            case 7:
                g6 g6Var = (g6) this.f30578b;
                if (g6Var.getParent() instanceof ck0) {
                    ((ck0) g6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(g6Var), g6Var);
                    return;
                } else {
                    g6Var.callOnClick();
                    return;
                }
            case 8:
                ((o7) this.f30578b).h();
                return;
            case 9:
                v9 v9Var = (v9) this.f30578b;
                v9Var.C.invalidate();
                v9Var.T();
                return;
            case 10:
                ((v9) ((f9) this.f30578b).f30624c).T();
                return;
            case 11:
                aa aaVar = (aa) this.f30578b;
                aaVar.f30409y = -1;
                int i7 = 0;
                while (true) {
                    q1[] q1VarArr = aaVar.f30404n;
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
            case 12:
                gc.e();
                ((cx) this.f30578b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f30578b;
                x2Var.f30196c0 = true;
                x2Var.f30198d0 = true;
                return;
        }
    }
}
