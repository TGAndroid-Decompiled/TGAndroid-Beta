package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ss implements Runnable {
    public final int f30875a;
    public final ts f30876b;

    public ss(ts tsVar, int i10) {
        this.f30875a = i10;
        this.f30876b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f30875a) {
            case 0:
                ts tsVar = this.f30876b;
                tsVar.f31162c = false;
                tsVar.f31161b.run();
                ArrayList arrayList = tsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - tsVar.f31164f > 3600000) {
                    arrayList.clear();
                    tsVar.f31163e = false;
                    tsVar.f31165g = null;
                    tsVar.a();
                    return;
                }
                return;
            default:
                this.f30876b.f31166i = false;
                return;
        }
    }
}
