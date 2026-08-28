package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ys {
    public final int f35059a;
    public final Object f35060b;

    public ys(Object obj, int i9) {
        this.f35059a = i9;
        this.f35060b = obj;
    }

    public final void a(int i9, boolean z10) {
        switch (this.f35059a) {
            case 0:
                ArrayList arrayList = ((at) this.f35060b).f26898b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ys) obj).a(i9, z10);
                }
                return;
            default:
                ((Runnable) this.f35060b).run();
                return;
        }
    }
}
