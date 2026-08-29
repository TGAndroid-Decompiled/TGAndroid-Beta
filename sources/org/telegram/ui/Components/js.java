package org.telegram.ui.Components;

import java.util.ArrayList;
public final class js implements Runnable {
    public final int f29813a;
    public final ks f29814b;

    public js(ks ksVar, int i10) {
        this.f29813a = i10;
        this.f29814b = ksVar;
    }

    @Override
    public final void run() {
        switch (this.f29813a) {
            case 0:
                ks ksVar = this.f29814b;
                ksVar.f30136c = false;
                ksVar.f30135b.run();
                ArrayList arrayList = ksVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - ksVar.f30138f > 3600000) {
                    arrayList.clear();
                    ksVar.f30137e = false;
                    ksVar.f30139g = null;
                    ksVar.a();
                    return;
                }
                return;
            default:
                this.f29814b.f30140i = false;
                return;
        }
    }
}
