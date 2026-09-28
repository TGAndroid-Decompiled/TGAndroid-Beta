package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class rp0 implements Runnable {
    public final int f28024a;
    public final wq0 f28025b;

    public rp0(wq0 wq0Var, int i10) {
        this.f28024a = i10;
        this.f28025b = wq0Var;
    }

    @Override
    public final void run() {
        switch (this.f28024a) {
            case 0:
                wq0 wq0Var = this.f28025b;
                wq0Var.A0 = true;
                e20 e20Var = wq0Var.f30158y0;
                e20Var.f23835r.setText("");
                AndroidUtilities.showKeyboard(e20Var.f23835r);
                return;
            default:
                th thVar = new th(9);
                wq0 wq0Var2 = this.f28025b;
                if (wq0Var2.isKeyboardVisible()) {
                    e20 e20Var2 = wq0Var2.f30158y0;
                    if (e20Var2 != null) {
                        AndroidUtilities.hideKeyboard(e20Var2.f23835r);
                    }
                    AndroidUtilities.runOnUIThread(thVar, 300L);
                    return;
                }
                thVar.run();
                return;
        }
    }
}
