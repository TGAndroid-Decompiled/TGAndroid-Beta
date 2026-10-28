package org.telegram.ui.Components;

import java.util.ArrayList;
public final class at implements Runnable {
    public final int f26660a;
    public final bt f26661b;

    public at(bt btVar, int i10) {
        this.f26660a = i10;
        this.f26661b = btVar;
    }

    @Override
    public final void run() {
        switch (this.f26660a) {
            case 0:
                bt btVar = this.f26661b;
                btVar.f26909c = false;
                btVar.f26908b.run();
                ArrayList arrayList = btVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - btVar.f26910f > 3600000) {
                    arrayList.clear();
                    btVar.e = false;
                    btVar.f26911g = null;
                    btVar.a();
                    return;
                }
                return;
            default:
                this.f26661b.f26912i = false;
                return;
        }
    }
}
