package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class bc0 implements Runnable {
    public final int f32349a;
    public final hc0 f32350b;

    public bc0(hc0 hc0Var, int i10) {
        this.f32349a = i10;
        this.f32350b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32349a) {
            case 0:
                hc0 hc0Var = this.f32350b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.f34165b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f32350b.a();
                return;
        }
    }
}
