package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class jq0 implements Runnable {
    public final int f29732a;
    public final nr0 f29733b;

    public jq0(nr0 nr0Var, int i10) {
        this.f29732a = i10;
        this.f29733b = nr0Var;
    }

    @Override
    public final void run() {
        switch (this.f29732a) {
            case 0:
                nr0 nr0Var = this.f29733b;
                nr0Var.B0 = true;
                m20 m20Var = nr0Var.f31063z0;
                m20Var.f30347r.setText("");
                AndroidUtilities.showKeyboard(m20Var.f30347r);
                return;
            default:
                k5 k5Var = new k5(16);
                nr0 nr0Var2 = this.f29733b;
                if (nr0Var2.isKeyboardVisible()) {
                    m20 m20Var2 = nr0Var2.f31063z0;
                    if (m20Var2 != null) {
                        AndroidUtilities.hideKeyboard(m20Var2.f30347r);
                    }
                    AndroidUtilities.runOnUIThread(k5Var, 300L);
                    return;
                }
                k5Var.run();
                return;
        }
    }
}
