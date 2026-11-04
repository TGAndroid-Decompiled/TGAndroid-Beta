package org.telegram.ui.Components;

import java.util.ArrayList;
public final class tr implements Runnable {
    public final int f38536a;
    public final ur f38537b;

    public tr(ur urVar, int i3) {
        this.f38536a = i3;
        this.f38537b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f38536a) {
            case 0:
                ur urVar = this.f38537b;
                urVar.f38852c = false;
                urVar.f38851b.run();
                ArrayList arrayList = urVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - urVar.f38854f > 3600000) {
                    arrayList.clear();
                    urVar.f38853e = false;
                    urVar.f38855g = null;
                    urVar.a();
                    return;
                }
                return;
            default:
                this.f38537b.f38856i = false;
                return;
        }
    }
}
