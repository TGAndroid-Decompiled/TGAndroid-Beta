package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class js0 implements Comparator {
    public final int f47011a;
    public final org.telegram.messenger.qp f47012b;

    public js0(org.telegram.messenger.qp qpVar, int i7) {
        this.f47011a = i7;
        this.f47012b = qpVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        us0 us0Var = (us0) obj;
        us0 us0Var2 = (us0) obj2;
        switch (this.f47011a) {
            case 0:
                SparseIntArray sparseIntArray = this.f47012b.O0;
                i7 = sparseIntArray.get(us0Var.f50485a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(us0Var2.f50485a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f47012b.N0;
                i7 = sparseIntArray2.get(us0Var.f50485a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(us0Var2.f50485a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
