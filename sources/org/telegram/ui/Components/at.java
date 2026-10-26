package org.telegram.ui.Components;

import java.util.ArrayList;
public final class at implements Runnable {
    public final int f26616a;
    public final bt f26617b;

    public at(bt btVar, int i10) {
        this.f26616a = i10;
        this.f26617b = btVar;
    }

    @Override
    public final void run() {
        switch (this.f26616a) {
            case 0:
                bt btVar = this.f26617b;
                btVar.f26961c = false;
                btVar.f26960b.run();
                ArrayList arrayList = btVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - btVar.f26962f > 3600000) {
                    arrayList.clear();
                    btVar.e = false;
                    btVar.f26963g = null;
                    btVar.a();
                    return;
                }
                return;
            default:
                this.f26617b.f26964i = false;
                return;
        }
    }
}
