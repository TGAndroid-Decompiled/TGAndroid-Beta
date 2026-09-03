package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class cw implements Runnable {
    public final int f33247a = 0;
    public final qy f33248b;
    public final ArrayList f33249c;
    public final int d;
    public final boolean e;
    public final HashSet f33250f;

    public cw(qy qyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        this.f33248b = qyVar;
        this.d = i10;
        this.f33249c = arrayList;
        this.e = z4;
        this.f33250f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f33247a) {
            case 0:
                qy.o0(this.f33248b, this.d, this.f33249c, this.e, this.f33250f);
                return;
            default:
                this.f33248b.r4(this.f33249c, this.d, false, this.e, this.f33250f);
                return;
        }
    }

    public cw(qy qyVar, ArrayList arrayList, int i10, boolean z4, HashSet hashSet) {
        this.f33248b = qyVar;
        this.f33249c = arrayList;
        this.d = i10;
        this.e = z4;
        this.f33250f = hashSet;
    }
}
