package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ra1;

public final class rl0 implements Runnable {

    public final int f32203a;

    public final vl0 f32204b;

    public rl0(vl0 vl0Var, int i10) {
        this.f32203a = i10;
        this.f32204b = vl0Var;
    }

    @Override
    public final void run() {
        int iMax;
        switch (this.f32203a) {
            case 0:
                vl0 vl0Var = this.f32204b;
                ra1 ra1Var = vl0Var.f33448e;
                vl0Var.U = false;
                float scrollX = vl0Var.getScrollX() + vl0Var.S;
                vl0Var.R = scrollX;
                int iCeil = ((int) Math.ceil(scrollX / vl0Var.getTabSize())) - 1;
                vl0Var.Q = iCeil;
                vl0Var.P = iCeil;
                if (vl0Var.e(iCeil) && iCeil >= 0 && iCeil < ra1Var.getChildCount()) {
                    try {
                        vl0Var.performHapticFeedback(0);
                        break;
                    } catch (Exception unused) {
                    }
                    vl0Var.W = 0.0f;
                    vl0Var.v = 0.0f;
                    View childAt = ra1Var.getChildAt(iCeil);
                    vl0Var.f33462s = childAt;
                    vl0Var.V = childAt.getX() - vl0Var.getScrollX();
                    vl0Var.f33462s.invalidate();
                    ra1Var.invalidate();
                    vl0Var.j();
                    vl0Var.invalidate();
                }
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                vl0 vl0Var2 = this.f32204b;
                long j10 = jCurrentTimeMillis - vl0Var2.f33459n0;
                int i10 = -1;
                if (j10 < 3000) {
                    iMax = Math.max(1, AndroidUtilities.dp(1.0f));
                    if (vl0Var2.m0) {
                        i10 = 1;
                    }
                } else if (j10 < 5000) {
                    iMax = Math.max(1, AndroidUtilities.dp(2.0f));
                    if (vl0Var2.m0) {
                        i10 = 1;
                    }
                } else {
                    iMax = Math.max(1, AndroidUtilities.dp(4.0f));
                    if (vl0Var2.m0) {
                        i10 = 1;
                    }
                }
                vl0Var2.scrollBy(iMax * i10, 0);
                AndroidUtilities.runOnUIThread(vl0Var2.f33460o0);
                break;
        }
    }
}
