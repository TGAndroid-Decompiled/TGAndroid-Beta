package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class aw implements Runnable {
    public final int f32710a = 0;
    public final oy f32711b;
    public final ArrayList f32712c;
    public final int d;
    public final boolean e;
    public final HashSet f32713f;

    public aw(oy oyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        this.f32711b = oyVar;
        this.d = i10;
        this.f32712c = arrayList;
        this.e = z4;
        this.f32713f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32710a) {
            case 0:
                oy.o0(this.f32711b, this.d, this.f32712c, this.e, this.f32713f);
                return;
            default:
                this.f32711b.r4(this.f32712c, this.d, false, this.e, this.f32713f);
                return;
        }
    }

    public aw(oy oyVar, ArrayList arrayList, int i10, boolean z4, HashSet hashSet) {
        this.f32711b = oyVar;
        this.f32712c = arrayList;
        this.d = i10;
        this.e = z4;
        this.f32713f = hashSet;
    }
}
