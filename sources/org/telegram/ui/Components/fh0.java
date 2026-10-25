package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;
public final class fh0 implements Comparator {
    public final nh0 f28190a;

    public fh0(nh0 nh0Var) {
        this.f28190a = nh0Var;
    }

    public final int a(mh0 mh0Var) {
        nh0 nh0Var = this.f28190a;
        int size = nh0Var.f30977r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(nh0Var.f30977r.answers.get(i10).option, mh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a2 = a((mh0) obj);
        int a10 = a((mh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        if (a2 < a10) {
            return -1;
        }
        return 0;
    }
}
