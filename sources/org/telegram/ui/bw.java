package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class bw implements Runnable {
    public final int f35610a = 0;
    public final py f35611b;
    public final ArrayList f35612c;
    public final int d;
    public final boolean f35613e;
    public final HashSet f35614f;

    public bw(py pyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        this.f35611b = pyVar;
        this.d = i10;
        this.f35612c = arrayList;
        this.f35613e = z4;
        this.f35614f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f35610a) {
            case 0:
                py.o0(this.f35611b, this.d, this.f35612c, this.f35613e, this.f35614f);
                return;
            default:
                this.f35611b.r4(this.f35612c, this.d, false, this.f35613e, this.f35614f);
                return;
        }
    }

    public bw(py pyVar, ArrayList arrayList, int i10, boolean z4, HashSet hashSet) {
        this.f35611b = pyVar;
        this.f35612c = arrayList;
        this.d = i10;
        this.f35613e = z4;
        this.f35614f = hashSet;
    }
}
