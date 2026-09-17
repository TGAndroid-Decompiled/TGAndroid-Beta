package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class gw implements Runnable {
    public final int f36802a = 0;
    public final uy f36803b;
    public final ArrayList f36804c;
    public final int d;
    public final boolean f36805e;
    public final HashSet f36806f;

    public gw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f36803b = uyVar;
        this.d = i10;
        this.f36804c = arrayList;
        this.f36805e = z10;
        this.f36806f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36802a) {
            case 0:
                uy.p0(this.f36803b, this.d, this.f36804c, this.f36805e, this.f36806f);
                return;
            default:
                this.f36803b.r4(this.f36804c, this.d, false, this.f36805e, this.f36806f);
                return;
        }
    }

    public gw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f36803b = uyVar;
        this.f36804c = arrayList;
        this.d = i10;
        this.f36805e = z10;
        this.f36806f = hashSet;
    }
}
