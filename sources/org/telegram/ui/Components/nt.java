package org.telegram.ui.Components;

import java.util.ArrayList;
public final class nt implements ot {
    public final int f26890a;
    public final Object f26891b;

    public nt(Object obj, int i10) {
        this.f26890a = i10;
        this.f26891b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f26890a) {
            case 0:
                ArrayList arrayList = ((qt) this.f26891b).f27832b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ot) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f26891b).run();
                return;
        }
    }
}
