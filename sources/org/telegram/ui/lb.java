package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class lb extends li.m {
    public int W;
    public vt0 X;
    public final vb Y;

    public lb(vb vbVar, kb kbVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, kbVar, g6Var);
        this.Y = vbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        vt0 vt0Var = this.X;
        if (vt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vt0Var);
        }
        vt0 vt0Var2 = new vt0(this, 20);
        this.X = vt0Var2;
        AndroidUtilities.runOnUIThread(vt0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, vb.R0, false);
        }
        vt0 vt0Var = this.X;
        if (vt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
