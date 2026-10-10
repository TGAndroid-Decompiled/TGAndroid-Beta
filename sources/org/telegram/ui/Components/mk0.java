package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class mk0 implements Runnable {
    public final int f28830a;
    public final vk0 f28831b;
    public final TLObject f28832c;

    public mk0(vk0 vk0Var, TLObject tLObject, int i10) {
        this.f28830a = i10;
        this.f28831b = vk0Var;
        this.f28832c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28830a) {
            case 0:
                vk0 vk0Var = this.f28831b;
                NotificationCenter.getInstance(vk0Var.f31871b).doOnIdle(new mk0(vk0Var, this.f28832c, 1));
                return;
            default:
                vk0.a(this.f28831b, this.f28832c);
                return;
        }
    }
}
