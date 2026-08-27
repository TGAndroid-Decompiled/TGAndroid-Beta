package org.telegram.ui.Components;

import java.util.ArrayList;

public final class xs {

    public final int f34690a;

    public final Object f34691b;

    public xs(Object obj, int i10) {
        this.f34690a = i10;
        this.f34691b = obj;
    }

    public final void a(int i10, boolean z10) {
        switch (this.f34690a) {
            case 0:
                ArrayList arrayList = ((zs) this.f34691b).f35333b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((xs) obj).a(i10, z10);
                }
                break;
            default:
                ((Runnable) this.f34691b).run();
                break;
        }
    }
}
