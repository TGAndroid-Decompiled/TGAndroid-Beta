package org.telegram.ui.Components;

import java.util.ArrayList;
public final class vs implements Runnable {
    public final int f28592a;
    public final ws f28593b;

    public vs(ws wsVar, int i10) {
        this.f28592a = i10;
        this.f28593b = wsVar;
    }

    @Override
    public final void run() {
        switch (this.f28592a) {
            case 0:
                ws wsVar = this.f28593b;
                wsVar.f28830c = false;
                wsVar.f28829b.run();
                ArrayList arrayList = wsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - wsVar.f28831f > 3600000) {
                    arrayList.clear();
                    wsVar.e = false;
                    wsVar.f28832g = null;
                    wsVar.a();
                    return;
                }
                return;
            default:
                this.f28593b.f28833i = false;
                return;
        }
    }
}
