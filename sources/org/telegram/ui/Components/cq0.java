package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class cq0 implements Runnable {
    public final int f25435a;
    public final hr0 f25436b;

    public cq0(hr0 hr0Var, int i10) {
        this.f25435a = i10;
        this.f25436b = hr0Var;
    }

    @Override
    public final void run() {
        switch (this.f25435a) {
            case 0:
                hr0 hr0Var = this.f25436b;
                hr0Var.B0 = true;
                i20 i20Var = hr0Var.f27154z0;
                i20Var.f27258r.setText("");
                AndroidUtilities.showKeyboard(i20Var.f27258r);
                return;
            default:
                pc pcVar = new pc(14);
                hr0 hr0Var2 = this.f25436b;
                if (hr0Var2.isKeyboardVisible()) {
                    i20 i20Var2 = hr0Var2.f27154z0;
                    if (i20Var2 != null) {
                        AndroidUtilities.hideKeyboard(i20Var2.f27258r);
                    }
                    AndroidUtilities.runOnUIThread(pcVar, 300L);
                    return;
                }
                pcVar.run();
                return;
        }
    }
}
