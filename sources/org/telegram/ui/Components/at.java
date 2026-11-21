package org.telegram.ui.Components;

import java.util.ArrayList;
public final class at implements bt {
    public final int f33620a;
    public final Object f33621b;

    public at(Object obj, int i7) {
        this.f33620a = i7;
        this.f33621b = obj;
    }

    @Override
    public final void a(int i7, boolean z10) {
        switch (this.f33620a) {
            case 0:
                ArrayList arrayList = ((dt) this.f33621b).f34573b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((bt) obj).a(i7, z10);
                }
                return;
            default:
                ((Runnable) this.f33621b).run();
                return;
        }
    }
}
