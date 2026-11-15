package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f47012a;
    public final y6 f47013b;
    public final n6 f47014c;
    public final o6 d;

    public f6(y6 y6Var, n6 n6Var, o6 o6Var, int i7) {
        this.f47012a = i7;
        this.f47013b = y6Var;
        this.f47014c = n6Var;
        this.d = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f47012a) {
            case 0:
                Utilities.f22416e.c(new f6(this.f47013b, this.f47014c, this.d, 1));
                return;
            default:
                y6.b0(this.f47013b, this.f47014c, this.d);
                return;
        }
    }
}
