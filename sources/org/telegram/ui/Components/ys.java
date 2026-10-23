package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ys implements Runnable {
    public final int f32729a;
    public final zs f32730b;

    public ys(zs zsVar, int i10) {
        this.f32729a = i10;
        this.f32730b = zsVar;
    }

    @Override
    public final void run() {
        switch (this.f32729a) {
            case 0:
                zs zsVar = this.f32730b;
                zsVar.f33037c = false;
                zsVar.f33036b.run();
                ArrayList arrayList = zsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - zsVar.f33038f > 3600000) {
                    arrayList.clear();
                    zsVar.e = false;
                    zsVar.f33039g = null;
                    zsVar.a();
                    return;
                }
                return;
            default:
                this.f32730b.f33040i = false;
                return;
        }
    }
}
