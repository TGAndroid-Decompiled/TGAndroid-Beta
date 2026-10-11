package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class c01 {
    public final boolean f25141a;
    public la.h d;
    public la.h f25145f;
    public la.h h;
    public int[] f25148j;
    public int[] f25150l;
    public a01[] f25152n;
    public int[] f25154p;
    public boolean f25156r;
    public int[] f25158t;
    public final m01 f25161x;
    public int f25142b = Integer.MIN_VALUE;
    public int f25143c = Integer.MIN_VALUE;
    public boolean f25144e = false;
    public boolean f25146g = false;
    public boolean f25147i = false;
    public boolean f25149k = false;
    public boolean f25151m = false;
    public boolean f25153o = false;
    public boolean f25155q = false;
    public boolean f25157s = false;
    public boolean f25159u = true;
    public final i01 v = new i01(0);
    public final i01 f25160w = new i01(-100000);

    public c01(m01 m01Var, boolean z10) {
        this.f25161x = m01Var;
        this.f25141a = z10;
    }

    public static void j(ArrayList arrayList, g01 g01Var, i01 i01Var, boolean z10) {
        if (g01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((a01) obj).f24423a.equals(g01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new a01(g01Var, i01Var));
        }
    }

    public static boolean m(int[] iArr, a01 a01Var) {
        if (a01Var.f24425c) {
            g01 g01Var = a01Var.f24423a;
            int i10 = g01Var.f26615a;
            int i11 = g01Var.f26616b;
            int i12 = iArr[i10] + a01Var.f24424b.f27279a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(la.h hVar, boolean z10) {
        for (i01 i01Var : (i01[]) ((Object[]) hVar.d)) {
            i01Var.f27279a = Integer.MIN_VALUE;
        }
        d01[] d01VarArr = (d01[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < d01VarArr.length; i10++) {
            int d = d01VarArr[i10].d(z10);
            i01 i01Var2 = (i01) ((Object[]) hVar.d)[((int[]) hVar.f15501b)[i10]];
            int i11 = i01Var2.f27279a;
            if (!z10) {
                d = -d;
            }
            i01Var2.f27279a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        j01 j01Var;
        int i10;
        if (z10) {
            iArr = this.f25148j;
        } else {
            iArr = this.f25150l;
        }
        m01 m01Var = this.f25161x;
        int childCount = m01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            f01 d = m01Var.d(i11);
            h01 h01Var = d.f26261a;
            boolean z11 = this.f25141a;
            if (z11) {
                j01Var = h01Var.f26922b;
            } else {
                j01Var = h01Var.f26921a;
            }
            g01 g01Var = j01Var.f27549b;
            if (z10) {
                i10 = g01Var.f26615a;
            } else {
                i10 = g01Var.f26616b;
            }
            iArr[i10] = Math.max(iArr[i10], m01Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        g01 g01Var;
        b01 b01Var = new b01(g01.class, i01.class);
        j01[] j01VarArr = (j01[]) ((Object[]) f().f15502c);
        int length = j01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                g01Var = j01VarArr[i10].f27549b;
            } else {
                g01 g01Var2 = j01VarArr[i10].f27549b;
                g01Var = new g01(g01Var2.f26616b, g01Var2.f26615a);
            }
            ?? obj = new Object();
            obj.f27279a = Integer.MIN_VALUE;
            b01Var.add(Pair.create(g01Var, obj));
        }
        return b01Var.i();
    }

    public final a01[] d() {
        if (this.f25152n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f25145f == null) {
                this.f25145f = c(true);
            }
            if (!this.f25146g) {
                a(this.f25145f, true);
                this.f25146g = true;
            }
            la.h hVar = this.f25145f;
            int i10 = 0;
            while (true) {
                g01[] g01VarArr = (g01[]) ((Object[]) hVar.f15502c);
                if (i10 >= g01VarArr.length) {
                    break;
                }
                j(arrayList, g01VarArr[i10], ((i01[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f25147i) {
                a(this.h, false);
                this.f25147i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                g01[] g01VarArr2 = (g01[]) ((Object[]) hVar2.f15502c);
                if (i11 >= g01VarArr2.length) {
                    break;
                }
                j(arrayList2, g01VarArr2[i11], ((i01[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f25159u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new g01(i12, i13), new i01(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new g01(0, e7), this.v, false);
            j(arrayList2, new g01(e7, 0), this.f25160w, false);
            a01[] q6 = q(arrayList);
            a01[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(a01[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f25152n = (a01[]) objArr;
        }
        if (!this.f25153o) {
            if (this.f25145f == null) {
                this.f25145f = c(true);
            }
            if (!this.f25146g) {
                a(this.f25145f, true);
                this.f25146g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f25147i) {
                a(this.h, false);
                this.f25147i = true;
            }
            this.f25153o = true;
        }
        return this.f25152n;
    }

    public final int e() {
        int max = Math.max(this.f25142b, h());
        if (max <= 1024) {
            return max;
        }
        m01.g("Table grid count out of bounds");
        throw null;
    }

    public final la.h f() {
        j01 j01Var;
        int i10;
        int i11;
        int i12;
        j01 j01Var2;
        d01 d01Var;
        la.h hVar = this.d;
        boolean z10 = this.f25141a;
        m01 m01Var = this.f25161x;
        if (hVar == null) {
            b01 b01Var = new b01(j01.class, d01.class);
            int childCount = m01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                h01 h01Var = m01Var.d(i13).f26261a;
                if (z10) {
                    j01Var2 = h01Var.f26922b;
                } else {
                    j01Var2 = h01Var.f26921a;
                }
                switch (j01.a(j01Var2, z10).f33503a) {
                    case 3:
                        d01Var = new d01();
                        break;
                    default:
                        d01Var = new d01();
                        break;
                }
                b01Var.add(Pair.create(j01Var2, d01Var));
            }
            this.d = b01Var.i();
        }
        if (!this.f25144e) {
            for (d01 d01Var2 : (d01[]) ((Object[]) this.d.d)) {
                d01Var2.c();
            }
            int childCount2 = m01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                f01 d = m01Var.d(i14);
                h01 h01Var2 = d.f26261a;
                if (z10) {
                    j01Var = h01Var2.f26922b;
                } else {
                    j01Var = h01Var2.f26921a;
                }
                if (z10) {
                    i10 = d.f26269k;
                } else {
                    i10 = d.f26270l;
                }
                int e7 = m01Var.e(d, z10, false) + m01Var.e(d, z10, true) + i10;
                float f7 = j01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f25158t[i14];
                }
                int i15 = e7 + i11;
                la.h hVar2 = this.d;
                d01 d01Var3 = (d01) ((Object[]) hVar2.d)[((int[]) hVar2.f15501b)[i14]];
                int i16 = d01Var3.f25571c;
                if (j01Var.f27550c == m01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                d01Var3.f25571c = i12 & i16;
                int a2 = j01.a(j01Var, z10).a(d, i15);
                d01Var3.b(a2, i15 - a2);
            }
            this.f25144e = true;
        }
        return this.d;
    }

    public final int[] g() {
        j01 j01Var;
        boolean z10;
        j01 j01Var2;
        if (this.f25154p == null) {
            this.f25154p = new int[e() + 1];
        }
        if (!this.f25155q) {
            int[] iArr = this.f25154p;
            boolean z11 = this.f25157s;
            float f7 = 0.0f;
            boolean z12 = this.f25141a;
            m01 m01Var = this.f25161x;
            if (!z11) {
                int childCount = m01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        h01 h01Var = m01Var.d(i10).f26261a;
                        if (z12) {
                            j01Var2 = h01Var.f26922b;
                        } else {
                            j01Var2 = h01Var.f26921a;
                        }
                        if (j01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f25156r = z10;
                this.f25157s = true;
            }
            if (!this.f25156r) {
                p(d(), iArr, true);
            } else {
                if (this.f25158t == null) {
                    this.f25158t = new int[m01Var.getChildCount()];
                }
                Arrays.fill(this.f25158t, 0);
                p(d(), iArr, true);
                int childCount2 = (m01Var.getChildCount() * this.v.f27279a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = m01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        h01 h01Var2 = m01Var.d(i11).f26261a;
                        if (z12) {
                            j01Var = h01Var2.f26922b;
                        } else {
                            j01Var = h01Var2.f26921a;
                        }
                        f7 += j01Var.d;
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
            if (!this.f25159u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f25155q = true;
        }
        return this.f25154p;
    }

    public final int h() {
        j01 j01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f25143c == Integer.MIN_VALUE) {
            m01 m01Var = this.f25161x;
            int childCount = m01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                h01 h01Var = m01Var.d(i12).f26261a;
                if (this.f25141a) {
                    j01Var = h01Var.f26922b;
                } else {
                    j01Var = h01Var.f26921a;
                }
                g01 g01Var = j01Var.f27549b;
                i11 = Math.max(Math.max(Math.max(i11, g01Var.f26615a), g01Var.f26616b), g01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f25143c = Math.max(0, i10);
        }
        return this.f25143c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        i01 i01Var = this.f25160w;
        i01 i01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                i01Var2.f27279a = size;
                i01Var.f27279a = -size;
                this.f25155q = false;
                return g()[e()];
            }
            i01Var2.f27279a = 0;
            i01Var.f27279a = -100000;
            this.f25155q = false;
            return g()[e()];
        }
        i01Var2.f27279a = 0;
        i01Var.f27279a = -size;
        this.f25155q = false;
        return g()[e()];
    }

    public final void k() {
        this.f25143c = Integer.MIN_VALUE;
        this.d = null;
        this.f25145f = null;
        this.h = null;
        this.f25148j = null;
        this.f25150l = null;
        this.f25152n = null;
        this.f25154p = null;
        this.f25158t = null;
        this.f25157s = false;
        l();
    }

    public final void l() {
        this.f25144e = false;
        this.f25146g = false;
        this.f25147i = false;
        this.f25149k = false;
        this.f25151m = false;
        this.f25153o = false;
        this.f25155q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f25141a) {
                str = "column";
            } else {
                str = "row";
            }
            m01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f25142b = i10;
    }

    public final void o(float f7, int i10) {
        j01 j01Var;
        Arrays.fill(this.f25158t, 0);
        m01 m01Var = this.f25161x;
        int childCount = m01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            h01 h01Var = m01Var.d(i11).f26261a;
            if (this.f25141a) {
                j01Var = h01Var.f26922b;
            } else {
                j01Var = h01Var.f26921a;
            }
            float f10 = j01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f25158t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(a01[] a01VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < a01VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
                boolean z11 = false;
                for (a01 a01Var : a01VarArr) {
                    z11 |= m(iArr, a01Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[a01VarArr.length];
            for (int i12 = 0; i12 < e7; i12++) {
                int length = a01VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, a01VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= a01VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    a01 a01Var2 = a01VarArr[i14];
                    g01 g01Var = a01Var2.f24423a;
                    if (g01Var.f26615a >= g01Var.f26616b) {
                        a01Var2.f24425c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final a01[] q(ArrayList arrayList) {
        e0.g0 g0Var = new e0.g0(this, (a01[]) arrayList.toArray(new a01[0]));
        int length = ((a01[][]) g0Var.f8413c).length;
        for (int i10 = 0; i10 < length; i10++) {
            g0Var.f(i10);
        }
        return (a01[]) g0Var.f8412b;
    }
}
