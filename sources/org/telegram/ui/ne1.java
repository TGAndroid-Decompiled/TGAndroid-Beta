package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ne1 extends s4.l {
    public Runnable F;
    public int G;
    public final af1 H;

    public ne1(af1 af1Var) {
        this.H = af1Var;
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
        me1 me1Var = new me1(this, 0);
        this.F = me1Var;
        AndroidUtilities.runOnUIThread(me1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        me1 me1Var = new me1(this, 1);
        this.F = me1Var;
        AndroidUtilities.runOnUIThread(me1Var);
    }

    @Override
    public final void z(s4.e1 e1Var) {
        af1 af1Var = this.H;
        View view = af1Var.f37742c1;
        if (view == e1Var.f47738a) {
            view.setTranslationX(0.0f);
            ee1 ee1Var = af1Var.O;
            if (ee1Var != null) {
                ee1Var.F.clear();
            }
            View view2 = af1Var.f37742c1;
            if (view2 instanceof xe1) {
                xe1 xe1Var = (xe1) view2;
                xe1Var.setTopicIcon(xe1Var.f45751c5);
            }
            af1Var.f37742c1 = null;
        }
    }
}
