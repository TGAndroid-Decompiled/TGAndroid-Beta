package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pu implements Runnable {
    public final int f50363a = 1;
    public final yw f50364b;
    public final int f50365c;
    public final ArrayList d;
    public final boolean f50366e;
    public final HashSet f50367f;

    public pu(yw ywVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f50364b = ywVar;
        this.f50365c = i7;
        this.d = arrayList;
        this.f50366e = z10;
        this.f50367f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f50363a) {
            case 0:
                this.f50364b.D4(this.d, this.f50365c, false, this.f50366e, this.f50367f);
                return;
            default:
                yw.r0(this.f50364b, this.f50365c, this.d, this.f50366e, this.f50367f);
                return;
        }
    }

    public pu(yw ywVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.f50364b = ywVar;
        this.d = arrayList;
        this.f50365c = i7;
        this.f50366e = z10;
        this.f50367f = hashSet;
    }
}
