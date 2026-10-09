package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class ew implements Runnable {
    public final int f37373a = 0;
    public final ty f37374b;
    public final ArrayList f37375c;
    public final int d;
    public final boolean f37376e;
    public final HashSet f37377f;

    public ew(ty tyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f37374b = tyVar;
        this.d = i10;
        this.f37375c = arrayList;
        this.f37376e = z10;
        this.f37377f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f37373a) {
            case 0:
                ty.n0(this.f37374b, this.d, this.f37375c, this.f37376e, this.f37377f);
                return;
            default:
                this.f37374b.o4(this.f37375c, this.d, false, this.f37376e, this.f37377f);
                return;
        }
    }

    public ew(ty tyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f37374b = tyVar;
        this.f37375c = arrayList;
        this.d = i10;
        this.f37376e = z10;
        this.f37377f = hashSet;
    }
}
