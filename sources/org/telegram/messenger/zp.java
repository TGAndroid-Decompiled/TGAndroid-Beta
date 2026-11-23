package org.telegram.messenger;

import java.util.ArrayList;
public final class zp implements Runnable {
    public final int f28332a;
    public final ur f28333b;
    public final ArrayList f28334c;
    public final boolean d;

    public zp(ur urVar, ArrayList arrayList, boolean z10, int i7) {
        this.f28332a = i7;
        this.f28333b = urVar;
        this.f28334c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zp.run():void");
    }

    public zp(ur urVar, boolean z10, ArrayList arrayList) {
        this.f28332a = 2;
        this.f28333b = urVar;
        this.d = z10;
        this.f28334c = arrayList;
    }
}
