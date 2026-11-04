package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uw;
public final class f implements Runnable {
    public final int f29139a;
    public final Object f29140b;

    public f(Object obj, int i3) {
        this.f29139a = i3;
        this.f29140b = obj;
    }

    @Override
    public final void run() {
        switch (this.f29139a) {
            case 0:
                g gVar = (g) this.f29140b;
                w70 w70Var = gVar.d;
                if (w70Var != null) {
                    gVar.h.F.n(w70Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((y1) this.f29140b).f30977e;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 2:
                ((d2) this.f29140b).a();
                return;
            case 3:
                org.telegram.messenger.g0.v1(((ai.x6) this.f29140b).f29316b.getEditText());
                return;
            case 4:
                org.telegram.messenger.g0.v1(((k3) this.f29140b).d);
                return;
            case 5:
                ((q5) this.f29140b).f30204a.invalidate();
                return;
            case 6:
                f6 f6Var = (f6) this.f29140b;
                if (f6Var.getParent() instanceof tj0) {
                    ((tj0) f6Var.getParent()).getOnItemClickListener().f(RecyclerView.R(f6Var), f6Var);
                    return;
                } else {
                    f6Var.callOnClick();
                    return;
                }
            case 7:
                ((n7) this.f29140b).h();
                return;
            case 8:
                u9 u9Var = (u9) this.f29140b;
                u9Var.C.invalidate();
                u9Var.T();
                return;
            case 9:
                ((u9) ((e9) this.f29140b).f29135c).T();
                return;
            case 10:
                z9 z9Var = (z9) this.f29140b;
                z9Var.f31071y = -1;
                int i3 = 0;
                while (true) {
                    q1[] q1VarArr = z9Var.f31066n;
                    if (i3 < q1VarArr.length) {
                        q1 q1Var = q1VarArr[i3];
                        if (q1Var != null) {
                            q1Var.invalidate();
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            case 11:
                ac.e();
                ((uw) this.f29140b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f29140b;
                t2Var.f28590c0 = true;
                t2Var.f28592d0 = true;
                return;
        }
    }
}
