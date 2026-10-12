package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.vy;
public final class g implements Runnable {
    public final int f21873a;
    public final Object f21874b;

    public g(Object obj, int i10) {
        this.f21873a = i10;
        this.f21874b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21873a) {
            case 0:
                h hVar = (h) this.f21874b;
                ma0 ma0Var = hVar.d;
                if (ma0Var != null) {
                    hVar.h.E.l(ma0Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f21874b).f23305e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 2:
                ((b2) this.f21874b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.t4) this.f21874b).f21886b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.f21874b).f22080b);
                return;
            case 5:
                i6 i6Var = (i6) this.f21874b;
                if (i6Var.getParent() instanceof wm0) {
                    ((wm0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f21874b).h();
                return;
            case 7:
                ba baVar = (ba) this.f21874b;
                baVar.C.invalidate();
                baVar.T();
                return;
            case 8:
                ((l9) this.f21874b).f22193b.T();
                return;
            case 9:
                ga gaVar = (ga) this.f21874b;
                gaVar.f21937s = -1;
                int i10 = 0;
                while (true) {
                    u1[] u1VarArr = gaVar.f21933e;
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
                sc.e();
                ((vy) this.f21874b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f21874b;
                e3Var.setCanDismissWithSwipe(true);
                e3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
