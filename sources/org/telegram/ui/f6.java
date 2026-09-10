package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f32687a;
    public final y6 f32688b;
    public final m6 f32689c;
    public final n6 d;

    public f6(y6 y6Var, m6 m6Var, n6 n6Var, int i10) {
        this.f32687a = i10;
        this.f32688b = y6Var;
        this.f32689c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f32687a) {
            case 0:
                Utilities.globalQueue.postRunnable(new f6(this.f32688b, this.f32689c, this.d, 1));
                return;
            default:
                y6.W(this.f32688b, this.f32689c, this.d);
                return;
        }
    }
}
