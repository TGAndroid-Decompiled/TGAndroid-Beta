package org.telegram.ui.Components;

import java.util.ArrayList;
public final class is implements Runnable {
    public final int f36264a;
    public final js f36265b;

    public is(js jsVar, int i7) {
        this.f36264a = i7;
        this.f36265b = jsVar;
    }

    @Override
    public final void run() {
        switch (this.f36264a) {
            case 0:
                js jsVar = this.f36265b;
                jsVar.f36548c = false;
                jsVar.f36547b.run();
                ArrayList arrayList = jsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - jsVar.f36550f > 3600000) {
                    arrayList.clear();
                    jsVar.f36549e = false;
                    jsVar.f36551g = null;
                    jsVar.a();
                    return;
                }
                return;
            default:
                this.f36265b.f36552i = false;
                return;
        }
    }
}
