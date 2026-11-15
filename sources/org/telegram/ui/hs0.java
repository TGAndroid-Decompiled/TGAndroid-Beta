package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class hs0 implements Comparator {
    public final int f47808a;
    public final org.telegram.messenger.np f47809b;

    public hs0(org.telegram.messenger.np npVar, int i7) {
        this.f47808a = i7;
        this.f47809b = npVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        ss0 ss0Var = (ss0) obj;
        ss0 ss0Var2 = (ss0) obj2;
        switch (this.f47808a) {
            case 0:
                SparseIntArray sparseIntArray = this.f47809b.P0;
                i7 = sparseIntArray.get(ss0Var.f51269a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(ss0Var2.f51269a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f47809b.O0;
                i7 = sparseIntArray2.get(ss0Var.f51269a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(ss0Var2.f51269a, Integer.MAX_VALUE);
                break;
        }
        return i7 - i10;
    }
}
