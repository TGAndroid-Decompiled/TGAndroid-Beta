package org.telegram.ui.Cells;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nm0;
public final class m9 implements Runnable {
    public final int f24490a;
    public final fa f24491b;

    public m9(fa faVar, int i10) {
        this.f24490a = i10;
        this.f24491b = faVar;
    }

    @Override
    public final void run() {
        int m10;
        int i10;
        int p10;
        switch (this.f24490a) {
            case 0:
                fa faVar = this.f24491b;
                if (faVar.N && faVar.E != null) {
                    if (faVar.Z && faVar.W == null) {
                        m10 = AndroidUtilities.dp(8.0f);
                    } else if (faVar.W != null) {
                        m10 = faVar.m() >> 1;
                    } else {
                        return;
                    }
                    if (!faVar.Z && !faVar.f24105j0) {
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
                    nm0 nm0Var = faVar.E;
                    if (nm0Var != null) {
                        if (!faVar.O) {
                            m10 = -m10;
                        }
                        nm0Var.scrollBy(0, m10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            default:
                fa faVar2 = this.f24491b;
                org.telegram.ui.ActionBar.m4 m4Var = faVar2.Y;
                if (m4Var != null && !faVar2.P) {
                    m4Var.hide(Long.MAX_VALUE);
                    AndroidUtilities.runOnUIThread(faVar2.f24112n0, 1000L);
                    return;
                }
                return;
        }
    }
}
