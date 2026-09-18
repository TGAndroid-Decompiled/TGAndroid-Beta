package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class mb extends ji.n {
    public int W;
    public ou0 X;
    public final wb Y;

    public mb(wb wbVar, lb lbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, lbVar, f6Var);
        this.Y = wbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        ou0 ou0Var = this.X;
        if (ou0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ou0Var);
        }
        ou0 ou0Var2 = new ou0(this, 20);
        this.X = ou0Var2;
        AndroidUtilities.runOnUIThread(ou0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, wb.R0, false);
        }
        ou0 ou0Var = this.X;
        if (ou0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ou0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
