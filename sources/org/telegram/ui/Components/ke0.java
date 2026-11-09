package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class ke0 implements Comparator {
    public final re0 f35331a;

    public ke0(re0 re0Var) {
        this.f35331a = re0Var;
    }

    public final int a(qe0 qe0Var) {
        re0 re0Var = this.f35331a;
        int size = re0Var.f37690p1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(re0Var.f37690p1.answers.get(i7).option, qe0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a10 = a((qe0) obj);
        int a11 = a((qe0) obj2);
        if (a10 > a11) {
            return 1;
        }
        if (a10 < a11) {
            return -1;
        }
        return 0;
    }
}
