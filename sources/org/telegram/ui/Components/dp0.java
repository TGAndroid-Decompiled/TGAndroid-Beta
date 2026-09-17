package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dp0 implements Runnable {
    public final int f25462a;
    public final hq0 f25463b;

    public dp0(hq0 hq0Var, int i10) {
        this.f25462a = i10;
        this.f25463b = hq0Var;
    }

    @Override
    public final void run() {
        switch (this.f25462a) {
            case 0:
                hq0 hq0Var = this.f25463b;
                hq0Var.A0 = true;
                b20 b20Var = hq0Var.f26848y0;
                b20Var.f24550r.setText("");
                AndroidUtilities.showKeyboard(b20Var.f24550r);
                return;
            default:
                ue ueVar = new ue(8);
                hq0 hq0Var2 = this.f25463b;
                if (hq0Var2.isKeyboardVisible()) {
                    b20 b20Var2 = hq0Var2.f26848y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.f24550r);
                    }
                    AndroidUtilities.runOnUIThread(ueVar, 300L);
                    return;
                }
                ueVar.run();
                return;
        }
    }
}
