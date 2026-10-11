package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class mk0 implements Runnable {
    public final int f28870a;
    public final vk0 f28871b;
    public final TLObject f28872c;

    public mk0(vk0 vk0Var, TLObject tLObject, int i10) {
        this.f28870a = i10;
        this.f28871b = vk0Var;
        this.f28872c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28870a) {
            case 0:
                vk0 vk0Var = this.f28871b;
                NotificationCenter.getInstance(vk0Var.f31905b).doOnIdle(new mk0(vk0Var, this.f28872c, 1));
                return;
            default:
                vk0.a(this.f28871b, this.f28872c);
                return;
        }
    }
}
