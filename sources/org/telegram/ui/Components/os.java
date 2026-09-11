package org.telegram.ui.Components;

import java.util.ArrayList;
public final class os implements Runnable {
    public final int f29176a;
    public final ps f29177b;

    public os(ps psVar, int i10) {
        this.f29176a = i10;
        this.f29177b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f29176a) {
            case 0:
                ps psVar = this.f29177b;
                psVar.f29480c = false;
                psVar.f29479b.run();
                ArrayList arrayList = psVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - psVar.f29482f > 3600000) {
                    arrayList.clear();
                    psVar.f29481e = false;
                    psVar.f29483g = null;
                    psVar.a();
                    return;
                }
                return;
            default:
                this.f29177b.f29484i = false;
                return;
        }
    }
}
