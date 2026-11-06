package org.telegram.ui.Components;

import java.util.ArrayList;
public final class tr implements Runnable {
    public final int f38385a;
    public final ur f38386b;

    public tr(ur urVar, int i7) {
        this.f38385a = i7;
        this.f38386b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f38385a) {
            case 0:
                ur urVar = this.f38386b;
                urVar.f38700c = false;
                urVar.f38699b.run();
                ArrayList arrayList = urVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - urVar.f38702f > 3600000) {
                    arrayList.clear();
                    urVar.f38701e = false;
                    urVar.f38703g = null;
                    urVar.a();
                    return;
                }
                return;
            default:
                this.f38386b.f38704i = false;
                return;
        }
    }
}
