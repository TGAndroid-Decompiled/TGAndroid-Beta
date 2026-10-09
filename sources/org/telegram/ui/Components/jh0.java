package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class jh0 implements Comparator {
    public final sh0 f27714a;

    public jh0(sh0 sh0Var) {
        this.f27714a = sh0Var;
    }

    public final int a(rh0 rh0Var) {
        sh0 sh0Var = this.f27714a;
        int size = sh0Var.f30801r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(sh0Var.f30801r.answers.get(i10).option, rh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((rh0) obj);
        int a10 = a((rh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
