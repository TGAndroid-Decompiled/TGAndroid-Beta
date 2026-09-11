package org.telegram.ui.Components;

import java.util.ArrayList;
public final class kt {
    public final int f27897a;
    public final Object f27898b;

    public kt(Object obj, int i10) {
        this.f27897a = i10;
        this.f27898b = obj;
    }

    public final void a(int i10, boolean z10) {
        switch (this.f27897a) {
            case 0:
                ArrayList arrayList = ((mt) this.f27898b).f28513b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((kt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f27898b).run();
                return;
        }
    }
}
