package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class gw implements Runnable {
    public final int f33958a = 0;
    public final uy f33959b;
    public final ArrayList f33960c;
    public final int d;
    public final boolean e;
    public final HashSet f33961f;

    public gw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f33959b = uyVar;
        this.d = i10;
        this.f33960c = arrayList;
        this.e = z10;
        this.f33961f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f33958a) {
            case 0:
                uy.p0(this.f33959b, this.d, this.f33960c, this.e, this.f33961f);
                return;
            default:
                this.f33959b.r4(this.f33960c, this.d, false, this.e, this.f33961f);
                return;
        }
    }

    public gw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f33959b = uyVar;
        this.f33960c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f33961f = hashSet;
    }
}
