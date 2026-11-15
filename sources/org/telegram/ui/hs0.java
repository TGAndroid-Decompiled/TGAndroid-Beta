package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class hs0 implements Comparator {
    public final int f47818a;
    public final org.telegram.messenger.np f47819b;

    public hs0(org.telegram.messenger.np npVar, int i7) {
        this.f47818a = i7;
        this.f47819b = npVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        ss0 ss0Var = (ss0) obj;
        ss0 ss0Var2 = (ss0) obj2;
        switch (this.f47818a) {
            case 0:
                SparseIntArray sparseIntArray = this.f47819b.P0;
                i7 = sparseIntArray.get(ss0Var.f51268a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(ss0Var2.f51268a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f47819b.O0;
                i7 = sparseIntArray2.get(ss0Var.f51268a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(ss0Var2.f51268a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
