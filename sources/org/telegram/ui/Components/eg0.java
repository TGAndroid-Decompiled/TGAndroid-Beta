package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class eg0 implements Comparator {
    public final lg0 f28060a;

    public eg0(lg0 lg0Var) {
        this.f28060a = lg0Var;
    }

    public final int a(kg0 kg0Var) {
        lg0 lg0Var = this.f28060a;
        int size = lg0Var.f30320r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(lg0Var.f30320r.answers.get(i10).option, kg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((kg0) obj);
        int a10 = a((kg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
