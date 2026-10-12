package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ck extends ji.n {
    public Runnable W;
    public final eo X;

    public ck(eo eoVar, eo eoVar2, ak akVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(eoVar2, akVar, c6Var);
        this.X = eoVar;
    }

    @Override
    public final void F() {
        eo eoVar = this.X;
        if (eoVar.H9 == -1) {
            eoVar.H9 = eoVar.getNotificationCenter().setAnimationInProgress(eoVar.H9, eo.Nc, false);
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
        bk bkVar = new bk(this, 1);
        this.W = bkVar;
        AndroidUtilities.runOnUIThread(bkVar);
    }

    @Override
    public final void W() {
        eo eoVar = this.X;
        eoVar.H9 = eoVar.getNotificationCenter().setAnimationInProgress(eoVar.H9, eo.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.u2 u2Var = eoVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(u2Var);
        u2Var.run();
        org.telegram.ui.Components.df dfVar = eoVar.Y.B4;
        AndroidUtilities.cancelRunOnUIThread(dfVar);
        dfVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        bk bkVar = new bk(this, 0);
        this.W = bkVar;
        AndroidUtilities.runOnUIThread(bkVar);
    }
}
