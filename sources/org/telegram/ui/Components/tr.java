package org.telegram.ui.Components;

import java.util.ArrayList;
public final class tr implements Runnable {
    public final int f38474a;
    public final ur f38475b;

    public tr(ur urVar, int i7) {
        this.f38474a = i7;
        this.f38475b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f38474a) {
            case 0:
                ur urVar = this.f38475b;
                urVar.f38782c = false;
                urVar.f38781b.run();
                ArrayList arrayList = urVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - urVar.f38784f > 3600000) {
                    arrayList.clear();
                    urVar.f38783e = false;
                    urVar.f38785g = null;
                    urVar.a();
                    return;
                }
                return;
            default:
                this.f38475b.f38786i = false;
                return;
        }
    }
}
