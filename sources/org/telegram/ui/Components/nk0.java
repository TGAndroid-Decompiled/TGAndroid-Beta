package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class nk0 implements Runnable {
    public final int f29074a;
    public final wk0 f29075b;
    public final TLObject f29076c;

    public nk0(wk0 wk0Var, TLObject tLObject, int i10) {
        this.f29074a = i10;
        this.f29075b = wk0Var;
        this.f29076c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f29074a) {
            case 0:
                wk0 wk0Var = this.f29075b;
                NotificationCenter.getInstance(wk0Var.f32664b).doOnIdle(new nk0(wk0Var, this.f29076c, 1));
                return;
            default:
                wk0.a(this.f29075b, this.f29076c);
                return;
        }
    }
}
