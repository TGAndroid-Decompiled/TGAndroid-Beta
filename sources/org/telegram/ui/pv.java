package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pv implements Runnable {
    public final int f40618a = 1;
    public final zx f40619b;
    public final int f40620c;
    public final ArrayList d;
    public final boolean e;
    public final HashSet f40621f;

    public pv(zx zxVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f40619b = zxVar;
        this.f40620c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f40621f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f40618a) {
            case 0:
                this.f40619b.D4(this.d, this.f40620c, false, this.e, this.f40621f);
                return;
            default:
                zx.r0(this.f40619b, this.f40620c, this.d, this.e, this.f40621f);
                return;
        }
    }

    public pv(zx zxVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f40619b = zxVar;
        this.d = arrayList;
        this.f40620c = i10;
        this.e = z10;
        this.f40621f = hashSet;
    }
}
