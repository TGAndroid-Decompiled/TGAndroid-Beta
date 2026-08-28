package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ra0 extends rh.m {
    public int W;
    public Runnable X;
    public final wa0 Y;

    public ra0(wa0 wa0Var, pa0 pa0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(null, pa0Var, b6Var);
        this.Y = wa0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        qa0 qa0Var = new qa0(this, 0);
        this.X = qa0Var;
        AndroidUtilities.runOnUIThread(qa0Var);
        wa0 wa0Var = this.Y;
        if (wa0Var.R) {
            wa0Var.R = false;
            AndroidUtilities.runOnUIThread(new qa0(this, 1));
        }
    }

    @Override
    public final void W() {
        cb0 cb0Var = this.Y.V;
        AndroidUtilities.cancelRunOnUIThread(cb0Var.f27464y);
        cb0Var.f27464y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(cb0Var.f27462w).setAnimationInProgress(this.W, null, false);
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
        qa0 qa0Var = new qa0(this, 2);
        this.X = qa0Var;
        AndroidUtilities.runOnUIThread(qa0Var);
    }
}
