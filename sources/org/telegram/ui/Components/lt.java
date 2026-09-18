package org.telegram.ui.Components;

import java.util.ArrayList;
public final class lt implements mt {
    public final int f26242a;
    public final Object f26243b;

    public lt(Object obj, int i10) {
        this.f26242a = i10;
        this.f26243b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f26242a) {
            case 0:
                ArrayList arrayList = ((ot) this.f26243b).f27050b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((mt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f26243b).run();
                return;
        }
    }
}
