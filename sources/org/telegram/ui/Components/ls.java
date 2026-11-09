package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ls implements ms {
    public final int f35830a;
    public final Object f35831b;

    public ls(Object obj, int i7) {
        this.f35830a = i7;
        this.f35831b = obj;
    }

    @Override
    public final void a(int i7, boolean z9) {
        switch (this.f35830a) {
            case 0:
                ArrayList arrayList = ((os) this.f35831b).f36777b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ms) obj).a(i7, z9);
                }
                return;
            default:
                ((Runnable) this.f35831b).run();
                return;
        }
    }
}
