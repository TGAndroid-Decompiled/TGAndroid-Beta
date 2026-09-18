package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class bc0 implements Runnable {
    public final int f32102a;
    public final hc0 f32103b;

    public bc0(hc0 hc0Var, int i10) {
        this.f32102a = i10;
        this.f32103b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32102a) {
            case 0:
                hc0 hc0Var = this.f32103b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.f34236b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f32103b.a();
                return;
        }
    }
}
