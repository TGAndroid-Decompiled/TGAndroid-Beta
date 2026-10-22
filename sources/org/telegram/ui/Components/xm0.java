package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xm0 implements Runnable {
    public final int f32453a;
    public final zm0 f32454b;

    public xm0(zm0 zm0Var, int i10) {
        this.f32453a = i10;
        this.f32454b = zm0Var;
    }

    @Override
    public final void run() {
        switch (this.f32453a) {
            case 0:
                zm0 zm0Var = this.f32454b;
                zm0Var.getClass();
                AndroidUtilities.runOnUIThread(new xm0(zm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xm0(this.f32454b, 3));
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
