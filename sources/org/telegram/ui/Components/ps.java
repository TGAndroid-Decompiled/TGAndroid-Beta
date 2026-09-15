package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f27135a;
    public final qs f27136b;

    public ps(qs qsVar, int i10) {
        this.f27135a = i10;
        this.f27136b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f27135a) {
            case 0:
                qs qsVar = this.f27136b;
                qsVar.f27437c = false;
                qsVar.f27436b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f27438f > 3600000) {
                    arrayList.clear();
                    qsVar.e = false;
                    qsVar.f27439g = null;
                    qsVar.a();
                    return;
                }
                return;
            default:
                this.f27136b.f27440i = false;
                return;
        }
    }
}
