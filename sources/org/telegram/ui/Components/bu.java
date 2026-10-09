package org.telegram.ui.Components;

import java.util.ArrayList;
public final class bu implements cu {
    public final int f25102a;
    public final Object f25103b;

    public bu(Object obj, int i10) {
        this.f25102a = i10;
        this.f25103b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f25102a) {
            case 0:
                ArrayList arrayList = ((eu) this.f25103b).f26169b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((cu) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f25103b).run();
                return;
        }
    }
}
