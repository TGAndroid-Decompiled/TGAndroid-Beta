package org.telegram.ui.Components;

import java.util.ArrayList;
public final class mt implements nt {
    public final int f26272a;
    public final Object f26273b;

    public mt(Object obj, int i10) {
        this.f26272a = i10;
        this.f26273b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f26272a) {
            case 0:
                ArrayList arrayList = ((pt) this.f26273b).f27129b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((nt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f26273b).run();
                return;
        }
    }
}
