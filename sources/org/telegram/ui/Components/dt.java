package org.telegram.ui.Components;

import java.util.ArrayList;
public final class dt {
    public final int f27871a;
    public final Object f27872b;

    public dt(Object obj, int i10) {
        this.f27871a = i10;
        this.f27872b = obj;
    }

    public final void a(int i10, boolean z10) {
        switch (this.f27871a) {
            case 0:
                ArrayList arrayList = ((ft) this.f27872b).f28529b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((dt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f27872b).run();
                return;
        }
    }
}
