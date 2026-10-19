package org.telegram.ui.Components;

import java.util.ArrayList;
public final class tt implements ut {
    public final int f30671a;
    public final Object f30672b;

    public tt(Object obj, int i10) {
        this.f30671a = i10;
        this.f30672b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f30671a) {
            case 0:
                ArrayList arrayList = ((wt) this.f30672b).f32213b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ut) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f30672b).run();
                return;
        }
    }
}
