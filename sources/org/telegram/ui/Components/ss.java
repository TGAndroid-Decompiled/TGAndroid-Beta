package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ss implements Runnable {
    public final int f30869a;
    public final ts f30870b;

    public ss(ts tsVar, int i10) {
        this.f30869a = i10;
        this.f30870b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f30869a) {
            case 0:
                ts tsVar = this.f30870b;
                tsVar.f31156c = false;
                tsVar.f31155b.run();
                ArrayList arrayList = tsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - tsVar.f31158f > 3600000) {
                    arrayList.clear();
                    tsVar.f31157e = false;
                    tsVar.f31159g = null;
                    tsVar.a();
                    return;
                }
                return;
            default:
                this.f30870b.f31160i = false;
                return;
        }
    }
}
