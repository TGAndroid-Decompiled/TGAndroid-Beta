package org.telegram.ui.Components;

import java.util.ArrayList;
public final class cu implements du {
    public final int f25472a;
    public final Object f25473b;

    public cu(Object obj, int i10) {
        this.f25472a = i10;
        this.f25473b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f25472a) {
            case 0:
                ArrayList arrayList = ((fu) this.f25473b).f26574b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((du) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f25473b).run();
                return;
        }
    }
}
