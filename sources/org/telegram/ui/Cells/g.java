package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.qy;
public final class g implements Runnable {
    public final int f21042a;
    public final Object f21043b;

    public g(Object obj, int i10) {
        this.f21042a = i10;
        this.f21043b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21042a) {
            case 0:
                h hVar = (h) this.f21043b;
                j90 j90Var = hVar.d;
                if (j90Var != null) {
                    hVar.h.B.l(j90Var, true);
                    return;
                }
                return;
            case 1:
                j1 j1Var = ((t1) this.f21043b).e;
                if (j1Var != null) {
                    j1Var.j();
                    return;
                }
                return;
            case 2:
                ((z1) this.f21043b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((kh.y5) this.f21043b).f20986b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((h3) this.f21043b).f21132b);
                return;
            case 5:
                g6 g6Var = (g6) this.f21043b;
                if (g6Var.getParent() instanceof rl0) {
                    ((rl0) g6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(g6Var), g6Var);
                    return;
                } else {
                    g6Var.callOnClick();
                    return;
                }
            case 6:
                ((q7) this.f21043b).h();
                return;
            case 7:
                y9 y9Var = (y9) this.f21043b;
                y9Var.C.invalidate();
                y9Var.U();
                return;
            case 8:
                ((i9) this.f21043b).f21195b.U();
                return;
            case 9:
                da daVar = (da) this.f21043b;
                daVar.f20956s = -1;
                int i10 = 0;
                while (true) {
                    s1[] s1VarArr = daVar.e;
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
                ic.e();
                ((qy) this.f21043b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f21043b;
                g3Var.setCanDismissWithSwipe(true);
                g3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
