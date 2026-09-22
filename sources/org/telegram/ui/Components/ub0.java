package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ub0 extends ji.n {
    public int W;
    public Runnable X;
    public final ac0 Y;

    public ub0(ac0 ac0Var, sb0 sb0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, sb0Var, f6Var);
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
        tb0 tb0Var = new tb0(this, 0);
        this.X = tb0Var;
        AndroidUtilities.runOnUIThread(tb0Var);
        ac0 ac0Var = this.Y;
        if (ac0Var.V) {
            ac0Var.V = false;
            AndroidUtilities.runOnUIThread(new tb0(this, 1));
        }
    }

    @Override
    public final void W() {
        gc0 gc0Var = this.Y.f22625c0;
        AndroidUtilities.cancelRunOnUIThread(gc0Var.f24503y);
        gc0Var.f24503y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(gc0Var.f24501w).setAnimationInProgress(this.W, null, false);
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
        tb0 tb0Var = new tb0(this, 2);
        this.X = tb0Var;
        AndroidUtilities.runOnUIThread(tb0Var);
    }
}
