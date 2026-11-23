package org.telegram.ui.Components;

import java.util.ArrayList;
public final class is implements Runnable {
    public final int f36305a;
    public final js f36306b;

    public is(js jsVar, int i7) {
        this.f36305a = i7;
        this.f36306b = jsVar;
    }

    @Override
    public final void run() {
        switch (this.f36305a) {
            case 0:
                js jsVar = this.f36306b;
                jsVar.f36593c = false;
                jsVar.f36592b.run();
                ArrayList arrayList = jsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - jsVar.f36595f > 3600000) {
                    arrayList.clear();
                    jsVar.f36594e = false;
                    jsVar.f36596g = null;
                    jsVar.a();
                    return;
                }
                return;
            default:
                this.f36306b.f36597i = false;
                return;
        }
    }
}
