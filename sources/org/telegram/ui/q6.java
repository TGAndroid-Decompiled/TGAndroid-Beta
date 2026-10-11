package org.telegram.ui;

import android.util.SparseArray;
public final class q6 {
    public long f41046a;
    public int f41047b;
    public long f41048c;
    public final SparseArray d = new SparseArray();

    public q6(long j3) {
        this.f41046a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        r6 r6Var = (r6) sparseArray.get(i10, null);
        if (r6Var == null) {
            r6Var = new r6();
            sparseArray.put(i10, r6Var);
        }
        long j3 = aVar.f54783c;
        r6Var.f41336a += j3;
        this.f41048c += j3;
        this.f41047b++;
        r6Var.f41337b.add(aVar);
    }

    public final void b(zh.a aVar) {
        r6 r6Var = (r6) this.d.get(aVar.d, null);
        if (r6Var != null && r6Var.f41337b.remove(aVar)) {
            long j3 = r6Var.f41336a;
            long j10 = aVar.f54783c;
            r6Var.f41336a = j3 - j10;
            this.f41048c -= j10;
            this.f41047b--;
        }
    }
}
