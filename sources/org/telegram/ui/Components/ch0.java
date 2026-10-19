package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class ch0 implements Comparator {
    public final kh0 f25220a;

    public ch0(kh0 kh0Var) {
        this.f25220a = kh0Var;
    }

    public final int a(jh0 jh0Var) {
        kh0 kh0Var = this.f25220a;
        int size = kh0Var.f27859r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(kh0Var.f27859r.answers.get(i10).option, jh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((jh0) obj);
        int a10 = a((jh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
