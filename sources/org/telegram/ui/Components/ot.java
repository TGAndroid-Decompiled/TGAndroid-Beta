package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ot implements pt {
    public final int f29445a;
    public final Object f29446b;

    public ot(Object obj, int i10) {
        this.f29445a = i10;
        this.f29446b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f29445a) {
            case 0:
                ArrayList arrayList = ((rt) this.f29446b).f30500b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((pt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f29446b).run();
                return;
        }
    }
}
