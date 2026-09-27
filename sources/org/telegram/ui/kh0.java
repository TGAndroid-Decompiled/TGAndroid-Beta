package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kh0 implements Runnable {
    public final vh0 f35037a;

    public kh0(vh0 vh0Var) {
        this.f35037a = vh0Var;
    }

    @Override
    public final void run() {
        vh0 vh0Var = this.f35037a;
        if (vh0Var.f38584b == null) {
            return;
        }
        for (int i10 = 0; i10 < vh0Var.f38584b.getChildCount(); i10++) {
            View childAt = vh0Var.f38584b.getChildAt(i10);
            if (childAt instanceof sh0) {
                sh0 sh0Var = (sh0) childAt;
                if (sh0Var.I) {
                    sh0Var.b(sh0Var.f37471n, sh0Var.f37472r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
