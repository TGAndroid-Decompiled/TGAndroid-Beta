package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uy;
public final class g implements Runnable {
    public final int f20121a;
    public final Object f20122b;

    public g(Object obj, int i10) {
        this.f20121a = i10;
        this.f20122b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20121a) {
            case 0:
                h hVar = (h) this.f20122b;
                g90 g90Var = hVar.d;
                if (g90Var != null) {
                    hVar.h.E.l(g90Var, true);
                    return;
                }
                return;
            case 1:
                k1 k1Var = ((u1) this.f20122b).e;
                if (k1Var != null) {
                    k1Var.k();
                    return;
                }
                return;
            case 2:
                ((a2) this.f20122b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.t4) this.f20122b).f20064b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f20122b).f20229b);
                return;
            case 5:
                h6 h6Var = (h6) this.f20122b;
                if (h6Var.getParent() instanceof ll0) {
                    ((ll0) h6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f20122b).h();
                return;
            case 7:
                da daVar = (da) this.f20122b;
                daVar.C.invalidate();
                daVar.U();
                return;
            case 8:
                ((n9) this.f20122b).f20505b.U();
                return;
            case 9:
                ja jaVar = (ja) this.f20122b;
                jaVar.f20344s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = jaVar.e;
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
                oc.e();
                ((uy) this.f20122b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f20122b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
