package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class nh0 implements Comparator {
    public final wh0 f28789a;

    public nh0(wh0 wh0Var) {
        this.f28789a = wh0Var;
    }

    public final int a(vh0 vh0Var) {
        wh0 wh0Var = this.f28789a;
        int size = wh0Var.f32398r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(wh0Var.f32398r.answers.get(i10).option, vh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((vh0) obj);
        int a10 = a((vh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
