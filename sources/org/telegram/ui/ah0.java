package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ah0 implements Runnable {
    public final mh0 f35682a;

    public ah0(mh0 mh0Var) {
        this.f35682a = mh0Var;
    }

    @Override
    public final void run() {
        mh0 mh0Var = this.f35682a;
        if (mh0Var.f39578b == null) {
            return;
        }
        for (int i10 = 0; i10 < mh0Var.f39578b.getChildCount(); i10++) {
            View childAt = mh0Var.f39578b.getChildAt(i10);
            if (childAt instanceof jh0) {
                jh0 jh0Var = (jh0) childAt;
                if (jh0Var.I) {
                    jh0Var.b(jh0Var.f38578n, jh0Var.f38579r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
