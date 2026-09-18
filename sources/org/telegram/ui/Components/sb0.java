package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class sb0 extends ji.n {
    public int W;
    public Runnable X;
    public final yb0 Y;

    public sb0(yb0 yb0Var, qb0 qb0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, qb0Var, e6Var);
        this.Y = yb0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        rb0 rb0Var = new rb0(this, 0);
        this.X = rb0Var;
        AndroidUtilities.runOnUIThread(rb0Var);
        yb0 yb0Var = this.Y;
        if (yb0Var.V) {
            yb0Var.V = false;
            AndroidUtilities.runOnUIThread(new rb0(this, 1));
        }
    }

    @Override
    public final void W() {
        ec0 ec0Var = this.Y.f30537c0;
        AndroidUtilities.cancelRunOnUIThread(ec0Var.f23853y);
        ec0Var.f23853y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(ec0Var.f23851w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        rb0 rb0Var = new rb0(this, 2);
        this.X = rb0Var;
        AndroidUtilities.runOnUIThread(rb0Var);
    }
}
