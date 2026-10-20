package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pv implements Runnable {
    public final int f40301a = 0;
    public final cy f40302b;
    public final ArrayList f40303c;
    public final int d;
    public final boolean e;
    public final HashSet f40304f;

    public pv(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f40302b = cyVar;
        this.d = i10;
        this.f40303c = arrayList;
        this.e = z10;
        this.f40304f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f40301a) {
            case 0:
                cy.n0(this.f40302b, this.d, this.f40303c, this.e, this.f40304f);
                return;
            default:
                this.f40302b.p4(this.f40303c, this.d, false, this.e, this.f40304f);
                return;
        }
    }

    public pv(cy cyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f40302b = cyVar;
        this.f40303c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f40304f = hashSet;
    }
}
