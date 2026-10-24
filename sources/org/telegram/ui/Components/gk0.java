package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gk0 implements Runnable {
    public final int f26712a;
    public final pk0 f26713b;
    public final TLObject f26714c;

    public gk0(pk0 pk0Var, TLObject tLObject, int i10) {
        this.f26712a = i10;
        this.f26713b = pk0Var;
        this.f26714c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26712a) {
            case 0:
                pk0 pk0Var = this.f26713b;
                NotificationCenter.getInstance(pk0Var.f29579b).doOnIdle(new gk0(pk0Var, this.f26714c, 1));
                return;
            default:
                pk0.a(this.f26713b, this.f26714c);
                return;
        }
    }
}
