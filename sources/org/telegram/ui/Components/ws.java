package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ws implements Runnable {
    public final int f32342a;
    public final xs f32343b;

    public ws(xs xsVar, int i10) {
        this.f32342a = i10;
        this.f32343b = xsVar;
    }

    @Override
    public final void run() {
        switch (this.f32342a) {
            case 0:
                xs xsVar = this.f32343b;
                xsVar.f32695c = false;
                xsVar.f32694b.run();
                ArrayList arrayList = xsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - xsVar.f32696f > 3600000) {
                    arrayList.clear();
                    xsVar.e = false;
                    xsVar.f32697g = null;
                    xsVar.a();
                    return;
                }
                return;
            default:
                this.f32343b.f32698i = false;
                return;
        }
    }
}
