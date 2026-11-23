package org.telegram.ui.Components;

import java.util.ArrayList;
public final class fs implements Runnable {
    public final int f35186a;
    public final gs f35187b;

    public fs(gs gsVar, int i7) {
        this.f35186a = i7;
        this.f35187b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f35186a) {
            case 0:
                gs gsVar = this.f35187b;
                gsVar.f35525c = false;
                gsVar.f35524b.run();
                ArrayList arrayList = gsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - gsVar.f35527f > 3600000) {
                    arrayList.clear();
                    gsVar.f35526e = false;
                    gsVar.f35528g = null;
                    gsVar.a();
                    return;
                }
                return;
            default:
                this.f35187b.f35529i = false;
                return;
        }
    }
}
