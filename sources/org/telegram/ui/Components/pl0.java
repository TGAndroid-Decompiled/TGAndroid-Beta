package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
public abstract class pl0 extends dl0 {
    public SparseIntArray f30110c;
    public SparseIntArray d;
    public SparseIntArray f30111e;
    public int f30112f;
    public int h;
    public final ArrayList f30113n = new ArrayList();

    public pl0() {
        L();
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        return V(S(b10), Q(b10), m1Var);
    }

    public final void L() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray == null) {
            this.d = new SparseIntArray();
            this.f30110c = new SparseIntArray();
            this.f30111e = new SparseIntArray();
        } else {
            sparseIntArray.clear();
            this.f30110c.clear();
            this.f30111e.clear();
        }
        this.h = -1;
        this.f30112f = -1;
    }

    public abstract int M(int i10);

    public int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf((-49612) * i10), O(i10, i11));
    }

    public abstract Object O(int i10, int i11);

    public abstract int P(int i10, int i11);

    public final int Q(int i10) {
        int i11 = this.f30110c.get(i10, Integer.MAX_VALUE);
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int i12 = this.f30112f;
        if (i12 < 0) {
            i12 = R();
            this.f30112f = i12;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int U = U(i13) + i14;
            if (i10 >= i14 && i10 < U) {
                int i15 = i10 - i14;
                this.f30110c.put(i10, i15);
                return i15;
            }
            i13++;
            i14 = U;
        }
        return -1;
    }

    public abstract int R();

    public final int S(int i10) {
        int i11 = this.d.get(i10, Integer.MAX_VALUE);
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int i12 = this.f30112f;
        if (i12 < 0) {
            i12 = R();
            this.f30112f = i12;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int U = U(i13) + i14;
            if (i10 >= i14 && i10 < U) {
                this.d.put(i10, i13);
                return i13;
            }
            i13++;
            i14 = U;
        }
        return -1;
    }

    public abstract View T(int i10, View view);

    public final int U(int i10) {
        int i11 = this.f30111e.get(i10, Integer.MAX_VALUE);
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int M = M(i10);
        this.f30111e.put(i10, M);
        return M;
    }

    public abstract boolean V(int i10, int i11, f2.m1 m1Var);

    public abstract void W(int i10, int i11, f2.m1 m1Var);

    public final void X(boolean z4) {
        ArrayList arrayList = this.f30113n;
        ArrayList arrayList2 = new ArrayList(arrayList);
        L();
        arrayList.clear();
        int i10 = this.f30112f;
        if (i10 < 0) {
            i10 = R();
            this.f30112f = i10;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int U = U(i11);
            for (int i12 = 0; i12 < U; i12++) {
                arrayList.add(Integer.valueOf(N(i11, i12)));
            }
        }
        if (z4) {
            f2.q.c(new cg.a(this, arrayList2, 2), true).b(this);
        } else {
            super.l();
        }
    }

    @Override
    public final int h() {
        int i10 = this.h;
        if (i10 >= 0) {
            return i10;
        }
        this.h = 0;
        int i11 = this.f30112f;
        if (i11 < 0) {
            i11 = R();
            this.f30112f = i11;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            this.h = U(i12) + this.h;
        }
        return this.h;
    }

    @Override
    public final int j(int i10) {
        return P(S(i10), Q(i10));
    }

    @Override
    public void l() {
        X(false);
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        W(S(i10), Q(i10), m1Var);
    }
}
