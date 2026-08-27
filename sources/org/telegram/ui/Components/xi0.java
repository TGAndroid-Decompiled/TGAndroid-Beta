package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

public final class xi0 implements Runnable {

    public final int f34620a;

    public final gj0 f34621b;

    public final TLObject f34622c;

    public xi0(gj0 gj0Var, TLObject tLObject, int i10) {
        this.f34620a = i10;
        this.f34621b = gj0Var;
        this.f34622c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34620a) {
            case 0:
                gj0 gj0Var = this.f34621b;
                NotificationCenter.getInstance(gj0Var.f28724b).doOnIdle(new xi0(gj0Var, this.f34622c, 1));
                break;
            default:
                gj0.a(this.f34621b, this.f34622c);
                break;
        }
    }
}
