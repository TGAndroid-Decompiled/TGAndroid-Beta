package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class rp0 implements Runnable {
    public final int f28060a;
    public final vq0 f28061b;

    public rp0(vq0 vq0Var, int i10) {
        this.f28060a = i10;
        this.f28061b = vq0Var;
    }

    @Override
    public final void run() {
        switch (this.f28060a) {
            case 0:
                vq0 vq0Var = this.f28061b;
                vq0Var.A0 = true;
                e20 e20Var = vq0Var.f29772y0;
                e20Var.f23850r.setText("");
                AndroidUtilities.showKeyboard(e20Var.f23850r);
                return;
            default:
                th thVar = new th(9);
                vq0 vq0Var2 = this.f28061b;
                if (vq0Var2.isKeyboardVisible()) {
                    e20 e20Var2 = vq0Var2.f29772y0;
                    if (e20Var2 != null) {
                        AndroidUtilities.hideKeyboard(e20Var2.f23850r);
                    }
                    AndroidUtilities.runOnUIThread(thVar, 300L);
                    return;
                }
                thVar.run();
                return;
        }
    }
}
