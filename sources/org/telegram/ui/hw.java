package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class hw implements Runnable {
    public final int f34373a = 0;
    public final wy f34374b;
    public final ArrayList f34375c;
    public final int d;
    public final boolean e;
    public final HashSet f34376f;

    public hw(wy wyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f34374b = wyVar;
        this.d = i10;
        this.f34375c = arrayList;
        this.e = z10;
        this.f34376f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f34373a) {
            case 0:
                wy.p0(this.f34374b, this.d, this.f34375c, this.e, this.f34376f);
                return;
            default:
                this.f34374b.r4(this.f34375c, this.d, false, this.e, this.f34376f);
                return;
        }
    }

    public hw(wy wyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f34374b = wyVar;
        this.f34375c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f34376f = hashSet;
    }
}
