package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class bc0 implements Runnable {
    public final int f32098a;
    public final hc0 f32099b;

    public bc0(hc0 hc0Var, int i10) {
        this.f32098a = i10;
        this.f32099b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32098a) {
            case 0:
                hc0 hc0Var = this.f32099b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.f34231b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f32099b.a();
                return;
        }
    }
}
