package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.cy;
public final class g implements Runnable {
    public final int f22281a;
    public final Object f22282b;

    public g(Object obj, int i10) {
        this.f22281a = i10;
        this.f22282b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22281a) {
            case 0:
                h hVar = (h) this.f22282b;
                ba0 ba0Var = hVar.d;
                if (ba0Var != null) {
                    hVar.h.E.l(ba0Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f22282b).e;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 2:
                ((b2) this.f22282b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((yh.s4) this.f22282b).f22233b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f22282b).f22406b);
                return;
            case 5:
                h6 h6Var = (h6) this.f22282b;
                if (h6Var.getParent() instanceof jm0) {
                    ((jm0) h6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 6:
                ((s7) this.f22282b).h();
                return;
            case 7:
                aa aaVar = (aa) this.f22282b;
                aaVar.C.invalidate();
                aaVar.T();
                return;
            case 8:
                ((k9) this.f22282b).f22519b.T();
                return;
            case 9:
                fa faVar = (fa) this.f22282b;
                faVar.f22277s = -1;
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
                ((cy) this.f22282b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f22282b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
