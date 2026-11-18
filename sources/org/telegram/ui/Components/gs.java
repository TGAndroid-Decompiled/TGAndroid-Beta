package org.telegram.ui.Components;

import java.util.ArrayList;
public final class gs implements Runnable {
    public final int f35555a;
    public final hs f35556b;

    public gs(hs hsVar, int i7) {
        this.f35555a = i7;
        this.f35556b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f35555a) {
            case 0:
                hs hsVar = this.f35556b;
                hsVar.f35959c = false;
                hsVar.f35958b.run();
                ArrayList arrayList = hsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - hsVar.f35961f > 3600000) {
                    arrayList.clear();
                    hsVar.f35960e = false;
                    hsVar.f35962g = null;
                    hsVar.a();
                    return;
                }
                return;
            default:
                this.f35556b.f35963i = false;
                return;
        }
    }
}
