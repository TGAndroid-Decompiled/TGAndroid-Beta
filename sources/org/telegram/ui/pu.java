package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pu implements Runnable {
    public final int f50372a = 1;
    public final yw f50373b;
    public final int f50374c;
    public final ArrayList d;
    public final boolean f50375e;
    public final HashSet f50376f;

    public pu(yw ywVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f50373b = ywVar;
        this.f50374c = i7;
        this.d = arrayList;
        this.f50375e = z10;
        this.f50376f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f50372a) {
            case 0:
                this.f50373b.D4(this.d, this.f50374c, false, this.f50375e, this.f50376f);
                return;
            default:
                yw.r0(this.f50373b, this.f50374c, this.d, this.f50375e, this.f50376f);
                return;
        }
    }

    public pu(yw ywVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.f50373b = ywVar;
        this.d = arrayList;
        this.f50374c = i7;
        this.f50375e = z10;
        this.f50376f = hashSet;
    }
}
