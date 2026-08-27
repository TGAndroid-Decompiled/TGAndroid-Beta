package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class gb extends sh.m {
    public int W;
    public lt0 X;
    public final qb Y;

    public gb(qb qbVar, fb fbVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, fbVar, c6Var);
        this.Y = qbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        lt0 lt0Var = this.X;
        if (lt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lt0Var);
        }
        lt0 lt0Var2 = new lt0(this, 20);
        this.X = lt0Var2;
        AndroidUtilities.runOnUIThread(lt0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, qb.U0, false);
        }
        lt0 lt0Var = this.X;
        if (lt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
