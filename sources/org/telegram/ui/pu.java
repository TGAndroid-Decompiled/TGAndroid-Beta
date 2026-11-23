package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pu implements Runnable {
    public final int f50918a = 1;
    public final cx f50919b;
    public final int f50920c;
    public final ArrayList d;
    public final boolean f50921e;
    public final HashSet f50922f;

    public pu(cx cxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f50919b = cxVar;
        this.f50920c = i7;
        this.d = arrayList;
        this.f50921e = z10;
        this.f50922f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f50918a) {
            case 0:
                this.f50919b.K4(this.d, this.f50920c, false, this.f50921e, this.f50922f);
                return;
            default:
                cx.K0(this.f50919b, this.f50920c, this.d, this.f50921e, this.f50922f);
                return;
        }
    }

    public pu(cx cxVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.f50919b = cxVar;
        this.d = arrayList;
        this.f50920c = i7;
        this.f50921e = z10;
        this.f50922f = hashSet;
    }
}
