package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.wy;
public final class g implements Runnable {
    public final int f19174a;
    public final Object f19175b;

    public g(Object obj, int i10) {
        this.f19174a = i10;
        this.f19175b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19174a) {
            case 0:
                h hVar = (h) this.f19175b;
                q90 q90Var = hVar.d;
                if (q90Var != null) {
                    hVar.h.E.l(q90Var, true);
                    return;
                }
                return;
            case 1:
                k1 k1Var = ((u1) this.f19175b).e;
                if (k1Var != null) {
                    k1Var.j();
                    return;
                }
                return;
            case 2:
                ((a2) this.f19175b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((wh.t4) this.f19175b).f19109b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f19175b).f19293b);
                return;
            case 5:
                j6 j6Var = (j6) this.f19175b;
                if (j6Var.getParent() instanceof vl0) {
                    ((vl0) j6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(j6Var), j6Var);
                    return;
                } else {
                    j6Var.callOnClick();
                    return;
                }
            case 6:
                ((u7) this.f19175b).h();
                return;
            case 7:
                fa faVar = (fa) this.f19175b;
                faVar.C.invalidate();
                faVar.U();
                return;
            case 8:
                ((p9) this.f19175b).f19694b.U();
                return;
            case 9:
                ka kaVar = (ka) this.f19175b;
                kaVar.f19459s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = kaVar.e;
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
                pc.e();
                ((wy) this.f19175b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f19175b;
                h3Var.setCanDismissWithSwipe(true);
                h3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
