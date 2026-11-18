package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class ls0 implements Comparator {
    public final int f49685a;
    public final org.telegram.messenger.mp f49686b;

    public ls0(org.telegram.messenger.mp mpVar, int i7) {
        this.f49685a = i7;
        this.f49686b = mpVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        ws0 ws0Var = (ws0) obj;
        ws0 ws0Var2 = (ws0) obj2;
        switch (this.f49685a) {
            case 0:
                SparseIntArray sparseIntArray = this.f49686b.P0;
                i7 = sparseIntArray.get(ws0Var.f53518a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(ws0Var2.f53518a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f49686b.O0;
                i7 = sparseIntArray2.get(ws0Var.f53518a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(ws0Var2.f53518a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
