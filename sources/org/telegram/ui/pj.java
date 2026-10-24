package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class pj extends li.m {
    public Runnable W;
    public final sn X;

    public pj(sn snVar, sn snVar2, nj njVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(snVar2, njVar, g6Var);
        this.X = snVar;
    }

    @Override
    public final void F() {
        sn snVar = this.X;
        if (snVar.T9 == -1) {
            snVar.T9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.T9, sn.f41442bd, false);
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
        oj ojVar = new oj(this, 1);
        this.W = ojVar;
        AndroidUtilities.runOnUIThread(ojVar);
    }

    @Override
    public final void W() {
        sn snVar = this.X;
        snVar.T9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.T9, sn.f41442bd, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.w2 w2Var = snVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(w2Var);
        w2Var.run();
        org.telegram.ui.Components.ye yeVar = snVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(yeVar);
        yeVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        oj ojVar = new oj(this, 0);
        this.W = ojVar;
        AndroidUtilities.runOnUIThread(ojVar);
    }
}
