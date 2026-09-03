package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class pg0 implements Comparator {
    public final wg0 f27854a;

    public pg0(wg0 wg0Var) {
        this.f27854a = wg0Var;
    }

    public final int a(vg0 vg0Var) {
        wg0 wg0Var = this.f27854a;
        int size = wg0Var.f30253r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(wg0Var.f30253r.answers.get(i10).option, vg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((vg0) obj);
        int a10 = a((vg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
