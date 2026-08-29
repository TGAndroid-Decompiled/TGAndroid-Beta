package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class le1 extends f2.l {
    public Runnable F;
    public int G;
    public final ze1 H;

    public le1(ze1 ze1Var) {
        this.H = ze1Var;
    }

    @Override
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().setAnimationInProgress(this.G, null, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.F = null;
            }
        }
    }

    @Override
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F = null;
        }
        ke1 ke1Var = new ke1(this, 0);
        this.F = ke1Var;
        AndroidUtilities.runOnUIThread(ke1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ke1 ke1Var = new ke1(this, 1);
        this.F = ke1Var;
        AndroidUtilities.runOnUIThread(ke1Var);
    }

    @Override
    public final void z(f2.n1 n1Var) {
        ze1 ze1Var = this.H;
        View view = ze1Var.X0;
        if (view == n1Var.f6432a) {
            view.setTranslationX(0.0f);
            be1 be1Var = ze1Var.K;
            if (be1Var != null) {
                be1Var.B.clear();
            }
            View view2 = ze1Var.X0;
            if (view2 instanceof we1) {
                we1 we1Var = (we1) view2;
                we1Var.setTopicIcon(we1Var.U4);
            }
            ze1Var.X0 = null;
        }
    }
}
