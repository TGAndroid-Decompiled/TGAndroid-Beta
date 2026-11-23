package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.n80;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.bx;
public final class f implements Runnable {
    public final int f30675a;
    public final Object f30676b;

    public f(Object obj, int i7) {
        this.f30675a = i7;
        this.f30676b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30675a) {
            case 0:
                g gVar = (g) this.f30676b;
                n80 n80Var = gVar.d;
                if (n80Var != null) {
                    gVar.h.F.n(n80Var, true);
                    return;
                }
                return;
            case 1:
                fj fjVar = (fj) this.f30676b;
                if (i21.k(fjVar)) {
                    i21.z(fjVar, false, null);
                    return;
                }
                return;
            case 2:
                m1 m1Var = ((z1) this.f30676b).f32586e;
                if (m1Var != null) {
                    m1Var.p();
                    return;
                }
                return;
            case 3:
                ((e2) this.f30676b).a();
                return;
            case 4:
                org.telegram.messenger.g0.v1(((bi.z8) this.f30676b).f30887b.getEditText());
                return;
            case 5:
                org.telegram.messenger.g0.v1(((l3) this.f30676b).d);
                return;
            case 6:
                ((r5) this.f30676b).f31783a.invalidate();
                return;
            case 7:
                g6 g6Var = (g6) this.f30676b;
                if (g6Var.getParent() instanceof ek0) {
                    ((ek0) g6Var.getParent()).getOnItemClickListener().b(RecyclerView.R(g6Var), g6Var);
                    return;
                } else {
                    g6Var.callOnClick();
                    return;
                }
            case 8:
                ((o7) this.f30676b).h();
                return;
            case 9:
                v9 v9Var = (v9) this.f30676b;
                v9Var.C.invalidate();
                v9Var.T();
                return;
            case 10:
                ((v9) ((f9) this.f30676b).f30711c).T();
                return;
            case 11:
                ba baVar = (ba) this.f30676b;
                baVar.f30550y = -1;
                int i7 = 0;
                while (true) {
                    r1[] r1VarArr = baVar.f30545n;
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
                fc.e();
                ((bx) this.f30676b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f30676b;
                w2Var.f30230c0 = true;
                w2Var.f30232d0 = true;
                return;
        }
    }
}
