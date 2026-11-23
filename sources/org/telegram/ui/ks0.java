package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class ks0 implements Comparator {
    public final int f49518a;
    public final org.telegram.messenger.mp f49519b;

    public ks0(org.telegram.messenger.mp mpVar, int i7) {
        this.f49518a = i7;
        this.f49519b = mpVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        vs0 vs0Var = (vs0) obj;
        vs0 vs0Var2 = (vs0) obj2;
        switch (this.f49518a) {
            case 0:
                SparseIntArray sparseIntArray = this.f49519b.P0;
                i7 = sparseIntArray.get(vs0Var.f53023a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(vs0Var2.f53023a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f49519b.O0;
                i7 = sparseIntArray2.get(vs0Var.f53023a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(vs0Var2.f53023a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
