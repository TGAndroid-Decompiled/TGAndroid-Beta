package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ff1 extends f2.l {
    public Runnable F;
    public int G;
    public final sf1 H;

    public ff1(sf1 sf1Var) {
        this.H = sf1Var;
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
        ef1 ef1Var = new ef1(this, 0);
        this.F = ef1Var;
        AndroidUtilities.runOnUIThread(ef1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ef1 ef1Var = new ef1(this, 1);
        this.F = ef1Var;
        AndroidUtilities.runOnUIThread(ef1Var);
    }

    @Override
    public final void z(f2.m1 m1Var) {
        sf1 sf1Var = this.H;
        View view = sf1Var.Y0;
        if (view == m1Var.f5875a) {
            view.setTranslationX(0.0f);
            ve1 ve1Var = sf1Var.L;
            if (ve1Var != null) {
                ve1Var.C.clear();
            }
            View view2 = sf1Var.Y0;
            if (view2 instanceof pf1) {
                pf1 pf1Var = (pf1) view2;
                pf1Var.setTopicIcon(pf1Var.V4);
            }
            sf1Var.Y0 = null;
        }
    }
}
