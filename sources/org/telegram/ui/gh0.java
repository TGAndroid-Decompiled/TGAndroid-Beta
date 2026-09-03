package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gh0 implements Runnable {
    public final rh0 f34452a;

    public gh0(rh0 rh0Var) {
        this.f34452a = rh0Var;
    }

    @Override
    public final void run() {
        rh0 rh0Var = this.f34452a;
        if (rh0Var.f37844b == null) {
            return;
        }
        for (int i10 = 0; i10 < rh0Var.f37844b.getChildCount(); i10++) {
            View childAt = rh0Var.f37844b.getChildAt(i10);
            if (childAt instanceof oh0) {
                oh0 oh0Var = (oh0) childAt;
                if (oh0Var.F) {
                    oh0Var.b(oh0Var.f36815n, oh0Var.f36816r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
