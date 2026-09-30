package org.telegram.ui.Components;

import java.util.ArrayList;
public final class rs implements Runnable {
    public final int f28045a;
    public final ss f28046b;

    public rs(ss ssVar, int i10) {
        this.f28045a = i10;
        this.f28046b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f28045a) {
            case 0:
                ss ssVar = this.f28046b;
                ssVar.f28361c = false;
                ssVar.f28360b.run();
                ArrayList arrayList = ssVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - ssVar.f28362f > 3600000) {
                    arrayList.clear();
                    ssVar.e = false;
                    ssVar.f28363g = null;
                    ssVar.a();
                    return;
                }
                return;
            default:
                this.f28046b.f28364i = false;
                return;
        }
    }
}
