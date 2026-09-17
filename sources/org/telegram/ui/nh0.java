package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nh0 implements Runnable {
    public final yh0 f38986a;

    public nh0(yh0 yh0Var) {
        this.f38986a = yh0Var;
    }

    @Override
    public final void run() {
        yh0 yh0Var = this.f38986a;
        if (yh0Var.f43149b == null) {
            return;
        }
        for (int i10 = 0; i10 < yh0Var.f43149b.getChildCount(); i10++) {
            View childAt = yh0Var.f43149b.getChildAt(i10);
            if (childAt instanceof vh0) {
                vh0 vh0Var = (vh0) childAt;
                if (vh0Var.I) {
                    vh0Var.b(vh0Var.f41588n, vh0Var.f41589r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
