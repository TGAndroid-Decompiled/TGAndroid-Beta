package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class kh0 implements Comparator {
    public final th0 f28028a;

    public kh0(th0 th0Var) {
        this.f28028a = th0Var;
    }

    public final int a(sh0 sh0Var) {
        th0 th0Var = this.f28028a;
        int size = th0Var.f31141r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(th0Var.f31141r.answers.get(i10).option, sh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((sh0) obj);
        int a10 = a((sh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
