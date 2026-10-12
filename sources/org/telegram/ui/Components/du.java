package org.telegram.ui.Components;

import java.util.ArrayList;
public final class du implements eu {
    public final int f25460a;
    public final Object f25461b;

    public du(Object obj, int i10) {
        this.f25460a = i10;
        this.f25461b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f25460a) {
            case 0:
                ArrayList arrayList = ((gu) this.f25461b).f26523b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((eu) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f25461b).run();
                return;
        }
    }
}
