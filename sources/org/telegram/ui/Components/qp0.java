package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class qp0 implements Runnable {
    public final int f27709a;
    public final vq0 f27710b;

    public qp0(vq0 vq0Var, int i10) {
        this.f27709a = i10;
        this.f27710b = vq0Var;
    }

    @Override
    public final void run() {
        switch (this.f27709a) {
            case 0:
                vq0 vq0Var = this.f27710b;
                vq0Var.A0 = true;
                b20 b20Var = vq0Var.f29744y0;
                b20Var.f22787r.setText("");
                AndroidUtilities.showKeyboard(b20Var.f22787r);
                return;
            default:
                sh shVar = new sh(7);
                vq0 vq0Var2 = this.f27710b;
                if (vq0Var2.isKeyboardVisible()) {
                    b20 b20Var2 = vq0Var2.f29744y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.f22787r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    return;
                }
                shVar.run();
                return;
        }
    }
}
