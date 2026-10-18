package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ys implements Runnable {
    public final int f32757a;
    public final zs f32758b;

    public ys(zs zsVar, int i10) {
        this.f32757a = i10;
        this.f32758b = zsVar;
    }

    @Override
    public final void run() {
        switch (this.f32757a) {
            case 0:
                zs zsVar = this.f32758b;
                zsVar.f33026c = false;
                zsVar.f33025b.run();
                ArrayList arrayList = zsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - zsVar.f33027f > 3600000) {
                    arrayList.clear();
                    zsVar.e = false;
                    zsVar.f33028g = null;
                    zsVar.a();
                    return;
                }
                return;
            default:
                this.f32758b.f33029i = false;
                return;
        }
    }
}
