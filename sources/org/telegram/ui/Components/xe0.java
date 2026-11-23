package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class xe0 implements Comparator {
    public final ef0 f41990a;

    public xe0(ef0 ef0Var) {
        this.f41990a = ef0Var;
    }

    public final int a(df0 df0Var) {
        ef0 ef0Var = this.f41990a;
        int size = ef0Var.f34708t1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(ef0Var.f34708t1.answers.get(i7).option, df0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a10 = a((df0) obj);
        int a11 = a((df0) obj2);
        if (a10 > a11) {
            return 1;
        }
        if (a10 < a11) {
            return -1;
        }
        return 0;
    }
}
