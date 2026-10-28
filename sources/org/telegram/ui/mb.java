package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class mb extends mi.m {
    public int W;
    public bu0 X;
    public final wb Y;

    public mb(wb wbVar, lb lbVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null, lbVar, u6Var);
        this.Y = wbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        bu0 bu0Var = this.X;
        if (bu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bu0Var);
        }
        bu0 bu0Var2 = new bu0(this, 20);
        this.X = bu0Var2;
        AndroidUtilities.runOnUIThread(bu0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, wb.R0, false);
        }
        bu0 bu0Var = this.X;
        if (bu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
