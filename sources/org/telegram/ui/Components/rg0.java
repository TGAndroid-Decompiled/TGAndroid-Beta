package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class rg0 implements Comparator {
    public final zg0 f26666a;

    public rg0(zg0 zg0Var) {
        this.f26666a = zg0Var;
    }

    public final int a(yg0 yg0Var) {
        zg0 zg0Var = this.f26666a;
        int size = zg0Var.f29682r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(zg0Var.f29682r.answers.get(i10).option, yg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((yg0) obj);
        int a10 = a((yg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
