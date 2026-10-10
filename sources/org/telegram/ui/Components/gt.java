package org.telegram.ui.Components;

import java.util.ArrayList;
public final class gt implements Runnable {
    public final int f26839a;
    public final ht f26840b;

    public gt(ht htVar, int i10) {
        this.f26839a = i10;
        this.f26840b = htVar;
    }

    @Override
    public final void run() {
        switch (this.f26839a) {
            case 0:
                ht htVar = this.f26840b;
                htVar.f27142c = false;
                htVar.f27141b.run();
                ArrayList arrayList = htVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - htVar.f27144f > 3600000) {
                    arrayList.clear();
                    htVar.f27143e = false;
                    htVar.f27145g = null;
                    htVar.a();
                    return;
                }
                return;
            default:
                this.f26840b.f27146i = false;
                return;
        }
    }
}
