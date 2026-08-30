package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class eh0 implements Runnable {
    public final ph0 f34020a;

    public eh0(ph0 ph0Var) {
        this.f34020a = ph0Var;
    }

    @Override
    public final void run() {
        ph0 ph0Var = this.f34020a;
        if (ph0Var.f37319b == null) {
            return;
        }
        for (int i10 = 0; i10 < ph0Var.f37319b.getChildCount(); i10++) {
            View childAt = ph0Var.f37319b.getChildAt(i10);
            if (childAt instanceof mh0) {
                mh0 mh0Var = (mh0) childAt;
                if (mh0Var.F) {
                    mh0Var.b(mh0Var.f36311n, mh0Var.f36312r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
