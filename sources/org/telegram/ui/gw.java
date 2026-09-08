package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class gw implements Runnable {
    public final int f36828a = 0;
    public final uy f36829b;
    public final ArrayList f36830c;
    public final int d;
    public final boolean f36831e;
    public final HashSet f36832f;

    public gw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f36829b = uyVar;
        this.d = i10;
        this.f36830c = arrayList;
        this.f36831e = z10;
        this.f36832f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36828a) {
            case 0:
                uy.p0(this.f36829b, this.d, this.f36830c, this.f36831e, this.f36832f);
                return;
            default:
                this.f36829b.r4(this.f36830c, this.d, false, this.f36831e, this.f36832f);
                return;
        }
    }

    public gw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f36829b = uyVar;
        this.f36830c = arrayList;
        this.d = i10;
        this.f36831e = z10;
        this.f36832f = hashSet;
    }
}
