package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public final class jy0 {

    public final boolean f29831a;
    public j9.a d;

    public j9.a f29835f;
    public j9.a h;

    public int[] f29838j;

    public int[] f29840l;

    public hy0[] f29842n;

    public int[] f29844p;

    public boolean f29846r;

    public int[] f29848t;

    public final ty0 f29851x;

    public int f29832b = Integer.MIN_VALUE;

    public int f29833c = Integer.MIN_VALUE;

    public boolean f29834e = false;

    public boolean f29836g = false;

    public boolean f29837i = false;

    public boolean f29839k = false;

    public boolean f29841m = false;

    public boolean f29843o = false;

    public boolean f29845q = false;

    public boolean f29847s = false;

    public boolean f29849u = true;
    public final py0 v = new py0(0);

    public final py0 f29850w = new py0(-100000);

    public jy0(ty0 ty0Var, boolean z10) {
        this.f29851x = ty0Var;
        this.f29831a = z10;
    }

    public static void j(ArrayList arrayList, ny0 ny0Var, py0 py0Var, boolean z10) {
        if (ny0Var.f31062b - ny0Var.f31061a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((hy0) obj).f29179a.equals(ny0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new hy0(ny0Var, py0Var));
    }

    public static boolean m(int[] iArr, hy0 hy0Var) {
        if (!hy0Var.f29181c) {
            return false;
        }
        ny0 ny0Var = hy0Var.f29179a;
        int i10 = ny0Var.f31061a;
        int i11 = ny0Var.f31062b;
        int i12 = iArr[i10] + hy0Var.f29180b.f31692a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(j9.a aVar, boolean z10) {
        for (py0 py0Var : (py0[]) ((Object[]) aVar.d)) {
            py0Var.f31692a = Integer.MIN_VALUE;
        }
        ky0[] ky0VarArr = (ky0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < ky0VarArr.length; i10++) {
            int iD = ky0VarArr[i10].d(z10);
            py0 py0Var2 = (py0) ((Object[]) aVar.d)[((int[]) aVar.f12863b)[i10]];
            int i11 = py0Var2.f31692a;
            if (!z10) {
                iD = -iD;
            }
            py0Var2.f31692a = Math.max(i11, iD);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.f29838j : this.f29840l;
        ty0 ty0Var = this.f29851x;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            my0 my0VarD = ty0Var.d(i10);
            oy0 oy0Var = my0VarD.f30778a;
            boolean z11 = this.f29831a;
            ny0 ny0Var = (z11 ? oy0Var.f31446b : oy0Var.f31445a).f32006b;
            int i11 = z10 ? ny0Var.f31061a : ny0Var.f31062b;
            iArr[i11] = Math.max(iArr[i11], ty0Var.f(my0VarD, z11, z10));
        }
    }

    public final j9.a c(boolean z10) {
        ny0 ny0Var;
        iy0 iy0Var = new iy0(ny0.class, py0.class);
        qy0[] qy0VarArr = (qy0[]) ((Object[]) f().f12864c);
        int length = qy0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                ny0Var = qy0VarArr[i10].f32006b;
            } else {
                ny0 ny0Var2 = qy0VarArr[i10].f32006b;
                ny0Var = new ny0(ny0Var2.f31062b, ny0Var2.f31061a);
            }
            py0 py0Var = new py0();
            py0Var.f31692a = Integer.MIN_VALUE;
            iy0Var.add(Pair.create(ny0Var, py0Var));
        }
        return iy0Var.i();
    }

    public final hy0[] d() {
        if (this.f29842n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f29835f == null) {
                this.f29835f = c(true);
            }
            if (!this.f29836g) {
                a(this.f29835f, true);
                this.f29836g = true;
            }
            j9.a aVar = this.f29835f;
            int i10 = 0;
            while (true) {
                ny0[] ny0VarArr = (ny0[]) ((Object[]) aVar.f12864c);
                if (i10 >= ny0VarArr.length) {
                    break;
                }
                j(arrayList, ny0VarArr[i10], ((py0[]) ((Object[]) aVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f29837i) {
                a(this.h, false);
                this.f29837i = true;
            }
            j9.a aVar2 = this.h;
            int i11 = 0;
            while (true) {
                ny0[] ny0VarArr2 = (ny0[]) ((Object[]) aVar2.f12864c);
                if (i11 >= ny0VarArr2.length) {
                    break;
                }
                j(arrayList2, ny0VarArr2[i11], ((py0[]) ((Object[]) aVar2.d))[i11], false);
                i11++;
            }
            if (this.f29849u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new ny0(i12, i13), new py0(0), true);
                    i12 = i13;
                }
            }
            int iE = e();
            j(arrayList, new ny0(0, iE), this.v, false);
            j(arrayList2, new ny0(iE, 0), this.f29850w, false);
            hy0[] hy0VarArrQ = q(arrayList);
            hy0[] hy0VarArrQ2 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(hy0[].class.getComponentType(), hy0VarArrQ.length + hy0VarArrQ2.length);
            System.arraycopy(hy0VarArrQ, 0, objArr, 0, hy0VarArrQ.length);
            System.arraycopy(hy0VarArrQ2, 0, objArr, hy0VarArrQ.length, hy0VarArrQ2.length);
            this.f29842n = (hy0[]) objArr;
        }
        if (!this.f29843o) {
            if (this.f29835f == null) {
                this.f29835f = c(true);
            }
            if (!this.f29836g) {
                a(this.f29835f, true);
                this.f29836g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f29837i) {
                a(this.h, false);
                this.f29837i = true;
            }
            this.f29843o = true;
        }
        return this.f29842n;
    }

    public final int e() {
        return Math.max(this.f29832b, h());
    }

    public final j9.a f() {
        Object gy0Var;
        j9.a aVar = this.d;
        boolean z10 = this.f29831a;
        ty0 ty0Var = this.f29851x;
        if (aVar == null) {
            iy0 iy0Var = new iy0(qy0.class, ky0.class);
            int childCount = ty0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                oy0 oy0Var = ty0Var.d(i10).f30778a;
                qy0 qy0Var = z10 ? oy0Var.f31446b : oy0Var.f31445a;
                switch (qy0.a(qy0Var, z10).f28467a) {
                    case 3:
                        gy0Var = new gy0();
                        break;
                    default:
                        gy0Var = new ky0();
                        break;
                }
                iy0Var.add(Pair.create(qy0Var, gy0Var));
            }
            this.d = iy0Var.i();
        }
        if (!this.f29834e) {
            for (ky0 ky0Var : (ky0[]) ((Object[]) this.d.d)) {
                ky0Var.c();
            }
            int childCount2 = ty0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                my0 my0VarD = ty0Var.d(i11);
                oy0 oy0Var2 = my0VarD.f30778a;
                qy0 qy0Var2 = z10 ? oy0Var2.f31446b : oy0Var2.f31445a;
                int iE = ty0Var.e(my0VarD, z10, false) + ty0Var.e(my0VarD, z10, true) + (z10 ? my0VarD.f30786k : my0VarD.f30787l);
                float f10 = qy0Var2.d;
                int i12 = iE + (f10 == 0.0f ? 0 : this.f29848t[i11]);
                j9.a aVar2 = this.d;
                ky0 ky0Var2 = (ky0) ((Object[]) aVar2.d)[((int[]) aVar2.f12863b)[i11]];
                ky0Var2.f30225c = ((qy0Var2.f32007c == ty0.N && f10 == 0.0f) ? 0 : 2) & ky0Var2.f30225c;
                int iA = qy0.a(qy0Var2, z10).a(my0VarD, i12);
                ky0Var2.b(iA, i12 - iA);
            }
            this.f29834e = true;
        }
        return this.d;
    }

    public final int[] g() {
        boolean z10;
        if (this.f29844p == null) {
            this.f29844p = new int[e() + 1];
        }
        if (!this.f29845q) {
            int[] iArr = this.f29844p;
            boolean z11 = this.f29847s;
            float f10 = 0.0f;
            boolean z12 = this.f29831a;
            ty0 ty0Var = this.f29851x;
            if (!z11) {
                int childCount = ty0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    oy0 oy0Var = ty0Var.d(i10).f30778a;
                    if ((z12 ? oy0Var.f31446b : oy0Var.f31445a).d != 0.0f) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                this.f29846r = z10;
                this.f29847s = true;
            }
            if (this.f29846r) {
                if (this.f29848t == null) {
                    this.f29848t = new int[ty0Var.getChildCount()];
                }
                Arrays.fill(this.f29848t, 0);
                p(d(), iArr, true);
                int childCount2 = (ty0Var.getChildCount() * this.v.f31692a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = ty0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        oy0 oy0Var2 = ty0Var.d(i11).f30778a;
                        f10 += (z12 ? oy0Var2.f31446b : oy0Var2.f31445a).d;
                    }
                    int i12 = -1;
                    int i13 = 0;
                    boolean z13 = true;
                    while (i13 < childCount2) {
                        int i14 = (int) ((((long) i13) + ((long) childCount2)) / 2);
                        l();
                        o(f10, i14);
                        boolean zP = p(d(), iArr, false);
                        if (zP) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = zP;
                    }
                    if (i12 > 0 && !z13) {
                        l();
                        o(f10, i12);
                        p(d(), iArr, true);
                    }
                }
            } else {
                p(d(), iArr, true);
            }
            if (!this.f29849u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f29845q = true;
        }
        return this.f29844p;
    }

    public final int h() {
        if (this.f29833c == Integer.MIN_VALUE) {
            ty0 ty0Var = this.f29851x;
            int childCount = ty0Var.getChildCount();
            int iMax = -1;
            for (int i10 = 0; i10 < childCount; i10++) {
                oy0 oy0Var = ty0Var.d(i10).f30778a;
                ny0 ny0Var = (this.f29831a ? oy0Var.f31446b : oy0Var.f31445a).f32006b;
                int i11 = ny0Var.f31061a;
                int i12 = ny0Var.f31062b;
                iMax = Math.max(Math.max(Math.max(iMax, i11), i12), i12 - ny0Var.f31061a);
            }
            this.f29833c = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
        }
        return this.f29833c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        py0 py0Var = this.f29850w;
        py0 py0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            py0Var2.f31692a = 0;
            py0Var.f31692a = -size;
            this.f29845q = false;
            return g()[e()];
        }
        if (mode == 0) {
            py0Var2.f31692a = 0;
            py0Var.f31692a = -100000;
            this.f29845q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        py0Var2.f31692a = size;
        py0Var.f31692a = -size;
        this.f29845q = false;
        return g()[e()];
    }

    public final void k() {
        this.f29833c = Integer.MIN_VALUE;
        this.d = null;
        this.f29835f = null;
        this.h = null;
        this.f29838j = null;
        this.f29840l = null;
        this.f29842n = null;
        this.f29844p = null;
        this.f29848t = null;
        this.f29847s = false;
        l();
    }

    public final void l() {
        this.f29834e = false;
        this.f29836g = false;
        this.f29837i = false;
        this.f29839k = false;
        this.f29841m = false;
        this.f29843o = false;
        this.f29845q = false;
    }

    public final void n(int i10) {
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            throw new IllegalArgumentException(s3.c.l((this.f29831a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f29832b = i10;
    }

    public final void o(float f10, int i10) {
        Arrays.fill(this.f29848t, 0);
        ty0 ty0Var = this.f29851x;
        int childCount = ty0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            oy0 oy0Var = ty0Var.d(i11).f30778a;
            float f11 = (this.f29831a ? oy0Var.f31446b : oy0Var.f31445a).d;
            if (f11 != 0.0f) {
                int iRound = Math.round((i10 * f11) / f10);
                this.f29848t[i11] = iRound;
                i10 -= iRound;
                f10 -= f11;
            }
        }
    }

    public final boolean p(hy0[] hy0VarArr, int[] iArr, boolean z10) {
        int iE = e() + 1;
        loop0: for (int i10 = 0; i10 < hy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < iE; i11++) {
                boolean zM = false;
                for (hy0 hy0Var : hy0VarArr) {
                    zM |= m(iArr, hy0Var);
                }
                if (!zM) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[hy0VarArr.length];
            for (int i12 = 0; i12 < iE; i12++) {
                int length = hy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, hy0VarArr[i13]);
                }
            }
            for (int i14 = 0; i14 < hy0VarArr.length; i14++) {
                if (zArr[i14]) {
                    hy0 hy0Var2 = hy0VarArr[i14];
                    ny0 ny0Var = hy0Var2.f29179a;
                    if (ny0Var.f31061a >= ny0Var.f31062b) {
                        hy0Var2.f29181c = false;
                        break;
                    }
                }
            }
        }
        return true;
    }

    public final hy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (hy0[]) arrayList.toArray(new hy0[0]));
        int length = ((hy0[][]) i0Var.f5066c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (hy0[]) i0Var.f5065b;
    }
}
