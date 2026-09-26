package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class sg0 implements Comparator {
    public final bh0 f28280a;

    public sg0(bh0 bh0Var) {
        this.f28280a = bh0Var;
    }

    public final int a(ah0 ah0Var) {
        bh0 bh0Var = this.f28280a;
        int size = bh0Var.f23021r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(bh0Var.f23021r.answers.get(i10).option, ah0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((ah0) obj);
        int a10 = a((ah0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
