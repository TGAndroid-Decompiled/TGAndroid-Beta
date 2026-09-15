package org.telegram.ui.Components;

import java.util.ArrayList;
public final class lt implements mt {
    public final int f26001a;
    public final Object f26002b;

    public lt(Object obj, int i10) {
        this.f26001a = i10;
        this.f26002b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f26001a) {
            case 0:
                ArrayList arrayList = ((ot) this.f26002b).f26884b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((mt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f26002b).run();
                return;
        }
    }
}
