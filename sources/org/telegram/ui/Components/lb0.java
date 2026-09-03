package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class lb0 extends wh.n {
    public int W;
    public Runnable X;
    public final rb0 Y;

    public lb0(rb0 rb0Var, jb0 jb0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, jb0Var, f6Var);
        this.Y = rb0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        kb0 kb0Var = new kb0(this, 0);
        this.X = kb0Var;
        AndroidUtilities.runOnUIThread(kb0Var);
        rb0 rb0Var = this.Y;
        if (rb0Var.S) {
            rb0Var.S = false;
            AndroidUtilities.runOnUIThread(new kb0(this, 1));
        }
    }

    @Override
    public final void W() {
        xb0 xb0Var = this.Y.W;
        AndroidUtilities.cancelRunOnUIThread(xb0Var.f30582y);
        xb0Var.f30582y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(xb0Var.f30580w).setAnimationInProgress(this.W, null, false);
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
        kb0 kb0Var = new kb0(this, 2);
        this.X = kb0Var;
        AndroidUtilities.runOnUIThread(kb0Var);
    }
}
