package org.telegram.messenger;

import java.util.ArrayList;
public final class yp implements Runnable {
    public final int f28200a;
    public final tr f28201b;
    public final ArrayList f28202c;
    public final boolean d;

    public yp(tr trVar, ArrayList arrayList, boolean z10, int i7) {
        this.f28200a = i7;
        this.f28201b = trVar;
        this.f28202c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yp.run():void");
    }

    public yp(tr trVar, boolean z10, ArrayList arrayList) {
        this.f28200a = 2;
        this.f28201b = trVar;
        this.d = z10;
        this.f28202c = arrayList;
    }
}
