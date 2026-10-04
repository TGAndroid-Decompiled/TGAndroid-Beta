package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class fw implements Runnable {
    public final int f36413a = 0;
    public final uy f36414b;
    public final ArrayList f36415c;
    public final int d;
    public final boolean f36416e;
    public final HashSet f36417f;

    public fw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f36414b = uyVar;
        this.d = i10;
        this.f36415c = arrayList;
        this.f36416e = z10;
        this.f36417f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36413a) {
            case 0:
                uy.p0(this.f36414b, this.d, this.f36415c, this.f36416e, this.f36417f);
                return;
            default:
                this.f36414b.A4(this.f36415c, this.d, false, this.f36416e, this.f36417f);
                return;
        }
    }

    public fw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f36414b = uyVar;
        this.f36415c = arrayList;
        this.d = i10;
        this.f36416e = z10;
        this.f36417f = hashSet;
    }
}
