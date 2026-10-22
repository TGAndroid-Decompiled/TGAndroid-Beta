package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ys implements Runnable {
    public final int f32728a;
    public final zs f32729b;

    public ys(zs zsVar, int i10) {
        this.f32728a = i10;
        this.f32729b = zsVar;
    }

    @Override
    public final void run() {
        switch (this.f32728a) {
            case 0:
                zs zsVar = this.f32729b;
                zsVar.f33036c = false;
                zsVar.f33035b.run();
                ArrayList arrayList = zsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - zsVar.f33037f > 3600000) {
                    arrayList.clear();
                    zsVar.e = false;
                    zsVar.f33038g = null;
                    zsVar.a();
                    return;
                }
                return;
            default:
                this.f32729b.f33039i = false;
                return;
        }
    }
}
