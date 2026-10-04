package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ot implements pt {
    public final int f29446a;
    public final Object f29447b;

    public ot(Object obj, int i10) {
        this.f29446a = i10;
        this.f29447b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f29446a) {
            case 0:
                ArrayList arrayList = ((rt) this.f29447b).f30501b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((pt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f29447b).run();
                return;
        }
    }
}
