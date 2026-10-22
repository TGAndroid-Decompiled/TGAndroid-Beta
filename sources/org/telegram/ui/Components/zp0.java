package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zp0 implements Runnable {
    public final int f33018a;
    public final fr0 f33019b;

    public zp0(fr0 fr0Var, int i10) {
        this.f33018a = i10;
        this.f33019b = fr0Var;
    }

    @Override
    public final void run() {
        switch (this.f33018a) {
            case 0:
                fr0 fr0Var = this.f33019b;
                fr0Var.B0 = true;
                k20 k20Var = fr0Var.f26400z0;
                k20Var.f27729r.setText("");
                AndroidUtilities.showKeyboard(k20Var.f27729r);
                return;
            default:
                rc rcVar = new rc(14);
                fr0 fr0Var2 = this.f33019b;
                if (fr0Var2.isKeyboardVisible()) {
                    k20 k20Var2 = fr0Var2.f26400z0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.f27729r);
                    }
                    AndroidUtilities.runOnUIThread(rcVar, 300L);
                    return;
                }
                rcVar.run();
                return;
        }
    }
}
