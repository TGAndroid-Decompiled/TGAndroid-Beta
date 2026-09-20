package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f27438a;
    public final qs f27439b;

    public ps(qs qsVar, int i10) {
        this.f27438a = i10;
        this.f27439b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f27438a) {
            case 0:
                qs qsVar = this.f27439b;
                qsVar.f27657c = false;
                qsVar.f27656b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f27658f > 3600000) {
                    arrayList.clear();
                    qsVar.e = false;
                    qsVar.f27659g = null;
                    qsVar.a();
                    return;
                }
                return;
            default:
                this.f27439b.f27660i = false;
                return;
        }
    }
}
