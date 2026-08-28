package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.dy;
public final class g implements Runnable {
    public final int f24361a;
    public final Object f24362b;

    public g(Object obj, int i9) {
        this.f24361a = i9;
        this.f24362b = obj;
    }

    @Override
    public final void run() {
        switch (this.f24361a) {
            case 0:
                h hVar = (h) this.f24362b;
                p80 p80Var = hVar.d;
                if (p80Var != null) {
                    hVar.h.A.l(p80Var, true);
                    return;
                }
                return;
            case 1:
                k1 k1Var = ((u1) this.f24362b).f25730e;
                if (k1Var != null) {
                    k1Var.m();
                    return;
                }
                return;
            case 2:
                ((a2) this.f24362b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((fh.p6) this.f24362b).f24373b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.f24362b).f24544b);
                return;
            case 5:
                h6 h6Var = (h6) this.f24362b;
                if (h6Var.getParent() instanceof wk0) {
                    ((wk0) h6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 6:
                ((r7) this.f24362b).h();
                return;
            case 7:
                aa aaVar = (aa) this.f24362b;
                aaVar.C.invalidate();
                aaVar.U();
                return;
            case 8:
                ((k9) this.f24362b).f24628b.U();
                return;
            case 9:
                fa faVar = (fa) this.f24362b;
                faVar.f24357s = -1;
                int i9 = 0;
                while (true) {
                    t1[] t1VarArr = faVar.f24353e;
                    if (i9 < t1VarArr.length) {
                        t1 t1Var = t1VarArr[i9];
                        if (t1Var != null) {
                            t1Var.invalidate();
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
            case 10:
                gc.e();
                ((dy) this.f24362b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24362b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
