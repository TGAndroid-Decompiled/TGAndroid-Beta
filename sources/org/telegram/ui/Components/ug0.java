package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class ug0 implements Comparator {
    public final dh0 f28857a;

    public ug0(dh0 dh0Var) {
        this.f28857a = dh0Var;
    }

    public final int a(ch0 ch0Var) {
        dh0 dh0Var = this.f28857a;
        int size = dh0Var.f23643r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(dh0Var.f23643r.answers.get(i10).option, ch0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((ch0) obj);
        int a10 = a((ch0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
