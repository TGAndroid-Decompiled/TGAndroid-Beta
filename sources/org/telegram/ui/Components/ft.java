package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ft implements Runnable {
    public final int f26480a;
    public final gt f26481b;

    public ft(gt gtVar, int i10) {
        this.f26480a = i10;
        this.f26481b = gtVar;
    }

    @Override
    public final void run() {
        switch (this.f26480a) {
            case 0:
                gt gtVar = this.f26481b;
                gtVar.f26874c = false;
                gtVar.f26873b.run();
                ArrayList arrayList = gtVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - gtVar.f26876f > 3600000) {
                    arrayList.clear();
                    gtVar.f26875e = false;
                    gtVar.f26877g = null;
                    gtVar.a();
                    return;
                }
                return;
            default:
                this.f26481b.f26878i = false;
                return;
        }
    }
}
