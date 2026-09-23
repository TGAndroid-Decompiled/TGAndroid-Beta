package org.telegram.ui.Components;

import java.util.ArrayList;
public final class qs implements Runnable {
    public final int f27441a;
    public final rs f27442b;

    public qs(rs rsVar, int i10) {
        this.f27441a = i10;
        this.f27442b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f27441a) {
            case 0:
                rs rsVar = this.f27442b;
                rsVar.f27715c = false;
                rsVar.f27714b.run();
                ArrayList arrayList = rsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - rsVar.f27716f > 3600000) {
                    arrayList.clear();
                    rsVar.e = false;
                    rsVar.f27717g = null;
                    rsVar.a();
                    return;
                }
                return;
            default:
                this.f27442b.f27718i = false;
                return;
        }
    }
}
