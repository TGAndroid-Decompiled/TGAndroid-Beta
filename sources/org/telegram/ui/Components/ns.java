package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ns implements Runnable {
    public final int f27355a;
    public final os f27356b;

    public ns(os osVar, int i10) {
        this.f27355a = i10;
        this.f27356b = osVar;
    }

    @Override
    public final void run() {
        switch (this.f27355a) {
            case 0:
                os osVar = this.f27356b;
                osVar.f27656c = false;
                osVar.f27655b.run();
                ArrayList arrayList = osVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - osVar.f27657f > 3600000) {
                    arrayList.clear();
                    osVar.e = false;
                    osVar.f27658g = null;
                    osVar.a();
                    return;
                }
                return;
            default:
                this.f27356b.f27659i = false;
                return;
        }
    }
}
