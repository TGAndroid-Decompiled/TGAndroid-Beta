package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ls implements ms {
    public final int f35852a;
    public final Object f35853b;

    public ls(Object obj, int i3) {
        this.f35852a = i3;
        this.f35853b = obj;
    }

    @Override
    public final void a(int i3, boolean z10) {
        switch (this.f35852a) {
            case 0:
                ArrayList arrayList = ((os) this.f35853b).f36933b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ms) obj).a(i3, z10);
                }
                return;
            default:
                ((Runnable) this.f35853b).run();
                return;
        }
    }
}
