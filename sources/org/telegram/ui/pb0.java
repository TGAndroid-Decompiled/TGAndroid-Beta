package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class pb0 implements Runnable {
    public final int f37269a;
    public final wb0 f37270b;

    public pb0(wb0 wb0Var, int i10) {
        this.f37269a = i10;
        this.f37270b = wb0Var;
    }

    @Override
    public final void run() {
        switch (this.f37269a) {
            case 0:
                wb0 wb0Var = this.f37270b;
                if (wb0Var.h >= 0) {
                    ConnectionsManager.getInstance(wb0Var.f39390b).cancelRequest(wb0Var.h, true);
                    wb0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f37270b.a();
                return;
        }
    }
}
