package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wp0 implements Runnable {
    public final int f32686a;
    public final br0 f32687b;

    public wp0(br0 br0Var, int i10) {
        this.f32686a = i10;
        this.f32687b = br0Var;
    }

    @Override
    public final void run() {
        switch (this.f32686a) {
            case 0:
                br0 br0Var = this.f32687b;
                br0Var.A0 = true;
                f20 f20Var = br0Var.f25084y0;
                f20Var.f26295r.setText("");
                AndroidUtilities.showKeyboard(f20Var.f26295r);
                return;
            default:
                uh uhVar = new uh(9);
                br0 br0Var2 = this.f32687b;
                if (br0Var2.isKeyboardVisible()) {
                    f20 f20Var2 = br0Var2.f25084y0;
                    if (f20Var2 != null) {
                        AndroidUtilities.hideKeyboard(f20Var2.f26295r);
                    }
                    AndroidUtilities.runOnUIThread(uhVar, 300L);
                    return;
                }
                uhVar.run();
                return;
        }
    }
}
