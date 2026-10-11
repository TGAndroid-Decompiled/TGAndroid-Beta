package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class lc0 extends ji.n {
    public int W;
    public Runnable X;
    public final qc0 Y;

    public lc0(qc0 qc0Var, jc0 jc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, jc0Var, d6Var);
        this.Y = qc0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        kc0 kc0Var = new kc0(this, 0);
        this.X = kc0Var;
        AndroidUtilities.runOnUIThread(kc0Var);
        qc0 qc0Var = this.Y;
        if (qc0Var.V) {
            qc0Var.V = false;
            AndroidUtilities.runOnUIThread(new kc0(this, 1));
        }
    }

    @Override
    public final void W() {
        wc0 wc0Var = this.Y.f30132c0;
        AndroidUtilities.cancelRunOnUIThread(wc0Var.f32622y);
        wc0Var.f32622y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(wc0Var.f32620w).setAnimationInProgress(this.W, null, false);
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
        kc0 kc0Var = new kc0(this, 2);
        this.X = kc0Var;
        AndroidUtilities.runOnUIThread(kc0Var);
    }
}
