package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f27132a;
    public final qs f27133b;

    public ps(qs qsVar, int i10) {
        this.f27132a = i10;
        this.f27133b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f27132a) {
            case 0:
                qs qsVar = this.f27133b;
                qsVar.f27434c = false;
                qsVar.f27433b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f27435f > 3600000) {
                    arrayList.clear();
                    qsVar.e = false;
                    qsVar.f27436g = null;
                    qsVar.a();
                    return;
                }
                return;
            default:
                this.f27133b.f27437i = false;
                return;
        }
    }
}
