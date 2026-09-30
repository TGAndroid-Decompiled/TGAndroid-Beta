package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xb0 extends ji.n {
    public int W;
    public Runnable X;
    public final cc0 Y;

    public xb0(cc0 cc0Var, vb0 vb0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, vb0Var, d6Var);
        this.Y = cc0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        wb0 wb0Var = new wb0(this, 0);
        this.X = wb0Var;
        AndroidUtilities.runOnUIThread(wb0Var);
        cc0 cc0Var = this.Y;
        if (cc0Var.V) {
            cc0Var.V = false;
            AndroidUtilities.runOnUIThread(new wb0(this, 1));
        }
    }

    @Override
    public final void W() {
        ic0 ic0Var = this.Y.f23264c0;
        AndroidUtilities.cancelRunOnUIThread(ic0Var.f25080y);
        ic0Var.f25080y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(ic0Var.f25078w).setAnimationInProgress(this.W, null, false);
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
        wb0 wb0Var = new wb0(this, 2);
        this.X = wb0Var;
        AndroidUtilities.runOnUIThread(wb0Var);
    }
}
