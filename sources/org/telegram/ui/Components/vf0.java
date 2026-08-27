package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

public final class vf0 implements Comparator {

    public final cg0 f33415a;

    public vf0(cg0 cg0Var) {
        this.f33415a = cg0Var;
    }

    public final int a(bg0 bg0Var) {
        cg0 cg0Var = this.f33415a;
        int size = cg0Var.f27422r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(cg0Var.f27422r.answers.get(i10).option, bg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int iA = a((bg0) obj);
        int iA2 = a((bg0) obj2);
        if (iA > iA2) {
            return 1;
        }
        return iA < iA2 ? -1 : 0;
    }
}
