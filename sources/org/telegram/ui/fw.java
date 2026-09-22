package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class fw implements Runnable {
    public final int f33706a = 0;
    public final uy f33707b;
    public final ArrayList f33708c;
    public final int d;
    public final boolean e;
    public final HashSet f33709f;

    public fw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f33707b = uyVar;
        this.d = i10;
        this.f33708c = arrayList;
        this.e = z10;
        this.f33709f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f33706a) {
            case 0:
                uy.p0(this.f33707b, this.d, this.f33708c, this.e, this.f33709f);
                return;
            default:
                this.f33707b.r4(this.f33708c, this.d, false, this.e, this.f33709f);
                return;
        }
    }

    public fw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f33707b = uyVar;
        this.f33708c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f33709f = hashSet;
    }
}
