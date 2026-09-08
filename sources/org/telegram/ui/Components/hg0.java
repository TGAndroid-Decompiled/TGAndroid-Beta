package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class hg0 implements Comparator {
    public final pg0 f26758a;

    public hg0(pg0 pg0Var) {
        this.f26758a = pg0Var;
    }

    public final int a(og0 og0Var) {
        pg0 pg0Var = this.f26758a;
        int size = pg0Var.f29402r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(pg0Var.f29402r.answers.get(i10).option, og0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((og0) obj);
        int a10 = a((og0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
