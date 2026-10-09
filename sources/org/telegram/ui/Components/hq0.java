package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class hq0 implements Runnable {
    public final int f27113a;
    public final mr0 f27114b;

    public hq0(mr0 mr0Var, int i10) {
        this.f27113a = i10;
        this.f27114b = mr0Var;
    }

    @Override
    public final void run() {
        switch (this.f27113a) {
            case 0:
                mr0 mr0Var = this.f27114b;
                mr0Var.A0 = true;
                s20 s20Var = mr0Var.f28926y0;
                s20Var.f30614r.setText("");
                AndroidUtilities.showKeyboard(s20Var.f30614r);
                return;
            default:
                vh vhVar = new vh(9);
                mr0 mr0Var2 = this.f27114b;
                if (mr0Var2.isKeyboardVisible()) {
                    s20 s20Var2 = mr0Var2.f28926y0;
                    if (s20Var2 != null) {
                        AndroidUtilities.hideKeyboard(s20Var2.f30614r);
                    }
                    AndroidUtilities.runOnUIThread(vhVar, 300L);
                    return;
                }
                vhVar.run();
                return;
        }
    }
}
