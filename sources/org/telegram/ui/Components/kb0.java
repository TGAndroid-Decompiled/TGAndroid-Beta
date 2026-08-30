package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class kb0 extends wh.n {
    public int W;
    public Runnable X;
    public final qb0 Y;

    public kb0(qb0 qb0Var, ib0 ib0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, ib0Var, f6Var);
        this.Y = qb0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        jb0 jb0Var = new jb0(this, 0);
        this.X = jb0Var;
        AndroidUtilities.runOnUIThread(jb0Var);
        qb0 qb0Var = this.Y;
        if (qb0Var.S) {
            qb0Var.S = false;
            AndroidUtilities.runOnUIThread(new jb0(this, 1));
        }
    }

    @Override
    public final void W() {
        wb0 wb0Var = this.Y.W;
        AndroidUtilities.cancelRunOnUIThread(wb0Var.f30294y);
        wb0Var.f30294y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(wb0Var.f30292w).setAnimationInProgress(this.W, null, false);
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
        jb0 jb0Var = new jb0(this, 2);
        this.X = jb0Var;
        AndroidUtilities.runOnUIThread(jb0Var);
    }
}
