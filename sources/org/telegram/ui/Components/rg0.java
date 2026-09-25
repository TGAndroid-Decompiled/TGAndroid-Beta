package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class rg0 implements Comparator {
    public final ah0 f27970a;

    public rg0(ah0 ah0Var) {
        this.f27970a = ah0Var;
    }

    public final int a(zg0 zg0Var) {
        ah0 ah0Var = this.f27970a;
        int size = ah0Var.f22694r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(ah0Var.f22694r.answers.get(i10).option, zg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((zg0) obj);
        int a10 = a((zg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
