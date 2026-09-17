package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class gw implements Runnable {
    public final int f36829a = 0;
    public final uy f36830b;
    public final ArrayList f36831c;
    public final int d;
    public final boolean f36832e;
    public final HashSet f36833f;

    public gw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f36830b = uyVar;
        this.d = i10;
        this.f36831c = arrayList;
        this.f36832e = z10;
        this.f36833f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36829a) {
            case 0:
                uy.p0(this.f36830b, this.d, this.f36831c, this.f36832e, this.f36833f);
                return;
            default:
                this.f36830b.r4(this.f36831c, this.d, false, this.f36832e, this.f36833f);
                return;
        }
    }

    public gw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f36830b = uyVar;
        this.f36831c = arrayList;
        this.d = i10;
        this.f36832e = z10;
        this.f36833f = hashSet;
    }
}
