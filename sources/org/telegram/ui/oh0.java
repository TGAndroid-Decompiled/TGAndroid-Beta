package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oh0 implements Runnable {
    public final zh0 f35498a;

    public oh0(zh0 zh0Var) {
        this.f35498a = zh0Var;
    }

    @Override
    public final void run() {
        zh0 zh0Var = this.f35498a;
        if (zh0Var.f39324b == null) {
            return;
        }
        for (int i10 = 0; i10 < zh0Var.f39324b.getChildCount(); i10++) {
            View childAt = zh0Var.f39324b.getChildAt(i10);
            if (childAt instanceof wh0) {
                wh0 wh0Var = (wh0) childAt;
                if (wh0Var.I) {
                    wh0Var.b(wh0Var.f38200n, wh0Var.f38201r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
