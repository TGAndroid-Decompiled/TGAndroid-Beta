package org.telegram.ui.Components;

import java.util.ArrayList;
public final class mt implements nt {
    public final int f26579a;
    public final Object f26580b;

    public mt(Object obj, int i10) {
        this.f26579a = i10;
        this.f26580b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f26579a) {
            case 0:
                ArrayList arrayList = ((pt) this.f26580b).f27433b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((nt) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f26580b).run();
                return;
        }
    }
}
