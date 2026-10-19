package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wm0 implements Runnable {
    public final int f32153a;
    public final ym0 f32154b;

    public wm0(ym0 ym0Var, int i10) {
        this.f32153a = i10;
        this.f32154b = ym0Var;
    }

    @Override
    public final void run() {
        switch (this.f32153a) {
            case 0:
                ym0 ym0Var = this.f32154b;
                ym0Var.getClass();
                AndroidUtilities.runOnUIThread(new wm0(ym0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wm0(this.f32154b, 3));
                return;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
