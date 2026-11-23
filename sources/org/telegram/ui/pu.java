package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pu implements Runnable {
    public final int f50986a = 1;
    public final cx f50987b;
    public final int f50988c;
    public final ArrayList d;
    public final boolean f50989e;
    public final HashSet f50990f;

    public pu(cx cxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f50987b = cxVar;
        this.f50988c = i7;
        this.d = arrayList;
        this.f50989e = z10;
        this.f50990f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f50986a) {
            case 0:
                this.f50987b.K4(this.d, this.f50988c, false, this.f50989e, this.f50990f);
                return;
            default:
                cx.K0(this.f50987b, this.f50988c, this.d, this.f50989e, this.f50990f);
                return;
        }
    }

    public pu(cx cxVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.f50987b = cxVar;
        this.d = arrayList;
        this.f50988c = i7;
        this.f50989e = z10;
        this.f50990f = hashSet;
    }
}
