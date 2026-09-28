package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class rp0 implements Runnable {
    public final int f28025a;
    public final wq0 f28026b;

    public rp0(wq0 wq0Var, int i10) {
        this.f28025a = i10;
        this.f28026b = wq0Var;
    }

    @Override
    public final void run() {
        switch (this.f28025a) {
            case 0:
                wq0 wq0Var = this.f28026b;
                wq0Var.A0 = true;
                e20 e20Var = wq0Var.f30159y0;
                e20Var.f23836r.setText("");
                AndroidUtilities.showKeyboard(e20Var.f23836r);
                return;
            default:
                th thVar = new th(9);
                wq0 wq0Var2 = this.f28026b;
                if (wq0Var2.isKeyboardVisible()) {
                    e20 e20Var2 = wq0Var2.f30159y0;
                    if (e20Var2 != null) {
                        AndroidUtilities.hideKeyboard(e20Var2.f23836r);
                    }
                    AndroidUtilities.runOnUIThread(thVar, 300L);
                    return;
                }
                thVar.run();
                return;
        }
    }
}
