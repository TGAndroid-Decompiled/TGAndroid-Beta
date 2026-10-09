package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r4 implements Runnable {
    public final int f35416a;
    public final t4 f35417b;

    public r4(t4 t4Var, int i10) {
        this.f35416a = i10;
        this.f35417b = t4Var;
    }

    @Override
    public final void run() {
        switch (this.f35416a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r4(this.f35417b, 1));
                return;
            default:
                this.f35417b.a();
                return;
        }
    }
}
