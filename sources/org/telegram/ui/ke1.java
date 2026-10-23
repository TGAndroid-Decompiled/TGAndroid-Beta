package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ke1 extends s4.k {
    public Runnable F;
    public int G;
    public final ye1 H;

    public ke1(ye1 ye1Var) {
        this.H = ye1Var;
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
        je1 je1Var = new je1(this, 0);
        this.F = je1Var;
        AndroidUtilities.runOnUIThread(je1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        je1 je1Var = new je1(this, 1);
        this.F = je1Var;
        AndroidUtilities.runOnUIThread(je1Var);
    }

    @Override
    public final void z(s4.b1 b1Var) {
        ye1 ye1Var = this.H;
        View view = ye1Var.f43800c1;
        if (view == b1Var.f46343a) {
            view.setTranslationX(0.0f);
            be1 be1Var = ye1Var.O;
            if (be1Var != null) {
                be1Var.F.clear();
            }
            View view2 = ye1Var.f43800c1;
            if (view2 instanceof ue1) {
                ue1 ue1Var = (ue1) view2;
                ue1Var.setTopicIcon(ue1Var.f42405c5);
            }
            ye1Var.f43800c1 = null;
        }
    }
}
