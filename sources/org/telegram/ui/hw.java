package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class hw implements Runnable {
    public final int f33474a = 0;
    public final wy f33475b;
    public final ArrayList f33476c;
    public final int d;
    public final boolean e;
    public final HashSet f33477f;

    public hw(wy wyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f33475b = wyVar;
        this.d = i10;
        this.f33476c = arrayList;
        this.e = z10;
        this.f33477f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f33474a) {
            case 0:
                wy.p0(this.f33475b, this.d, this.f33476c, this.e, this.f33477f);
                return;
            default:
                this.f33475b.r4(this.f33476c, this.d, false, this.e, this.f33477f);
                return;
        }
    }

    public hw(wy wyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f33475b = wyVar;
        this.f33476c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f33477f = hashSet;
    }
}
