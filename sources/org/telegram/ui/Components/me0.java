package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class me0 implements Comparator {
    public final te0 f37238a;

    public me0(te0 te0Var) {
        this.f37238a = te0Var;
    }

    public final int a(se0 se0Var) {
        te0 te0Var = this.f37238a;
        int size = te0Var.f39683t1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(te0Var.f39683t1.answers.get(i7).option, se0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a10 = a((se0) obj);
        int a11 = a((se0) obj2);
        if (a10 > a11) {
            return 1;
        }
        if (a10 < a11) {
            return -1;
        }
        return 0;
    }
}
