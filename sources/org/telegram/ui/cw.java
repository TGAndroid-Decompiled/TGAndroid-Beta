package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class cw implements Runnable {
    public final int f32424a = 0;
    public final ry f32425b;
    public final ArrayList f32426c;
    public final int d;
    public final boolean e;
    public final HashSet f32427f;

    public cw(ry ryVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f32425b = ryVar;
        this.d = i10;
        this.f32426c = arrayList;
        this.e = z10;
        this.f32427f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32424a) {
            case 0:
                ry.p0(this.f32425b, this.d, this.f32426c, this.e, this.f32427f);
                return;
            default:
                this.f32425b.r4(this.f32426c, this.d, false, this.e, this.f32427f);
                return;
        }
    }

    public cw(ry ryVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f32425b = ryVar;
        this.f32426c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f32427f = hashSet;
    }
}
