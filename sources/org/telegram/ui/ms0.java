package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class ms0 implements Comparator {
    public final int f47984a;
    public final org.telegram.messenger.qp f47985b;

    public ms0(org.telegram.messenger.qp qpVar, int i7) {
        this.f47984a = i7;
        this.f47985b = qpVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        xs0 xs0Var = (xs0) obj;
        xs0 xs0Var2 = (xs0) obj2;
        switch (this.f47984a) {
            case 0:
                SparseIntArray sparseIntArray = this.f47985b.O0;
                i7 = sparseIntArray.get(xs0Var.f51756a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(xs0Var2.f51756a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f47985b.N0;
                i7 = sparseIntArray2.get(xs0Var.f51756a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(xs0Var2.f51756a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
