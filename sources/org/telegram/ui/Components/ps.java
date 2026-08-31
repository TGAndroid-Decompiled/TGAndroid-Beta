package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f30193a;
    public final qs f30194b;

    public ps(qs qsVar, int i10) {
        this.f30193a = i10;
        this.f30194b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f30193a) {
            case 0:
                qs qsVar = this.f30194b;
                qsVar.f30471c = false;
                qsVar.f30470b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f30473f > 3600000) {
                    arrayList.clear();
                    qsVar.f30472e = false;
                    qsVar.f30474g = null;
                    qsVar.a();
                    return;
                }
                return;
            default:
                this.f30194b.f30475i = false;
                return;
        }
    }
}
