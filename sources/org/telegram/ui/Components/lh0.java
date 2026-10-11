package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class lh0 implements Comparator {
    public final uh0 f28339a;

    public lh0(uh0 uh0Var) {
        this.f28339a = uh0Var;
    }

    public final int a(th0 th0Var) {
        uh0 uh0Var = this.f28339a;
        int size = uh0Var.f31456r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(uh0Var.f31456r.answers.get(i10).option, th0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((th0) obj);
        int a10 = a((th0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
