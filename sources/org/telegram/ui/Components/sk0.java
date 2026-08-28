package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
public abstract class sk0 extends gk0 {
    public SparseIntArray f32485c;
    public SparseIntArray d;
    public SparseIntArray f32486e;
    public int f32487f;
    public int h;
    public final ArrayList f32488n = new ArrayList();

    public sk0() {
        L();
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        return V(S(b10), Q(b10), q1Var);
    }

    public final void L() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray == null) {
            this.d = new SparseIntArray();
            this.f32485c = new SparseIntArray();
            this.f32486e = new SparseIntArray();
        } else {
            sparseIntArray.clear();
            this.f32485c.clear();
            this.f32486e.clear();
        }
        this.h = -1;
        this.f32487f = -1;
    }

    public abstract int M(int i9);

    public int N(int i9, int i10) {
        return Objects.hash(Integer.valueOf((-49612) * i9), O(i9, i10));
    }

    public abstract Object O(int i9, int i10);

    public abstract int P(int i9, int i10);

    public final int Q(int i9) {
        int i10 = this.f32485c.get(i9, Integer.MAX_VALUE);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int i11 = this.f32487f;
        if (i11 < 0) {
            i11 = R();
            this.f32487f = i11;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int U = U(i12) + i13;
            if (i9 >= i13 && i9 < U) {
                int i14 = i9 - i13;
                this.f32485c.put(i9, i14);
                return i14;
            }
            i12++;
            i13 = U;
        }
        return -1;
    }

    public abstract int R();

    public final int S(int i9) {
        int i10 = this.d.get(i9, Integer.MAX_VALUE);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int i11 = this.f32487f;
        if (i11 < 0) {
            i11 = R();
            this.f32487f = i11;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int U = U(i12) + i13;
            if (i9 >= i13 && i9 < U) {
                this.d.put(i9, i12);
                return i12;
            }
            i12++;
            i13 = U;
        }
        return -1;
    }

    public abstract View T(int i9, View view);

    public final int U(int i9) {
        int i10 = this.f32486e.get(i9, Integer.MAX_VALUE);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int M = M(i9);
        this.f32486e.put(i9, M);
        return M;
    }

    public abstract boolean V(int i9, int i10, f2.q1 q1Var);

    public abstract void W(int i9, int i10, f2.q1 q1Var);

    public final void X(boolean z10) {
        ArrayList arrayList = this.f32488n;
        ArrayList arrayList2 = new ArrayList(arrayList);
        L();
        arrayList.clear();
        int i9 = this.f32487f;
        if (i9 < 0) {
            i9 = R();
            this.f32487f = i9;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int U = U(i10);
            for (int i11 = 0; i11 < U; i11++) {
                arrayList.add(Integer.valueOf(N(i10, i11)));
            }
        }
        if (z10) {
            f2.s.c(new of.g(this, arrayList2, 2), true).b(this);
        } else {
            super.l();
        }
    }

    @Override
    public final int h() {
        int i9 = this.h;
        if (i9 >= 0) {
            return i9;
        }
        this.h = 0;
        int i10 = this.f32487f;
        if (i10 < 0) {
            i10 = R();
            this.f32487f = i10;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            this.h = U(i11) + this.h;
        }
        return this.h;
    }

    @Override
    public final int j(int i9) {
        return P(S(i9), Q(i9));
    }

    @Override
    public void l() {
        X(false);
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        W(S(i9), Q(i9), q1Var);
    }
}
