package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class qg0 implements Comparator {
    public final xg0 f30410a;

    public qg0(xg0 xg0Var) {
        this.f30410a = xg0Var;
    }

    public final int a(wg0 wg0Var) {
        xg0 xg0Var = this.f30410a;
        int size = xg0Var.f33071r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(xg0Var.f33071r.answers.get(i10).option, wg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((wg0) obj);
        int a10 = a((wg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
