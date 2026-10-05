package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class fw implements Runnable {
    public final int f36427a = 0;
    public final uy f36428b;
    public final ArrayList f36429c;
    public final int d;
    public final boolean f36430e;
    public final HashSet f36431f;

    public fw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f36428b = uyVar;
        this.d = i10;
        this.f36429c = arrayList;
        this.f36430e = z10;
        this.f36431f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36427a) {
            case 0:
                uy.p0(this.f36428b, this.d, this.f36429c, this.f36430e, this.f36431f);
                return;
            default:
                this.f36428b.A4(this.f36429c, this.d, false, this.f36430e, this.f36431f);
                return;
        }
    }

    public fw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f36428b = uyVar;
        this.f36429c = arrayList;
        this.d = i10;
        this.f36430e = z10;
        this.f36431f = hashSet;
    }
}
