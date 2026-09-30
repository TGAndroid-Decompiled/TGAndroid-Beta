package org.telegram.ui.Components;

import java.util.ArrayList;
public final class nt implements ot {
    public final int f26854a;
    public final Object f26855b;

    public nt(Object obj, int i10) {
        this.f26854a = i10;
        this.f26855b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f26854a) {
            case 0:
                ArrayList arrayList = ((qt) this.f26855b).f27825b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ot) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f26855b).run();
                return;
        }
    }
}
