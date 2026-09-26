package org.telegram.ui.Components;

import java.util.ArrayList;
public final class nt implements ot {
    public final int f26874a;
    public final Object f26875b;

    public nt(Object obj, int i10) {
        this.f26874a = i10;
        this.f26875b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f26874a) {
            case 0:
                ArrayList arrayList = ((qt) this.f26875b).f27764b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ot) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f26875b).run();
                return;
        }
    }
}
