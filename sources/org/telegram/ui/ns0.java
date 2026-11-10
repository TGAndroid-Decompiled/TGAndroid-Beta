package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class ns0 implements Comparator {
    public final int f48281a;
    public final org.telegram.messenger.qp f48282b;

    public ns0(org.telegram.messenger.qp qpVar, int i7) {
        this.f48281a = i7;
        this.f48282b = qpVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        ys0 ys0Var = (ys0) obj;
        ys0 ys0Var2 = (ys0) obj2;
        switch (this.f48281a) {
            case 0:
                SparseIntArray sparseIntArray = this.f48282b.O0;
                i7 = sparseIntArray.get(ys0Var.f52109a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(ys0Var2.f52109a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f48282b.N0;
                i7 = sparseIntArray2.get(ys0Var.f52109a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(ys0Var2.f52109a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
