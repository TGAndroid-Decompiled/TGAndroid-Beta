package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dq0 implements Runnable {
    public final int f24166a;
    public final ir0 f24167b;

    public dq0(ir0 ir0Var, int i10) {
        this.f24166a = i10;
        this.f24167b = ir0Var;
    }

    @Override
    public final void run() {
        switch (this.f24166a) {
            case 0:
                ir0 ir0Var = this.f24167b;
                ir0Var.A0 = true;
                o20 o20Var = ir0Var.f25772y0;
                o20Var.f27510r.setText("");
                AndroidUtilities.showKeyboard(o20Var.f27510r);
                return;
            default:
                ve veVar = new ve(10);
                ir0 ir0Var2 = this.f24167b;
                if (ir0Var2.isKeyboardVisible()) {
                    o20 o20Var2 = ir0Var2.f25772y0;
                    if (o20Var2 != null) {
                        AndroidUtilities.hideKeyboard(o20Var2.f27510r);
                    }
                    AndroidUtilities.runOnUIThread(veVar, 300L);
                    return;
                }
                veVar.run();
                return;
        }
    }
}
