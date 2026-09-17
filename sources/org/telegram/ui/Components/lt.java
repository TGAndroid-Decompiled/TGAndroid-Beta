package org.telegram.ui.Components;

import java.util.ArrayList;
public final class lt implements mt {
    public final int f25967a;
    public final Object f25968b;

    public lt(Object obj, int i10) {
        this.f25967a = i10;
        this.f25968b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f25967a) {
            case 0:
                ArrayList arrayList = ((ot) this.f25968b).f26846b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((mt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f25968b).run();
                return;
        }
    }
}
