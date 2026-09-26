package org.telegram.ui.Components;

import java.util.ArrayList;
public final class qs implements Runnable {
    public final int f27756a;
    public final rs f27757b;

    public qs(rs rsVar, int i10) {
        this.f27756a = i10;
        this.f27757b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f27756a) {
            case 0:
                rs rsVar = this.f27757b;
                rsVar.f28044c = false;
                rsVar.f28043b.run();
                ArrayList arrayList = rsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - rsVar.f28045f > 3600000) {
                    arrayList.clear();
                    rsVar.e = false;
                    rsVar.f28046g = null;
                    rsVar.a();
                    return;
                }
                return;
            default:
                this.f27757b.f28047i = false;
                return;
        }
    }
}
