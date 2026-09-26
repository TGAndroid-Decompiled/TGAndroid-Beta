package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class qp0 implements Runnable {
    public final int f27748a;
    public final vq0 f27749b;

    public qp0(vq0 vq0Var, int i10) {
        this.f27748a = i10;
        this.f27749b = vq0Var;
    }

    @Override
    public final void run() {
        switch (this.f27748a) {
            case 0:
                vq0 vq0Var = this.f27749b;
                vq0Var.A0 = true;
                d20 d20Var = vq0Var.f29747y0;
                d20Var.f23475r.setText("");
                AndroidUtilities.showKeyboard(d20Var.f23475r);
                return;
            default:
                th thVar = new th(9);
                vq0 vq0Var2 = this.f27749b;
                if (vq0Var2.isKeyboardVisible()) {
                    d20 d20Var2 = vq0Var2.f29747y0;
                    if (d20Var2 != null) {
                        AndroidUtilities.hideKeyboard(d20Var2.f23475r);
                    }
                    AndroidUtilities.runOnUIThread(thVar, 300L);
                    return;
                }
                thVar.run();
                return;
        }
    }
}
