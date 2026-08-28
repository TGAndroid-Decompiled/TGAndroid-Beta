package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bn0 implements Runnable {
    public final int f36912a;
    public final co0 f36913b;

    public bn0(co0 co0Var, int i9) {
        this.f36912a = i9;
        this.f36913b = co0Var;
    }

    @Override
    public final void run() {
        switch (this.f36912a) {
            case 0:
                co0 co0Var = this.f36913b;
                co0Var.f37256f[0].requestFocus();
                AndroidUtilities.showKeyboard(co0Var.f37256f[0]);
                return;
            case 1:
                this.f36913b.s0();
                return;
            case 2:
                co0 co0Var2 = this.f36913b;
                co0Var2.getMessagesController().newMessageCallback = null;
                if (co0Var2.f37250b1 == 3 && !co0Var2.isFinishing()) {
                    co0Var2.f37250b1 = 4;
                    bo0 bo0Var = co0Var2.V0;
                    if (bo0Var != null) {
                        bo0Var.b(4);
                    }
                    co0Var2.finishFragment();
                    return;
                } else if (co0Var2.f37250b1 == 1 && !co0Var2.isFinishing()) {
                    co0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                co0 co0Var3 = this.f36913b;
                if (co0Var3.Z != null) {
                    co0Var3.v0();
                    co0Var3.Z = null;
                    return;
                }
                return;
        }
    }
}
