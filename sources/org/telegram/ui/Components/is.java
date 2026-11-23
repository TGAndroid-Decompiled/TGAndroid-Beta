package org.telegram.ui.Components;

import java.util.ArrayList;
public final class is implements Runnable {
    public final int f36306a;
    public final js f36307b;

    public is(js jsVar, int i7) {
        this.f36306a = i7;
        this.f36307b = jsVar;
    }

    @Override
    public final void run() {
        switch (this.f36306a) {
            case 0:
                js jsVar = this.f36307b;
                jsVar.f36594c = false;
                jsVar.f36593b.run();
                ArrayList arrayList = jsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - jsVar.f36596f > 3600000) {
                    arrayList.clear();
                    jsVar.f36595e = false;
                    jsVar.f36597g = null;
                    jsVar.a();
                    return;
                }
                return;
            default:
                this.f36307b.f36598i = false;
                return;
        }
    }
}
