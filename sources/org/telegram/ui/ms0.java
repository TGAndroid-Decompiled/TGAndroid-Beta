package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class ms0 implements Comparator {
    public final int f49939a;
    public final org.telegram.messenger.np f49940b;

    public ms0(org.telegram.messenger.np npVar, int i7) {
        this.f49939a = i7;
        this.f49940b = npVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        xs0 xs0Var = (xs0) obj;
        xs0 xs0Var2 = (xs0) obj2;
        switch (this.f49939a) {
            case 0:
                SparseIntArray sparseIntArray = this.f49940b.P0;
                i7 = sparseIntArray.get(xs0Var.f53918a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(xs0Var2.f53918a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f49940b.O0;
                i7 = sparseIntArray2.get(xs0Var.f53918a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(xs0Var2.f53918a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
