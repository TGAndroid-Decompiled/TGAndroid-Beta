package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ot implements pt {
    public final int f27172a;
    public final Object f27173b;

    public ot(Object obj, int i10) {
        this.f27172a = i10;
        this.f27173b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f27172a) {
            case 0:
                ArrayList arrayList = ((rt) this.f27173b).f28130b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((pt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f27173b).run();
                return;
        }
    }
}
