package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dq0 implements Runnable {
    public final int f24473a;
    public final jr0 f24474b;

    public dq0(jr0 jr0Var, int i10) {
        this.f24473a = i10;
        this.f24474b = jr0Var;
    }

    @Override
    public final void run() {
        switch (this.f24473a) {
            case 0:
                jr0 jr0Var = this.f24474b;
                jr0Var.A0 = true;
                o20 o20Var = jr0Var.f26489y0;
                o20Var.f27815r.setText("");
                AndroidUtilities.showKeyboard(o20Var.f27815r);
                return;
            default:
                ve veVar = new ve(10);
                jr0 jr0Var2 = this.f24474b;
                if (jr0Var2.isKeyboardVisible()) {
                    o20 o20Var2 = jr0Var2.f26489y0;
                    if (o20Var2 != null) {
                        AndroidUtilities.hideKeyboard(o20Var2.f27815r);
                    }
                    AndroidUtilities.runOnUIThread(veVar, 300L);
                    return;
                }
                veVar.run();
                return;
        }
    }
}
