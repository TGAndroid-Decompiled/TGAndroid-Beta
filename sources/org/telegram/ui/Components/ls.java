package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ls implements ms {
    public final int f35755a;
    public final Object f35756b;

    public ls(Object obj, int i7) {
        this.f35755a = i7;
        this.f35756b = obj;
    }

    @Override
    public final void a(int i7, boolean z9) {
        switch (this.f35755a) {
            case 0:
                ArrayList arrayList = ((os) this.f35756b).f36670b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ms) obj).a(i7, z9);
                }
                return;
            default:
                ((Runnable) this.f35756b).run();
                return;
        }
    }
}
