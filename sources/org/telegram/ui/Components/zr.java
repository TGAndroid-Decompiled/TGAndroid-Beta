package org.telegram.ui.Components;

import java.util.ArrayList;
public final class zr implements Runnable {
    public final int f42417a;
    public final as f42418b;

    public zr(as asVar, int i7) {
        this.f42417a = i7;
        this.f42418b = asVar;
    }

    @Override
    public final void run() {
        switch (this.f42417a) {
            case 0:
                as asVar = this.f42418b;
                asVar.f33053c = false;
                asVar.f33052b.run();
                ArrayList arrayList = asVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - asVar.f33055f > 3600000) {
                    arrayList.clear();
                    asVar.f33054e = false;
                    asVar.f33056g = null;
                    asVar.a();
                    return;
                }
                return;
            default:
                this.f42418b.f33057i = false;
                return;
        }
    }
}
