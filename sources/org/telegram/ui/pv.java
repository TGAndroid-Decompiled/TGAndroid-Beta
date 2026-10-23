package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pv implements Runnable {
    public final int f40305a = 0;
    public final cy f40306b;
    public final ArrayList f40307c;
    public final int d;
    public final boolean e;
    public final HashSet f40308f;

    public pv(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f40306b = cyVar;
        this.d = i10;
        this.f40307c = arrayList;
        this.e = z10;
        this.f40308f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f40305a) {
            case 0:
                cy.n0(this.f40306b, this.d, this.f40307c, this.e, this.f40308f);
                return;
            default:
                this.f40306b.p4(this.f40307c, this.d, false, this.e, this.f40308f);
                return;
        }
    }

    public pv(cy cyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f40306b = cyVar;
        this.f40307c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f40308f = hashSet;
    }
}
