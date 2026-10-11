package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class dw implements Runnable {
    public final int f37164a = 0;
    public final sy f37165b;
    public final ArrayList f37166c;
    public final int d;
    public final boolean f37167e;
    public final HashSet f37168f;

    public dw(sy syVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f37165b = syVar;
        this.d = i10;
        this.f37166c = arrayList;
        this.f37167e = z10;
        this.f37168f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f37164a) {
            case 0:
                sy.n0(this.f37165b, this.d, this.f37166c, this.f37167e, this.f37168f);
                return;
            default:
                this.f37165b.o4(this.f37166c, this.d, false, this.f37167e, this.f37168f);
                return;
        }
    }

    public dw(sy syVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f37165b = syVar;
        this.f37166c = arrayList;
        this.d = i10;
        this.f37167e = z10;
        this.f37168f = hashSet;
    }
}
