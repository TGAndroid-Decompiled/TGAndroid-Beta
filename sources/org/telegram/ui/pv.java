package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pv implements Runnable {
    public final int f40295a = 0;
    public final cy f40296b;
    public final ArrayList f40297c;
    public final int d;
    public final boolean e;
    public final HashSet f40298f;

    public pv(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f40296b = cyVar;
        this.d = i10;
        this.f40297c = arrayList;
        this.e = z10;
        this.f40298f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f40295a) {
            case 0:
                cy.n0(this.f40296b, this.d, this.f40297c, this.e, this.f40298f);
                return;
            default:
                this.f40296b.p4(this.f40297c, this.d, false, this.e, this.f40298f);
                return;
        }
    }

    public pv(cy cyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f40296b = cyVar;
        this.f40297c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f40298f = hashSet;
    }
}
