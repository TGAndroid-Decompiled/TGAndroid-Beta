package org.telegram.ui.Cells;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;
public final class m9 implements Runnable {
    public final int f24488a;
    public final fa f24489b;

    public m9(fa faVar, int i10) {
        this.f24488a = i10;
        this.f24489b = faVar;
    }

    @Override
    public final void run() {
        int m10;
        int i10;
        int p10;
        switch (this.f24488a) {
            case 0:
                fa faVar = this.f24489b;
                if (faVar.N && faVar.E != null) {
                    if (faVar.Z && faVar.W == null) {
                        m10 = AndroidUtilities.dp(8.0f);
                    } else if (faVar.W != null) {
                        m10 = faVar.m() >> 1;
                    } else {
                        return;
                    }
                    if (!faVar.Z && !faVar.f24103j0) {
                        if (faVar.O) {
                            if (faVar.W.getBottom() - m10 < faVar.F.getMeasuredHeight() - faVar.o()) {
                                i10 = faVar.W.getBottom() - faVar.F.getMeasuredHeight();
                                p10 = faVar.o();
                                m10 = i10 + p10;
                            }
                        } else if (faVar.W.getTop() + m10 > faVar.p()) {
                            i10 = -faVar.W.getTop();
                            p10 = faVar.p();
                            m10 = i10 + p10;
                        }
                    }
                    mm0 mm0Var = faVar.E;
                    if (mm0Var != null) {
                        if (!faVar.O) {
                            m10 = -m10;
                        }
                        mm0Var.scrollBy(0, m10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            default:
                fa faVar2 = this.f24489b;
                org.telegram.ui.ActionBar.m4 m4Var = faVar2.Y;
                if (m4Var != null && !faVar2.P) {
                    m4Var.hide(Long.MAX_VALUE);
                    AndroidUtilities.runOnUIThread(faVar2.f24110n0, 1000L);
                    return;
                }
                return;
        }
    }
}
