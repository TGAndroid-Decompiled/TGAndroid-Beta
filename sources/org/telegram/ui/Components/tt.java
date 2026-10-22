package org.telegram.ui.Components;

import java.util.ArrayList;
public final class tt implements ut {
    public final int f30675a;
    public final Object f30676b;

    public tt(Object obj, int i10) {
        this.f30675a = i10;
        this.f30676b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f30675a) {
            case 0:
                ArrayList arrayList = ((wt) this.f30676b).f32249b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ut) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f30676b).run();
                return;
        }
    }
}
