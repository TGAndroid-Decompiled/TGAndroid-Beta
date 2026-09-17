package org.telegram.ui.Components;

import java.util.ArrayList;
public final class kt {
    public final int f27898a;
    public final Object f27899b;

    public kt(Object obj, int i10) {
        this.f27898a = i10;
        this.f27899b = obj;
    }

    public final void a(int i10, boolean z10) {
        switch (this.f27898a) {
            case 0:
                ArrayList arrayList = ((mt) this.f27899b).f28514b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((kt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f27899b).run();
                return;
        }
    }
}
