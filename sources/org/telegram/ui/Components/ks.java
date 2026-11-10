package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ks implements ls {
    public final int f35422a;
    public final Object f35423b;

    public ks(Object obj, int i7) {
        this.f35422a = i7;
        this.f35423b = obj;
    }

    @Override
    public final void a(int i7, boolean z9) {
        switch (this.f35422a) {
            case 0:
                ArrayList arrayList = ((ns) this.f35423b).f36368b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ls) obj).a(i7, z9);
                }
                return;
            default:
                ((Runnable) this.f35423b).run();
                return;
        }
    }
}
