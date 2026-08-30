package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.oy;
public final class g implements Runnable {
    public final int f21076a;
    public final Object f21077b;

    public g(Object obj, int i10) {
        this.f21076a = i10;
        this.f21077b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21076a) {
            case 0:
                h hVar = (h) this.f21077b;
                i90 i90Var = hVar.d;
                if (i90Var != null) {
                    hVar.h.B.l(i90Var, true);
                    return;
                }
                return;
            case 1:
                k1 k1Var = ((u1) this.f21077b).e;
                if (k1Var != null) {
                    k1Var.j();
                    return;
                }
                return;
            case 2:
                ((a2) this.f21077b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((kh.z5) this.f21077b).f21050b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f21077b).f21199b);
                return;
            case 5:
                h6 h6Var = (h6) this.f21077b;
                if (h6Var.getParent() instanceof sl0) {
                    ((sl0) h6Var.getParent()).getOnItemClickListener().f(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 6:
                ((r7) this.f21077b).h();
                return;
            case 7:
                z9 z9Var = (z9) this.f21077b;
                z9Var.C.invalidate();
                z9Var.U();
                return;
            case 8:
                ((j9) this.f21077b).f21269b.U();
                return;
            case 9:
                ea eaVar = (ea) this.f21077b;
                eaVar.f21039s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = eaVar.e;
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
                ((oy) this.f21077b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f21077b;
                g3Var.setCanDismissWithSwipe(true);
                g3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
