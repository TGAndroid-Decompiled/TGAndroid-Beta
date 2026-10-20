package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class dh0 implements Comparator {
    public final lh0 f25501a;

    public dh0(lh0 lh0Var) {
        this.f25501a = lh0Var;
    }

    public final int a(kh0 kh0Var) {
        lh0 lh0Var = this.f25501a;
        int size = lh0Var.f28167r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(lh0Var.f28167r.answers.get(i10).option, kh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((kh0) obj);
        int a10 = a((kh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
