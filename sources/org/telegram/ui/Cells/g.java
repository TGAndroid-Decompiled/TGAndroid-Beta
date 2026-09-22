package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uy;
public final class g implements Runnable {
    public final int f20333a;
    public final Object f20334b;

    public g(Object obj, int i10) {
        this.f20333a = i10;
        this.f20334b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20333a) {
            case 0:
                h hVar = (h) this.f20334b;
                r90 r90Var = hVar.d;
                if (r90Var != null) {
                    hVar.h.E.l(r90Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f20334b).e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 2:
                ((b2) this.f20334b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.u4) this.f20334b).f20386b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((k3) this.f20334b).f20542b);
                return;
            case 5:
                j6 j6Var = (j6) this.f20334b;
                if (j6Var.getParent() instanceof yl0) {
                    ((yl0) j6Var.getParent()).getOnItemClickListener().d(RecyclerView.S(j6Var), j6Var);
                    return;
                } else {
                    j6Var.callOnClick();
                    return;
                }
            case 6:
                ((u7) this.f20334b).h();
                return;
            case 7:
                ea eaVar = (ea) this.f20334b;
                eaVar.C.invalidate();
                eaVar.U();
                return;
            case 8:
                ((o9) this.f20334b).f20796b.U();
                return;
            case 9:
                ja jaVar = (ja) this.f20334b;
                jaVar.f20528s = -1;
                int i10 = 0;
                while (true) {
                    u1[] u1VarArr = jaVar.e;
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
                pc.e();
                ((uy) this.f20334b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f20334b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
