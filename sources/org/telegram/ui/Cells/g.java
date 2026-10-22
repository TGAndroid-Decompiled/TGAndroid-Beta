package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.cy;
public final class g implements Runnable {
    public final int f22280a;
    public final Object f22281b;

    public g(Object obj, int i10) {
        this.f22280a = i10;
        this.f22281b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22280a) {
            case 0:
                h hVar = (h) this.f22281b;
                ba0 ba0Var = hVar.d;
                if (ba0Var != null) {
                    hVar.h.E.l(ba0Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f22281b).e;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 2:
                ((b2) this.f22281b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((yh.s4) this.f22281b).f22232b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f22281b).f22405b);
                return;
            case 5:
                h6 h6Var = (h6) this.f22281b;
                if (h6Var.getParent() instanceof jm0) {
                    ((jm0) h6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 6:
                ((s7) this.f22281b).h();
                return;
            case 7:
                aa aaVar = (aa) this.f22281b;
                aaVar.C.invalidate();
                aaVar.T();
                return;
            case 8:
                ((k9) this.f22281b).f22518b.T();
                return;
            case 9:
                fa faVar = (fa) this.f22281b;
                faVar.f22276s = -1;
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
                ((cy) this.f22281b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f22281b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
