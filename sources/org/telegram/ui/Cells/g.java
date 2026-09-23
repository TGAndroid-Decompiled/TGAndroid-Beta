package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ry;
public final class g implements Runnable {
    public final int f20074a;
    public final Object f20075b;

    public g(Object obj, int i10) {
        this.f20074a = i10;
        this.f20075b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20074a) {
            case 0:
                h hVar = (h) this.f20075b;
                h90 h90Var = hVar.d;
                if (h90Var != null) {
                    hVar.h.E.l(h90Var, true);
                    return;
                }
                return;
            case 1:
                k1 k1Var = ((u1) this.f20075b).e;
                if (k1Var != null) {
                    k1Var.k();
                    return;
                }
                return;
            case 2:
                ((a2) this.f20075b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.u4) this.f20075b).f20027b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.f20075b).f20177b);
                return;
            case 5:
                i6 i6Var = (i6) this.f20075b;
                if (i6Var.getParent() instanceof ml0) {
                    ((ml0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f20075b).h();
                return;
            case 7:
                ea eaVar = (ea) this.f20075b;
                eaVar.C.invalidate();
                eaVar.U();
                return;
            case 8:
                ((o9) this.f20075b).f20551b.U();
                return;
            case 9:
                ka kaVar = (ka) this.f20075b;
                kaVar.f20349s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = kaVar.e;
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
                ((ry) this.f20075b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f20075b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
