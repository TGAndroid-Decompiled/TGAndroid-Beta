package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f30181a;
    public final qs f30182b;

    public ps(qs qsVar, int i10) {
        this.f30181a = i10;
        this.f30182b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f30181a) {
            case 0:
                qs qsVar = this.f30182b;
                qsVar.f30509c = false;
                qsVar.f30508b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f30511f > 3600000) {
                    arrayList.clear();
                    qsVar.f30510e = false;
                    qsVar.f30512g = null;
                    qsVar.a();
                    return;
                }
                return;
            default:
                this.f30182b.f30513i = false;
                return;
        }
    }
}
