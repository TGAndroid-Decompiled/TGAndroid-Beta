package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ys implements zs {
    public final int f42624a;
    public final Object f42625b;

    public ys(Object obj, int i7) {
        this.f42624a = i7;
        this.f42625b = obj;
    }

    @Override
    public final void a(int i7, boolean z10) {
        switch (this.f42624a) {
            case 0:
                ArrayList arrayList = ((bt) this.f42625b).f33778b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((zs) obj).a(i7, z10);
                }
                return;
            default:
                ((Runnable) this.f42625b).run();
                return;
        }
    }
}
