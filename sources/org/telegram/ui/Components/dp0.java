package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dp0 implements Runnable {
    public final int f25434a;
    public final hq0 f25435b;

    public dp0(hq0 hq0Var, int i10) {
        this.f25434a = i10;
        this.f25435b = hq0Var;
    }

    @Override
    public final void run() {
        switch (this.f25434a) {
            case 0:
                hq0 hq0Var = this.f25435b;
                hq0Var.A0 = true;
                b20 b20Var = hq0Var.f26820y0;
                b20Var.f24522r.setText("");
                AndroidUtilities.showKeyboard(b20Var.f24522r);
                return;
            default:
                ue ueVar = new ue(8);
                hq0 hq0Var2 = this.f25435b;
                if (hq0Var2.isKeyboardVisible()) {
                    b20 b20Var2 = hq0Var2.f26820y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.f24522r);
                    }
                    AndroidUtilities.runOnUIThread(ueVar, 300L);
                    return;
                }
                ueVar.run();
                return;
        }
    }
}
