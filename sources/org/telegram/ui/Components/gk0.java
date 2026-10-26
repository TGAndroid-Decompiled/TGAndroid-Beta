package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gk0 implements Runnable {
    public final int f28586a;
    public final pk0 f28587b;
    public final TLObject f28588c;

    public gk0(pk0 pk0Var, TLObject tLObject, int i10) {
        this.f28586a = i10;
        this.f28587b = pk0Var;
        this.f28588c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28586a) {
            case 0:
                pk0 pk0Var = this.f28587b;
                NotificationCenter.getInstance(pk0Var.f31585b).doOnIdle(new gk0(pk0Var, this.f28588c, 1));
                return;
            default:
                pk0.a(this.f28587b, this.f28588c);
                return;
        }
    }
}
