package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pv implements Runnable {
    public final int f40300a = 0;
    public final cy f40301b;
    public final ArrayList f40302c;
    public final int d;
    public final boolean e;
    public final HashSet f40303f;

    public pv(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f40301b = cyVar;
        this.d = i10;
        this.f40302c = arrayList;
        this.e = z10;
        this.f40303f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f40300a) {
            case 0:
                cy.n0(this.f40301b, this.d, this.f40302c, this.e, this.f40303f);
                return;
            default:
                this.f40301b.p4(this.f40302c, this.d, false, this.e, this.f40303f);
                return;
        }
    }

    public pv(cy cyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f40301b = cyVar;
        this.f40302c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f40303f = hashSet;
    }
}
