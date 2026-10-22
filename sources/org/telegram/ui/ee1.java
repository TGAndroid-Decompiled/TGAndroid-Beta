package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ee1 extends s4.k {
    public Runnable F;
    public int G;
    public final re1 H;

    public ee1(re1 re1Var) {
        this.H = re1Var;
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
        de1 de1Var = new de1(this, 0);
        this.F = de1Var;
        AndroidUtilities.runOnUIThread(de1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        de1 de1Var = new de1(this, 1);
        this.F = de1Var;
        AndroidUtilities.runOnUIThread(de1Var);
    }

    @Override
    public final void z(s4.b1 b1Var) {
        re1 re1Var = this.H;
        View view = re1Var.f41156b1;
        if (view == b1Var.f45920a) {
            view.setTranslationX(0.0f);
            vd1 vd1Var = re1Var.O;
            if (vd1Var != null) {
                vd1Var.F.clear();
            }
            View view2 = re1Var.f41156b1;
            if (view2 instanceof oe1) {
                oe1 oe1Var = (oe1) view2;
                oe1Var.setTopicIcon(oe1Var.f39868c5);
            }
            re1Var.f41156b1 = null;
        }
    }
}
