package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f35094a;
    public final d7 f35095b;
    public final r6 f35096c;
    public final s6 d;

    public j6(d7 d7Var, r6 r6Var, s6 s6Var, int i10) {
        this.f35094a = i10;
        this.f35095b = d7Var;
        this.f35096c = r6Var;
        this.d = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f35094a) {
            case 0:
                Utilities.globalQueue.postRunnable(new j6(this.f35095b, this.f35096c, this.d, 1));
                return;
            default:
                d7.W(this.f35095b, this.f35096c, this.d);
                return;
        }
    }
}
