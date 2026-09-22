package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f27415a;
    public final qs f27416b;

    public ps(qs qsVar, int i10) {
        this.f27415a = i10;
        this.f27416b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f27415a) {
            case 0:
                qs qsVar = this.f27416b;
                qsVar.f27667c = false;
                qsVar.f27666b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f27668f > 3600000) {
                    arrayList.clear();
                    qsVar.e = false;
                    qsVar.f27669g = null;
                    qsVar.a();
                    return;
                }
                return;
            default:
                this.f27416b.f27670i = false;
                return;
        }
    }
}
