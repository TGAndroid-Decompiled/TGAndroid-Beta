package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class hp0 implements Runnable {
    public final int f27557a;
    public final mq0 f27558b;

    public hp0(mq0 mq0Var, int i10) {
        this.f27557a = i10;
        this.f27558b = mq0Var;
    }

    @Override
    public final void run() {
        switch (this.f27557a) {
            case 0:
                mq0 mq0Var = this.f27558b;
                mq0Var.f29227x0 = true;
                d20 d20Var = mq0Var.f29223v0;
                d20Var.f26172r.setText("");
                AndroidUtilities.showKeyboard(d20Var.f26172r);
                return;
            default:
                jc jcVar = new jc(12);
                mq0 mq0Var2 = this.f27558b;
                if (mq0Var2.isKeyboardVisible()) {
                    d20 d20Var2 = mq0Var2.f29223v0;
                    if (d20Var2 != null) {
                        AndroidUtilities.hideKeyboard(d20Var2.f26172r);
                    }
                    AndroidUtilities.runOnUIThread(jcVar, 300L);
                    return;
                }
                jcVar.run();
                return;
        }
    }
}
