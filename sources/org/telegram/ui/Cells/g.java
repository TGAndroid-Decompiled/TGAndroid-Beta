package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ty;
public final class g implements Runnable {
    public final int f20319a;
    public final Object f20320b;

    public g(Object obj, int i10) {
        this.f20319a = i10;
        this.f20320b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20319a) {
            case 0:
                h hVar = (h) this.f20320b;
                t90 t90Var = hVar.d;
                if (t90Var != null) {
                    hVar.h.E.l(t90Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f20320b).e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 2:
                ((b2) this.f20320b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.v4) this.f20320b).f20330b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.f20320b).f20493b);
                return;
            case 5:
                i6 i6Var = (i6) this.f20320b;
                if (i6Var.getParent() instanceof yl0) {
                    ((yl0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.S(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f20320b).h();
                return;
            case 7:
                da daVar = (da) this.f20320b;
                daVar.C.invalidate();
                daVar.U();
                return;
            case 8:
                ((n9) this.f20320b).f20726b.U();
                return;
            case 9:
                ia iaVar = (ia) this.f20320b;
                iaVar.f20473s = -1;
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
                qc.e();
                ((ty) this.f20320b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f20320b;
                g3Var.setCanDismissWithSwipe(true);
                g3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
