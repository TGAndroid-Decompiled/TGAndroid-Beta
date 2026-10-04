package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class mb extends ji.n {
    public int W;
    public hu0 X;
    public final wb Y;

    public mb(wb wbVar, lb lbVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, lbVar, d6Var);
        this.Y = wbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        hu0 hu0Var = this.X;
        if (hu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(hu0Var);
        }
        hu0 hu0Var2 = new hu0(this, 20);
        this.X = hu0Var2;
        AndroidUtilities.runOnUIThread(hu0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, wb.R0, false);
        }
        hu0 hu0Var = this.X;
        if (hu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(hu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
