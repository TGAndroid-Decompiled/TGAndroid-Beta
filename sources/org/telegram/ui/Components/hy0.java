package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class hy0 {
    public final boolean f29213a;
    public j4.c d;
    public j4.c f29217f;
    public j4.c h;
    public int[] f29220j;
    public int[] f29222l;
    public fy0[] f29224n;
    public int[] f29226p;
    public boolean f29228r;
    public int[] f29230t;
    public final ry0 f29233x;
    public int f29214b = Integer.MIN_VALUE;
    public int f29215c = Integer.MIN_VALUE;
    public boolean f29216e = false;
    public boolean f29218g = false;
    public boolean f29219i = false;
    public boolean f29221k = false;
    public boolean f29223m = false;
    public boolean f29225o = false;
    public boolean f29227q = false;
    public boolean f29229s = false;
    public boolean f29231u = true;
    public final ny0 v = new ny0(0);
    public final ny0 f29232w = new ny0(-100000);

    public hy0(ry0 ry0Var, boolean z10) {
        this.f29233x = ry0Var;
        this.f29213a = z10;
    }

    public static void j(ArrayList arrayList, ly0 ly0Var, ny0 ny0Var, boolean z10) {
        if (ly0Var.f30585b - ly0Var.f30584a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    if (((fy0) obj).f28604a.equals(ly0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new fy0(ly0Var, ny0Var));
        }
    }

    public static boolean m(int[] iArr, fy0 fy0Var) {
        if (fy0Var.f28606c) {
            ly0 ly0Var = fy0Var.f28604a;
            int i9 = ly0Var.f30584a;
            int i10 = ly0Var.f30585b;
            int i11 = iArr[i9] + fy0Var.f28605b.f31218a;
            if (i11 > iArr[i10]) {
                iArr[i10] = i11;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(j4.c cVar, boolean z10) {
        for (ny0 ny0Var : (ny0[]) ((Object[]) cVar.d)) {
            ny0Var.f31218a = Integer.MIN_VALUE;
        }
        iy0[] iy0VarArr = (iy0[]) ((Object[]) f().d);
        for (int i9 = 0; i9 < iy0VarArr.length; i9++) {
            int d = iy0VarArr[i9].d(z10);
            ny0 ny0Var2 = (ny0) ((Object[]) cVar.d)[((int[]) cVar.f13431b)[i9]];
            int i10 = ny0Var2.f31218a;
            if (!z10) {
                d = -d;
            }
            ny0Var2.f31218a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        oy0 oy0Var;
        int i9;
        if (z10) {
            iArr = this.f29220j;
        } else {
            iArr = this.f29222l;
        }
        ry0 ry0Var = this.f29233x;
        int childCount = ry0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ky0 d = ry0Var.d(i10);
            my0 my0Var = d.f30264a;
            boolean z11 = this.f29213a;
            if (z11) {
                oy0Var = my0Var.f30948b;
            } else {
                oy0Var = my0Var.f30947a;
            }
            ly0 ly0Var = oy0Var.f31476b;
            if (z10) {
                i9 = ly0Var.f30584a;
            } else {
                i9 = ly0Var.f30585b;
            }
            iArr[i9] = Math.max(iArr[i9], ry0Var.f(d, z11, z10));
        }
    }

    public final j4.c c(boolean z10) {
        ly0 ly0Var;
        gy0 gy0Var = new gy0(ly0.class, ny0.class);
        oy0[] oy0VarArr = (oy0[]) ((Object[]) f().f13432c);
        int length = oy0VarArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (z10) {
                ly0Var = oy0VarArr[i9].f31476b;
            } else {
                ly0 ly0Var2 = oy0VarArr[i9].f31476b;
                ly0Var = new ly0(ly0Var2.f30585b, ly0Var2.f30584a);
            }
            ?? obj = new Object();
            obj.f31218a = Integer.MIN_VALUE;
            gy0Var.add(Pair.create(ly0Var, obj));
        }
        return gy0Var.i();
    }

    public final fy0[] d() {
        if (this.f29224n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f29217f == null) {
                this.f29217f = c(true);
            }
            if (!this.f29218g) {
                a(this.f29217f, true);
                this.f29218g = true;
            }
            j4.c cVar = this.f29217f;
            int i9 = 0;
            while (true) {
                ly0[] ly0VarArr = (ly0[]) ((Object[]) cVar.f13432c);
                if (i9 >= ly0VarArr.length) {
                    break;
                }
                j(arrayList, ly0VarArr[i9], ((ny0[]) ((Object[]) cVar.d))[i9], false);
                i9++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f29219i) {
                a(this.h, false);
                this.f29219i = true;
            }
            j4.c cVar2 = this.h;
            int i10 = 0;
            while (true) {
                ly0[] ly0VarArr2 = (ly0[]) ((Object[]) cVar2.f13432c);
                if (i10 >= ly0VarArr2.length) {
                    break;
                }
                j(arrayList2, ly0VarArr2[i10], ((ny0[]) ((Object[]) cVar2.d))[i10], false);
                i10++;
            }
            if (this.f29231u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new ly0(i11, i12), new ny0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new ly0(0, e10), this.v, false);
            j(arrayList2, new ly0(e10, 0), this.f29232w, false);
            fy0[] q10 = q(arrayList);
            fy0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(fy0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f29224n = (fy0[]) objArr;
        }
        if (!this.f29225o) {
            if (this.f29217f == null) {
                this.f29217f = c(true);
            }
            if (!this.f29218g) {
                a(this.f29217f, true);
                this.f29218g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f29219i) {
                a(this.h, false);
                this.f29219i = true;
            }
            this.f29225o = true;
        }
        return this.f29224n;
    }

    public final int e() {
        return Math.max(this.f29214b, h());
    }

    public final j4.c f() {
        oy0 oy0Var;
        int i9;
        int i10;
        int i11;
        oy0 oy0Var2;
        iy0 iy0Var;
        j4.c cVar = this.d;
        boolean z10 = this.f29213a;
        ry0 ry0Var = this.f29233x;
        if (cVar == null) {
            gy0 gy0Var = new gy0(oy0.class, iy0.class);
            int childCount = ry0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                my0 my0Var = ry0Var.d(i12).f30264a;
                if (z10) {
                    oy0Var2 = my0Var.f30948b;
                } else {
                    oy0Var2 = my0Var.f30947a;
                }
                switch (oy0.a(oy0Var2, z10).f27843a) {
                    case 3:
                        iy0Var = new iy0();
                        break;
                    default:
                        iy0Var = new iy0();
                        break;
                }
                gy0Var.add(Pair.create(oy0Var2, iy0Var));
            }
            this.d = gy0Var.i();
        }
        if (!this.f29216e) {
            for (iy0 iy0Var2 : (iy0[]) ((Object[]) this.d.d)) {
                iy0Var2.c();
            }
            int childCount2 = ry0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                ky0 d = ry0Var.d(i13);
                my0 my0Var2 = d.f30264a;
                if (z10) {
                    oy0Var = my0Var2.f30948b;
                } else {
                    oy0Var = my0Var2.f30947a;
                }
                if (z10) {
                    i9 = d.f30272k;
                } else {
                    i9 = d.f30273l;
                }
                int e10 = ry0Var.e(d, z10, false) + ry0Var.e(d, z10, true) + i9;
                float f10 = oy0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f29230t[i13];
                }
                int i14 = e10 + i10;
                j4.c cVar2 = this.d;
                iy0 iy0Var3 = (iy0) ((Object[]) cVar2.d)[((int[]) cVar2.f13431b)[i13]];
                int i15 = iy0Var3.f29546c;
                if (oy0Var.f31477c == ry0.N && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                iy0Var3.f29546c = i11 & i15;
                int a2 = oy0.a(oy0Var, z10).a(d, i14);
                iy0Var3.b(a2, i14 - a2);
            }
            this.f29216e = true;
        }
        return this.d;
    }

    public final int[] g() {
        oy0 oy0Var;
        boolean z10;
        oy0 oy0Var2;
        if (this.f29226p == null) {
            this.f29226p = new int[e() + 1];
        }
        if (!this.f29227q) {
            int[] iArr = this.f29226p;
            boolean z11 = this.f29229s;
            float f10 = 0.0f;
            boolean z12 = this.f29213a;
            ry0 ry0Var = this.f29233x;
            if (!z11) {
                int childCount = ry0Var.getChildCount();
                int i9 = 0;
                while (true) {
                    if (i9 < childCount) {
                        my0 my0Var = ry0Var.d(i9).f30264a;
                        if (z12) {
                            oy0Var2 = my0Var.f30948b;
                        } else {
                            oy0Var2 = my0Var.f30947a;
                        }
                        if (oy0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i9++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f29228r = z10;
                this.f29229s = true;
            }
            if (!this.f29228r) {
                p(d(), iArr, true);
            } else {
                if (this.f29230t == null) {
                    this.f29230t = new int[ry0Var.getChildCount()];
                }
                Arrays.fill(this.f29230t, 0);
                p(d(), iArr, true);
                int childCount2 = (ry0Var.getChildCount() * this.v.f31218a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = ry0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        my0 my0Var2 = ry0Var.d(i10).f30264a;
                        if (z12) {
                            oy0Var = my0Var2.f30948b;
                        } else {
                            oy0Var = my0Var2.f30947a;
                        }
                        f10 += oy0Var.d;
                    }
                    int i11 = -1;
                    int i12 = 0;
                    boolean z13 = true;
                    while (i12 < childCount2) {
                        int i13 = (int) ((i12 + childCount2) / 2);
                        l();
                        o(f10, i13);
                        boolean p6 = p(d(), iArr, false);
                        if (p6) {
                            i12 = i13 + 1;
                            i11 = i13;
                        } else {
                            childCount2 = i13;
                        }
                        z13 = p6;
                    }
                    if (i11 > 0 && !z13) {
                        l();
                        o(f10, i11);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f29231u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f29227q = true;
        }
        return this.f29226p;
    }

    public final int h() {
        oy0 oy0Var;
        int i9 = Integer.MIN_VALUE;
        if (this.f29215c == Integer.MIN_VALUE) {
            ry0 ry0Var = this.f29233x;
            int childCount = ry0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                my0 my0Var = ry0Var.d(i11).f30264a;
                if (this.f29213a) {
                    oy0Var = my0Var.f30948b;
                } else {
                    oy0Var = my0Var.f30947a;
                }
                ly0 ly0Var = oy0Var.f31476b;
                int i12 = ly0Var.f30584a;
                int i13 = ly0Var.f30585b;
                i10 = Math.max(Math.max(Math.max(i10, i12), i13), i13 - ly0Var.f30584a);
            }
            if (i10 != -1) {
                i9 = i10;
            }
            this.f29215c = Math.max(0, i9);
        }
        return this.f29215c;
    }

    public final int i(int i9) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        ny0 ny0Var = this.f29232w;
        ny0 ny0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                ny0Var2.f31218a = size;
                ny0Var.f31218a = -size;
                this.f29227q = false;
                return g()[e()];
            }
            ny0Var2.f31218a = 0;
            ny0Var.f31218a = -100000;
            this.f29227q = false;
            return g()[e()];
        }
        ny0Var2.f31218a = 0;
        ny0Var.f31218a = -size;
        this.f29227q = false;
        return g()[e()];
    }

    public final void k() {
        this.f29215c = Integer.MIN_VALUE;
        this.d = null;
        this.f29217f = null;
        this.h = null;
        this.f29220j = null;
        this.f29222l = null;
        this.f29224n = null;
        this.f29226p = null;
        this.f29230t = null;
        this.f29229s = false;
        l();
    }

    public final void l() {
        this.f29216e = false;
        this.f29218g = false;
        this.f29219i = false;
        this.f29221k = false;
        this.f29223m = false;
        this.f29225o = false;
        this.f29227q = false;
    }

    public final void n(int i9) {
        String str;
        if (i9 != Integer.MIN_VALUE && i9 < h()) {
            if (this.f29213a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(ta.b.j(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f29214b = i9;
    }

    public final void o(float f10, int i9) {
        oy0 oy0Var;
        Arrays.fill(this.f29230t, 0);
        ry0 ry0Var = this.f29233x;
        int childCount = ry0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            my0 my0Var = ry0Var.d(i10).f30264a;
            if (this.f29213a) {
                oy0Var = my0Var.f30948b;
            } else {
                oy0Var = my0Var.f30947a;
            }
            float f11 = oy0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i9 * f11) / f10);
                this.f29230t[i10] = round;
                i9 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(fy0[] fy0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i9 = 0; i9 < fy0VarArr.length; i9++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (fy0 fy0Var : fy0VarArr) {
                    z11 |= m(iArr, fy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[fy0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = fy0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, fy0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= fy0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    fy0 fy0Var2 = fy0VarArr[i13];
                    ly0 ly0Var = fy0Var2.f28604a;
                    if (ly0Var.f30584a >= ly0Var.f30585b) {
                        fy0Var2.f28606c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final fy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (fy0[]) arrayList.toArray(new fy0[0]));
        int length = ((fy0[][]) i0Var.f4709c).length;
        for (int i9 = 0; i9 < length; i9++) {
            i0Var.d(i9);
        }
        return (fy0[]) i0Var.f4708b;
    }
}
