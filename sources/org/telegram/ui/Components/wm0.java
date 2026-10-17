package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wm0 implements Runnable {
    public final int f32154a;
    public final ym0 f32155b;

    public wm0(ym0 ym0Var, int i10) {
        this.f32154a = i10;
        this.f32155b = ym0Var;
    }

    @Override
    public final void run() {
        switch (this.f32154a) {
            case 0:
                ym0 ym0Var = this.f32155b;
                ym0Var.getClass();
                AndroidUtilities.runOnUIThread(new wm0(ym0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wm0(this.f32155b, 3));
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
