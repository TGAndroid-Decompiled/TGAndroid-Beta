package org.telegram.ui.Components;

import java.util.ArrayList;
public final class tr implements Runnable {
    public final int f38405a;
    public final ur f38406b;

    public tr(ur urVar, int i7) {
        this.f38405a = i7;
        this.f38406b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f38405a) {
            case 0:
                ur urVar = this.f38406b;
                urVar.f38713c = false;
                urVar.f38712b.run();
                ArrayList arrayList = urVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - urVar.f38715f > 3600000) {
                    arrayList.clear();
                    urVar.f38714e = false;
                    urVar.f38716g = null;
                    urVar.a();
                    return;
                }
                return;
            default:
                this.f38406b.f38717i = false;
                return;
        }
    }
}
