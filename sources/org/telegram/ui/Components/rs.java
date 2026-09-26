package org.telegram.ui.Components;

import java.util.ArrayList;
public final class rs implements Runnable {
    public final int f28052a;
    public final ss f28053b;

    public rs(ss ssVar, int i10) {
        this.f28052a = i10;
        this.f28053b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f28052a) {
            case 0:
                ss ssVar = this.f28053b;
                ssVar.f28353c = false;
                ssVar.f28352b.run();
                ArrayList arrayList = ssVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - ssVar.f28354f > 3600000) {
                    arrayList.clear();
                    ssVar.e = false;
                    ssVar.f28355g = null;
                    ssVar.a();
                    return;
                }
                return;
            default:
                this.f28053b.f28356i = false;
                return;
        }
    }
}
