package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dp0 implements Runnable {
    public final int f25435a;
    public final hq0 f25436b;

    public dp0(hq0 hq0Var, int i10) {
        this.f25435a = i10;
        this.f25436b = hq0Var;
    }

    @Override
    public final void run() {
        switch (this.f25435a) {
            case 0:
                hq0 hq0Var = this.f25436b;
                hq0Var.A0 = true;
                b20 b20Var = hq0Var.f26821y0;
                b20Var.f24523r.setText("");
                AndroidUtilities.showKeyboard(b20Var.f24523r);
                return;
            default:
                ue ueVar = new ue(8);
                hq0 hq0Var2 = this.f25436b;
                if (hq0Var2.isKeyboardVisible()) {
                    b20 b20Var2 = hq0Var2.f26821y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.f24523r);
                    }
                    AndroidUtilities.runOnUIThread(ueVar, 300L);
                    return;
                }
                ueVar.run();
                return;
        }
    }
}
