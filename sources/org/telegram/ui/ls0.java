package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class ls0 implements Comparator {
    public final int f49699a;
    public final org.telegram.messenger.np f49700b;

    public ls0(org.telegram.messenger.np npVar, int i7) {
        this.f49699a = i7;
        this.f49700b = npVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        ws0 ws0Var = (ws0) obj;
        ws0 ws0Var2 = (ws0) obj2;
        switch (this.f49699a) {
            case 0:
                SparseIntArray sparseIntArray = this.f49700b.P0;
                i7 = sparseIntArray.get(ws0Var.f53519a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(ws0Var2.f53519a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f49700b.O0;
                i7 = sparseIntArray2.get(ws0Var.f53519a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(ws0Var2.f53519a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
