package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ge1 extends s4.k {
    public Runnable F;
    public int G;
    public final te1 H;

    public ge1(te1 te1Var) {
        this.H = te1Var;
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
        fe1 fe1Var = new fe1(this, 0);
        this.F = fe1Var;
        AndroidUtilities.runOnUIThread(fe1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        fe1 fe1Var = new fe1(this, 1);
        this.F = fe1Var;
        AndroidUtilities.runOnUIThread(fe1Var);
    }

    @Override
    public final void z(s4.b1 b1Var) {
        te1 te1Var = this.H;
        View view = te1Var.f41684b1;
        if (view == b1Var.f45938a) {
            view.setTranslationX(0.0f);
            xd1 xd1Var = te1Var.O;
            if (xd1Var != null) {
                xd1Var.F.clear();
            }
            View view2 = te1Var.f41684b1;
            if (view2 instanceof qe1) {
                qe1 qe1Var = (qe1) view2;
                qe1Var.setTopicIcon(qe1Var.f40404c5);
            }
            te1Var.f41684b1 = null;
        }
    }
}
