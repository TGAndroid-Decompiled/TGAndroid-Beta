package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class kc0 extends ji.n {
    public int W;
    public Runnable X;
    public final pc0 Y;

    public kc0(pc0 pc0Var, ic0 ic0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, ic0Var, d6Var);
        this.Y = pc0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        jc0 jc0Var = new jc0(this, 0);
        this.X = jc0Var;
        AndroidUtilities.runOnUIThread(jc0Var);
        pc0 pc0Var = this.Y;
        if (pc0Var.V) {
            pc0Var.V = false;
            AndroidUtilities.runOnUIThread(new jc0(this, 1));
        }
    }

    @Override
    public final void W() {
        vc0 vc0Var = this.Y.f29848c0;
        AndroidUtilities.cancelRunOnUIThread(vc0Var.f31861y);
        vc0Var.f31861y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(vc0Var.f31859w).setAnimationInProgress(this.W, null, false);
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
        jc0 jc0Var = new jc0(this, 2);
        this.X = jc0Var;
        AndroidUtilities.runOnUIThread(jc0Var);
    }
}
