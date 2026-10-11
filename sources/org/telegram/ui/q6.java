package org.telegram.ui;

import android.util.SparseArray;
public final class q6 {
    public long f41080a;
    public int f41081b;
    public long f41082c;
    public final SparseArray d = new SparseArray();

    public q6(long j3) {
        this.f41080a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        r6 r6Var = (r6) sparseArray.get(i10, null);
        if (r6Var == null) {
            r6Var = new r6();
            sparseArray.put(i10, r6Var);
        }
        long j3 = aVar.f54817c;
        r6Var.f41370a += j3;
        this.f41082c += j3;
        this.f41081b++;
        r6Var.f41371b.add(aVar);
    }

    public final void b(zh.a aVar) {
        r6 r6Var = (r6) this.d.get(aVar.d, null);
        if (r6Var != null && r6Var.f41371b.remove(aVar)) {
            long j3 = r6Var.f41370a;
            long j10 = aVar.f54817c;
            r6Var.f41370a = j3 - j10;
            this.f41082c -= j10;
            this.f41081b--;
        }
    }
}
