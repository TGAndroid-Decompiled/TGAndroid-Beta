package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.q80;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.cx;
public final class f implements Runnable {
    public final int f30623a;
    public final Object f30624b;

    public f(Object obj, int i7) {
        this.f30623a = i7;
        this.f30624b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30623a) {
            case 0:
                g gVar = (g) this.f30624b;
                q80 q80Var = gVar.d;
                if (q80Var != null) {
                    gVar.h.F.n(q80Var, true);
                    return;
                }
                return;
            case 1:
                gj gjVar = (gj) this.f30624b;
                if (j21.k(gjVar)) {
                    j21.z(gjVar, false, null);
                    return;
                }
                return;
            case 2:
                m1 m1Var = ((z1) this.f30624b).f32532e;
                if (m1Var != null) {
                    m1Var.m();
                    return;
                }
                return;
            case 3:
                ((e2) this.f30624b).a();
                return;
            case 4:
                org.telegram.messenger.g0.v1(((bi.w8) this.f30624b).f30831b.getEditText());
                return;
            case 5:
                org.telegram.messenger.g0.v1(((l3) this.f30624b).d);
                return;
            case 6:
                ((s5) this.f30624b).f31784a.invalidate();
                return;
            case 7:
                h6 h6Var = (h6) this.f30624b;
                if (h6Var.getParent() instanceof ek0) {
                    ((ek0) h6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 8:
                ((p7) this.f30624b).h();
                return;
            case 9:
                w9 w9Var = (w9) this.f30624b;
                w9Var.C.invalidate();
                w9Var.T();
                return;
            case 10:
                ((w9) ((g9) this.f30624b).f30714c).T();
                return;
            case 11:
                ba baVar = (ba) this.f30624b;
                baVar.f30499y = -1;
                int i7 = 0;
                while (true) {
                    r1[] r1VarArr = baVar.f30494n;
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
                ((cx) this.f30624b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f30624b;
                w2Var.f30180c0 = true;
                w2Var.f30182d0 = true;
                return;
        }
    }
}
