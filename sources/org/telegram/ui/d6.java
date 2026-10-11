package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f36943a;
    public final x6 f36944b;
    public final k6 f36945c;
    public final l6 d;

    public d6(x6 x6Var, k6 k6Var, l6 l6Var, int i10) {
        this.f36943a = i10;
        this.f36944b = x6Var;
        this.f36945c = k6Var;
        this.d = l6Var;
    }

    @Override
    public final void run() {
        switch (this.f36943a) {
            case 0:
                Utilities.globalQueue.postRunnable(new d6(this.f36944b, this.f36945c, this.d, 1));
                return;
            default:
                x6.W(this.f36944b, this.f36945c, this.d);
                return;
        }
    }
}
