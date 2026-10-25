package org.telegram.ui.Components;

import java.util.ArrayList;
public final class at implements Runnable {
    public final int f26614a;
    public final bt f26615b;

    public at(bt btVar, int i10) {
        this.f26614a = i10;
        this.f26615b = btVar;
    }

    @Override
    public final void run() {
        switch (this.f26614a) {
            case 0:
                bt btVar = this.f26615b;
                btVar.f26959c = false;
                btVar.f26958b.run();
                ArrayList arrayList = btVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - btVar.f26960f > 3600000) {
                    arrayList.clear();
                    btVar.e = false;
                    btVar.f26961g = null;
                    btVar.a();
                    return;
                }
                return;
            default:
                this.f26615b.f26962i = false;
                return;
        }
    }
}
