package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oh0 implements Runnable {
    public final zh0 f40579a;

    public oh0(zh0 zh0Var) {
        this.f40579a = zh0Var;
    }

    @Override
    public final void run() {
        zh0 zh0Var = this.f40579a;
        if (zh0Var.f44679b == null) {
            return;
        }
        for (int i10 = 0; i10 < zh0Var.f44679b.getChildCount(); i10++) {
            View childAt = zh0Var.f44679b.getChildAt(i10);
            if (childAt instanceof wh0) {
                wh0 wh0Var = (wh0) childAt;
                if (wh0Var.I) {
                    wh0Var.b(wh0Var.f43655n, wh0Var.f43656r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
