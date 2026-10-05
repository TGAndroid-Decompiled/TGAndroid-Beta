package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ss implements Runnable {
    public final int f30939a;
    public final ts f30940b;

    public ss(ts tsVar, int i10) {
        this.f30939a = i10;
        this.f30940b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f30939a) {
            case 0:
                ts tsVar = this.f30940b;
                tsVar.f31230c = false;
                tsVar.f31229b.run();
                ArrayList arrayList = tsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - tsVar.f31232f > 3600000) {
                    arrayList.clear();
                    tsVar.f31231e = false;
                    tsVar.f31233g = null;
                    tsVar.a();
                    return;
                }
                return;
            default:
                this.f30940b.f31234i = false;
                return;
        }
    }
}
