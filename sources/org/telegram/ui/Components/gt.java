package org.telegram.ui.Components;

import java.util.ArrayList;
public final class gt implements Runnable {
    public final int f26819a;
    public final ht f26820b;

    public gt(ht htVar, int i10) {
        this.f26819a = i10;
        this.f26820b = htVar;
    }

    @Override
    public final void run() {
        switch (this.f26819a) {
            case 0:
                ht htVar = this.f26820b;
                htVar.f27073c = false;
                htVar.f27072b.run();
                ArrayList arrayList = htVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - htVar.f27075f > 3600000) {
                    arrayList.clear();
                    htVar.f27074e = false;
                    htVar.f27076g = null;
                    htVar.a();
                    return;
                }
                return;
            default:
                this.f26820b.f27077i = false;
                return;
        }
    }
}
