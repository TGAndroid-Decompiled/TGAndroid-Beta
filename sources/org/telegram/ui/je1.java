package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class je1 extends s4.k {
    public Runnable F;
    public int G;
    public final xe1 H;

    public je1(xe1 xe1Var) {
        this.H = xe1Var;
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
    public final void z(s4.b1 b1Var) {
        xe1 xe1Var = this.H;
        View view = xe1Var.f43553c1;
        if (view == b1Var.f46342a) {
            view.setTranslationX(0.0f);
            ae1 ae1Var = xe1Var.O;
            if (ae1Var != null) {
                ae1Var.F.clear();
            }
            View view2 = xe1Var.f43553c1;
            if (view2 instanceof te1) {
                te1 te1Var = (te1) view2;
                te1Var.setTopicIcon(te1Var.f42027c5);
            }
            xe1Var.f43553c1 = null;
        }
    }
}
