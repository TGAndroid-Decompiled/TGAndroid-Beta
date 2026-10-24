package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ec0 extends li.m {
    public int W;
    public Runnable X;
    public final jc0 Y;

    public ec0(jc0 jc0Var, cc0 cc0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, cc0Var, g6Var);
        this.Y = jc0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        dc0 dc0Var = new dc0(this, 0);
        this.X = dc0Var;
        AndroidUtilities.runOnUIThread(dc0Var);
        jc0 jc0Var = this.Y;
        if (jc0Var.V) {
            jc0Var.V = false;
            AndroidUtilities.runOnUIThread(new dc0(this, 1));
        }
    }

    @Override
    public final void W() {
        pc0 pc0Var = this.Y.f27674c0;
        AndroidUtilities.cancelRunOnUIThread(pc0Var.f29546y);
        pc0Var.f29546y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(pc0Var.f29544w).setAnimationInProgress(this.W, null, false);
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
        dc0 dc0Var = new dc0(this, 2);
        this.X = dc0Var;
        AndroidUtilities.runOnUIThread(dc0Var);
    }
}
