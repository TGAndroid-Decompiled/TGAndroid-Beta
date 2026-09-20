package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class rb0 extends ji.n {
    public int W;
    public Runnable X;
    public final xb0 Y;

    public rb0(xb0 xb0Var, pb0 pb0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, pb0Var, f6Var);
        this.Y = xb0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        qb0 qb0Var = new qb0(this, 0);
        this.X = qb0Var;
        AndroidUtilities.runOnUIThread(qb0Var);
        xb0 xb0Var = this.Y;
        if (xb0Var.V) {
            xb0Var.V = false;
            AndroidUtilities.runOnUIThread(new qb0(this, 1));
        }
    }

    @Override
    public final void W() {
        dc0 dc0Var = this.Y.f30229c0;
        AndroidUtilities.cancelRunOnUIThread(dc0Var.f23559y);
        dc0Var.f23559y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(dc0Var.f23557w).setAnimationInProgress(this.W, null, false);
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
        qb0 qb0Var = new qb0(this, 2);
        this.X = qb0Var;
        AndroidUtilities.runOnUIThread(qb0Var);
    }
}
