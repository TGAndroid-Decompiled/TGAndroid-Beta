package org.telegram.ui.Components;

import java.util.ArrayList;
public final class es implements Runnable {
    public final int f25920a;
    public final fs f25921b;

    public es(fs fsVar, int i10) {
        this.f25920a = i10;
        this.f25921b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f25920a) {
            case 0:
                fs fsVar = this.f25921b;
                fsVar.f26211c = false;
                fsVar.f26210b.run();
                ArrayList arrayList = fsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - fsVar.f26212f > 3600000) {
                    arrayList.clear();
                    fsVar.e = false;
                    fsVar.f26213g = null;
                    fsVar.a();
                    return;
                }
                return;
            default:
                this.f25921b.f26214i = false;
                return;
        }
    }
}
