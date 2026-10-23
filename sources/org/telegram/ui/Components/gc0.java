package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class gc0 extends li.m {
    public int W;
    public Runnable X;
    public final lc0 Y;

    public gc0(lc0 lc0Var, ec0 ec0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, ec0Var, g6Var);
        this.Y = lc0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        fc0 fc0Var = new fc0(this, 0);
        this.X = fc0Var;
        AndroidUtilities.runOnUIThread(fc0Var);
        lc0 lc0Var = this.Y;
        if (lc0Var.V) {
            lc0Var.V = false;
            AndroidUtilities.runOnUIThread(new fc0(this, 1));
        }
    }

    @Override
    public final void W() {
        rc0 rc0Var = this.Y.f28340c0;
        AndroidUtilities.cancelRunOnUIThread(rc0Var.f30152y);
        rc0Var.f30152y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(rc0Var.f30150w).setAnimationInProgress(this.W, null, false);
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
        fc0 fc0Var = new fc0(this, 2);
        this.X = fc0Var;
        AndroidUtilities.runOnUIThread(fc0Var);
    }
}
