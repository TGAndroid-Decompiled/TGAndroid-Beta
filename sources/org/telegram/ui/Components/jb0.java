package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class jb0 extends ji.n {
    public int W;
    public Runnable X;
    public final pb0 Y;

    public jb0(pb0 pb0Var, hb0 hb0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, hb0Var, e6Var);
        this.Y = pb0Var;
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
        pb0 pb0Var = this.Y;
        if (pb0Var.V) {
            pb0Var.V = false;
            AndroidUtilities.runOnUIThread(new ib0(this, 1));
        }
    }

    @Override
    public final void W() {
        vb0 vb0Var = this.Y.f26998c0;
        AndroidUtilities.cancelRunOnUIThread(vb0Var.f28684y);
        vb0Var.f28684y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(vb0Var.f28682w).setAnimationInProgress(this.W, null, false);
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
