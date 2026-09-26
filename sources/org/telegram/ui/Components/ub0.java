package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ub0 extends ji.n {
    public int W;
    public Runnable X;
    public final zb0 Y;

    public ub0(zb0 zb0Var, sb0 sb0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, sb0Var, d6Var);
        this.Y = zb0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        tb0 tb0Var = new tb0(this, 0);
        this.X = tb0Var;
        AndroidUtilities.runOnUIThread(tb0Var);
        zb0 zb0Var = this.Y;
        if (zb0Var.V) {
            zb0Var.V = false;
            AndroidUtilities.runOnUIThread(new tb0(this, 1));
        }
    }

    @Override
    public final void W() {
        fc0 fc0Var = this.Y.f30839c0;
        AndroidUtilities.cancelRunOnUIThread(fc0Var.f24148y);
        fc0Var.f24148y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(fc0Var.f24146w).setAnimationInProgress(this.W, null, false);
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
        tb0 tb0Var = new tb0(this, 2);
        this.X = tb0Var;
        AndroidUtilities.runOnUIThread(tb0Var);
    }
}
