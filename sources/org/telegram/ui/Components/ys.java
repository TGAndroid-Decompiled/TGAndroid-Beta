package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ys implements Runnable {
    public final int f32724a;
    public final zs f32725b;

    public ys(zs zsVar, int i10) {
        this.f32724a = i10;
        this.f32725b = zsVar;
    }

    @Override
    public final void run() {
        switch (this.f32724a) {
            case 0:
                zs zsVar = this.f32725b;
                zsVar.f33032c = false;
                zsVar.f33031b.run();
                ArrayList arrayList = zsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - zsVar.f33033f > 3600000) {
                    arrayList.clear();
                    zsVar.e = false;
                    zsVar.f33034g = null;
                    zsVar.a();
                    return;
                }
                return;
            default:
                this.f32725b.f33035i = false;
                return;
        }
    }
}
