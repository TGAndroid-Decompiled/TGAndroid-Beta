package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pv implements Runnable {
    public final int f42660a = 0;
    public final cy f42661b;
    public final ArrayList f42662c;
    public final int d;
    public final boolean e;
    public final HashSet f42663f;

    public pv(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f42661b = cyVar;
        this.d = i10;
        this.f42662c = arrayList;
        this.e = z10;
        this.f42663f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f42660a) {
            case 0:
                cy.n0(this.f42661b, this.d, this.f42662c, this.e, this.f42663f);
                return;
            default:
                this.f42661b.z4(this.f42662c, this.d, false, this.e, this.f42663f);
                return;
        }
    }

    public pv(cy cyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f42661b = cyVar;
        this.f42662c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f42663f = hashSet;
    }
}
