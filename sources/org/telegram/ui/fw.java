package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class fw implements Runnable {
    public final int f36414a = 0;
    public final uy f36415b;
    public final ArrayList f36416c;
    public final int d;
    public final boolean f36417e;
    public final HashSet f36418f;

    public fw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f36415b = uyVar;
        this.d = i10;
        this.f36416c = arrayList;
        this.f36417e = z10;
        this.f36418f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36414a) {
            case 0:
                uy.p0(this.f36415b, this.d, this.f36416c, this.f36417e, this.f36418f);
                return;
            default:
                this.f36415b.A4(this.f36416c, this.d, false, this.f36417e, this.f36418f);
                return;
        }
    }

    public fw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f36415b = uyVar;
        this.f36416c = arrayList;
        this.d = i10;
        this.f36417e = z10;
        this.f36418f = hashSet;
    }
}
