package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class mb extends ii.n {
    public int W;
    public mu0 X;
    public final wb Y;

    public mb(wb wbVar, lb lbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, lbVar, f6Var);
        this.Y = wbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        mu0 mu0Var = this.X;
        if (mu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mu0Var);
        }
        mu0 mu0Var2 = new mu0(this, 20);
        this.X = mu0Var2;
        AndroidUtilities.runOnUIThread(mu0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, wb.Y0, false);
        }
        mu0 mu0Var = this.X;
        if (mu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
