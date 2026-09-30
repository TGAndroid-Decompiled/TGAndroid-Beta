package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.qy;
public final class g implements Runnable {
    public final int f20334a;
    public final Object f20335b;

    public g(Object obj, int i10) {
        this.f20334a = i10;
        this.f20335b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20334a) {
            case 0:
                h hVar = (h) this.f20335b;
                u90 u90Var = hVar.d;
                if (u90Var != null) {
                    hVar.h.E.l(u90Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f20335b).e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 2:
                ((b2) this.f20335b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.u4) this.f20335b).f20345b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.f20335b).f20508b);
                return;
            case 5:
                i6 i6Var = (i6) this.f20335b;
                if (i6Var.getParent() instanceof zl0) {
                    ((zl0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f20335b).h();
                return;
            case 7:
                da daVar = (da) this.f20335b;
                daVar.C.invalidate();
                daVar.U();
                return;
            case 8:
                ((n9) this.f20335b).f20741b.U();
                return;
            case 9:
                ia iaVar = (ia) this.f20335b;
                iaVar.f20488s = -1;
                int i10 = 0;
                while (true) {
                    u1[] u1VarArr = iaVar.e;
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
                ((qy) this.f20335b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f20335b;
                e3Var.setCanDismissWithSwipe(true);
                e3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
