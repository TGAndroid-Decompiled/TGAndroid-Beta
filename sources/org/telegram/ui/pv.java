package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pv implements Runnable {
    public final int f42663a = 0;
    public final cy f42664b;
    public final ArrayList f42665c;
    public final int d;
    public final boolean e;
    public final HashSet f42666f;

    public pv(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f42664b = cyVar;
        this.d = i10;
        this.f42665c = arrayList;
        this.e = z10;
        this.f42666f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f42663a) {
            case 0:
                cy.n0(this.f42664b, this.d, this.f42665c, this.e, this.f42666f);
                return;
            default:
                this.f42664b.z4(this.f42665c, this.d, false, this.e, this.f42666f);
                return;
        }
    }

    public pv(cy cyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f42664b = cyVar;
        this.f42665c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f42666f = hashSet;
    }
}
