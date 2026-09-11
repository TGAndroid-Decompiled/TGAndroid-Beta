package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class gw implements Runnable {
    public final int f36801a = 0;
    public final uy f36802b;
    public final ArrayList f36803c;
    public final int d;
    public final boolean f36804e;
    public final HashSet f36805f;

    public gw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f36802b = uyVar;
        this.d = i10;
        this.f36803c = arrayList;
        this.f36804e = z10;
        this.f36805f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36801a) {
            case 0:
                uy.p0(this.f36802b, this.d, this.f36803c, this.f36804e, this.f36805f);
                return;
            default:
                this.f36802b.r4(this.f36803c, this.d, false, this.f36804e, this.f36805f);
                return;
        }
    }

    public gw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f36802b = uyVar;
        this.f36803c = arrayList;
        this.d = i10;
        this.f36804e = z10;
        this.f36805f = hashSet;
    }
}
