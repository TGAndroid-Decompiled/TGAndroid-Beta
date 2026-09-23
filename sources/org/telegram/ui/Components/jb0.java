package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class jb0 extends ji.n {
    public int W;
    public Runnable X;
    public final ob0 Y;

    public jb0(ob0 ob0Var, hb0 hb0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, hb0Var, d6Var);
        this.Y = ob0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ib0 ib0Var = new ib0(this, 0);
        this.X = ib0Var;
        AndroidUtilities.runOnUIThread(ib0Var);
        ob0 ob0Var = this.Y;
        if (ob0Var.V) {
            ob0Var.V = false;
            AndroidUtilities.runOnUIThread(new ib0(this, 1));
        }
    }

    @Override
    public final void W() {
        ub0 ub0Var = this.Y.f26708c0;
        AndroidUtilities.cancelRunOnUIThread(ub0Var.f28457y);
        ub0Var.f28457y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(ub0Var.f28455w).setAnimationInProgress(this.W, null, false);
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
        ib0 ib0Var = new ib0(this, 2);
        this.X = ib0Var;
        AndroidUtilities.runOnUIThread(ib0Var);
    }
}
