package org.telegram.ui.Components;

import java.util.ArrayList;
public final class tr implements Runnable {
    public final int f38396a;
    public final ur f38397b;

    public tr(ur urVar, int i7) {
        this.f38396a = i7;
        this.f38397b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f38396a) {
            case 0:
                ur urVar = this.f38397b;
                urVar.f38704c = false;
                urVar.f38703b.run();
                ArrayList arrayList = urVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - urVar.f38706f > 3600000) {
                    arrayList.clear();
                    urVar.f38705e = false;
                    urVar.f38707g = null;
                    urVar.a();
                    return;
                }
                return;
            default:
                this.f38397b.f38708i = false;
                return;
        }
    }
}
