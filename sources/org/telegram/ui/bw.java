package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class bw implements Runnable {
    public final int f32504a = 0;
    public final qy f32505b;
    public final ArrayList f32506c;
    public final int d;
    public final boolean e;
    public final HashSet f32507f;

    public bw(qy qyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f32505b = qyVar;
        this.d = i10;
        this.f32506c = arrayList;
        this.e = z10;
        this.f32507f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32504a) {
            case 0:
                qy.p0(this.f32505b, this.d, this.f32506c, this.e, this.f32507f);
                return;
            default:
                this.f32505b.r4(this.f32506c, this.d, false, this.e, this.f32507f);
                return;
        }
    }

    public bw(qy qyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f32505b = qyVar;
        this.f32506c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f32507f = hashSet;
    }
}
