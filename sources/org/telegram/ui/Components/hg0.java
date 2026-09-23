package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class hg0 implements Comparator {
    public final qg0 f24674a;

    public hg0(qg0 qg0Var) {
        this.f24674a = qg0Var;
    }

    public final int a(pg0 pg0Var) {
        qg0 qg0Var = this.f24674a;
        int size = qg0Var.f27344r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(qg0Var.f27344r.answers.get(i10).option, pg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((pg0) obj);
        int a10 = a((pg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
