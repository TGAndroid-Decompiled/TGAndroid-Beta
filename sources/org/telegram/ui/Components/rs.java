package org.telegram.ui.Components;

import java.util.ArrayList;
public final class rs implements Runnable {
    public final int f28083a;
    public final ss f28084b;

    public rs(ss ssVar, int i10) {
        this.f28083a = i10;
        this.f28084b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f28083a) {
            case 0:
                ss ssVar = this.f28084b;
                ssVar.f28374c = false;
                ssVar.f28373b.run();
                ArrayList arrayList = ssVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - ssVar.f28375f > 3600000) {
                    arrayList.clear();
                    ssVar.e = false;
                    ssVar.f28376g = null;
                    ssVar.a();
                    return;
                }
                return;
            default:
                this.f28084b.f28377i = false;
                return;
        }
    }
}
