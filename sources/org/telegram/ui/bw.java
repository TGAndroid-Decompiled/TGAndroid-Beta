package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class bw implements Runnable {
    public final int f32502a = 0;
    public final qy f32503b;
    public final ArrayList f32504c;
    public final int d;
    public final boolean e;
    public final HashSet f32505f;

    public bw(qy qyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f32503b = qyVar;
        this.d = i10;
        this.f32504c = arrayList;
        this.e = z10;
        this.f32505f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32502a) {
            case 0:
                qy.p0(this.f32503b, this.d, this.f32504c, this.e, this.f32505f);
                return;
            default:
                this.f32503b.r4(this.f32504c, this.d, false, this.e, this.f32505f);
                return;
        }
    }

    public bw(qy qyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f32503b = qyVar;
        this.f32504c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f32505f = hashSet;
    }
}
