package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uy;
public final class g implements Runnable {
    public final int f22123a;
    public final Object f22124b;

    public g(Object obj, int i10) {
        this.f22123a = i10;
        this.f22124b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22123a) {
            case 0:
                h hVar = (h) this.f22124b;
                u90 u90Var = hVar.d;
                if (u90Var != null) {
                    hVar.h.E.l(u90Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f22124b).f23551e;
                if (l1Var != null) {
                    l1Var.l();
                    return;
                }
                return;
            case 2:
                ((b2) this.f22124b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.u4) this.f22124b).f22136b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.f22124b).f22315b);
                return;
            case 5:
                i6 i6Var = (i6) this.f22124b;
                if (i6Var.getParent() instanceof zl0) {
                    ((zl0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f22124b).h();
                return;
            case 7:
                da daVar = (da) this.f22124b;
                daVar.C.invalidate();
                daVar.U();
                return;
            case 8:
                ((n9) this.f22124b).f22565b.U();
                return;
            case 9:
                ia iaVar = (ia) this.f22124b;
                iaVar.f22294s = -1;
                int i10 = 0;
                while (true) {
                    u1[] u1VarArr = iaVar.f22290e;
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
                rc.e();
                ((uy) this.f22124b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f22124b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
