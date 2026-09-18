package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f27124a;
    public final qs f27125b;

    public ps(qs qsVar, int i10) {
        this.f27124a = i10;
        this.f27125b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f27124a) {
            case 0:
                qs qsVar = this.f27125b;
                qsVar.f27396c = false;
                qsVar.f27395b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f27397f > 3600000) {
                    arrayList.clear();
                    qsVar.e = false;
                    qsVar.f27398g = null;
                    qsVar.a();
                    return;
                }
                return;
            default:
                this.f27125b.f27399i = false;
                return;
        }
    }
}
