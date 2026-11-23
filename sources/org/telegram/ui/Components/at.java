package org.telegram.ui.Components;

import java.util.ArrayList;
public final class at implements bt {
    public final int f33617a;
    public final Object f33618b;

    public at(Object obj, int i7) {
        this.f33617a = i7;
        this.f33618b = obj;
    }

    @Override
    public final void a(int i7, boolean z10) {
        switch (this.f33617a) {
            case 0:
                ArrayList arrayList = ((dt) this.f33618b).f34547b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((bt) obj).a(i7, z10);
                }
                return;
            default:
                ((Runnable) this.f33618b).run();
                return;
        }
    }
}
