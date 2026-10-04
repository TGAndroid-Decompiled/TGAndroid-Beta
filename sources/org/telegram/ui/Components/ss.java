package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ss implements Runnable {
    public final int f30868a;
    public final ts f30869b;

    public ss(ts tsVar, int i10) {
        this.f30868a = i10;
        this.f30869b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f30868a) {
            case 0:
                ts tsVar = this.f30869b;
                tsVar.f31155c = false;
                tsVar.f31154b.run();
                ArrayList arrayList = tsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - tsVar.f31157f > 3600000) {
                    arrayList.clear();
                    tsVar.f31156e = false;
                    tsVar.f31158g = null;
                    tsVar.a();
                    return;
                }
                return;
            default:
                this.f30869b.f31159i = false;
                return;
        }
    }
}
