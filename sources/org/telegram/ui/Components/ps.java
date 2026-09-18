package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f27311a;
    public final qs f27312b;

    public ps(qs qsVar, int i10) {
        this.f27311a = i10;
        this.f27312b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f27311a) {
            case 0:
                qs qsVar = this.f27312b;
                qsVar.f27732c = false;
                qsVar.f27731b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f27733f > 3600000) {
                    arrayList.clear();
                    qsVar.e = false;
                    qsVar.f27734g = null;
                    qsVar.a();
                    return;
                }
                return;
            default:
                this.f27312b.f27735i = false;
                return;
        }
    }
}
