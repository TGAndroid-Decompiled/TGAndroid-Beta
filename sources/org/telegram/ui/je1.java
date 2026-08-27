package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class je1 extends f2.l {
    public Runnable F;
    public int G;
    public final we1 H;

    public je1(we1 we1Var) {
        this.H = we1Var;
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
        ie1 ie1Var = new ie1(this, 0);
        this.F = ie1Var;
        AndroidUtilities.runOnUIThread(ie1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ie1 ie1Var = new ie1(this, 1);
        this.F = ie1Var;
        AndroidUtilities.runOnUIThread(ie1Var);
    }

    @Override
    public final void z(f2.o1 o1Var) {
        we1 we1Var = this.H;
        View view = we1Var.X0;
        if (view == o1Var.f5789a) {
            view.setTranslationX(0.0f);
            ae1 ae1Var = we1Var.K;
            if (ae1Var != null) {
                ae1Var.B.clear();
            }
            View view2 = we1Var.X0;
            if (view2 instanceof te1) {
                te1 te1Var = (te1) view2;
                te1Var.setTopicIcon(te1Var.U4);
            }
            we1Var.X0 = null;
        }
    }
}
