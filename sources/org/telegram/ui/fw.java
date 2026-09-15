package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class fw implements Runnable {
    public final int f33688a = 0;
    public final uy f33689b;
    public final ArrayList f33690c;
    public final int d;
    public final boolean e;
    public final HashSet f33691f;

    public fw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f33689b = uyVar;
        this.d = i10;
        this.f33690c = arrayList;
        this.e = z10;
        this.f33691f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f33688a) {
            case 0:
                uy.p0(this.f33689b, this.d, this.f33690c, this.e, this.f33691f);
                return;
            default:
                this.f33689b.r4(this.f33690c, this.d, false, this.e, this.f33691f);
                return;
        }
    }

    public fw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f33689b = uyVar;
        this.f33690c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f33691f = hashSet;
    }
}
