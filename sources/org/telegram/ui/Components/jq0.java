package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class jq0 implements Runnable {
    public final int f27729a;
    public final or0 f27730b;

    public jq0(or0 or0Var, int i10) {
        this.f27729a = i10;
        this.f27730b = or0Var;
    }

    @Override
    public final void run() {
        switch (this.f27729a) {
            case 0:
                or0 or0Var = this.f27730b;
                or0Var.A0 = true;
                t20 t20Var = or0Var.f29508y0;
                t20Var.f30964r.setText("");
                AndroidUtilities.showKeyboard(t20Var.f30964r);
                return;
            default:
                vh vhVar = new vh(9);
                or0 or0Var2 = this.f27730b;
                if (or0Var2.isKeyboardVisible()) {
                    t20 t20Var2 = or0Var2.f29508y0;
                    if (t20Var2 != null) {
                        AndroidUtilities.hideKeyboard(t20Var2.f30964r);
                    }
                    AndroidUtilities.runOnUIThread(vhVar, 300L);
                    return;
                }
                vhVar.run();
                return;
        }
    }
}
