package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class mf0 implements Comparator {
    public final tf0 f28433a;

    public mf0(tf0 tf0Var) {
        this.f28433a = tf0Var;
    }

    public final int a(sf0 sf0Var) {
        tf0 tf0Var = this.f28433a;
        int size = tf0Var.f30559p1.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(tf0Var.f30559p1.answers.get(i10).option, sf0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((sf0) obj);
        int a10 = a((sf0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
