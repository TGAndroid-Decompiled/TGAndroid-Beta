package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hh0 implements Runnable {
    public final sh0 f34227a;

    public hh0(sh0 sh0Var) {
        this.f34227a = sh0Var;
    }

    @Override
    public final void run() {
        sh0 sh0Var = this.f34227a;
        if (sh0Var.f37771b == null) {
            return;
        }
        for (int i10 = 0; i10 < sh0Var.f37771b.getChildCount(); i10++) {
            View childAt = sh0Var.f37771b.getChildAt(i10);
            if (childAt instanceof ph0) {
                ph0 ph0Var = (ph0) childAt;
                if (ph0Var.I) {
                    ph0Var.b(ph0Var.f36544n, ph0Var.f36545r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
