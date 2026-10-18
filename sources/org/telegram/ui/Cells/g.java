package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ey;
public final class g implements Runnable {
    public final int f22273a;
    public final Object f22274b;

    public g(Object obj, int i10) {
        this.f22273a = i10;
        this.f22274b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22273a) {
            case 0:
                h hVar = (h) this.f22274b;
                ba0 ba0Var = hVar.d;
                if (ba0Var != null) {
                    hVar.h.E.l(ba0Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f22274b).e;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 2:
                ((b2) this.f22274b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((yh.s4) this.f22274b).f22225b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f22274b).f22398b);
                return;
            case 5:
                h6 h6Var = (h6) this.f22274b;
                if (h6Var.getParent() instanceof im0) {
                    ((im0) h6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 6:
                ((s7) this.f22274b).h();
                return;
            case 7:
                aa aaVar = (aa) this.f22274b;
                aaVar.C.invalidate();
                aaVar.T();
                return;
            case 8:
                ((k9) this.f22274b).f22511b.T();
                return;
            case 9:
                fa faVar = (fa) this.f22274b;
                faVar.f22269s = -1;
                int i10 = 0;
                while (true) {
                    u1[] u1VarArr = faVar.e;
                    if (i10 < u1VarArr.length) {
                        u1 u1Var = u1VarArr[i10];
                        if (u1Var != null) {
                            u1Var.invalidate();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 10:
                qc.e();
                ((ey) this.f22274b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f22274b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
