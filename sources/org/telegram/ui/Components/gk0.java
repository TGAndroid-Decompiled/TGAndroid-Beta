package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gk0 implements Runnable {
    public final int f28584a;
    public final pk0 f28585b;
    public final TLObject f28586c;

    public gk0(pk0 pk0Var, TLObject tLObject, int i10) {
        this.f28584a = i10;
        this.f28585b = pk0Var;
        this.f28586c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28584a) {
            case 0:
                pk0 pk0Var = this.f28585b;
                NotificationCenter.getInstance(pk0Var.f31583b).doOnIdle(new gk0(pk0Var, this.f28586c, 1));
                return;
            default:
                pk0.a(this.f28585b, this.f28586c);
                return;
        }
    }
}
