package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class gw implements Runnable {
    public final int f38164a = 0;
    public final vy f38165b;
    public final ArrayList f38166c;
    public final int d;
    public final boolean f38167e;
    public final HashSet f38168f;

    public gw(vy vyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f38165b = vyVar;
        this.d = i10;
        this.f38166c = arrayList;
        this.f38167e = z10;
        this.f38168f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f38164a) {
            case 0:
                vy.n0(this.f38165b, this.d, this.f38166c, this.f38167e, this.f38168f);
                return;
            default:
                this.f38165b.o4(this.f38166c, this.d, false, this.f38167e, this.f38168f);
                return;
        }
    }

    public gw(vy vyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f38165b = vyVar;
        this.f38166c = arrayList;
        this.d = i10;
        this.f38167e = z10;
        this.f38168f = hashSet;
    }
}
