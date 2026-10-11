package org.telegram.ui.Components;

import java.util.ArrayList;
public final class cu implements du {
    public final int f25323a;
    public final Object f25324b;

    public cu(Object obj, int i10) {
        this.f25323a = i10;
        this.f25324b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f25323a) {
            case 0:
                ArrayList arrayList = ((fu) this.f25324b).f26493b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((du) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f25324b).run();
                return;
        }
    }
}
