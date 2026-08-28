package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class vi0 implements Runnable {
    public final int f33385a;
    public final ej0 f33386b;
    public final TLObject f33387c;

    public vi0(ej0 ej0Var, TLObject tLObject, int i9) {
        this.f33385a = i9;
        this.f33386b = ej0Var;
        this.f33387c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f33385a) {
            case 0:
                ej0 ej0Var = this.f33386b;
                NotificationCenter.getInstance(ej0Var.f28038b).doOnIdle(new vi0(ej0Var, this.f33387c, 1));
                return;
            default:
                ej0.a(this.f33386b, this.f33387c);
                return;
        }
    }
}
