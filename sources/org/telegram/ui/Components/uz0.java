package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class uz0 {
    public final boolean f31072a;
    public m.g3 d;
    public m.g3 f31075f;
    public m.g3 h;
    public int[] f31078j;
    public int[] f31080l;
    public sz0[] f31082n;
    public int[] f31084p;
    public boolean f31086r;
    public int[] f31088t;
    public final e01 f31091x;
    public int f31073b = Integer.MIN_VALUE;
    public int f31074c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f31076g = false;
    public boolean f31077i = false;
    public boolean f31079k = false;
    public boolean f31081m = false;
    public boolean f31083o = false;
    public boolean f31085q = false;
    public boolean f31087s = false;
    public boolean f31089u = true;
    public final a01 v = new a01(0);
    public final a01 f31090w = new a01(-100000);

    public uz0(e01 e01Var, boolean z10) {
        this.f31091x = e01Var;
        this.f31072a = z10;
    }

    public static void j(ArrayList arrayList, yz0 yz0Var, a01 a01Var, boolean z10) {
        if (yz0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((sz0) obj).f30364a.equals(yz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new sz0(yz0Var, a01Var));
        }
    }

    public static boolean m(int[] iArr, sz0 sz0Var) {
        if (sz0Var.f30366c) {
            yz0 yz0Var = sz0Var.f30364a;
            int i10 = yz0Var.f32785a;
            int i11 = yz0Var.f32786b;
            int i12 = iArr[i10] + sz0Var.f30365b.f24427a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.g3 g3Var, boolean z10) {
        for (a01 a01Var : (a01[]) ((Object[]) g3Var.d)) {
            a01Var.f24427a = Integer.MIN_VALUE;
        }
        vz0[] vz0VarArr = (vz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < vz0VarArr.length; i10++) {
            int d = vz0VarArr[i10].d(z10);
            a01 a01Var2 = (a01) ((Object[]) g3Var.d)[((int[]) g3Var.f16202b)[i10]];
            int i11 = a01Var2.f24427a;
            if (!z10) {
                d = -d;
            }
            a01Var2.f24427a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        b01 b01Var;
        int i10;
        if (z10) {
            iArr = this.f31078j;
        } else {
            iArr = this.f31080l;
        }
        e01 e01Var = this.f31091x;
        int childCount = e01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            xz0 d = e01Var.d(i11);
            zz0 zz0Var = d.f32484a;
            boolean z11 = this.f31072a;
            if (z11) {
                b01Var = zz0Var.f33068b;
            } else {
                b01Var = zz0Var.f33067a;
            }
            yz0 yz0Var = b01Var.f24759b;
            if (z10) {
                i10 = yz0Var.f32785a;
            } else {
                i10 = yz0Var.f32786b;
            }
            iArr[i10] = Math.max(iArr[i10], e01Var.f(d, z11, z10));
        }
    }

    public final m.g3 c(boolean z10) {
        yz0 yz0Var;
        tz0 tz0Var = new tz0(yz0.class, a01.class);
        b01[] b01VarArr = (b01[]) ((Object[]) f().f16203c);
        int length = b01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                yz0Var = b01VarArr[i10].f24759b;
            } else {
                yz0 yz0Var2 = b01VarArr[i10].f24759b;
                yz0Var = new yz0(yz0Var2.f32786b, yz0Var2.f32785a);
            }
            ?? obj = new Object();
            obj.f24427a = Integer.MIN_VALUE;
            tz0Var.add(Pair.create(yz0Var, obj));
        }
        return tz0Var.h();
    }

    public final sz0[] d() {
        if (this.f31082n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f31075f == null) {
                this.f31075f = c(true);
            }
            if (!this.f31076g) {
                a(this.f31075f, true);
                this.f31076g = true;
            }
            m.g3 g3Var = this.f31075f;
            int i10 = 0;
            while (true) {
                yz0[] yz0VarArr = (yz0[]) ((Object[]) g3Var.f16203c);
                if (i10 >= yz0VarArr.length) {
                    break;
                }
                j(arrayList, yz0VarArr[i10], ((a01[]) ((Object[]) g3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31077i) {
                a(this.h, false);
                this.f31077i = true;
            }
            m.g3 g3Var2 = this.h;
            int i11 = 0;
            while (true) {
                yz0[] yz0VarArr2 = (yz0[]) ((Object[]) g3Var2.f16203c);
                if (i11 >= yz0VarArr2.length) {
                    break;
                }
                j(arrayList2, yz0VarArr2[i11], ((a01[]) ((Object[]) g3Var2.d))[i11], false);
                i11++;
            }
            if (this.f31089u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new yz0(i12, i13), new a01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new yz0(0, e), this.v, false);
            j(arrayList2, new yz0(e, 0), this.f31090w, false);
            sz0[] q6 = q(arrayList);
            sz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(sz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f31082n = (sz0[]) objArr;
        }
        if (!this.f31083o) {
            if (this.f31075f == null) {
                this.f31075f = c(true);
            }
            if (!this.f31076g) {
                a(this.f31075f, true);
                this.f31076g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31077i) {
                a(this.h, false);
                this.f31077i = true;
            }
            this.f31083o = true;
        }
        return this.f31082n;
    }

    public final int e() {
        int max = Math.max(this.f31073b, h());
        if (max <= 1024) {
            return max;
        }
        e01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.g3 f() {
        b01 b01Var;
        int i10;
        int i11;
        int i12;
        b01 b01Var2;
        vz0 vz0Var;
        m.g3 g3Var = this.d;
        boolean z10 = this.f31072a;
        e01 e01Var = this.f31091x;
        if (g3Var == null) {
            tz0 tz0Var = new tz0(b01.class, vz0.class);
            int childCount = e01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                zz0 zz0Var = e01Var.d(i13).f32484a;
                if (z10) {
                    b01Var2 = zz0Var.f33068b;
                } else {
                    b01Var2 = zz0Var.f33067a;
                }
                switch (b01.a(b01Var2, z10).f29759a) {
                    case 3:
                        vz0Var = new vz0();
                        break;
                    default:
                        vz0Var = new vz0();
                        break;
                }
                tz0Var.add(Pair.create(b01Var2, vz0Var));
            }
            this.d = tz0Var.h();
        }
        if (!this.e) {
            for (vz0 vz0Var2 : (vz0[]) ((Object[]) this.d.d)) {
                vz0Var2.c();
            }
            int childCount2 = e01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                xz0 d = e01Var.d(i14);
                zz0 zz0Var2 = d.f32484a;
                if (z10) {
                    b01Var = zz0Var2.f33068b;
                } else {
                    b01Var = zz0Var2.f33067a;
                }
                if (z10) {
                    i10 = d.f32491k;
                } else {
                    i10 = d.f32492l;
                }
                int e = e01Var.e(d, z10, false) + e01Var.e(d, z10, true) + i10;
                float f7 = b01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f31088t[i14];
                }
                int i15 = e + i11;
                m.g3 g3Var2 = this.d;
                vz0 vz0Var3 = (vz0) ((Object[]) g3Var2.d)[((int[]) g3Var2.f16202b)[i14]];
                int i16 = vz0Var3.f31956c;
                if (b01Var.f24760c == e01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                vz0Var3.f31956c = i12 & i16;
                int a2 = b01.a(b01Var, z10).a(d, i15);
                vz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        b01 b01Var;
        boolean z10;
        b01 b01Var2;
        if (this.f31084p == null) {
            this.f31084p = new int[e() + 1];
        }
        if (!this.f31085q) {
            int[] iArr = this.f31084p;
            boolean z11 = this.f31087s;
            float f7 = 0.0f;
            boolean z12 = this.f31072a;
            e01 e01Var = this.f31091x;
            if (!z11) {
                int childCount = e01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        zz0 zz0Var = e01Var.d(i10).f32484a;
                        if (z12) {
                            b01Var2 = zz0Var.f33068b;
                        } else {
                            b01Var2 = zz0Var.f33067a;
                        }
                        if (b01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f31086r = z10;
                this.f31087s = true;
            }
            if (!this.f31086r) {
                p(d(), iArr, true);
            } else {
                if (this.f31088t == null) {
                    this.f31088t = new int[e01Var.getChildCount()];
                }
                Arrays.fill(this.f31088t, 0);
                p(d(), iArr, true);
                int childCount2 = (e01Var.getChildCount() * this.v.f24427a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = e01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        zz0 zz0Var2 = e01Var.d(i11).f32484a;
                        if (z12) {
                            b01Var = zz0Var2.f33068b;
                        } else {
                            b01Var = zz0Var2.f33067a;
                        }
                        f7 += b01Var.d;
                    }
                    int i12 = -1;
                    boolean z13 = true;
                    int i13 = 0;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f7, i14);
                        boolean p5 = p(d(), iArr, false);
                        if (p5) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = p5;
                    }
                    if (i12 > 0 && !z13) {
                        l();
                        o(f7, i12);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f31089u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f31085q = true;
        }
        return this.f31084p;
    }

    public final int h() {
        b01 b01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f31074c == Integer.MIN_VALUE) {
            e01 e01Var = this.f31091x;
            int childCount = e01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                zz0 zz0Var = e01Var.d(i12).f32484a;
                if (this.f31072a) {
                    b01Var = zz0Var.f33068b;
                } else {
                    b01Var = zz0Var.f33067a;
                }
                yz0 yz0Var = b01Var.f24759b;
                i11 = Math.max(Math.max(Math.max(i11, yz0Var.f32785a), yz0Var.f32786b), yz0Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f31074c = Math.max(0, i10);
        }
        return this.f31074c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        a01 a01Var = this.f31090w;
        a01 a01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                a01Var2.f24427a = size;
                a01Var.f24427a = -size;
                this.f31085q = false;
                return g()[e()];
            }
            a01Var2.f24427a = 0;
            a01Var.f24427a = -100000;
            this.f31085q = false;
            return g()[e()];
        }
        a01Var2.f24427a = 0;
        a01Var.f24427a = -size;
        this.f31085q = false;
        return g()[e()];
    }

    public final void k() {
        this.f31074c = Integer.MIN_VALUE;
        this.d = null;
        this.f31075f = null;
        this.h = null;
        this.f31078j = null;
        this.f31080l = null;
        this.f31082n = null;
        this.f31084p = null;
        this.f31088t = null;
        this.f31087s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f31076g = false;
        this.f31077i = false;
        this.f31079k = false;
        this.f31081m = false;
        this.f31083o = false;
        this.f31085q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f31072a) {
                str = "column";
            } else {
                str = "row";
            }
            e01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f31073b = i10;
    }

    public final void o(float f7, int i10) {
        b01 b01Var;
        Arrays.fill(this.f31088t, 0);
        e01 e01Var = this.f31091x;
        int childCount = e01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            zz0 zz0Var = e01Var.d(i11).f32484a;
            if (this.f31072a) {
                b01Var = zz0Var.f33068b;
            } else {
                b01Var = zz0Var.f33067a;
            }
            float f10 = b01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f31088t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(sz0[] sz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < sz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (sz0 sz0Var : sz0VarArr) {
                    z11 |= m(iArr, sz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[sz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = sz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, sz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= sz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    sz0 sz0Var2 = sz0VarArr[i14];
                    yz0 yz0Var = sz0Var2.f30364a;
                    if (yz0Var.f32785a >= yz0Var.f32786b) {
                        sz0Var2.f30366c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final sz0[] q(ArrayList arrayList) {
        e0.f0 f0Var = new e0.f0(this, (sz0[]) arrayList.toArray(new sz0[0]));
        int length = ((sz0[][]) f0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            f0Var.f(i10);
        }
        return (sz0[]) f0Var.f8096c;
    }
}
