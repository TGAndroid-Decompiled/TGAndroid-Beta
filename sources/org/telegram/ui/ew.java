package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class ew implements Runnable {
    public final int f37371a = 0;
    public final ty f37372b;
    public final ArrayList f37373c;
    public final int d;
    public final boolean f37374e;
    public final HashSet f37375f;

    public ew(ty tyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f37372b = tyVar;
        this.d = i10;
        this.f37373c = arrayList;
        this.f37374e = z10;
        this.f37375f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f37371a) {
            case 0:
                ty.n0(this.f37372b, this.d, this.f37373c, this.f37374e, this.f37375f);
                return;
            default:
                this.f37372b.o4(this.f37373c, this.d, false, this.f37374e, this.f37375f);
                return;
        }
    }

    public ew(ty tyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f37372b = tyVar;
        this.f37373c = arrayList;
        this.d = i10;
        this.f37374e = z10;
        this.f37375f = hashSet;
    }
}
