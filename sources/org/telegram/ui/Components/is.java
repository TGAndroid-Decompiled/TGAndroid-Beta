package org.telegram.ui.Components;

import java.util.ArrayList;
public final class is implements Runnable {
    public final int f36312a;
    public final js f36313b;

    public is(js jsVar, int i7) {
        this.f36312a = i7;
        this.f36313b = jsVar;
    }

    @Override
    public final void run() {
        switch (this.f36312a) {
            case 0:
                js jsVar = this.f36313b;
                jsVar.f36599c = false;
                jsVar.f36598b.run();
                ArrayList arrayList = jsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - jsVar.f36601f > 3600000) {
                    arrayList.clear();
                    jsVar.f36600e = false;
                    jsVar.f36602g = null;
                    jsVar.a();
                    return;
                }
                return;
            default:
                this.f36313b.f36603i = false;
                return;
        }
    }
}
