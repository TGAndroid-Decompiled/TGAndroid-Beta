package org.telegram.ui.Components;

import java.util.ArrayList;
public final class xs implements ys {
    public final int f42163a;
    public final Object f42164b;

    public xs(Object obj, int i7) {
        this.f42163a = i7;
        this.f42164b = obj;
    }

    @Override
    public final void a(int i7, boolean z10) {
        switch (this.f42163a) {
            case 0:
                ArrayList arrayList = ((at) this.f42164b).f33550b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ys) obj).a(i7, z10);
                }
                return;
            default:
                ((Runnable) this.f42164b).run();
                return;
        }
    }
}
