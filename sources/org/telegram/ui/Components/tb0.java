package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class tb0 extends ii.n {
    public int W;
    public Runnable X;
    public final yb0 Y;

    public tb0(yb0 yb0Var, rb0 rb0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, rb0Var, f6Var);
        this.Y = yb0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        sb0 sb0Var = new sb0(this, 0);
        this.X = sb0Var;
        AndroidUtilities.runOnUIThread(sb0Var);
        yb0 yb0Var = this.Y;
        if (yb0Var.V) {
            yb0Var.V = false;
            AndroidUtilities.runOnUIThread(new sb0(this, 1));
        }
    }

    @Override
    public final void W() {
        ec0 ec0Var = this.Y.f29295c0;
        AndroidUtilities.cancelRunOnUIThread(ec0Var.f22670y);
        ec0Var.f22670y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(ec0Var.f22668w).setAnimationInProgress(this.W, null, false);
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
        sb0 sb0Var = new sb0(this, 2);
        this.X = sb0Var;
        AndroidUtilities.runOnUIThread(sb0Var);
    }
}
