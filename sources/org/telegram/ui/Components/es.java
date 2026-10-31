package org.telegram.ui.Components;

import java.util.ArrayList;
public final class es implements Runnable {
    public final int f25854a;
    public final fs f25855b;

    public es(fs fsVar, int i10) {
        this.f25854a = i10;
        this.f25855b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f25854a) {
            case 0:
                fs fsVar = this.f25855b;
                fsVar.f26126c = false;
                fsVar.f26125b.run();
                ArrayList arrayList = fsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - fsVar.f26127f > 3600000) {
                    arrayList.clear();
                    fsVar.e = false;
                    fsVar.f26128g = null;
                    fsVar.a();
                    return;
                }
                return;
            default:
                this.f25855b.f26129i = false;
                return;
        }
    }
}
