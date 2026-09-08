package org.telegram.ui.Components;

import java.util.ArrayList;
public final class kt {
    public final int f27924a;
    public final Object f27925b;

    public kt(Object obj, int i10) {
        this.f27924a = i10;
        this.f27925b = obj;
    }

    public final void a(int i10, boolean z10) {
        switch (this.f27924a) {
            case 0:
                ArrayList arrayList = ((mt) this.f27925b).f28540b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((kt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f27925b).run();
                return;
        }
    }
}
