package org.telegram.ui.Components;

import java.util.ArrayList;
public final class gt {
    public final int f25233a;
    public final Object f25234b;

    public gt(Object obj, int i10) {
        this.f25233a = i10;
        this.f25234b = obj;
    }

    public final void a(int i10, boolean z4) {
        switch (this.f25233a) {
            case 0:
                ArrayList arrayList = ((jt) this.f25234b).f26051b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((gt) obj).a(i10, z4);
                }
                return;
            default:
                ((Runnable) this.f25234b).run();
                return;
        }
    }
}
