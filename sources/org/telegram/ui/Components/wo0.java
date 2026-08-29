package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wo0 implements Runnable {
    public final int f34471a;
    public final dq0 f34472b;

    public wo0(dq0 dq0Var, int i10) {
        this.f34471a = i10;
        this.f34472b = dq0Var;
    }

    @Override
    public final void run() {
        switch (this.f34471a) {
            case 0:
                dq0 dq0Var = this.f34472b;
                dq0Var.f27856w0 = true;
                x10 x10Var = dq0Var.f27853u0;
                x10Var.f34546r.setText("");
                AndroidUtilities.showKeyboard(x10Var.f34546r);
                return;
            default:
                g5 g5Var = new g5(14);
                dq0 dq0Var2 = this.f34472b;
                if (dq0Var2.isKeyboardVisible()) {
                    x10 x10Var2 = dq0Var2.f27853u0;
                    if (x10Var2 != null) {
                        AndroidUtilities.hideKeyboard(x10Var2.f34546r);
                    }
                    AndroidUtilities.runOnUIThread(g5Var, 300L);
                    return;
                }
                g5Var.run();
                return;
        }
    }
}
