package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class va0 extends sh.m {
    public int W;
    public Runnable X;
    public final ab0 Y;

    public va0(ab0 ab0Var, ta0 ta0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, ta0Var, c6Var);
        this.Y = ab0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ua0 ua0Var = new ua0(this, 0);
        this.X = ua0Var;
        AndroidUtilities.runOnUIThread(ua0Var);
        ab0 ab0Var = this.Y;
        if (ab0Var.R) {
            ab0Var.R = false;
            AndroidUtilities.runOnUIThread(new ua0(this, 1));
        }
    }

    @Override
    public final void W() {
        gb0 gb0Var = this.Y.V;
        AndroidUtilities.cancelRunOnUIThread(gb0Var.f28590y);
        gb0Var.f28590y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(gb0Var.f28588w).setAnimationInProgress(this.W, null, false);
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
        ua0 ua0Var = new ua0(this, 2);
        this.X = ua0Var;
        AndroidUtilities.runOnUIThread(ua0Var);
    }
}
