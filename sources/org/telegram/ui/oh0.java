package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oh0 implements Runnable {
    public final zh0 f36200a;

    public oh0(zh0 zh0Var) {
        this.f36200a = zh0Var;
    }

    @Override
    public final void run() {
        zh0 zh0Var = this.f36200a;
        if (zh0Var.f40148b == null) {
            return;
        }
        for (int i10 = 0; i10 < zh0Var.f40148b.getChildCount(); i10++) {
            View childAt = zh0Var.f40148b.getChildAt(i10);
            if (childAt instanceof wh0) {
                wh0 wh0Var = (wh0) childAt;
                if (wh0Var.I) {
                    wh0Var.b(wh0Var.f39165n, wh0Var.f39166r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
