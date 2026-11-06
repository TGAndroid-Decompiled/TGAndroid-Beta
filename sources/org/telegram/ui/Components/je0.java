package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class je0 implements Comparator {
    public final qe0 f34948a;

    public je0(qe0 qe0Var) {
        this.f34948a = qe0Var;
    }

    public final int a(pe0 pe0Var) {
        qe0 qe0Var = this.f34948a;
        int size = qe0Var.f37274p1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(qe0Var.f37274p1.answers.get(i7).option, pe0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a10 = a((pe0) obj);
        int a11 = a((pe0) obj2);
        if (a10 > a11) {
            return 1;
        }
        if (a10 < a11) {
            return -1;
        }
        return 0;
    }
}
