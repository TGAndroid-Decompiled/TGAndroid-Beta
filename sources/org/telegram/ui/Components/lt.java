package org.telegram.ui.Components;

import java.util.ArrayList;
public final class lt implements mt {
    public final int f26004a;
    public final Object f26005b;

    public lt(Object obj, int i10) {
        this.f26004a = i10;
        this.f26005b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f26004a) {
            case 0:
                ArrayList arrayList = ((ot) this.f26005b).f26881b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((mt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f26005b).run();
                return;
        }
    }
}
