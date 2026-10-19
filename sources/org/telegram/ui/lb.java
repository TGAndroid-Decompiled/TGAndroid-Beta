package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class lb extends li.m {
    public int W;
    public st0 X;
    public final vb Y;

    public lb(vb vbVar, kb kbVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, kbVar, d6Var);
        this.Y = vbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        st0 st0Var = this.X;
        if (st0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(st0Var);
        }
        st0 st0Var2 = new st0(this, 20);
        this.X = st0Var2;
        AndroidUtilities.runOnUIThread(st0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, vb.R0, false);
        }
        st0 st0Var = this.X;
        if (st0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(st0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
