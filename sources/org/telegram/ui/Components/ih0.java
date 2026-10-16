package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class ih0 implements Comparator {
    public final qh0 f25641a;

    public ih0(qh0 qh0Var) {
        this.f25641a = qh0Var;
    }

    public final int a(ph0 ph0Var) {
        qh0 qh0Var = this.f25641a;
        int size = qh0Var.f28290r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(qh0Var.f28290r.answers.get(i10).option, ph0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((ph0) obj);
        int a10 = a((ph0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
