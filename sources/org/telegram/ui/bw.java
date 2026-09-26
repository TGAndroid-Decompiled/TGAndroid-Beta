package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class bw implements Runnable {
    public final int f32501a = 0;
    public final qy f32502b;
    public final ArrayList f32503c;
    public final int d;
    public final boolean e;
    public final HashSet f32504f;

    public bw(qy qyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f32502b = qyVar;
        this.d = i10;
        this.f32503c = arrayList;
        this.e = z10;
        this.f32504f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32501a) {
            case 0:
                qy.p0(this.f32502b, this.d, this.f32503c, this.e, this.f32504f);
                return;
            default:
                this.f32502b.r4(this.f32503c, this.d, false, this.e, this.f32504f);
                return;
        }
    }

    public bw(qy qyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f32502b = qyVar;
        this.f32503c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f32504f = hashSet;
    }
}
