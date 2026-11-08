package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ls implements ms {
    public final int f35773a;
    public final Object f35774b;

    public ls(Object obj, int i7) {
        this.f35773a = i7;
        this.f35774b = obj;
    }

    @Override
    public final void a(int i7, boolean z9) {
        switch (this.f35773a) {
            case 0:
                ArrayList arrayList = ((os) this.f35774b).f36690b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ms) obj).a(i7, z9);
                }
                return;
            default:
                ((Runnable) this.f35774b).run();
                return;
        }
    }
}
