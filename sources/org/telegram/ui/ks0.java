package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class ks0 implements Comparator {
    public final int f47296a;
    public final org.telegram.messenger.qp f47297b;

    public ks0(org.telegram.messenger.qp qpVar, int i7) {
        this.f47296a = i7;
        this.f47297b = qpVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        vs0 vs0Var = (vs0) obj;
        vs0 vs0Var2 = (vs0) obj2;
        switch (this.f47296a) {
            case 0:
                SparseIntArray sparseIntArray = this.f47297b.O0;
                i7 = sparseIntArray.get(vs0Var.f50823a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(vs0Var2.f50823a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f47297b.N0;
                i7 = sparseIntArray2.get(vs0Var.f50823a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(vs0Var2.f50823a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
