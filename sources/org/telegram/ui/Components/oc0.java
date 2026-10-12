package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class oc0 extends ji.n {
    public int W;
    public Runnable X;
    public final tc0 Y;

    public oc0(tc0 tc0Var, mc0 mc0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, mc0Var, c6Var);
        this.Y = tc0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        nc0 nc0Var = new nc0(this, 0);
        this.X = nc0Var;
        AndroidUtilities.runOnUIThread(nc0Var);
        tc0 tc0Var = this.Y;
        if (tc0Var.V) {
            tc0Var.V = false;
            AndroidUtilities.runOnUIThread(new nc0(this, 1));
        }
    }

    @Override
    public final void W() {
        zc0 zc0Var = this.Y.f30859c0;
        AndroidUtilities.cancelRunOnUIThread(zc0Var.f33340y);
        zc0Var.f33340y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(zc0Var.f33338w).setAnimationInProgress(this.W, null, false);
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
        nc0 nc0Var = new nc0(this, 2);
        this.X = nc0Var;
        AndroidUtilities.runOnUIThread(nc0Var);
    }
}
