package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.cy;
public final class g implements Runnable {
    public final int f24130a;
    public final Object f24131b;

    public g(Object obj, int i10) {
        this.f24130a = i10;
        this.f24131b = obj;
    }

    @Override
    public final void run() {
        switch (this.f24130a) {
            case 0:
                h hVar = (h) this.f24131b;
                da0 da0Var = hVar.d;
                if (da0Var != null) {
                    hVar.h.E.l(da0Var, true);
                    return;
                }
                return;
            case 1:
                j1 j1Var = ((t1) this.f24131b).e;
                if (j1Var != null) {
                    j1Var.j();
                    return;
                }
                return;
            case 2:
                ((z1) this.f24131b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((zh.t4) this.f24131b).f24001b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((g3) this.f24131b).d);
                return;
            case 5:
                m6 m6Var = (m6) this.f24131b;
                if (m6Var.getParent() instanceof mm0) {
                    ((mm0) m6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(m6Var), m6Var);
                    return;
                } else {
                    m6Var.callOnClick();
                    return;
                }
            case 6:
                ((w7) this.f24131b).h();
                return;
            case 7:
                fa faVar = (fa) this.f24131b;
                faVar.C.invalidate();
                faVar.T();
                return;
            case 8:
                ((p9) this.f24131b).f24781b.T();
                return;
            case 9:
                ka kaVar = (ka) this.f24131b;
                kaVar.f24365s = -1;
                int i10 = 0;
                while (true) {
                    s1[] s1VarArr = kaVar.e;
                    if (i10 < s1VarArr.length) {
                        s1 s1Var = s1VarArr[i10];
                        if (s1Var != null) {
                            s1Var.invalidate();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 10:
                qc.e();
                ((cy) this.f24131b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f24131b;
                k3Var.setCanDismissWithSwipe(true);
                k3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
