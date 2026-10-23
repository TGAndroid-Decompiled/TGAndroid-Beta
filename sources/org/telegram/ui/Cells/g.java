package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ey;
public final class g implements Runnable {
    public final int f22384a;
    public final Object f22385b;

    public g(Object obj, int i10) {
        this.f22384a = i10;
        this.f22385b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22384a) {
            case 0:
                h hVar = (h) this.f22385b;
                ca0 ca0Var = hVar.d;
                if (ca0Var != null) {
                    hVar.h.E.l(ca0Var, true);
                    return;
                }
                return;
            case 1:
                k1 k1Var = ((u1) this.f22385b).e;
                if (k1Var != null) {
                    k1Var.j();
                    return;
                }
                return;
            case 2:
                ((a2) this.f22385b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((yh.s4) this.f22385b).f22315b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((h3) this.f22385b).d);
                return;
            case 5:
                i6 i6Var = (i6) this.f22385b;
                if (i6Var.getParent() instanceof mm0) {
                    ((mm0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((s7) this.f22385b).h();
                return;
            case 7:
                ba baVar = (ba) this.f22385b;
                baVar.C.invalidate();
                baVar.T();
                return;
            case 8:
                ((l9) this.f22385b).f22695b.T();
                return;
            case 9:
                ga gaVar = (ga) this.f22385b;
                gaVar.f22440s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = gaVar.e;
                    if (i10 < t1VarArr.length) {
                        t1 t1Var = t1VarArr[i10];
                        if (t1Var != null) {
                            t1Var.invalidate();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 10:
                qc.e();
                ((ey) this.f22385b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f22385b;
                h3Var.setCanDismissWithSwipe(true);
                h3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
