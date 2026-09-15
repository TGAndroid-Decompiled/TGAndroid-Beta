package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qf1 extends s4.j {
    public Runnable F;
    public int G;
    public final dg1 H;

    public qf1(dg1 dg1Var) {
        this.H = dg1Var;
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
        pf1 pf1Var = new pf1(this, 0);
        this.F = pf1Var;
        AndroidUtilities.runOnUIThread(pf1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        pf1 pf1Var = new pf1(this, 1);
        this.F = pf1Var;
        AndroidUtilities.runOnUIThread(pf1Var);
    }

    @Override
    public final void z(s4.c1 c1Var) {
        dg1 dg1Var = this.H;
        View view = dg1Var.f33017b1;
        if (view == c1Var.f42675a) {
            view.setTranslationX(0.0f);
            hf1 hf1Var = dg1Var.O;
            if (hf1Var != null) {
                hf1Var.F.clear();
            }
            View view2 = dg1Var.f33017b1;
            if (view2 instanceof ag1) {
                ag1 ag1Var = (ag1) view2;
                ag1Var.setTopicIcon(ag1Var.Y4);
            }
            dg1Var.f33017b1 = null;
        }
    }
}
