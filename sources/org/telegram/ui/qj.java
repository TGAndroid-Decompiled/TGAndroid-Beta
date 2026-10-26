package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class qj extends mi.m {
    public Runnable W;
    public final un X;

    public qj(un unVar, un unVar2, oj ojVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(unVar2, ojVar, u6Var);
        this.X = unVar;
    }

    @Override
    public final void F() {
        un unVar = this.X;
        if (unVar.T9 == -1) {
            unVar.T9 = unVar.getNotificationCenter().setAnimationInProgress(unVar.T9, un.f44176hd, false);
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
        pj pjVar = new pj(this, 1);
        this.W = pjVar;
        AndroidUtilities.runOnUIThread(pjVar);
    }

    @Override
    public final void W() {
        un unVar = this.X;
        unVar.T9 = unVar.getNotificationCenter().setAnimationInProgress(unVar.T9, un.f44176hd, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.z2 z2Var = unVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(z2Var);
        z2Var.run();
        org.telegram.ui.Components.af afVar = unVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(afVar);
        afVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        pj pjVar = new pj(this, 0);
        this.W = pjVar;
        AndroidUtilities.runOnUIThread(pjVar);
    }
}
