package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ck extends ki.n {
    public Runnable W;
    public final fo X;

    public ck(fo foVar, fo foVar2, ak akVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(foVar2, akVar, c6Var);
        this.X = foVar;
    }

    @Override
    public final void F() {
        fo foVar = this.X;
        if (foVar.H9 == -1) {
            foVar.H9 = foVar.getNotificationCenter().setAnimationInProgress(foVar.H9, fo.Nc, false);
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
        fo foVar = this.X;
        foVar.H9 = foVar.getNotificationCenter().setAnimationInProgress(foVar.H9, fo.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.u2 u2Var = foVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(u2Var);
        u2Var.run();
        org.telegram.ui.Components.cf cfVar = foVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(cfVar);
        cfVar.run();
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
