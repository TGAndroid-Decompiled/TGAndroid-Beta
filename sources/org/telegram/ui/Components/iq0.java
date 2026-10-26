package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class iq0 implements Runnable {
    public final int f29352a;
    public final mr0 f29353b;

    public iq0(mr0 mr0Var, int i10) {
        this.f29352a = i10;
        this.f29353b = mr0Var;
    }

    @Override
    public final void run() {
        switch (this.f29352a) {
            case 0:
                mr0 mr0Var = this.f29353b;
                mr0Var.B0 = true;
                m20 m20Var = mr0Var.f30732z0;
                m20Var.f30367r.setText("");
                AndroidUtilities.showKeyboard(m20Var.f30367r);
                return;
            default:
                k5 k5Var = new k5(16);
                mr0 mr0Var2 = this.f29353b;
                if (mr0Var2.isKeyboardVisible()) {
                    m20 m20Var2 = mr0Var2.f30732z0;
                    if (m20Var2 != null) {
                        AndroidUtilities.hideKeyboard(m20Var2.f30367r);
                    }
                    AndroidUtilities.runOnUIThread(k5Var, 300L);
                    return;
                }
                k5Var.run();
                return;
        }
    }
}
