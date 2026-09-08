package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uy;
public final class g implements Runnable {
    public final int f21983a;
    public final Object f21984b;

    public g(Object obj, int i10) {
        this.f21983a = i10;
        this.f21984b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21983a) {
            case 0:
                h hVar = (h) this.f21984b;
                h90 h90Var = hVar.d;
                if (h90Var != null) {
                    hVar.h.E.l(h90Var, true);
                    return;
                }
                return;
            case 1:
                k1 k1Var = ((u1) this.f21984b).f23340e;
                if (k1Var != null) {
                    k1Var.j();
                    return;
                }
                return;
            case 2:
                ((a2) this.f21984b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((yh.s4) this.f21984b).f21927b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f21984b).f22101b);
                return;
            case 5:
                h6 h6Var = (h6) this.f21984b;
                if (h6Var.getParent() instanceof ll0) {
                    ((ll0) h6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(h6Var), h6Var);
                    return;
                } else {
                    h6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f21984b).h();
                return;
            case 7:
                da daVar = (da) this.f21984b;
                daVar.C.invalidate();
                daVar.U();
                return;
            case 8:
                ((n9) this.f21984b).f22397b.U();
                return;
            case 9:
                ia iaVar = (ia) this.f21984b;
                iaVar.f22162s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = iaVar.f22158e;
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
                ((uy) this.f21984b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f21984b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
