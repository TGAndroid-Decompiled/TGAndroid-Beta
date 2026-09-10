package org.telegram.ui.Components;

import java.util.ArrayList;
public final class qt {
    public final int f26483a;
    public final Object f26484b;

    public qt(Object obj, int i10) {
        this.f26483a = i10;
        this.f26484b = obj;
    }

    public final void a(int i10, boolean z10) {
        switch (this.f26483a) {
            case 0:
                ArrayList arrayList = ((st) this.f26484b).f27212b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((qt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f26484b).run();
                return;
        }
    }
}
