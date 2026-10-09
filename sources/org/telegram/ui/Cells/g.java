package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ty;
public final class g implements Runnable {
    public final int f22101a;
    public final Object f22102b;

    public g(Object obj, int i10) {
        this.f22101a = i10;
        this.f22102b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22101a) {
            case 0:
                h hVar = (h) this.f22102b;
                ia0 ia0Var = hVar.d;
                if (ia0Var != null) {
                    hVar.h.E.l(ia0Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f22102b).f23533e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 2:
                ((b2) this.f22102b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.u4) this.f22102b).f22114b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.f22102b).f22297b);
                return;
            case 5:
                i6 i6Var = (i6) this.f22102b;
                if (i6Var.getParent() instanceof qm0) {
                    ((qm0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f22102b).h();
                return;
            case 7:
                ba baVar = (ba) this.f22102b;
                baVar.C.invalidate();
                baVar.T();
                return;
            case 8:
                ((l9) this.f22102b).f22430b.T();
                return;
            case 9:
                ga gaVar = (ga) this.f22102b;
                gaVar.f22171s = -1;
                int i10 = 0;
                while (true) {
                    u1[] u1VarArr = gaVar.f22167e;
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
                tc.e();
                ((ty) this.f22102b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f22102b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
