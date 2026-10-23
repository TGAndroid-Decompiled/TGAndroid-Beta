package org.telegram.ui.Components;

import java.util.ArrayList;
public final class tt implements ut {
    public final int f30902a;
    public final Object f30903b;

    public tt(Object obj, int i10) {
        this.f30902a = i10;
        this.f30903b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f30902a) {
            case 0:
                ArrayList arrayList = ((wt) this.f30903b).f32346b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ut) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f30903b).run();
                return;
        }
    }
}
