package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.yy;
public final class g implements Runnable {
    public final int f20894a;
    public final Object f20895b;

    public g(Object obj, int i10) {
        this.f20894a = i10;
        this.f20895b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20894a) {
            case 0:
                h hVar = (h) this.f20895b;
                ha0 ha0Var = hVar.d;
                if (ha0Var != null) {
                    hVar.h.E.l(ha0Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f20895b).e;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 2:
                ((b2) this.f20895b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((yh.s4) this.f20895b).f20905b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.f20895b).f21083b);
                return;
            case 5:
                i6 i6Var = (i6) this.f20895b;
                if (i6Var.getParent() instanceof mm0) {
                    ((mm0) i6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f20895b).h();
                return;
            case 7:
                ba baVar = (ba) this.f20895b;
                baVar.C.invalidate();
                baVar.T();
                return;
            case 8:
                ((l9) this.f20895b).f21189b.T();
                return;
            case 9:
                ga gaVar = (ga) this.f20895b;
                gaVar.f20949s = -1;
                int i10 = 0;
                while (true) {
                    u1[] u1VarArr = gaVar.e;
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
                ((yy) this.f20895b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f20895b;
                e3Var.setCanDismissWithSwipe(true);
                e3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
