package org.telegram.messenger;

import java.util.ArrayList;
public final class yp implements Runnable {
    public final int f28174a;
    public final tr f28175b;
    public final ArrayList f28176c;
    public final boolean d;

    public yp(tr trVar, ArrayList arrayList, boolean z10, int i7) {
        this.f28174a = i7;
        this.f28175b = trVar;
        this.f28176c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yp.run():void");
    }

    public yp(tr trVar, boolean z10, ArrayList arrayList) {
        this.f28174a = 2;
        this.f28175b = trVar;
        this.d = z10;
        this.f28176c = arrayList;
    }
}
