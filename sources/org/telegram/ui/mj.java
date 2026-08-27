package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class mj extends sh.m {
    public Runnable W;
    public final rn X;

    public mj(rn rnVar, rn rnVar2, kj kjVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(rnVar2, kjVar, c6Var);
        this.X = rnVar;
    }

    @Override
    public final void F() {
        rn rnVar = this.X;
        if (rnVar.D9 == -1) {
            rnVar.D9 = rnVar.getNotificationCenter().setAnimationInProgress(rnVar.D9, rn.Jc, false);
        }
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        lj ljVar = new lj(this, 1);
        this.W = ljVar;
        AndroidUtilities.runOnUIThread(ljVar);
    }

    @Override
    public final void W() {
        rn rnVar = this.X;
        rnVar.D9 = rnVar.getNotificationCenter().setAnimationInProgress(rnVar.D9, rn.Jc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.u2 u2Var = rnVar.U.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(u2Var);
        u2Var.run();
        org.telegram.ui.Components.ne neVar = rnVar.U.T3;
        AndroidUtilities.cancelRunOnUIThread(neVar);
        neVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        lj ljVar = new lj(this, 0);
        this.W = ljVar;
        AndroidUtilities.runOnUIThread(ljVar);
    }
}
