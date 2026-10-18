package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ys implements Runnable {
    public final int f32750a;
    public final zs f32751b;

    public ys(zs zsVar, int i10) {
        this.f32750a = i10;
        this.f32751b = zsVar;
    }

    @Override
    public final void run() {
        switch (this.f32750a) {
            case 0:
                zs zsVar = this.f32751b;
                zsVar.f33019c = false;
                zsVar.f33018b.run();
                ArrayList arrayList = zsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - zsVar.f33020f > 3600000) {
                    arrayList.clear();
                    zsVar.e = false;
                    zsVar.f33021g = null;
                    zsVar.a();
                    return;
                }
                return;
            default:
                this.f32751b.f33022i = false;
                return;
        }
    }
}
