package org.telegram.ui.Components;

import java.util.ArrayList;
public final class rs implements Runnable {
    public final int f28046a;
    public final ss f28047b;

    public rs(ss ssVar, int i10) {
        this.f28046a = i10;
        this.f28047b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f28046a) {
            case 0:
                ss ssVar = this.f28047b;
                ssVar.f28364c = false;
                ssVar.f28363b.run();
                ArrayList arrayList = ssVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - ssVar.f28365f > 3600000) {
                    arrayList.clear();
                    ssVar.e = false;
                    ssVar.f28366g = null;
                    ssVar.a();
                    return;
                }
                return;
            default:
                this.f28047b.f28367i = false;
                return;
        }
    }
}
