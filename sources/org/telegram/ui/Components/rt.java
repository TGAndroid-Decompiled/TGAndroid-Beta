package org.telegram.ui.Components;

import java.util.ArrayList;
public final class rt implements st {
    public final int f30268a;
    public final Object f30269b;

    public rt(Object obj, int i10) {
        this.f30268a = i10;
        this.f30269b = obj;
    }

    @Override
    public final void a(int i10, boolean z10) {
        switch (this.f30268a) {
            case 0:
                ArrayList arrayList = ((ut) this.f30269b).f31221b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((st) obj).a(i10, z10);
                }
                return;
            default:
                ((Runnable) this.f30269b).run();
                return;
        }
    }
}
