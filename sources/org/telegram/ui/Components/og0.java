package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class og0 implements Comparator {
    public final vg0 f27565a;

    public og0(vg0 vg0Var) {
        this.f27565a = vg0Var;
    }

    public final int a(ug0 ug0Var) {
        vg0 vg0Var = this.f27565a;
        int size = vg0Var.f29465r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(vg0Var.f29465r.answers.get(i10).option, ug0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((ug0) obj);
        int a10 = a((ug0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
