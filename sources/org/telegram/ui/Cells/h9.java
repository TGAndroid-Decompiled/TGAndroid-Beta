package org.telegram.ui.Cells;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.im0;
public final class h9 implements Runnable {
    public final int f22390a;
    public final aa f22391b;

    public h9(aa aaVar, int i10) {
        this.f22390a = i10;
        this.f22391b = aaVar;
    }

    @Override
    public final void run() {
        int m10;
        int i10;
        int p5;
        switch (this.f22390a) {
            case 0:
                aa aaVar = this.f22391b;
                if (aaVar.N && aaVar.E != null) {
                    if (aaVar.Z && aaVar.W == null) {
                        m10 = AndroidUtilities.dp(8.0f);
                    } else if (aaVar.W != null) {
                        m10 = aaVar.m() >> 1;
                    } else {
                        return;
                    }
                    if (!aaVar.Z && !aaVar.f21996j0) {
                        if (aaVar.O) {
                            if (aaVar.W.getBottom() - m10 < aaVar.F.getMeasuredHeight() - aaVar.o()) {
                                i10 = aaVar.W.getBottom() - aaVar.F.getMeasuredHeight();
                                p5 = aaVar.o();
                                m10 = i10 + p5;
                            }
                        } else if (aaVar.W.getTop() + m10 > aaVar.p()) {
                            i10 = -aaVar.W.getTop();
                            p5 = aaVar.p();
                            m10 = i10 + p5;
                        }
                    }
                    im0 im0Var = aaVar.E;
                    if (im0Var != null) {
                        if (!aaVar.O) {
                            m10 = -m10;
                        }
                        im0Var.scrollBy(0, m10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            default:
                aa aaVar2 = this.f22391b;
                org.telegram.ui.ActionBar.h4 h4Var = aaVar2.Y;
                if (h4Var != null && !aaVar2.P) {
                    h4Var.hide(Long.MAX_VALUE);
                    AndroidUtilities.runOnUIThread(aaVar2.f22003n0, 1000L);
                    return;
                }
                return;
        }
    }
}
