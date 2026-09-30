package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class bw implements Runnable {
    public final int f32588a = 0;
    public final qy f32589b;
    public final ArrayList f32590c;
    public final int d;
    public final boolean e;
    public final HashSet f32591f;

    public bw(qy qyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f32589b = qyVar;
        this.d = i10;
        this.f32590c = arrayList;
        this.e = z10;
        this.f32591f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32588a) {
            case 0:
                qy.p0(this.f32589b, this.d, this.f32590c, this.e, this.f32591f);
                return;
            default:
                this.f32589b.r4(this.f32590c, this.d, false, this.e, this.f32591f);
                return;
        }
    }

    public bw(qy qyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f32589b = qyVar;
        this.f32590c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f32591f = hashSet;
    }
}
