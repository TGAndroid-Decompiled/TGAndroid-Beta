package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ht {
    public final int f25485a;
    public final Object f25486b;

    public ht(Object obj, int i10) {
        this.f25485a = i10;
        this.f25486b = obj;
    }

    public final void a(int i10, boolean z4) {
        switch (this.f25485a) {
            case 0:
                ArrayList arrayList = ((kt) this.f25486b).f26381b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ht) obj).a(i10, z4);
                }
                return;
            default:
                ((Runnable) this.f25486b).run();
                return;
        }
    }
}
