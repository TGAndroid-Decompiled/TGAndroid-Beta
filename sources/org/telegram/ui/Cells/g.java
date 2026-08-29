package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.fy;
public final class g implements Runnable {
    public final int f24375a;
    public final Object f24376b;

    public g(Object obj, int i10) {
        this.f24375a = i10;
        this.f24376b = obj;
    }

    @Override
    public final void run() {
        switch (this.f24375a) {
            case 0:
                h hVar = (h) this.f24376b;
                c90 c90Var = hVar.d;
                if (c90Var != null) {
                    hVar.h.A.l(c90Var, true);
                    return;
                }
                return;
            case 1:
                j1 j1Var = ((t1) this.f24376b).f25688e;
                if (j1Var != null) {
                    j1Var.k();
                    return;
                }
                return;
            case 2:
                ((z1) this.f24376b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((ih.z5) this.f24376b).f24218b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((g3) this.f24376b).f24387b);
                return;
            case 5:
                f6 f6Var = (f6) this.f24376b;
                if (f6Var.getParent() instanceof jl0) {
                    ((jl0) f6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(f6Var), f6Var);
                    return;
                } else {
                    f6Var.callOnClick();
                    return;
                }
            case 6:
                ((p7) this.f24376b).h();
                return;
            case 7:
                x9 x9Var = (x9) this.f24376b;
                x9Var.C.invalidate();
                x9Var.U();
                return;
            case 8:
                ((h9) this.f24376b).f24465b.U();
                return;
            case 9:
                ca caVar = (ca) this.f24376b;
                caVar.f24193s = -1;
                int i10 = 0;
                while (true) {
                    s1[] s1VarArr = caVar.f24189e;
                    if (i10 < s1VarArr.length) {
                        s1 s1Var = s1VarArr[i10];
                        if (s1Var != null) {
                            s1Var.invalidate();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 10:
                mc.e();
                ((fy) this.f24376b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24376b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
