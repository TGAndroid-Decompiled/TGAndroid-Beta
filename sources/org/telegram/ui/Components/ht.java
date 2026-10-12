package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ht implements Runnable {
    public final int f26891a;
    public final kt f26892b;

    public ht(kt ktVar, int i10) {
        this.f26891a = i10;
        this.f26892b = ktVar;
    }

    @Override
    public final void run() {
        switch (this.f26891a) {
            case 0:
                kt ktVar = this.f26892b;
                ktVar.f27926c = false;
                ktVar.f27925b.run();
                ArrayList arrayList = ktVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - ktVar.f27928f > 3600000) {
                    arrayList.clear();
                    ktVar.f27927e = false;
                    ktVar.f27929g = null;
                    ktVar.a();
                    return;
                }
                return;
            default:
                this.f26892b.f27930i = false;
                return;
        }
    }
}
