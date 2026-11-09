package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pu implements Runnable {
    public final int f48806a = 1;
    public final yw f48807b;
    public final int f48808c;
    public final ArrayList d;
    public final boolean f48809e;
    public final HashSet f48810f;

    public pu(yw ywVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        this.f48807b = ywVar;
        this.f48808c = i7;
        this.d = arrayList;
        this.f48809e = z9;
        this.f48810f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f48806a) {
            case 0:
                this.f48807b.D4(this.d, this.f48808c, false, this.f48809e, this.f48810f);
                return;
            default:
                yw.r0(this.f48807b, this.f48808c, this.d, this.f48809e, this.f48810f);
                return;
        }
    }

    public pu(yw ywVar, ArrayList arrayList, int i7, boolean z9, HashSet hashSet) {
        this.f48807b = ywVar;
        this.d = arrayList;
        this.f48808c = i7;
        this.f48809e = z9;
        this.f48810f = hashSet;
    }
}
