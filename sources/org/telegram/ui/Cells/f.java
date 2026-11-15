package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.xb;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.yw;
public final class f implements Runnable {
    public final int f30195a;
    public final Object f30196b;

    public f(Object obj, int i7) {
        this.f30195a = i7;
        this.f30196b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30195a) {
            case 0:
                g gVar = (g) this.f30196b;
                d80 d80Var = gVar.d;
                if (d80Var != null) {
                    gVar.h.F.o(d80Var, true);
                    return;
                }
                return;
            case 1:
                gj gjVar = (gj) this.f30196b;
                if (x11.j(gjVar)) {
                    x11.x(gjVar, false, null);
                    return;
                }
                return;
            case 2:
                l1 l1Var = ((y1) this.f30196b).f32052e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 3:
                ((d2) this.f30196b).a();
                return;
            case 4:
                org.telegram.messenger.g0.v1(((bi.o6) this.f30196b).f30375b.getEditText());
                return;
            case 5:
                org.telegram.messenger.g0.v1(((k3) this.f30196b).d);
                return;
            case 6:
                ((q5) this.f30196b).f31280a.invalidate();
                return;
            case 7:
                f6 f6Var = (f6) this.f30196b;
                if (f6Var.getParent() instanceof uj0) {
                    ((uj0) f6Var.getParent()).getOnItemClickListener().b(RecyclerView.R(f6Var), f6Var);
                    return;
                } else {
                    f6Var.callOnClick();
                    return;
                }
            case 8:
                ((n7) this.f30196b).h();
                return;
            case 9:
                u9 u9Var = (u9) this.f30196b;
                u9Var.C.invalidate();
                u9Var.T();
                return;
            case 10:
                ((u9) ((e9) this.f30196b).f30191c).T();
                return;
            case 11:
                z9 z9Var = (z9) this.f30196b;
                z9Var.f32141y = -1;
                int i7 = 0;
                while (true) {
                    q1[] q1VarArr = z9Var.f32136n;
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
                xb.e();
                ((yw) this.f30196b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f30196b;
                u2Var.f29686c0 = true;
                u2Var.f29688d0 = true;
                return;
        }
    }
}
