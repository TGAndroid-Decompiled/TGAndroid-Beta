package org.telegram.ui.Cells;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rm0;
public final class i9 implements Runnable {
    public final int f22281a;
    public final ba f22282b;

    public i9(ba baVar, int i10) {
        this.f22281a = i10;
        this.f22282b = baVar;
    }

    @Override
    public final void run() {
        int m10;
        int i10;
        int p5;
        switch (this.f22281a) {
            case 0:
                ba baVar = this.f22282b;
                if (baVar.N && baVar.E != null) {
                    if (baVar.Z && baVar.W == null) {
                        m10 = AndroidUtilities.dp(8.0f);
                    } else if (baVar.W != null) {
                        m10 = baVar.m() >> 1;
                    } else {
                        return;
                    }
                    if (!baVar.Z && !baVar.f21873j0) {
                        if (baVar.O) {
                            if (baVar.W.getBottom() - m10 < baVar.F.getMeasuredHeight() - baVar.o()) {
                                i10 = baVar.W.getBottom() - baVar.F.getMeasuredHeight();
                                p5 = baVar.o();
                                m10 = i10 + p5;
                            }
                        } else if (baVar.W.getTop() + m10 > baVar.p()) {
                            i10 = -baVar.W.getTop();
                            p5 = baVar.p();
                            m10 = i10 + p5;
                        }
                    }
                    rm0 rm0Var = baVar.E;
                    if (rm0Var != null) {
                        if (!baVar.O) {
                            m10 = -m10;
                        }
                        rm0Var.scrollBy(0, m10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            default:
                ba baVar2 = this.f22282b;
                org.telegram.ui.ActionBar.h4 h4Var = baVar2.Y;
                if (h4Var != null && !baVar2.P) {
                    h4Var.hide(Long.MAX_VALUE);
                    AndroidUtilities.runOnUIThread(baVar2.f21880n0, 1000L);
                    return;
                }
                return;
        }
    }
}
