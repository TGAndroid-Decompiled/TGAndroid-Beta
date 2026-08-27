package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;

public abstract class vk0 extends jk0 {

    public SparseIntArray f33434c;
    public SparseIntArray d;

    public SparseIntArray f33435e;

    public int f33436f;
    public int h;

    public final ArrayList f33437n = new ArrayList();

    public vk0() {
        L();
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        return V(S(iB), Q(iB), o1Var);
    }

    public final void L() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray == null) {
            this.d = new SparseIntArray();
            this.f33434c = new SparseIntArray();
            this.f33435e = new SparseIntArray();
        } else {
            sparseIntArray.clear();
            this.f33434c.clear();
            this.f33435e.clear();
        }
        this.h = -1;
        this.f33436f = -1;
    }

    public abstract int M(int i10);

    public int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf((-49612) * i10), O(i10, i11));
    }

    public abstract Object O(int i10, int i11);

    public abstract int P(int i10, int i11);

    public final int Q(int i10) {
        int i11 = this.f33434c.get(i10, Integer.MAX_VALUE);
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iR = this.f33436f;
        if (iR < 0) {
            iR = R();
            this.f33436f = iR;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < iR) {
            int iU = U(i12) + i13;
            if (i10 >= i13 && i10 < iU) {
                int i14 = i10 - i13;
                this.f33434c.put(i10, i14);
                return i14;
            }
            i12++;
            i13 = iU;
        }
        return -1;
    }

    public abstract int R();

    public final int S(int i10) {
        int i11 = this.d.get(i10, Integer.MAX_VALUE);
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iR = this.f33436f;
        if (iR < 0) {
            iR = R();
            this.f33436f = iR;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < iR) {
            int iU = U(i12) + i13;
            if (i10 >= i13 && i10 < iU) {
                this.d.put(i10, i12);
                return i12;
            }
            i12++;
            i13 = iU;
        }
        return -1;
    }

    public abstract View T(int i10, View view);

    public final int U(int i10) {
        int i11 = this.f33435e.get(i10, Integer.MAX_VALUE);
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iM = M(i10);
        this.f33435e.put(i10, iM);
        return iM;
    }

    public abstract boolean V(int i10, int i11, f2.o1 o1Var);

    public abstract void W(int i10, int i11, f2.o1 o1Var);

    public final void X(boolean z10) {
        ArrayList arrayList = this.f33437n;
        ArrayList arrayList2 = new ArrayList(arrayList);
        L();
        arrayList.clear();
        int iR = this.f33436f;
        if (iR < 0) {
            iR = R();
            this.f33436f = iR;
        }
        for (int i10 = 0; i10 < iR; i10++) {
            int iU = U(i10);
            for (int i11 = 0; i11 < iU; i11++) {
                arrayList.add(Integer.valueOf(N(i10, i11)));
            }
        }
        if (z10) {
            f2.q.c(new fx(this, arrayList2, 1), true).b(this);
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
        int iR = this.f33436f;
        if (iR < 0) {
            iR = R();
            this.f33436f = iR;
        }
        for (int i11 = 0; i11 < iR; i11++) {
            this.h = U(i11) + this.h;
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
    public final void v(f2.o1 o1Var, int i10) {
        W(S(i10), Q(i10), o1Var);
    }
}
