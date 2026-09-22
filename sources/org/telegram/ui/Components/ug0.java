package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class ug0 implements Comparator {
    public final ch0 f28779a;

    public ug0(ch0 ch0Var) {
        this.f28779a = ch0Var;
    }

    public final int a(bh0 bh0Var) {
        ch0 ch0Var = this.f28779a;
        int size = ch0Var.f23361r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(ch0Var.f23361r.answers.get(i10).option, bh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((bh0) obj);
        int a10 = a((bh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
