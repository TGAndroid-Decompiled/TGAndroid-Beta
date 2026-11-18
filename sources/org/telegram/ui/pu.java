package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pu implements Runnable {
    public final int f51016a = 1;
    public final cx f51017b;
    public final int f51018c;
    public final ArrayList d;
    public final boolean f51019e;
    public final HashSet f51020f;

    public pu(cx cxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f51017b = cxVar;
        this.f51018c = i7;
        this.d = arrayList;
        this.f51019e = z10;
        this.f51020f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f51016a) {
            case 0:
                this.f51017b.K4(this.d, this.f51018c, false, this.f51019e, this.f51020f);
                return;
            default:
                cx.K0(this.f51017b, this.f51018c, this.d, this.f51019e, this.f51020f);
                return;
        }
    }

    public pu(cx cxVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.f51017b = cxVar;
        this.d = arrayList;
        this.f51018c = i7;
        this.f51019e = z10;
        this.f51020f = hashSet;
    }
}
