package org.telegram.ui.Components;

import java.util.ArrayList;
public final class rs implements ss {
    public final int f39054a;
    public final Object f39055b;

    public rs(Object obj, int i7) {
        this.f39054a = i7;
        this.f39055b = obj;
    }

    @Override
    public final void a(int i7, boolean z10) {
        switch (this.f39054a) {
            case 0:
                ArrayList arrayList = ((us) this.f39055b).f40156b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ss) obj).a(i7, z10);
                }
                return;
            default:
                ((Runnable) this.f39055b).run();
                return;
        }
    }
}
