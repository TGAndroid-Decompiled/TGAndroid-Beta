package org.telegram.ui.Components;

import java.util.ArrayList;
public final class eu implements fu {
    public final int f25786a;
    public final Object f25787b;

    public eu(Object obj, int i10) {
        this.f25786a = i10;
        this.f25787b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f25786a) {
            case 0:
                ArrayList arrayList = ((hu) this.f25787b).f26895b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((fu) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f25787b).run();
                return;
        }
    }
}
