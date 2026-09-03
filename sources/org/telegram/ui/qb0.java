package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class qb0 implements Runnable {
    public final int f40420a;
    public final xb0 f40421b;

    public qb0(xb0 xb0Var, int i10) {
        this.f40420a = i10;
        this.f40421b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f40420a) {
            case 0:
                xb0 xb0Var = this.f40421b;
                if (xb0Var.h >= 0) {
                    ConnectionsManager.getInstance(xb0Var.f43001b).cancelRequest(xb0Var.h, true);
                    xb0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f40421b.a();
                return;
        }
    }
}
