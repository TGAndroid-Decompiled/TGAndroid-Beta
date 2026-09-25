package org.telegram.ui.Components;

import java.util.ArrayList;
public final class qs implements Runnable {
    public final int f27757a;
    public final rs f27758b;

    public qs(rs rsVar, int i10) {
        this.f27757a = i10;
        this.f27758b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f27757a) {
            case 0:
                rs rsVar = this.f27758b;
                rsVar.f28045c = false;
                rsVar.f28044b.run();
                ArrayList arrayList = rsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - rsVar.f28046f > 3600000) {
                    arrayList.clear();
                    rsVar.e = false;
                    rsVar.f28047g = null;
                    rsVar.a();
                    return;
                }
                return;
            default:
                this.f27758b.f28048i = false;
                return;
        }
    }
}
