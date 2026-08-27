package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class cn0 implements Runnable {

    public final int f37119a;

    public final do0 f37120b;

    public cn0(do0 do0Var, int i10) {
        this.f37119a = i10;
        this.f37120b = do0Var;
    }

    @Override
    public final void run() {
        switch (this.f37119a) {
            case 0:
                do0 do0Var = this.f37120b;
                do0Var.f37462f[0].requestFocus();
                AndroidUtilities.showKeyboard(do0Var.f37462f[0]);
                break;
            case 1:
                this.f37120b.t0();
                break;
            case 2:
                do0 do0Var2 = this.f37120b;
                do0Var2.getMessagesController().newMessageCallback = null;
                if (do0Var2.f37456b1 == 3 && !do0Var2.isFinishing()) {
                    do0Var2.f37456b1 = 4;
                    co0 co0Var = do0Var2.V0;
                    if (co0Var != null) {
                        co0Var.b(4);
                    }
                    do0Var2.finishFragment();
                    break;
                } else if (do0Var2.f37456b1 == 1 && !do0Var2.isFinishing()) {
                    do0Var2.finishFragment();
                    break;
                }
                break;
            default:
                do0 do0Var3 = this.f37120b;
                if (do0Var3.Z != null) {
                    do0Var3.w0();
                    do0Var3.Z = null;
                    break;
                }
                break;
        }
    }
}
