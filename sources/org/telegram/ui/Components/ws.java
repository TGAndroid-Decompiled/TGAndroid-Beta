package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ws implements xs {
    public final int f32237a;
    public final Object f32238b;

    public ws(Object obj, int i10) {
        this.f32237a = i10;
        this.f32238b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f32237a) {
            case 0:
                ArrayList arrayList = ((zs) this.f32238b).f33159b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((xs) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f32238b).run();
                return;
        }
    }
}
