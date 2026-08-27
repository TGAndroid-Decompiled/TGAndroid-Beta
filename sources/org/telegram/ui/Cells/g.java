package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.gy;

public final class g implements Runnable {

    public final int f24358a;

    public final Object f24359b;

    public g(Object obj, int i10) {
        this.f24358a = i10;
        this.f24359b = obj;
    }

    @Override
    public final void run() {
        switch (this.f24358a) {
            case 0:
                h hVar = (h) this.f24359b;
                t80 t80Var = hVar.d;
                if (t80Var != null) {
                    hVar.h.A.l(t80Var, true);
                }
                break;
            case 1:
                j1 j1Var = ((t1) this.f24359b).f25657e;
                if (j1Var != null) {
                    j1Var.k();
                }
                break;
            case 2:
                ((z1) this.f24359b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((gh.h6) this.f24359b).f24196b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((g3) this.f24359b).f24370b);
                break;
            case 5:
                e6 e6Var = (e6) this.f24359b;
                if (!(e6Var.getParent() instanceof zk0)) {
                    e6Var.callOnClick();
                } else {
                    ((zk0) e6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(e6Var), e6Var);
                }
                break;
            case 6:
                ((o7) this.f24359b).h();
                break;
            case 7:
                w9 w9Var = (w9) this.f24359b;
                w9Var.C.invalidate();
                w9Var.U();
                break;
            case 8:
                ((g9) this.f24359b).f24404b.U();
                break;
            case 9:
                ba baVar = (ba) this.f24359b;
                baVar.f24136s = -1;
                int i10 = 0;
                while (true) {
                    s1[] s1VarArr = baVar.f24132e;
                    if (i10 < s1VarArr.length) {
                        s1 s1Var = s1VarArr[i10];
                        if (s1Var != null) {
                            s1Var.invalidate();
                        }
                        i10++;
                    }
                    break;
                }
                break;
            case 10:
                gy gyVar = (gy) this.f24359b;
                ec.e();
                gyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f24359b;
                e3Var.setCanDismissWithSwipe(true);
                e3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
