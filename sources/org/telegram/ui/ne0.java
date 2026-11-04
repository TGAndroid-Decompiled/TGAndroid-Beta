package org.telegram.ui;

import android.view.View;
public final class ne0 implements Runnable {
    public final xe0 f47981a;

    public ne0(xe0 xe0Var) {
        this.f47981a = xe0Var;
    }

    @Override
    public final void run() {
        xe0 xe0Var = this.f47981a;
        if (xe0Var.f51985b == null) {
            return;
        }
        for (int i3 = 0; i3 < xe0Var.f51985b.getChildCount(); i3++) {
            View childAt = xe0Var.f51985b.getChildAt(i3);
            if (childAt instanceof ue0) {
                ue0 ue0Var = (ue0) childAt;
                if (ue0Var.J) {
                    ue0Var.b(ue0Var.f50067n, ue0Var.f50068r);
                }
            }
        }
        org.telegram.messenger.g0.i3(this, 500L);
    }
}
