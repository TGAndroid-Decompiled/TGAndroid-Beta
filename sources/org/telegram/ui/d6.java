package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f36909a;
    public final x6 f36910b;
    public final k6 f36911c;
    public final l6 d;

    public d6(x6 x6Var, k6 k6Var, l6 l6Var, int i10) {
        this.f36909a = i10;
        this.f36910b = x6Var;
        this.f36911c = k6Var;
        this.d = l6Var;
    }

    @Override
    public final void run() {
        switch (this.f36909a) {
            case 0:
                Utilities.globalQueue.postRunnable(new d6(this.f36910b, this.f36911c, this.d, 1));
                return;
            default:
                x6.W(this.f36910b, this.f36911c, this.d);
                return;
        }
    }
}
