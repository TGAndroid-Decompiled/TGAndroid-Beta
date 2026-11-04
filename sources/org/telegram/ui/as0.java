package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class as0 implements Comparator {
    public final int f43836a;
    public final org.telegram.messenger.hp f43837b;

    public as0(org.telegram.messenger.hp hpVar, int i3) {
        this.f43836a = i3;
        this.f43837b = hpVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        ls0 ls0Var = (ls0) obj;
        ls0 ls0Var2 = (ls0) obj2;
        switch (this.f43836a) {
            case 0:
                SparseIntArray sparseIntArray = this.f43837b.P0;
                i3 = sparseIntArray.get(ls0Var.f47430a, Integer.MAX_VALUE);
                i10 = sparseIntArray.get(ls0Var2.f47430a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f43837b.O0;
                i3 = sparseIntArray2.get(ls0Var.f47430a, Integer.MAX_VALUE);
                i10 = sparseIntArray2.get(ls0Var2.f47430a, Integer.MAX_VALUE);
                break;
        }
        return i3 - i10;
    }
}
