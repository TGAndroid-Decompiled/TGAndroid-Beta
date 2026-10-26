package org.telegram.ui.Components;

import java.util.ArrayList;
public final class vt implements wt {
    public final int f34258a;
    public final Object f34259b;

    public vt(Object obj, int i10) {
        this.f34258a = i10;
        this.f34259b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f34258a) {
            case 0:
                ArrayList arrayList = ((yt) this.f34259b).f35139b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((wt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f34259b).run();
                return;
        }
    }
}
