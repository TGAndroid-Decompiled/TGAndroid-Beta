package org.telegram.ui.Components;

import java.util.ArrayList;
public final class kt {
    public final int f28493a;
    public final Object f28494b;

    public kt(Object obj, int i10) {
        this.f28493a = i10;
        this.f28494b = obj;
    }

    public final void a(int i10, boolean z4) {
        switch (this.f28493a) {
            case 0:
                ArrayList arrayList = ((mt) this.f28494b).f29257b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((kt) obj).a(i10, z4);
                }
                return;
            default:
                ((Runnable) this.f28494b).run();
                return;
        }
    }
}
