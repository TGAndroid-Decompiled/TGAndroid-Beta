package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class pe1 extends s4.l {
    public Runnable F;
    public int G;
    public final cf1 H;

    public pe1(cf1 cf1Var) {
        this.H = cf1Var;
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
        oe1 oe1Var = new oe1(this, 0);
        this.F = oe1Var;
        AndroidUtilities.runOnUIThread(oe1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        oe1 oe1Var = new oe1(this, 1);
        this.F = oe1Var;
        AndroidUtilities.runOnUIThread(oe1Var);
    }

    @Override
    public final void z(s4.e1 e1Var) {
        cf1 cf1Var = this.H;
        View view = cf1Var.f38296c1;
        if (view == e1Var.f47773a) {
            view.setTranslationX(0.0f);
            ge1 ge1Var = cf1Var.O;
            if (ge1Var != null) {
                ge1Var.F.clear();
            }
            View view2 = cf1Var.f38296c1;
            if (view2 instanceof ze1) {
                ze1 ze1Var = (ze1) view2;
                ze1Var.setTopicIcon(ze1Var.f46245c5);
            }
            cf1Var.f38296c1 = null;
        }
    }
}
