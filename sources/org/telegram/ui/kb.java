package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class kb extends ji.n {
    public int W;
    public eu0 X;
    public final ub Y;

    public kb(ub ubVar, jb jbVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, jbVar, d6Var);
        this.Y = ubVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        eu0 eu0Var = this.X;
        if (eu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(eu0Var);
        }
        eu0 eu0Var2 = new eu0(this, 20);
        this.X = eu0Var2;
        AndroidUtilities.runOnUIThread(eu0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, ub.R0, false);
        }
        eu0 eu0Var = this.X;
        if (eu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(eu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
