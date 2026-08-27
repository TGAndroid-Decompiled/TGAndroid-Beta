package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class mo0 implements Runnable {

    public final int f30730a;

    public final sp0 f30731b;

    public mo0(sp0 sp0Var, int i10) {
        this.f30730a = i10;
        this.f30731b = sp0Var;
    }

    @Override
    public final void run() {
        switch (this.f30730a) {
            case 0:
                sp0 sp0Var = this.f30731b;
                sp0Var.f32548w0 = true;
                p10 p10Var = sp0Var.f32545u0;
                p10Var.f31468r.setText("");
                AndroidUtilities.showKeyboard(p10Var.f31468r);
                break;
            default:
                gc gcVar = new gc(11);
                sp0 sp0Var2 = this.f30731b;
                if (!sp0Var2.isKeyboardVisible()) {
                    gcVar.run();
                } else {
                    p10 p10Var2 = sp0Var2.f32545u0;
                    if (p10Var2 != null) {
                        AndroidUtilities.hideKeyboard(p10Var2.f31468r);
                    }
                    AndroidUtilities.runOnUIThread(gcVar, 300L);
                }
                break;
        }
    }
}
