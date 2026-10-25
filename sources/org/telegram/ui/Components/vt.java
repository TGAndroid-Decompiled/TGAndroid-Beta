package org.telegram.ui.Components;

import java.util.ArrayList;
public final class vt implements wt {
    public final int f34255a;
    public final Object f34256b;

    public vt(Object obj, int i10) {
        this.f34255a = i10;
        this.f34256b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f34255a) {
            case 0:
                ArrayList arrayList = ((yt) this.f34256b).f35136b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((wt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f34256b).run();
                return;
        }
    }
}
