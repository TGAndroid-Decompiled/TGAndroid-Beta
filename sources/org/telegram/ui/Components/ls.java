package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ls implements ms {
    public final int f35735a;
    public final Object f35736b;

    public ls(Object obj, int i7) {
        this.f35735a = i7;
        this.f35736b = obj;
    }

    @Override
    public final void a(int i7, boolean z9) {
        switch (this.f35735a) {
            case 0:
                ArrayList arrayList = ((os) this.f35736b).f36652b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ms) obj).a(i7, z9);
                }
                return;
            default:
                ((Runnable) this.f35736b).run();
                return;
        }
    }
}
