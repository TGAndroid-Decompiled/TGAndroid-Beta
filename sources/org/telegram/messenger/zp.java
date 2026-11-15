package org.telegram.messenger;

import java.util.ArrayList;
public final class zp implements Runnable {
    public final int f27993a;
    public final vr f27994b;
    public final ArrayList f27995c;
    public final boolean d;

    public zp(vr vrVar, ArrayList arrayList, boolean z10, int i7) {
        this.f27993a = i7;
        this.f27994b = vrVar;
        this.f27995c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zp.run():void");
    }

    public zp(vr vrVar, boolean z10, ArrayList arrayList) {
        this.f27993a = 2;
        this.f27994b = vrVar;
        this.d = z10;
        this.f27995c = arrayList;
    }
}
