package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class gw implements Runnable {
    public final int f34010a = 0;
    public final uy f34011b;
    public final ArrayList f34012c;
    public final int d;
    public final boolean e;
    public final HashSet f34013f;

    public gw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f34011b = uyVar;
        this.d = i10;
        this.f34012c = arrayList;
        this.e = z10;
        this.f34013f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f34010a) {
            case 0:
                uy.p0(this.f34011b, this.d, this.f34012c, this.e, this.f34013f);
                return;
            default:
                this.f34011b.r4(this.f34012c, this.d, false, this.e, this.f34013f);
                return;
        }
    }

    public gw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f34011b = uyVar;
        this.f34012c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f34013f = hashSet;
    }
}
