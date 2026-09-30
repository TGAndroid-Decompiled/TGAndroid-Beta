package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ss implements Runnable {
    public final int f28340a;
    public final ts f28341b;

    public ss(ts tsVar, int i10) {
        this.f28340a = i10;
        this.f28341b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f28340a) {
            case 0:
                ts tsVar = this.f28341b;
                tsVar.f28651c = false;
                tsVar.f28650b.run();
                ArrayList arrayList = tsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - tsVar.f28652f > 3600000) {
                    arrayList.clear();
                    tsVar.e = false;
                    tsVar.f28653g = null;
                    tsVar.a();
                    return;
                }
                return;
            default:
                this.f28341b.f28654i = false;
                return;
        }
    }
}
