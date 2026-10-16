package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ct implements Runnable {
    public final int f23890a;
    public final dt f23891b;

    public ct(dt dtVar, int i10) {
        this.f23890a = i10;
        this.f23891b = dtVar;
    }

    @Override
    public final void run() {
        switch (this.f23890a) {
            case 0:
                dt dtVar = this.f23891b;
                dtVar.f24180c = false;
                dtVar.f24179b.run();
                ArrayList arrayList = dtVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - dtVar.f24181f > 3600000) {
                    arrayList.clear();
                    dtVar.e = false;
                    dtVar.f24182g = null;
                    dtVar.a();
                    return;
                }
                return;
            default:
                this.f23891b.f24183i = false;
                return;
        }
    }
}
