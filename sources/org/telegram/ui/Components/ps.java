package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f27121a;
    public final qs f27122b;

    public ps(qs qsVar, int i10) {
        this.f27121a = i10;
        this.f27122b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f27121a) {
            case 0:
                qs qsVar = this.f27122b;
                qsVar.f27393c = false;
                qsVar.f27392b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f27394f > 3600000) {
                    arrayList.clear();
                    qsVar.e = false;
                    qsVar.f27395g = null;
                    qsVar.a();
                    return;
                }
                return;
            default:
                this.f27122b.f27396i = false;
                return;
        }
    }
}
