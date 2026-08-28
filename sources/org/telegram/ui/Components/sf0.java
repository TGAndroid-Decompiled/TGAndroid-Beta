package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class sf0 implements Comparator {
    public final ag0 f32457a;

    public sf0(ag0 ag0Var) {
        this.f32457a = ag0Var;
    }

    public final int a(zf0 zf0Var) {
        ag0 ag0Var = this.f32457a;
        int size = ag0Var.f26788r.answers.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (Arrays.equals(ag0Var.f26788r.answers.get(i9).option, zf0Var.d)) {
                return i9;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((zf0) obj);
        int a3 = a((zf0) obj2);
        if (a2 > a3) {
            return 1;
        }
        if (a2 < a3) {
            return -1;
        }
        return 0;
    }
}
