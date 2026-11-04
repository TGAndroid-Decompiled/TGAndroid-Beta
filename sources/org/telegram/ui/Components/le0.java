package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class le0 implements Comparator {
    public final se0 f35712a;

    public le0(se0 se0Var) {
        this.f35712a = se0Var;
    }

    public final int a(re0 re0Var) {
        se0 se0Var = this.f35712a;
        int size = se0Var.f37994q1.answers.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (Arrays.equals(se0Var.f37994q1.answers.get(i3).option, re0Var.d)) {
                return i3;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a10 = a((re0) obj);
        int a11 = a((re0) obj2);
        if (a10 > a11) {
            return 1;
        }
        if (a10 < a11) {
            return -1;
        }
        return 0;
    }
}
