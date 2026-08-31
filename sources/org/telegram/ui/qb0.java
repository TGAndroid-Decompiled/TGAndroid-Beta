package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class qb0 implements Runnable {
    public final int f40428a;
    public final xb0 f40429b;

    public qb0(xb0 xb0Var, int i10) {
        this.f40428a = i10;
        this.f40429b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f40428a) {
            case 0:
                xb0 xb0Var = this.f40429b;
                if (xb0Var.h >= 0) {
                    ConnectionsManager.getInstance(xb0Var.f43022b).cancelRequest(xb0Var.h, true);
                    xb0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f40429b.a();
                return;
        }
    }
}
