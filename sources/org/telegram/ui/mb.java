package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class mb extends mi.m {
    public int W;
    public zt0 X;
    public final wb Y;

    public mb(wb wbVar, lb lbVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null, lbVar, u6Var);
        this.Y = wbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        zt0 zt0Var = this.X;
        if (zt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zt0Var);
        }
        zt0 zt0Var2 = new zt0(this, 20);
        this.X = zt0Var2;
        AndroidUtilities.runOnUIThread(zt0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, wb.R0, false);
        }
        zt0 zt0Var = this.X;
        if (zt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
