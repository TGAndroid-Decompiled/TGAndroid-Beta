package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class gh0 implements Comparator {
    public final oh0 f28585a;

    public gh0(oh0 oh0Var) {
        this.f28585a = oh0Var;
    }

    public final int a(nh0 nh0Var) {
        oh0 oh0Var = this.f28585a;
        int size = oh0Var.f31289r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(oh0Var.f31289r.answers.get(i10).option, nh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((nh0) obj);
        int a10 = a((nh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
