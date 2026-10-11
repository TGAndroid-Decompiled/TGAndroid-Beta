package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.sy;
public final class g implements Runnable {
    public final int f22129a;
    public final Object f22130b;

    public g(Object obj, int i10) {
        this.f22129a = i10;
        this.f22130b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22129a) {
            case 0:
                h hVar = (h) this.f22130b;
                ia0 ia0Var = hVar.d;
                if (ia0Var != null) {
                    hVar.h.E.l(ia0Var, true);
                    return;
                }
                return;
            case 1:
                l1 l1Var = ((v1) this.f22130b).f23561e;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 2:
                ((b2) this.f22130b).a();
                return;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.u4) this.f22130b).f22142b.getEditText());
                return;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.f22130b).f22325b);
                return;
            case 5:
                i6 i6Var = (i6) this.f22130b;
                if (i6Var.getParent() instanceof rm0) {
                    ((rm0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    return;
                } else {
                    i6Var.callOnClick();
                    return;
                }
            case 6:
                ((t7) this.f22130b).h();
                return;
            case 7:
                ba baVar = (ba) this.f22130b;
                baVar.C.invalidate();
                baVar.T();
                return;
            case 8:
                ((l9) this.f22130b).f22458b.T();
                return;
            case 9:
                ga gaVar = (ga) this.f22130b;
                gaVar.f22199s = -1;
                int i10 = 0;
                while (true) {
                    u1[] u1VarArr = gaVar.f22195e;
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
                ((sy) this.f22130b).presentFragment(new SessionsActivity(0));
                return;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f22130b;
                e3Var.setCanDismissWithSwipe(true);
                e3Var.setCanDismissWithTouchOutside(true);
                return;
        }
    }
}
