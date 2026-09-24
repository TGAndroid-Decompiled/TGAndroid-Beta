package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class bw implements Runnable {
    public final int f32488a = 0;
    public final qy f32489b;
    public final ArrayList f32490c;
    public final int d;
    public final boolean e;
    public final HashSet f32491f;

    public bw(qy qyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f32489b = qyVar;
        this.d = i10;
        this.f32490c = arrayList;
        this.e = z10;
        this.f32491f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32488a) {
            case 0:
                qy.p0(this.f32489b, this.d, this.f32490c, this.e, this.f32491f);
                return;
            default:
                this.f32489b.r4(this.f32490c, this.d, false, this.e, this.f32491f);
                return;
        }
    }

    public bw(qy qyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f32489b = qyVar;
        this.f32490c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f32491f = hashSet;
    }
}
