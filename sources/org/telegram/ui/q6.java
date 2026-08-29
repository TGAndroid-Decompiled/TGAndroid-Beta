package org.telegram.ui;

import android.util.SparseArray;
public final class q6 {
    public long f41543a;
    public int f41544b;
    public long f41545c;
    public final SparseArray d = new SparseArray();

    public q6(long j10) {
        this.f41543a = j10;
    }

    public final void a(kh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        r6 r6Var = (r6) sparseArray.get(i10, null);
        if (r6Var == null) {
            r6Var = new r6();
            sparseArray.put(i10, r6Var);
        }
        long j10 = aVar.f13891c;
        r6Var.f41978a += j10;
        this.f41545c += j10;
        this.f41544b++;
        r6Var.f41979b.add(aVar);
    }

    public final void b(kh.a aVar) {
        r6 r6Var = (r6) this.d.get(aVar.d, null);
        if (r6Var != null && r6Var.f41979b.remove(aVar)) {
            long j10 = r6Var.f41978a;
            long j11 = aVar.f13891c;
            r6Var.f41978a = j10 - j11;
            this.f41545c -= j11;
            this.f41544b--;
        }
    }
}
