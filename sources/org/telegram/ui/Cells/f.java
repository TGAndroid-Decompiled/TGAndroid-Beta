package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ay;
public final class f implements Runnable {
    public final int f21877a;
    public final Object f21878b;

    public f(Object obj, int i10) {
        this.f21877a = i10;
        this.f21878b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21877a) {
            case 0:
                g gVar = (g) this.f21878b;
                t80 t80Var = gVar.d;
                if (t80Var != null) {
                    gVar.h.E.n(t80Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((y1) this.f21878b).e;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 2:
                ((d2) this.f21878b).a();
                return;
            case 3:
                org.telegram.messenger.i0.v1(((ph.b4) this.f21878b).f22065b.getEditText());
                return;
            case 4:
                org.telegram.messenger.i0.v1(((m3) this.f21878b).d);
                return;
            case 5:
                k6 k6Var = (k6) this.f21878b;
                if (k6Var.getParent() instanceof tk0) {
                    ((tk0) k6Var.getParent()).getOnItemClickListener().f(RecyclerView.R(k6Var), k6Var);
                    return;
                } else {
                    k6Var.callOnClick();
                    return;
                }
            case 6:
                ((s7) this.f21878b).h();
                return;
            case 7:
                w9 w9Var = (w9) this.f21878b;
                w9Var.C.invalidate();
                w9Var.T();
                return;
            case 8:
                ((w9) ((h9) this.f21878b).f22006c).T();
                return;
            case 9:
                z9 z9Var = (z9) this.f21878b;
                z9Var.f23662y = -1;
                int i10 = 0;
                while (true) {
                    q1[] q1VarArr = z9Var.f23657n;
                    if (i10 < q1VarArr.length) {
                        q1 q1Var = q1VarArr[i10];
                        if (q1Var != null) {
                            q1Var.invalidate();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 10:
                wb.e();
                ((ay) this.f21878b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f21878b;
                z2Var.f21587b0 = true;
                z2Var.f21590c0 = true;
                return;
        }
    }
}
