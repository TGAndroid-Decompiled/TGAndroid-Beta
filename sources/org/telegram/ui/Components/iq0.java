package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class iq0 implements Runnable {
    public final int f27439a;
    public final nr0 f27440b;

    public iq0(nr0 nr0Var, int i10) {
        this.f27439a = i10;
        this.f27440b = nr0Var;
    }

    @Override
    public final void run() {
        switch (this.f27439a) {
            case 0:
                nr0 nr0Var = this.f27440b;
                nr0Var.A0 = true;
                t20 t20Var = nr0Var.f29223y0;
                t20Var.f30958r.setText("");
                AndroidUtilities.showKeyboard(t20Var.f30958r);
                return;
            default:
                vh vhVar = new vh(9);
                nr0 nr0Var2 = this.f27440b;
                if (nr0Var2.isKeyboardVisible()) {
                    t20 t20Var2 = nr0Var2.f29223y0;
                    if (t20Var2 != null) {
                        AndroidUtilities.hideKeyboard(t20Var2.f30958r);
                    }
                    AndroidUtilities.runOnUIThread(vhVar, 300L);
                    return;
                }
                vhVar.run();
                return;
        }
    }
}
