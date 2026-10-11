package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class dw implements Runnable {
    public final int f37130a = 0;
    public final sy f37131b;
    public final ArrayList f37132c;
    public final int d;
    public final boolean f37133e;
    public final HashSet f37134f;

    public dw(sy syVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f37131b = syVar;
        this.d = i10;
        this.f37132c = arrayList;
        this.f37133e = z10;
        this.f37134f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f37130a) {
            case 0:
                sy.n0(this.f37131b, this.d, this.f37132c, this.f37133e, this.f37134f);
                return;
            default:
                this.f37131b.o4(this.f37132c, this.d, false, this.f37133e, this.f37134f);
                return;
        }
    }

    public dw(sy syVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f37131b = syVar;
        this.f37132c = arrayList;
        this.d = i10;
        this.f37133e = z10;
        this.f37134f = hashSet;
    }
}
