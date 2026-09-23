package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class cp0 implements Runnable {
    public final int f23087a;
    public final hq0 f23088b;

    public cp0(hq0 hq0Var, int i10) {
        this.f23087a = i10;
        this.f23088b = hq0Var;
    }

    @Override
    public final void run() {
        switch (this.f23087a) {
            case 0:
                hq0 hq0Var = this.f23088b;
                hq0Var.A0 = true;
                c20 c20Var = hq0Var.f24805y0;
                c20Var.f22890r.setText("");
                AndroidUtilities.showKeyboard(c20Var.f22890r);
                return;
            default:
                th thVar = new th(7);
                hq0 hq0Var2 = this.f23088b;
                if (hq0Var2.isKeyboardVisible()) {
                    c20 c20Var2 = hq0Var2.f24805y0;
                    if (c20Var2 != null) {
                        AndroidUtilities.hideKeyboard(c20Var2.f22890r);
                    }
                    AndroidUtilities.runOnUIThread(thVar, 300L);
                    return;
                }
                thVar.run();
                return;
        }
    }
}
