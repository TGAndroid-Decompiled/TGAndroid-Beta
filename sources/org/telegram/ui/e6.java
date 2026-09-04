package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f35941a;
    public final z6 f35942b;
    public final m6 f35943c;
    public final n6 d;

    public e6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.f35941a = i10;
        this.f35942b = z6Var;
        this.f35943c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f35941a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.f35942b, this.f35943c, this.d, 1));
                return;
            default:
                z6.W(this.f35942b, this.f35943c, this.d);
                return;
        }
    }
}
