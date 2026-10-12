package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ct implements Runnable {
    public final int f24208a;
    public final dt f24209b;

    public ct(dt dtVar, int i10) {
        this.f24208a = i10;
        this.f24209b = dtVar;
    }

    @Override
    public final void run() {
        switch (this.f24208a) {
            case 0:
                dt dtVar = this.f24209b;
                dtVar.f24486c = false;
                dtVar.f24485b.run();
                ArrayList arrayList = dtVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - dtVar.f24487f > 3600000) {
                    arrayList.clear();
                    dtVar.e = false;
                    dtVar.f24488g = null;
                    dtVar.a();
                    return;
                }
                return;
            default:
                this.f24209b.f24489i = false;
                return;
        }
    }
}
