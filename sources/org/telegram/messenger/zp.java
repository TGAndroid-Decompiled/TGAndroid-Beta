package org.telegram.messenger;

import java.util.ArrayList;
public final class zp implements Runnable {
    public final int f28368a;
    public final ur f28369b;
    public final ArrayList f28370c;
    public final boolean d;

    public zp(ur urVar, ArrayList arrayList, boolean z10, int i7) {
        this.f28368a = i7;
        this.f28369b = urVar;
        this.f28370c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zp.run():void");
    }

    public zp(ur urVar, boolean z10, ArrayList arrayList) {
        this.f28368a = 2;
        this.f28369b = urVar;
        this.d = z10;
        this.f28370c = arrayList;
    }
}
