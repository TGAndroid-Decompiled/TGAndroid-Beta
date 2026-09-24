package org.telegram.ui.Components;

import java.util.ArrayList;
public final class qs implements Runnable {
    public final int f27750a;
    public final rs f27751b;

    public qs(rs rsVar, int i10) {
        this.f27750a = i10;
        this.f27751b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f27750a) {
            case 0:
                rs rsVar = this.f27751b;
                rsVar.f28036c = false;
                rsVar.f28035b.run();
                ArrayList arrayList = rsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - rsVar.f28037f > 3600000) {
                    arrayList.clear();
                    rsVar.e = false;
                    rsVar.f28038g = null;
                    rsVar.a();
                    return;
                }
                return;
            default:
                this.f27751b.f28039i = false;
                return;
        }
    }
}
