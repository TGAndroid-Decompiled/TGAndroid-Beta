package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class lo0 implements Runnable {
    public final int f30512a;
    public final rp0 f30513b;

    public lo0(rp0 rp0Var, int i9) {
        this.f30512a = i9;
        this.f30513b = rp0Var;
    }

    @Override
    public final void run() {
        switch (this.f30512a) {
            case 0:
                rp0 rp0Var = this.f30513b;
                rp0Var.f32270w0 = true;
                m10 m10Var = rp0Var.f32267u0;
                m10Var.f30664r.setText("");
                AndroidUtilities.showKeyboard(m10Var.f30664r);
                return;
            default:
                hc hcVar = new hc(12);
                rp0 rp0Var2 = this.f30513b;
                if (rp0Var2.isKeyboardVisible()) {
                    m10 m10Var2 = rp0Var2.f32267u0;
                    if (m10Var2 != null) {
                        AndroidUtilities.hideKeyboard(m10Var2.f30664r);
                    }
                    AndroidUtilities.runOnUIThread(hcVar, 300L);
                    return;
                }
                hcVar.run();
                return;
        }
    }
}
