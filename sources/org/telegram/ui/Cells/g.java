package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uy;
public final class g implements Runnable {
    public final int f20102a;
    public final Object f20103b;

    public g(Object obj, int i10) {
        this.f20102a = i10;
        this.f20103b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20102a) {
            case 0:
                h hVar = (h) this.f20103b;
                g90 g90Var = hVar.d;
                if (g90Var != null) {
                    hVar.h.E.l(g90Var, true);
                    return;
                }
                return;
            case 1:
                k1 k1Var = ((u1) this.f20103b).e;
                if (k1Var != null) {
                    k1Var.k();
                    return;
                }
                return;
            case 2:
                ((a2) this.f20103b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.t4) this.f20103b).f20058b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f20103b).f20190b);
                return;
            case 5:
                i6 i6Var = (i6) this.f20103b;
                if (i6Var.getParent() instanceof ll0) {
                    ((ll0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f20103b).h();
                return;
            case 7:
                da daVar = (da) this.f20103b;
                daVar.C.invalidate();
                daVar.U();
                return;
            case 8:
                ((n9) this.f20103b).f20494b.U();
                return;
            case 9:
                ja jaVar = (ja) this.f20103b;
                jaVar.f20319s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = jaVar.e;
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
                oc.e();
                ((uy) this.f20103b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f20103b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
