package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nn0 implements Runnable {
    public final int f35566a;
    public final qo0 f35567b;

    public nn0(qo0 qo0Var, int i10) {
        this.f35566a = i10;
        this.f35567b = qo0Var;
    }

    @Override
    public final void run() {
        switch (this.f35566a) {
            case 0:
                qo0 qo0Var = this.f35567b;
                qo0Var.f36496f[0].requestFocus();
                AndroidUtilities.showKeyboard(qo0Var.f36496f[0]);
                return;
            case 1:
                this.f35567b.t0();
                return;
            case 2:
                qo0 qo0Var2 = this.f35567b;
                qo0Var2.getMessagesController().newMessageCallback = null;
                if (qo0Var2.f36498f1 == 3 && !qo0Var2.isFinishing()) {
                    qo0Var2.f36498f1 = 4;
                    po0 po0Var = qo0Var2.Z0;
                    if (po0Var != null) {
                        po0Var.a(4);
                    }
                    qo0Var2.finishFragment();
                    return;
                } else if (qo0Var2.f36498f1 == 1 && !qo0Var2.isFinishing()) {
                    qo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                qo0 qo0Var3 = this.f35567b;
                if (qo0Var3.f36492d0 != null) {
                    qo0Var3.w0();
                    qo0Var3.f36492d0 = null;
                    return;
                }
                return;
        }
    }
}
