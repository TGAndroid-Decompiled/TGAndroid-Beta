package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class fw implements Runnable {
    public final int f36419a = 0;
    public final uy f36420b;
    public final ArrayList f36421c;
    public final int d;
    public final boolean f36422e;
    public final HashSet f36423f;

    public fw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f36420b = uyVar;
        this.d = i10;
        this.f36421c = arrayList;
        this.f36422e = z10;
        this.f36423f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36419a) {
            case 0:
                uy.p0(this.f36420b, this.d, this.f36421c, this.f36422e, this.f36423f);
                return;
            default:
                this.f36420b.A4(this.f36421c, this.d, false, this.f36422e, this.f36423f);
                return;
        }
    }

    public fw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f36420b = uyVar;
        this.f36421c = arrayList;
        this.d = i10;
        this.f36422e = z10;
        this.f36423f = hashSet;
    }
}
