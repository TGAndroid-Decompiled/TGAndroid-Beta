package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f38255a;
    public final b7 f38256b;
    public final o6 f38257c;
    public final p6 d;

    public h6(b7 b7Var, o6 o6Var, p6 p6Var, int i10) {
        this.f38255a = i10;
        this.f38256b = b7Var;
        this.f38257c = o6Var;
        this.d = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f38255a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.f38256b, this.f38257c, this.d, 1));
                return;
            default:
                b7.W(this.f38256b, this.f38257c, this.d);
                return;
        }
    }
}
