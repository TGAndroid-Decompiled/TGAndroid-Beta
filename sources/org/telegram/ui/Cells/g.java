package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.py;
public final class g implements Runnable {
    public final int f22822a;
    public final Object f22823b;

    public g(Object obj, int i10) {
        this.f22822a = i10;
        this.f22823b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22822a) {
            case 0:
                h hVar = (h) this.f22823b;
                k90 k90Var = hVar.d;
                if (k90Var != null) {
                    hVar.h.B.l(k90Var, true);
                    return;
                }
                return;
            case 1:
                k1 k1Var = ((u1) this.f22823b).f24189e;
                if (k1Var != null) {
                    k1Var.j();
                    return;
                }
                return;
            case 2:
                ((a2) this.f22823b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((lh.z5) this.f22823b).f22793b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f22823b).f22955b);
                return;
            case 5:
                h6 h6Var = (h6) this.f22823b;
                if (h6Var.getParent() instanceof tl0) {
                    ((tl0) h6Var.getParent()).getOnItemClickListener().f(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 6:
                ((r7) this.f22823b).h();
                return;
            case 7:
                z9 z9Var = (z9) this.f22823b;
                z9Var.C.invalidate();
                z9Var.U();
                return;
            case 8:
                ((j9) this.f22823b).f23031b.U();
                return;
            case 9:
                ea eaVar = (ea) this.f22823b;
                eaVar.f22782s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = eaVar.f22778e;
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
                ic.e();
                ((py) this.f22823b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f22823b;
                h3Var.setCanDismissWithSwipe(true);
                h3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
