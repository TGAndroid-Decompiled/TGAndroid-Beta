package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ys implements Runnable {
    public final int f32741a;
    public final zs f32742b;

    public ys(zs zsVar, int i10) {
        this.f32741a = i10;
        this.f32742b = zsVar;
    }

    @Override
    public final void run() {
        switch (this.f32741a) {
            case 0:
                zs zsVar = this.f32742b;
                zsVar.f33033c = false;
                zsVar.f33032b.run();
                ArrayList arrayList = zsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - zsVar.f33034f > 3600000) {
                    arrayList.clear();
                    zsVar.e = false;
                    zsVar.f33035g = null;
                    zsVar.a();
                    return;
                }
                return;
            default:
                this.f32742b.f33036i = false;
                return;
        }
    }
}
