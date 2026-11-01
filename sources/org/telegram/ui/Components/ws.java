package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ws implements xs {
    public final int f32303a;
    public final Object f32304b;

    public ws(Object obj, int i10) {
        this.f32303a = i10;
        this.f32304b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f32303a) {
            case 0:
                ArrayList arrayList = ((zs) this.f32304b).f33219b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((xs) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f32304b).run();
                return;
        }
    }
}
