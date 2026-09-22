package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class bc0 implements Runnable {
    public final int f32367a;
    public final hc0 f32368b;

    public bc0(hc0 hc0Var, int i10) {
        this.f32367a = i10;
        this.f32368b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32367a) {
            case 0:
                hc0 hc0Var = this.f32368b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.f34181b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f32368b.a();
                return;
        }
    }
}
