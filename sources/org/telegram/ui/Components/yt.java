package org.telegram.ui.Components;

import java.util.ArrayList;
public final class yt implements zt {
    public final int f31680a;
    public final Object f31681b;

    public yt(Object obj, int i10) {
        this.f31680a = i10;
        this.f31681b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f31680a) {
            case 0:
                ArrayList arrayList = ((bu) this.f31681b).f23854b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((zt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f31681b).run();
                return;
        }
    }
}
