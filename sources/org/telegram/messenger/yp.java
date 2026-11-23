package org.telegram.messenger;

import java.util.ArrayList;
public final class yp implements Runnable {
    public final int f28272a;
    public final tr f28273b;
    public final ArrayList f28274c;
    public final boolean d;

    public yp(tr trVar, ArrayList arrayList, boolean z10, int i7) {
        this.f28272a = i7;
        this.f28273b = trVar;
        this.f28274c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yp.run():void");
    }

    public yp(tr trVar, boolean z10, ArrayList arrayList) {
        this.f28272a = 2;
        this.f28273b = trVar;
        this.d = z10;
        this.f28274c = arrayList;
    }
}
