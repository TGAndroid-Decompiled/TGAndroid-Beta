package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ob extends ji.n {
    public int W;
    public pu0 X;
    public final yb Y;

    public ob(yb ybVar, nb nbVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, nbVar, c6Var);
        this.Y = ybVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        pu0 pu0Var = this.X;
        if (pu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(pu0Var);
        }
        pu0 pu0Var2 = new pu0(this, 20);
        this.X = pu0Var2;
        AndroidUtilities.runOnUIThread(pu0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, yb.R0, false);
        }
        pu0 pu0Var = this.X;
        if (pu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(pu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
