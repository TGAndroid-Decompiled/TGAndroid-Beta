package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class we0 implements Comparator {
    public final df0 f41705a;

    public we0(df0 df0Var) {
        this.f41705a = df0Var;
    }

    public final int a(cf0 cf0Var) {
        df0 df0Var = this.f41705a;
        int size = df0Var.f34426t1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(df0Var.f34426t1.answers.get(i7).option, cf0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a10 = a((cf0) obj);
        int a11 = a((cf0) obj2);
        if (a10 > a11) {
            return 1;
        }
        if (a10 < a11) {
            return -1;
        }
        return 0;
    }
}
