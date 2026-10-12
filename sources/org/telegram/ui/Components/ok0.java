package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class ok0 implements Runnable {
    public final int f29229a;
    public final xk0 f29230b;
    public final TLObject f29231c;

    public ok0(xk0 xk0Var, TLObject tLObject, int i10) {
        this.f29229a = i10;
        this.f29230b = xk0Var;
        this.f29231c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f29229a) {
            case 0:
                xk0 xk0Var = this.f29230b;
                NotificationCenter.getInstance(xk0Var.f32795b).doOnIdle(new ok0(xk0Var, this.f29231c, 1));
                return;
            default:
                xk0.a(this.f29230b, this.f29231c);
                return;
        }
    }
}
