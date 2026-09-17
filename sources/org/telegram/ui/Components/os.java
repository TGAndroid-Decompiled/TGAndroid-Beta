package org.telegram.ui.Components;

import java.util.ArrayList;
public final class os implements Runnable {
    public final int f29204a;
    public final ps f29205b;

    public os(ps psVar, int i10) {
        this.f29204a = i10;
        this.f29205b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f29204a) {
            case 0:
                ps psVar = this.f29205b;
                psVar.f29508c = false;
                psVar.f29507b.run();
                ArrayList arrayList = psVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - psVar.f29510f > 3600000) {
                    arrayList.clear();
                    psVar.f29509e = false;
                    psVar.f29511g = null;
                    psVar.a();
                    return;
                }
                return;
            default:
                this.f29205b.f29512i = false;
                return;
        }
    }
}
