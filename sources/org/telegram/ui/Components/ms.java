package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ms implements Runnable {
    public final int f27131a;
    public final ns f27132b;

    public ms(ns nsVar, int i10) {
        this.f27131a = i10;
        this.f27132b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f27131a) {
            case 0:
                ns nsVar = this.f27132b;
                nsVar.f27359c = false;
                nsVar.f27358b.run();
                ArrayList arrayList = nsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - nsVar.f27360f > 3600000) {
                    arrayList.clear();
                    nsVar.e = false;
                    nsVar.f27361g = null;
                    nsVar.a();
                    return;
                }
                return;
            default:
                this.f27132b.f27362i = false;
                return;
        }
    }
}
