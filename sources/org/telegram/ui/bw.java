package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class bw implements Runnable {
    public final int f35599a = 0;
    public final py f35600b;
    public final ArrayList f35601c;
    public final int d;
    public final boolean f35602e;
    public final HashSet f35603f;

    public bw(py pyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        this.f35600b = pyVar;
        this.d = i10;
        this.f35601c = arrayList;
        this.f35602e = z4;
        this.f35603f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f35599a) {
            case 0:
                py.o0(this.f35600b, this.d, this.f35601c, this.f35602e, this.f35603f);
                return;
            default:
                this.f35600b.r4(this.f35601c, this.d, false, this.f35602e, this.f35603f);
                return;
        }
    }

    public bw(py pyVar, ArrayList arrayList, int i10, boolean z4, HashSet hashSet) {
        this.f35600b = pyVar;
        this.f35601c = arrayList;
        this.d = i10;
        this.f35602e = z4;
        this.f35603f = hashSet;
    }
}
