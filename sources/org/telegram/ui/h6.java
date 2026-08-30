package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f34766a;
    public final b7 f34767b;
    public final p6 f34768c;
    public final q6 d;

    public h6(b7 b7Var, p6 p6Var, q6 q6Var, int i10) {
        this.f34766a = i10;
        this.f34767b = b7Var;
        this.f34768c = p6Var;
        this.d = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f34766a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.f34767b, this.f34768c, this.d, 1));
                return;
            default:
                b7.W(this.f34767b, this.f34768c, this.d);
                return;
        }
    }
}
