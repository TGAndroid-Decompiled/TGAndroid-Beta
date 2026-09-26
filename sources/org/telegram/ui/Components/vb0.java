package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class vb0 extends ji.n {
    public int W;
    public Runnable X;
    public final ac0 Y;

    public vb0(ac0 ac0Var, tb0 tb0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, tb0Var, d6Var);
        this.Y = ac0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ub0 ub0Var = new ub0(this, 0);
        this.X = ub0Var;
        AndroidUtilities.runOnUIThread(ub0Var);
        ac0 ac0Var = this.Y;
        if (ac0Var.V) {
            ac0Var.V = false;
            AndroidUtilities.runOnUIThread(new ub0(this, 1));
        }
    }

    @Override
    public final void W() {
        gc0 gc0Var = this.Y.f22606c0;
        AndroidUtilities.cancelRunOnUIThread(gc0Var.f24471y);
        gc0Var.f24471y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(gc0Var.f24469w).setAnimationInProgress(this.W, null, false);
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
        ub0 ub0Var = new ub0(this, 2);
        this.X = ub0Var;
        AndroidUtilities.runOnUIThread(ub0Var);
    }
}
