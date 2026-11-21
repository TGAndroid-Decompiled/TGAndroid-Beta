package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pu implements Runnable {
    public final int f50982a = 1;
    public final cx f50983b;
    public final int f50984c;
    public final ArrayList d;
    public final boolean f50985e;
    public final HashSet f50986f;

    public pu(cx cxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f50983b = cxVar;
        this.f50984c = i7;
        this.d = arrayList;
        this.f50985e = z10;
        this.f50986f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f50982a) {
            case 0:
                this.f50983b.K4(this.d, this.f50984c, false, this.f50985e, this.f50986f);
                return;
            default:
                cx.K0(this.f50983b, this.f50984c, this.d, this.f50985e, this.f50986f);
                return;
        }
    }

    public pu(cx cxVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.f50983b = cxVar;
        this.d = arrayList;
        this.f50984c = i7;
        this.f50985e = z10;
        this.f50986f = hashSet;
    }
}
