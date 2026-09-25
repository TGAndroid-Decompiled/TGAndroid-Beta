package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class bw implements Runnable {
    public final int f32503a = 0;
    public final qy f32504b;
    public final ArrayList f32505c;
    public final int d;
    public final boolean e;
    public final HashSet f32506f;

    public bw(qy qyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f32504b = qyVar;
        this.d = i10;
        this.f32505c = arrayList;
        this.e = z10;
        this.f32506f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32503a) {
            case 0:
                qy.p0(this.f32504b, this.d, this.f32505c, this.e, this.f32506f);
                return;
            default:
                this.f32504b.r4(this.f32505c, this.d, false, this.e, this.f32506f);
                return;
        }
    }

    public bw(qy qyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f32504b = qyVar;
        this.f32505c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f32506f = hashSet;
    }
}
