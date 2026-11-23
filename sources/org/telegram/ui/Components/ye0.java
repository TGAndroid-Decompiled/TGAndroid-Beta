package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class ye0 implements Comparator {
    public final ff0 f42424a;

    public ye0(ff0 ff0Var) {
        this.f42424a = ff0Var;
    }

    public final int a(ef0 ef0Var) {
        ff0 ff0Var = this.f42424a;
        int size = ff0Var.f35224t1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(ff0Var.f35224t1.answers.get(i7).option, ef0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a10 = a((ef0) obj);
        int a11 = a((ef0) obj2);
        if (a10 > a11) {
            return 1;
        }
        if (a10 < a11) {
            return -1;
        }
        return 0;
    }
}
