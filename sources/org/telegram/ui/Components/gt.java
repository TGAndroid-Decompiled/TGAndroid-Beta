package org.telegram.ui.Components;

import java.util.ArrayList;
public final class gt implements Runnable {
    public final int f26868a;
    public final ht f26869b;

    public gt(ht htVar, int i10) {
        this.f26868a = i10;
        this.f26869b = htVar;
    }

    @Override
    public final void run() {
        switch (this.f26868a) {
            case 0:
                ht htVar = this.f26869b;
                htVar.f27232c = false;
                htVar.f27231b.run();
                ArrayList arrayList = htVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - htVar.f27234f > 3600000) {
                    arrayList.clear();
                    htVar.f27233e = false;
                    htVar.f27235g = null;
                    htVar.a();
                    return;
                }
                return;
            default:
                this.f26869b.f27236i = false;
                return;
        }
    }
}
