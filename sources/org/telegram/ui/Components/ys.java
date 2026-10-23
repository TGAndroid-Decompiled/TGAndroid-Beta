package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ys implements Runnable {
    public final int f33033a;
    public final zs f33034b;

    public ys(zs zsVar, int i10) {
        this.f33033a = i10;
        this.f33034b = zsVar;
    }

    @Override
    public final void run() {
        switch (this.f33033a) {
            case 0:
                zs zsVar = this.f33034b;
                zsVar.f33330c = false;
                zsVar.f33329b.run();
                ArrayList arrayList = zsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - zsVar.f33331f > 3600000) {
                    arrayList.clear();
                    zsVar.e = false;
                    zsVar.f33332g = null;
                    zsVar.a();
                    return;
                }
                return;
            default:
                this.f33034b.f33333i = false;
                return;
        }
    }
}
