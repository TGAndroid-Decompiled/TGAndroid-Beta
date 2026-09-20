package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class gw implements Runnable {
    public final int f33994a = 0;
    public final uy f33995b;
    public final ArrayList f33996c;
    public final int d;
    public final boolean e;
    public final HashSet f33997f;

    public gw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f33995b = uyVar;
        this.d = i10;
        this.f33996c = arrayList;
        this.e = z10;
        this.f33997f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f33994a) {
            case 0:
                uy.p0(this.f33995b, this.d, this.f33996c, this.e, this.f33997f);
                return;
            default:
                this.f33995b.r4(this.f33996c, this.d, false, this.e, this.f33997f);
                return;
        }
    }

    public gw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f33995b = uyVar;
        this.f33996c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f33997f = hashSet;
    }
}
