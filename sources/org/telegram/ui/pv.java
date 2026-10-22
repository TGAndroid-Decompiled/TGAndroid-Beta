package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pv implements Runnable {
    public final int f40304a = 0;
    public final cy f40305b;
    public final ArrayList f40306c;
    public final int d;
    public final boolean e;
    public final HashSet f40307f;

    public pv(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f40305b = cyVar;
        this.d = i10;
        this.f40306c = arrayList;
        this.e = z10;
        this.f40307f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f40304a) {
            case 0:
                cy.n0(this.f40305b, this.d, this.f40306c, this.e, this.f40307f);
                return;
            default:
                this.f40305b.p4(this.f40306c, this.d, false, this.e, this.f40307f);
                return;
        }
    }

    public pv(cy cyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f40305b = cyVar;
        this.f40306c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f40307f = hashSet;
    }
}
