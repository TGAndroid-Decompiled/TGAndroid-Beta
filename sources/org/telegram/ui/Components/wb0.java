package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class wb0 extends ji.n {
    public int W;
    public Runnable X;
    public final bc0 Y;

    public wb0(bc0 bc0Var, ub0 ub0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, ub0Var, d6Var);
        this.Y = bc0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        vb0 vb0Var = new vb0(this, 0);
        this.X = vb0Var;
        AndroidUtilities.runOnUIThread(vb0Var);
        bc0 bc0Var = this.Y;
        if (bc0Var.V) {
            bc0Var.V = false;
            AndroidUtilities.runOnUIThread(new vb0(this, 1));
        }
    }

    @Override
    public final void W() {
        hc0 hc0Var = this.Y.f22938c0;
        AndroidUtilities.cancelRunOnUIThread(hc0Var.f24781y);
        hc0Var.f24781y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(hc0Var.f24779w).setAnimationInProgress(this.W, null, false);
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
        vb0 vb0Var = new vb0(this, 2);
        this.X = vb0Var;
        AndroidUtilities.runOnUIThread(vb0Var);
    }
}
