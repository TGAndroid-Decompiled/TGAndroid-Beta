package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class dc0 extends li.m {
    public int W;
    public Runnable X;
    public final ic0 Y;

    public dc0(ic0 ic0Var, bc0 bc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, bc0Var, d6Var);
        this.Y = ic0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        cc0 cc0Var = new cc0(this, 0);
        this.X = cc0Var;
        AndroidUtilities.runOnUIThread(cc0Var);
        ic0 ic0Var = this.Y;
        if (ic0Var.V) {
            ic0Var.V = false;
            AndroidUtilities.runOnUIThread(new cc0(this, 1));
        }
    }

    @Override
    public final void W() {
        oc0 oc0Var = this.Y.f27192c0;
        AndroidUtilities.cancelRunOnUIThread(oc0Var.f28937y);
        oc0Var.f28937y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(oc0Var.f28935w).setAnimationInProgress(this.W, null, false);
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
        cc0 cc0Var = new cc0(this, 2);
        this.X = cc0Var;
        AndroidUtilities.runOnUIThread(cc0Var);
    }
}
