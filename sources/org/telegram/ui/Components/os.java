package org.telegram.ui.Components;

import java.util.ArrayList;
public final class os implements Runnable {
    public final int f29177a;
    public final ps f29178b;

    public os(ps psVar, int i10) {
        this.f29177a = i10;
        this.f29178b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f29177a) {
            case 0:
                ps psVar = this.f29178b;
                psVar.f29481c = false;
                psVar.f29480b.run();
                ArrayList arrayList = psVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - psVar.f29483f > 3600000) {
                    arrayList.clear();
                    psVar.f29482e = false;
                    psVar.f29484g = null;
                    psVar.a();
                    return;
                }
                return;
            default:
                this.f29178b.f29485i = false;
                return;
        }
    }
}
