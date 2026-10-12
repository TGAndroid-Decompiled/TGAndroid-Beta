package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class h01 {
    public final boolean f26580a;
    public m.f3 d;
    public m.f3 f26584f;
    public m.f3 h;
    public int[] f26587j;
    public int[] f26589l;
    public f01[] f26591n;
    public int[] f26593p;
    public boolean f26595r;
    public int[] f26597t;
    public final r01 f26600x;
    public int f26581b = Integer.MIN_VALUE;
    public int f26582c = Integer.MIN_VALUE;
    public boolean f26583e = false;
    public boolean f26585g = false;
    public boolean f26586i = false;
    public boolean f26588k = false;
    public boolean f26590m = false;
    public boolean f26592o = false;
    public boolean f26594q = false;
    public boolean f26596s = false;
    public boolean f26598u = true;
    public final n01 v = new n01(0);
    public final n01 f26599w = new n01(-100000);

    public h01(r01 r01Var, boolean z10) {
        this.f26600x = r01Var;
        this.f26580a = z10;
    }

    public static void j(ArrayList arrayList, l01 l01Var, n01 n01Var, boolean z10) {
        if (l01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((f01) obj).f25839a.equals(l01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new f01(l01Var, n01Var));
        }
    }

    public static boolean m(int[] iArr, f01 f01Var) {
        if (f01Var.f25841c) {
            l01 l01Var = f01Var.f25839a;
            int i10 = l01Var.f27969a;
            int i11 = l01Var.f27970b;
            int i12 = iArr[i10] + f01Var.f25840b.f28696a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.f3 f3Var, boolean z10) {
        for (n01 n01Var : (n01[]) ((Object[]) f3Var.d)) {
            n01Var.f28696a = Integer.MIN_VALUE;
        }
        i01[] i01VarArr = (i01[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < i01VarArr.length; i10++) {
            int d = i01VarArr[i10].d(z10);
            n01 n01Var2 = (n01) ((Object[]) f3Var.d)[((int[]) f3Var.f15424b)[i10]];
            int i11 = n01Var2.f28696a;
            if (!z10) {
                d = -d;
            }
            n01Var2.f28696a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        o01 o01Var;
        int i10;
        if (z10) {
            iArr = this.f26587j;
        } else {
            iArr = this.f26589l;
        }
        r01 r01Var = this.f26600x;
        int childCount = r01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            k01 d = r01Var.d(i11);
            m01 m01Var = d.f27694a;
            boolean z11 = this.f26580a;
            if (z11) {
                o01Var = m01Var.f28335b;
            } else {
                o01Var = m01Var.f28334a;
            }
            l01 l01Var = o01Var.f29018b;
            if (z10) {
                i10 = l01Var.f27969a;
            } else {
                i10 = l01Var.f27970b;
            }
            iArr[i10] = Math.max(iArr[i10], r01Var.f(d, z11, z10));
        }
    }

    public final m.f3 c(boolean z10) {
        l01 l01Var;
        g01 g01Var = new g01(l01.class, n01.class);
        o01[] o01VarArr = (o01[]) ((Object[]) f().f15425c);
        int length = o01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                l01Var = o01VarArr[i10].f29018b;
            } else {
                l01 l01Var2 = o01VarArr[i10].f29018b;
                l01Var = new l01(l01Var2.f27970b, l01Var2.f27969a);
            }
            ?? obj = new Object();
            obj.f28696a = Integer.MIN_VALUE;
            g01Var.add(Pair.create(l01Var, obj));
        }
        return g01Var.i();
    }

    public final f01[] d() {
        if (this.f26591n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f26584f == null) {
                this.f26584f = c(true);
            }
            if (!this.f26585g) {
                a(this.f26584f, true);
                this.f26585g = true;
            }
            m.f3 f3Var = this.f26584f;
            int i10 = 0;
            while (true) {
                l01[] l01VarArr = (l01[]) ((Object[]) f3Var.f15425c);
                if (i10 >= l01VarArr.length) {
                    break;
                }
                j(arrayList, l01VarArr[i10], ((n01[]) ((Object[]) f3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26586i) {
                a(this.h, false);
                this.f26586i = true;
            }
            m.f3 f3Var2 = this.h;
            int i11 = 0;
            while (true) {
                l01[] l01VarArr2 = (l01[]) ((Object[]) f3Var2.f15425c);
                if (i11 >= l01VarArr2.length) {
                    break;
                }
                j(arrayList2, l01VarArr2[i11], ((n01[]) ((Object[]) f3Var2.d))[i11], false);
                i11++;
            }
            if (this.f26598u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new l01(i12, i13), new n01(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new l01(0, e7), this.v, false);
            j(arrayList2, new l01(e7, 0), this.f26599w, false);
            f01[] q6 = q(arrayList);
            f01[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(f01[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f26591n = (f01[]) objArr;
        }
        if (!this.f26592o) {
            if (this.f26584f == null) {
                this.f26584f = c(true);
            }
            if (!this.f26585g) {
                a(this.f26584f, true);
                this.f26585g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26586i) {
                a(this.h, false);
                this.f26586i = true;
            }
            this.f26592o = true;
        }
        return this.f26591n;
    }

    public final int e() {
        int max = Math.max(this.f26581b, h());
        if (max <= 1024) {
            return max;
        }
        r01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.f3 f() {
        o01 o01Var;
        int i10;
        int i11;
        int i12;
        o01 o01Var2;
        i01 i01Var;
        m.f3 f3Var = this.d;
        boolean z10 = this.f26580a;
        r01 r01Var = this.f26600x;
        if (f3Var == null) {
            g01 g01Var = new g01(o01.class, i01.class);
            int childCount = r01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                m01 m01Var = r01Var.d(i13).f27694a;
                if (z10) {
                    o01Var2 = m01Var.f28335b;
                } else {
                    o01Var2 = m01Var.f28334a;
                }
                switch (o01.a(o01Var2, z10).f25149a) {
                    case 3:
                        i01Var = new i01();
                        break;
                    default:
                        i01Var = new i01();
                        break;
                }
                g01Var.add(Pair.create(o01Var2, i01Var));
            }
            this.d = g01Var.i();
        }
        if (!this.f26583e) {
            for (i01 i01Var2 : (i01[]) ((Object[]) this.d.d)) {
                i01Var2.c();
            }
            int childCount2 = r01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                k01 d = r01Var.d(i14);
                m01 m01Var2 = d.f27694a;
                if (z10) {
                    o01Var = m01Var2.f28335b;
                } else {
                    o01Var = m01Var2.f28334a;
                }
                if (z10) {
                    i10 = d.f27702k;
                } else {
                    i10 = d.f27703l;
                }
                int e7 = r01Var.e(d, z10, false) + r01Var.e(d, z10, true) + i10;
                float f7 = o01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f26597t[i14];
                }
                int i15 = e7 + i11;
                m.f3 f3Var2 = this.d;
                i01 i01Var3 = (i01) ((Object[]) f3Var2.d)[((int[]) f3Var2.f15424b)[i14]];
                int i16 = i01Var3.f26992c;
                if (o01Var.f29019c == r01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                i01Var3.f26992c = i12 & i16;
                int a2 = o01.a(o01Var, z10).a(d, i15);
                i01Var3.b(a2, i15 - a2);
            }
            this.f26583e = true;
        }
        return this.d;
    }

    public final int[] g() {
        o01 o01Var;
        boolean z10;
        o01 o01Var2;
        if (this.f26593p == null) {
            this.f26593p = new int[e() + 1];
        }
        if (!this.f26594q) {
            int[] iArr = this.f26593p;
            boolean z11 = this.f26596s;
            float f7 = 0.0f;
            boolean z12 = this.f26580a;
            r01 r01Var = this.f26600x;
            if (!z11) {
                int childCount = r01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        m01 m01Var = r01Var.d(i10).f27694a;
                        if (z12) {
                            o01Var2 = m01Var.f28335b;
                        } else {
                            o01Var2 = m01Var.f28334a;
                        }
                        if (o01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f26595r = z10;
                this.f26596s = true;
            }
            if (!this.f26595r) {
                p(d(), iArr, true);
            } else {
                if (this.f26597t == null) {
                    this.f26597t = new int[r01Var.getChildCount()];
                }
                Arrays.fill(this.f26597t, 0);
                p(d(), iArr, true);
                int childCount2 = (r01Var.getChildCount() * this.v.f28696a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = r01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        m01 m01Var2 = r01Var.d(i11).f27694a;
                        if (z12) {
                            o01Var = m01Var2.f28335b;
                        } else {
                            o01Var = m01Var2.f28334a;
                        }
                        f7 += o01Var.d;
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
            if (!this.f26598u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f26594q = true;
        }
        return this.f26593p;
    }

    public final int h() {
        o01 o01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f26582c == Integer.MIN_VALUE) {
            r01 r01Var = this.f26600x;
            int childCount = r01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                m01 m01Var = r01Var.d(i12).f27694a;
                if (this.f26580a) {
                    o01Var = m01Var.f28335b;
                } else {
                    o01Var = m01Var.f28334a;
                }
                l01 l01Var = o01Var.f29018b;
                i11 = Math.max(Math.max(Math.max(i11, l01Var.f27969a), l01Var.f27970b), l01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f26582c = Math.max(0, i10);
        }
        return this.f26582c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        n01 n01Var = this.f26599w;
        n01 n01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                n01Var2.f28696a = size;
                n01Var.f28696a = -size;
                this.f26594q = false;
                return g()[e()];
            }
            n01Var2.f28696a = 0;
            n01Var.f28696a = -100000;
            this.f26594q = false;
            return g()[e()];
        }
        n01Var2.f28696a = 0;
        n01Var.f28696a = -size;
        this.f26594q = false;
        return g()[e()];
    }

    public final void k() {
        this.f26582c = Integer.MIN_VALUE;
        this.d = null;
        this.f26584f = null;
        this.h = null;
        this.f26587j = null;
        this.f26589l = null;
        this.f26591n = null;
        this.f26593p = null;
        this.f26597t = null;
        this.f26596s = false;
        l();
    }

    public final void l() {
        this.f26583e = false;
        this.f26585g = false;
        this.f26586i = false;
        this.f26588k = false;
        this.f26590m = false;
        this.f26592o = false;
        this.f26594q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f26580a) {
                str = "column";
            } else {
                str = "row";
            }
            r01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f26581b = i10;
    }

    public final void o(float f7, int i10) {
        o01 o01Var;
        Arrays.fill(this.f26597t, 0);
        r01 r01Var = this.f26600x;
        int childCount = r01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            m01 m01Var = r01Var.d(i11).f27694a;
            if (this.f26580a) {
                o01Var = m01Var.f28335b;
            } else {
                o01Var = m01Var.f28334a;
            }
            float f10 = o01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f26597t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(f01[] f01VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < f01VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
                boolean z11 = false;
                for (f01 f01Var : f01VarArr) {
                    z11 |= m(iArr, f01Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[f01VarArr.length];
            for (int i12 = 0; i12 < e7; i12++) {
                int length = f01VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, f01VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= f01VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    f01 f01Var2 = f01VarArr[i14];
                    l01 l01Var = f01Var2.f25839a;
                    if (l01Var.f27969a >= l01Var.f27970b) {
                        f01Var2.f25841c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final f01[] q(ArrayList arrayList) {
        e0.g0 g0Var = new e0.g0(this, (f01[]) arrayList.toArray(new f01[0]));
        int length = ((f01[][]) g0Var.f8411c).length;
        for (int i10 = 0; i10 < length; i10++) {
            g0Var.f(i10);
        }
        return (f01[]) g0Var.f8410b;
    }
}
