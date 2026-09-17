package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class hw implements Runnable {
    public final int f34368a = 0;
    public final wy f34369b;
    public final ArrayList f34370c;
    public final int d;
    public final boolean e;
    public final HashSet f34371f;

    public hw(wy wyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f34369b = wyVar;
        this.d = i10;
        this.f34370c = arrayList;
        this.e = z10;
        this.f34371f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f34368a) {
            case 0:
                wy.p0(this.f34369b, this.d, this.f34370c, this.e, this.f34371f);
                return;
            default:
                this.f34369b.r4(this.f34370c, this.d, false, this.e, this.f34371f);
                return;
        }
    }

    public hw(wy wyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f34369b = wyVar;
        this.f34370c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f34371f = hashSet;
    }
}
