package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ls implements ms {
    public final int f35730a;
    public final Object f35731b;

    public ls(Object obj, int i7) {
        this.f35730a = i7;
        this.f35731b = obj;
    }

    @Override
    public final void a(int i7, boolean z9) {
        switch (this.f35730a) {
            case 0:
                ArrayList arrayList = ((os) this.f35731b).f36774b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ms) obj).a(i7, z9);
                }
                return;
            default:
                ((Runnable) this.f35731b).run();
                return;
        }
    }
}
