package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
public abstract class xj0 extends ij0 {
    public SparseIntArray f42102c;
    public SparseIntArray d;
    public SparseIntArray f42103e;
    public int f42104f;
    public int h;
    public final ArrayList f42105n = new ArrayList();

    public xj0() {
        L();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        return V(S(b10), Q(b10), f1Var);
    }

    public final void L() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray == null) {
            this.d = new SparseIntArray();
            this.f42102c = new SparseIntArray();
            this.f42103e = new SparseIntArray();
        } else {
            sparseIntArray.clear();
            this.f42102c.clear();
            this.f42103e.clear();
        }
        this.h = -1;
        this.f42104f = -1;
    }

    public abstract int M(int i7);

    public int N(int i7, int i10) {
        return Objects.hash(Integer.valueOf((-49612) * i7), O(i7, i10));
    }

    public abstract Object O(int i7, int i10);

    public abstract int P(int i7, int i10);

    public final int Q(int i7) {
        int i10 = this.f42102c.get(i7, Integer.MAX_VALUE);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int i11 = this.f42104f;
        if (i11 < 0) {
            i11 = R();
            this.f42104f = i11;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int U = U(i12) + i13;
            if (i7 >= i13 && i7 < U) {
                int i14 = i7 - i13;
                this.f42102c.put(i7, i14);
                return i14;
            }
            i12++;
            i13 = U;
        }
        return -1;
    }

    public abstract int R();

    public final int S(int i7) {
        int i10 = this.d.get(i7, Integer.MAX_VALUE);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int i11 = this.f42104f;
        if (i11 < 0) {
            i11 = R();
            this.f42104f = i11;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int U = U(i12) + i13;
            if (i7 >= i13 && i7 < U) {
                this.d.put(i7, i12);
                return i12;
            }
            i12++;
            i13 = U;
        }
        return -1;
    }

    public abstract View T(int i7, View view);

    public final int U(int i7) {
        int i10 = this.f42103e.get(i7, Integer.MAX_VALUE);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int M = M(i7);
        this.f42103e.put(i7, M);
        return M;
    }

    public abstract boolean V(int i7, int i10, v4.f1 f1Var);

    public abstract void W(int i7, int i10, v4.f1 f1Var);

    public final void X(boolean z10) {
        ArrayList arrayList = this.f42105n;
        ArrayList arrayList2 = new ArrayList(arrayList);
        L();
        arrayList.clear();
        int i7 = this.f42104f;
        if (i7 < 0) {
            i7 = R();
            this.f42104f = i7;
        }
        for (int i10 = 0; i10 < i7; i10++) {
            int U = U(i10);
            for (int i11 = 0; i11 < U; i11++) {
                arrayList.add(Integer.valueOf(N(i10, i11)));
            }
        }
        if (z10) {
            v4.o.c(new jg.g(this, arrayList2, 2), true).c(this);
        } else {
            super.f();
        }
    }

    @Override
    public final int b() {
        int i7 = this.h;
        if (i7 >= 0) {
            return i7;
        }
        this.h = 0;
        int i10 = this.f42104f;
        if (i10 < 0) {
            i10 = R();
            this.f42104f = i10;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            this.h = U(i11) + this.h;
        }
        return this.h;
    }

    @Override
    public final int d(int i7) {
        return P(S(i7), Q(i7));
    }

    @Override
    public void f() {
        X(false);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        W(S(i7), Q(i7), f1Var);
    }
}
