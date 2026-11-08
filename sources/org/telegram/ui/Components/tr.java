package org.telegram.ui.Components;

import java.util.ArrayList;
public final class tr implements Runnable {
    public final int f38413a;
    public final ur f38414b;

    public tr(ur urVar, int i7) {
        this.f38413a = i7;
        this.f38414b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f38413a) {
            case 0:
                ur urVar = this.f38414b;
                urVar.f38715c = false;
                urVar.f38714b.run();
                ArrayList arrayList = urVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - urVar.f38717f > 3600000) {
                    arrayList.clear();
                    urVar.f38716e = false;
                    urVar.f38718g = null;
                    urVar.a();
                    return;
                }
                return;
            default:
                this.f38414b.f38719i = false;
                return;
        }
    }
}
