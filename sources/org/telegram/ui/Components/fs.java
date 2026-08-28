package org.telegram.ui.Components;

import java.util.ArrayList;
public final class fs implements Runnable {
    public final int f28560a;
    public final gs f28561b;

    public fs(gs gsVar, int i9) {
        this.f28560a = i9;
        this.f28561b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f28560a) {
            case 0:
                gs gsVar = this.f28561b;
                gsVar.f28857c = false;
                gsVar.f28856b.run();
                ArrayList arrayList = gsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - gsVar.f28859f > 3600000) {
                    arrayList.clear();
                    gsVar.f28858e = false;
                    gsVar.f28860g = null;
                    gsVar.a();
                    return;
                }
                return;
            default:
                this.f28561b.f28861i = false;
                return;
        }
    }
}
