package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class qb extends ki.n {
    public int W;
    public su0 X;
    public final ac Y;

    public qb(ac acVar, pb pbVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, pbVar, c6Var);
        this.Y = acVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        su0 su0Var = this.X;
        if (su0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(su0Var);
        }
        su0 su0Var2 = new su0(this, 20);
        this.X = su0Var2;
        AndroidUtilities.runOnUIThread(su0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, ac.R0, false);
        }
        su0 su0Var = this.X;
        if (su0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(su0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
