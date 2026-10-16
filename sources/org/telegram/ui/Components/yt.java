package org.telegram.ui.Components;

import java.util.ArrayList;
public final class yt implements zt {
    public final int f31358a;
    public final Object f31359b;

    public yt(Object obj, int i10) {
        this.f31358a = i10;
        this.f31359b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f31358a) {
            case 0:
                ArrayList arrayList = ((bu) this.f31359b).f23549b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((zt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f31359b).run();
                return;
        }
    }
}
