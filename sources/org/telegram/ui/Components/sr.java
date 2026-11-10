package org.telegram.ui.Components;

import java.util.ArrayList;
public final class sr implements Runnable {
    public final int f38046a;
    public final tr f38047b;

    public sr(tr trVar, int i7) {
        this.f38046a = i7;
        this.f38047b = trVar;
    }

    @Override
    public final void run() {
        switch (this.f38046a) {
            case 0:
                tr trVar = this.f38047b;
                trVar.f38376c = false;
                trVar.f38375b.run();
                ArrayList arrayList = trVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - trVar.f38378f > 3600000) {
                    arrayList.clear();
                    trVar.f38377e = false;
                    trVar.f38379g = null;
                    trVar.a();
                    return;
                }
                return;
            default:
                this.f38047b.f38380i = false;
                return;
        }
    }
}
